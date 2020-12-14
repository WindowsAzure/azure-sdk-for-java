// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Query Text. */
@JsonFlatten
@Fluent
public class QueryTextInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryTextInner.class);

    /*
     * Query identifier unique to the server.
     */
    @JsonProperty(value = "properties.queryId")
    private String queryId;

    /*
     * Query text.
     */
    @JsonProperty(value = "properties.queryText")
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
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryId(String queryId) {
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
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryText(String queryText) {
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
