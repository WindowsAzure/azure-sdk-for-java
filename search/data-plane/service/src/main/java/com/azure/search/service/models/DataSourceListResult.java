/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Response from a List Datasources request. If successful, it includes the
 * full definitions of all datasources.
 */
public class DataSourceListResult {
    /**
     * The datasources in the Search service.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataSource> dataSources;

    /**
     * Get the datasources in the Search service.
     *
     * @return the dataSources value
     */
    public List<DataSource> dataSources() {
        return this.dataSources;
    }

}
