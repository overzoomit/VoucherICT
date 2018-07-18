package com.stasbranger.voucherict.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.stasbranger.voucherict.domain.Azienda;

/**
 * Spring Data MongoDB repository for the Azienda entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AziendaRepository extends MongoRepository<Azienda, String> {
}
