package io.weli.pili.search;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

public interface PiliEmojiRepo extends SolrCrudRepository<PiliEmoji, String> {
    @Query("name:*?0*")
    Page<PiliEmoji> query(String keyword, Pageable pageable);

}

