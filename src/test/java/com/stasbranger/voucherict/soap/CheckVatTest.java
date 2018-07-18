package com.stasbranger.voucherict.soap;

import java.util.Iterator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stasbranger.voucherict.VoucherIctApplication;
import com.stasbranger.voucherict.domain.Azienda;
import com.stasbranger.voucherict.service.AziendaService;
import com.stasbranger.voucherict.soap.CheckVatHandler.COUNTRIES;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VoucherIctApplication.class)
public class CheckVatTest {

	@Autowired
	private AziendaService aziendaService;

	@Test
	public void CheckVatResult() {

		Page<Azienda> aziendas = aziendaService.findAll(PageRequest.of(0, 7000));
		Iterator<Azienda> iter = aziendas.iterator();
		CheckVatHandler handler=new CheckVatHandler(COUNTRIES.IT);
		while (iter.hasNext()) {
			Azienda azienda = (Azienda) iter.next();
			if((azienda.getIndirizzo() == null || azienda.getIndirizzo().equals("No match available")) && azienda.getPartitaIva().length() == 11) {
				try {
					System.out.println("Id : " + azienda.getId() + "    codice: " + azienda.getCodice());
					CheckVatResult result = handler.query(azienda.getPartitaIva());
					if(result.isValid()) {
						CheckVatAddress address = result.getAddress();
						String provincia = address.getCity().trim().substring(address.getCity().length() - 2);
						System.out.println("provincia : " + provincia);
						azienda.setProvincia(provincia);
						String citta = address.getCity().replace(provincia, "").trim();
						System.out.println("citta' : " + citta);
						azienda.setCitta(citta);
						System.out.println("via : " + address.getStreet());
						azienda.setIndirizzo(address.getStreet());
						System.out.println("cap : " + address.getZipcode());
						azienda.setCap(address.getZipcode());
						
					}else {
						azienda.setIndirizzo("No match available");						
					}
					aziendaService.save(azienda);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
