package com.stasbranger.voucherict.service.impl;

import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.stasbranger.voucherict.domain.Azienda;
import com.stasbranger.voucherict.repository.AziendaRepository;
import com.stasbranger.voucherict.repository.search.AziendaSearchRepository;
import com.stasbranger.voucherict.service.AziendaService;

/**
 * Service Implementation for managing Azienda.
 */
@Service
public class AziendaServiceImpl implements AziendaService {

	private final Logger log = LoggerFactory.getLogger(AziendaServiceImpl.class);

	private final AziendaRepository aziendaRepository;

	private final AziendaSearchRepository aziendaSearchRepository;

	public AziendaServiceImpl(AziendaRepository aziendaRepository, AziendaSearchRepository aziendaSearchRepository) {
		this.aziendaRepository = aziendaRepository;
		this.aziendaSearchRepository = aziendaSearchRepository;
	}

	/**
	 * Save a azienda.
	 *
	 * @param azienda the entity to save
	 * @return the persisted entity
	 */
	@Override
	public Azienda save(Azienda azienda) {
		log.debug("Request to save Azienda : {}", azienda);        
		Azienda result = aziendaRepository.save(azienda);
		aziendaSearchRepository.save(result);
		return result;
	}

	/**
	 * Get all the aziendas.
	 *
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	@Override
	public Page<Azienda> findAll(Pageable pageable) {
		log.debug("Request to get all Aziendas");
		return aziendaRepository.findAll(pageable);
	}


	/**
	 * Get one azienda by id.
	 *
	 * @param id the id of the entity
	 * @return the entity
	 */
	@Override
	public Optional<Azienda> findOne(String id) {
		log.debug("Request to get Azienda : {}", id);
		return aziendaRepository.findById(id);
	}

	/**
	 * Delete the azienda by id.
	 *
	 * @param id the id of the entity
	 */
	@Override
	public void delete(String id) {
		log.debug("Request to delete Azienda : {}", id);
		aziendaRepository.deleteById(id);
		aziendaSearchRepository.deleteById(id);
	}

	/**
	 * Search for the azienda corresponding to the query.
	 *
	 * @param query the query of the search
	 * @param pageable the pagination information
	 * @return the list of entities
	 */
	@Override
	public Page<Azienda> search(String query, Pageable pageable) {
		log.debug("Request to search for a page of Aziendas for query {}", query);
		return aziendaSearchRepository.search(queryStringQuery(query), pageable);    }

	/**
	 * Import aziendas by pdf files
	 *
	 * @param File the file of the voucher
	 */
	@Override
	public List<Azienda> importPdf(File file) throws IOException {

		List<Azienda> list = new ArrayList<Azienda>();
		String regione = file.getName().replace(".pdf", "").replace("Allegato_A_-_", "").replace("_", " ");

		try (PDDocument document = PDDocument.load(file)) {

			document.getClass();

			if (!document.isEncrypted()) {

				PDFTextStripperByArea stripper = new PDFTextStripperByArea();
				stripper.setSortByPosition(true);

				PDFTextStripper tStripper = new PDFTextStripper();


				String pdfFileInText = tStripper.getText(document);

				// split by whitespace
				String lines[] = pdfFileInText.split("\\r?\\n");
				for (String line : lines) {
					if(line.startsWith("V-DGT_")) {

						System.out.println(line);
						Azienda azienda = new Azienda();
						// CODICE
						Pattern r = Pattern.compile("V-DGT_\\d+");
						Matcher m = r.matcher(line);
						if (m.find( )) {
							System.out.println(m.group(0));
							azienda.setCodice(m.group(0));
							line = line.replace(m.group(0), "");
							line = line.trim();
						}else {
							System.out.println("ERR: ");
						}

						// PREZZO
						r = Pattern.compile("(\\d+\\.)?\\d+,?\\d+€");
						m = r.matcher(line);
						if (m.find( )) {
							System.out.println(m.group(0).replace("€", "").replace(".", "").replace(",", "."));
							azienda.setVoucherAssegnato(Double.parseDouble(m.group(0).replace("€", "").replace(".", "").replace(",", ".")));
							line = line.replace(m.group(0), "");
							line = line.trim();
						}else {
							System.out.println("ERR: ");
						}

						// CUP
						r = Pattern.compile("B\\d{2}(\\w|\\s)\\d{11}");
						m = r.matcher(line);
						if (m.find( )) {
							System.out.println(m.group(0));
							azienda.setCup(m.group(0));
							line = line.replace(m.group(0), "");
							line = line.trim();
						}else {
							System.out.println("ERR: ");
						}

						// PARTITA IVA
						r = Pattern.compile("\\d{11}|\\w{16}");
						m = r.matcher(line);
						if (m.find( )) {
							System.out.println(m.group(0));
							azienda.setPartitaIva(m.group(0));
							line = line.replace(m.group(0), "");
							line = line.trim();
						}else {
							System.out.println("ERR: ");
						}

						// RNA
						r = Pattern.compile("\\d{6}");
						m = r.matcher(line);
						if (m.find( )) {
							System.out.println(m.group(0));
							azienda.setRna(m.group(0));
							line = line.replace(m.group(0), "");
							line = line.trim();
						}else {
							System.out.println("ERR: ");
						}
						// RAGIONE SOCIALE
						System.out.println(line);
						azienda.setRagioneSociale(line);
						
						// REGIONE
						System.out.println(regione);
						azienda.setRegione(regione);
						
						list.add(azienda);
					}
				}

			}

		}

		return list;
	}
}
