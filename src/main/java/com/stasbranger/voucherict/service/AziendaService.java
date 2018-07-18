package com.stasbranger.voucherict.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.stasbranger.voucherict.domain.Azienda;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * Service Interface for managing Azienda.
 */
public interface AziendaService {

    /**
     * Save a azienda.
     *
     * @param azienda the entity to save
     * @return the persisted entity
     */
    Azienda save(Azienda azienda);

    /**
     * Get all the aziendas.
     *
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Azienda> findAll(Pageable pageable);

    /**
     * Get the "id" azienda.
     *
     * @param id the id of the entity
     * @return the entity
     */
    Optional<Azienda> findOne(String id);

    /**
     * Delete the "id" azienda.
     *
     * @param id the id of the entity
     */
    void delete(String id);
    
    /**
     * Search for the azienda corresponding to the query.
     *
     * @param query the query of the search
     * 
     * @param pageable the pagination information
     * @return the list of entities
     */
    Page<Azienda> search(String query, Pageable pageable);
    
    /**
     * Import aziendas by pdf files
     *
     * @param File the file of the voucher
     */
    List<Azienda> importPdf(File file) throws IOException;
}
