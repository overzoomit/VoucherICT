package com.stasbranger.voucherict.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.stasbranger.voucherict.VoucherIctApplication;
import com.stasbranger.voucherict.domain.Azienda;

/**
 * Test class for the AziendaResource REST controller.
 *
 * @see AziendaService
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = VoucherIctApplication.class)
public class AziendaServiceIntTest {

	@Autowired
	private AziendaService aziendaService;

	private Azienda azienda;

	// PUGLIA
	@Test
	public void testImportPuglia() {
		File file = new File("src/main/resources/data/Allegato_A_-_Puglia.pdf");
		assertTrue(file.exists());

		List<Azienda> list;
		try {
			list = aziendaService.importPdf(file);
			assertFalse(list.isEmpty());
			for (Azienda azienda : list) {
				assertNotNull(azienda.getRagioneSociale());
				assertNotNull(azienda.getPartitaIva());
				assertNotNull(azienda.getCodice());
				assertNotNull(azienda.getCup());
				assertNotNull(azienda.getRna());
				assertNotNull(azienda.getVoucherAssegnato());
				assertNotNull(azienda.getRegione());

				aziendaService.save(azienda);
			}
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}

	// BASILICATA
	@Test
	public void testImportBasilicata() {
		File file = new File("src/main/resources/data/Allegato_A_-_Basilicata.pdf");
		assertTrue(file.exists());

		List<Azienda> list;
		try {
			list = aziendaService.importPdf(file);
			assertFalse(list.isEmpty());
			for (Azienda azienda : list) {
				assertNotNull(azienda.getRagioneSociale());
				assertNotNull(azienda.getPartitaIva());
				assertNotNull(azienda.getCodice());
				assertNotNull(azienda.getCup());
				assertNotNull(azienda.getRna());
				assertNotNull(azienda.getVoucherAssegnato());
				assertNotNull(azienda.getRegione());

				aziendaService.save(azienda);
			}
		} catch (IOException e) {
			e.printStackTrace();
			assertTrue(false);
		}
	}
}
