package io.weli.pili.search;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(solrCoreName = "pili")
public class PiliEmoji {
    @Id
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String location;

    public PiliEmoji(String name, String location) {
        this.name = name;
        this.location = location;
    }


}
