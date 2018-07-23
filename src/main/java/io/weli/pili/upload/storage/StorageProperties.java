package io.weli.pili.upload.storage;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class StorageProperties {

    /**
     * Folder location for storing files
     */
    private String location = "./target/classes/static/";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
