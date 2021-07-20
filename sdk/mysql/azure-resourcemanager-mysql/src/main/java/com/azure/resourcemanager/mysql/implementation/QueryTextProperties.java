// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of a query text. */
@Fluent
public final class QueryTextProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryTextProperties.class);

    /*
     * Query identifier unique to the server.
     */
    @JsonProperty(value = "queryId")
    private String queryId;

    /*
     * Query text.
     */
    @JsonProperty(value = "queryText")
    private String queryText;

    /**
     * Get the queryId property: Query identifier unique to the server.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set the queryId property: Query identifier unique to the server.
     *
     * @param queryId the queryId value to set.
     * @return the QueryTextProperties object itself.
     */
    public QueryTextProperties withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get the queryText property: Query text.
     *
     * @return the queryText value.
     */
    public String queryText() {
        return this.queryText;
    }

    /**
     * Set the queryText property: Query text.
     *
     * @param queryText the queryText value to set.
     * @return the QueryTextProperties object itself.
     */
    public QueryTextProperties withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
