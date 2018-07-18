package com.stasbranger.voucherict.web.rest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codahale.metrics.annotation.Timed;
import com.stasbranger.voucherict.domain.Azienda;
import com.stasbranger.voucherict.service.AziendaService;
import com.stasbranger.voucherict.web.rest.errors.BadRequestAlertException;
import com.stasbranger.voucherict.web.rest.util.HeaderUtil;
import com.stasbranger.voucherict.web.rest.util.PaginationUtil;

/**
 * REST controller for managing Azienda.
 */
@RestController
@RequestMapping("/api")
public class AziendaResource {

	private final Logger log = LoggerFactory.getLogger(AziendaResource.class);

	private static final String ENTITY_NAME = "azienda";

	private final AziendaService aziendaService;

	public AziendaResource(AziendaService aziendaService) {
		this.aziendaService = aziendaService;
	}

	/**
	 * POST  /aziendas : Create a new azienda.
	 *
	 * @param azienda the azienda to create
	 * @return the ResponseEntity with status 201 (Created) and with body the new azienda, or with status 400 (Bad Request) if the azienda has already an ID
	 * @throws URISyntaxException if the Location URI syntax is incorrect
	 */
	@PostMapping("/aziendas")
	@Timed
	public ResponseEntity<Azienda> createAzienda(@Valid @RequestBody Azienda azienda) throws URISyntaxException {
		log.debug("REST request to save Azienda : {}", azienda);
		if (azienda.getId() != null) {
			throw new BadRequestAlertException("A new azienda cannot already have an ID", ENTITY_NAME, "idexists");
		}
		Azienda result = aziendaService.save(azienda);
		return ResponseEntity.created(new URI("/api/aziendas/" + result.getId()))
				.headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
				.body(result);
	}

	/**
	 * PUT  /aziendas : Updates an existing azienda.
	 *
	 * @param azienda the azienda to update
	 * @return the ResponseEntity with status 200 (OK) and with body the updated azienda,
	 * or with status 400 (Bad Request) if the azienda is not valid,
	 * or with status 500 (Internal Server Error) if the azienda couldn't be updated
	 * @throws URISyntaxException if the Location URI syntax is incorrect
	 */
	@PutMapping("/aziendas")
	@Timed
	public ResponseEntity<Azienda> updateAzienda(@Valid @RequestBody Azienda azienda) throws URISyntaxException {
		log.debug("REST request to update Azienda : {}", azienda);
		if (azienda.getId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		Azienda result = aziendaService.save(azienda);
		return ResponseEntity.ok()
				.headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, azienda.getId().toString()))
				.body(result);
	}

	/**
	 * GET  /aziendas : get all the aziendas.
	 *
	 * @param pageable the pagination information
	 * @return the ResponseEntity with status 200 (OK) and the list of aziendas in body
	 */
	@GetMapping("/aziendas")
	@Timed
	public ResponseEntity<List<Azienda>> getAllAziendas(Pageable pageable) {
		log.debug("REST request to get a page of Aziendas");
		Page<Azienda> page = aziendaService.findAll(pageable);
		HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/aziendas");
		return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
	}

	/**	
	 * GET  /aziendas/:id : get the "id" azienda.
	 *
	 * @param id the id of the azienda to retrieve
	 * @return the ResponseEntity with status 200 (OK) and with body the azienda, or with status 404 (Not Found)
	 */
	@GetMapping("/aziendas/{id}")
	@Timed
	public ResponseEntity<Azienda> getAzienda(@PathVariable String id) {
		log.debug("REST request to get Azienda : {}", id);
		return aziendaService.findOne(id)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}

	/**
	 * DELETE  /aziendas/:id : delete the "id" azienda.
	 *
	 * @param id the id of the azienda to delete
	 * @return the ResponseEntity with status 200 (OK)
	 */
	@DeleteMapping("/aziendas/{id}")
	@Timed
	public ResponseEntity<Void> deleteAzienda(@PathVariable String id) {
		log.debug("REST request to delete Azienda : {}", id);
		aziendaService.delete(id);
		return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id)).build();
	}

    /**
     * SEARCH  /_search/aziendas?query=:query : search for the azienda corresponding
     * to the query.
     *
     * @param query the query of the azienda search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/aziendas")
    @Timed
    public ResponseEntity<List<Azienda>> searchAziendas(@RequestParam String query, Pageable pageable) {
        log.debug("REST request to search for a page of Aziendas for query {}", query);
        Page<Azienda> page = aziendaService.search(query, pageable);
        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/aziendas");
        return new ResponseEntity<>(page.getContent(), headers, HttpStatus.OK);
    }

}
