package io.weli.pili.search;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "PiliEmoji")
public class PiliEmoji {
    @Id
    @Field
    private String id;

    @Field
    private String label;

    @Field
    private String location;

}
