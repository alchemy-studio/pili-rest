package io.weli.pili.search;

import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface PiliEmojiRepo extends SolrCrudRepository<PiliEmoji, String> {

    @Query("name:?0")
    List<PiliEmoji> findAllByName(String keyword);
}

