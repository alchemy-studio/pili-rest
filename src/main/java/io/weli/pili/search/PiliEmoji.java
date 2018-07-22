package io.weli.pili.search;

import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.UUID;

@SolrDocument(solrCoreName = "pili")
public class PiliEmoji {
    @Id
    @Field
    private String id;

    @Field
    private String name;

    @Field
    private String location;

    public PiliEmoji() {
    }

    public PiliEmoji(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
