package io.weli.pili.search;

import org.springframework.data.solr.repository.SolrCrudRepository;

public interface PiliEmojiRepo extends SolrCrudRepository<PiliEmoji, String> {
}
