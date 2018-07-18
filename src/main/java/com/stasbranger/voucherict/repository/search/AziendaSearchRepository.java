package com.stasbranger.voucherict.repository.search;

import com.stasbranger.voucherict.domain.Azienda;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the Azienda entity.
 */
public interface AziendaSearchRepository extends ElasticsearchRepository<Azienda, String> {
}
