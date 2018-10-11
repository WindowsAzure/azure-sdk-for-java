/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.datalake.analytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Data Lake Analytics catalog U-SQL external datasource item.
 */
public class USqlExternalDataSource extends CatalogItem {
    /**
     * the name of the database.
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /**
     * the name of the external data source.
     */
    @JsonProperty(value = "externalDataSourceName")
    private String name;

    /**
     * the name of the provider for the external data source.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /**
     * the name of the provider string for the external data source.
     */
    @JsonProperty(value = "providerString")
    private String providerString;

    /**
     * the list of types to push down from the external data source.
     */
    @JsonProperty(value = "pushdownTypes")
    private List<String> pushdownTypes;

    /**
     * Get the name of the database.
     *
     * @return the databaseName value
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the name of the database.
     *
     * @param databaseName the databaseName value to set
     * @return the USqlExternalDataSource object itself.
     */
    public USqlExternalDataSource withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the name of the external data source.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the external data source.
     *
     * @param name the name value to set
     * @return the USqlExternalDataSource object itself.
     */
    public USqlExternalDataSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the name of the provider for the external data source.
     *
     * @return the provider value
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the name of the provider for the external data source.
     *
     * @param provider the provider value to set
     * @return the USqlExternalDataSource object itself.
     */
    public USqlExternalDataSource withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the name of the provider string for the external data source.
     *
     * @return the providerString value
     */
    public String providerString() {
        return this.providerString;
    }

    /**
     * Set the name of the provider string for the external data source.
     *
     * @param providerString the providerString value to set
     * @return the USqlExternalDataSource object itself.
     */
    public USqlExternalDataSource withProviderString(String providerString) {
        this.providerString = providerString;
        return this;
    }

    /**
     * Get the list of types to push down from the external data source.
     *
     * @return the pushdownTypes value
     */
    public List<String> pushdownTypes() {
        return this.pushdownTypes;
    }

    /**
     * Set the list of types to push down from the external data source.
     *
     * @param pushdownTypes the pushdownTypes value to set
     * @return the USqlExternalDataSource object itself.
     */
    public USqlExternalDataSource withPushdownTypes(List<String> pushdownTypes) {
        this.pushdownTypes = pushdownTypes;
        return this;
    }

}
