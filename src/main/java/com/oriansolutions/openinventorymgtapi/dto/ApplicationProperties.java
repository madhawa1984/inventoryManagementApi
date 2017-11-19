package com.oriansolutions.openinventorymgtapi.dto;


import org.springframework.boot.context.properties.ConfigurationProperties;
import java.util.Map;

/**
 * Created by madhawa on 11/19/17.
 */

@ConfigurationProperties("application")
public class ApplicationProperties {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getDatasource() {
        return datasource;
    }
    public void setDatasource(Map<String, String> datasource) {
        this.datasource = datasource;
    }

    private String name;
    private Map<String,String> datasource;


}
