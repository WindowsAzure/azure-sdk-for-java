// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.implementation.QueryTextProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Represents a Query Text. */
@Fluent
public final class QueryTextInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(QueryTextInner.class);

    /*
     * The properties of a query text.
     */
    @JsonProperty(value = "properties")
    private QueryTextProperties properties;

    /**
     * Get the properties property: The properties of a query text.
     *
     * @return the properties value.
     */
    private QueryTextProperties properties() {
        return this.properties;
    }

    /**
     * Get the queryId property: Query identifier unique to the server.
     *
     * @return the queryId value.
     */
    public String queryId() {
        return this.properties() == null ? null : this.properties().queryId();
    }

    /**
     * Set the queryId property: Query identifier unique to the server.
     *
     * @param queryId the queryId value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryId(String queryId) {
        if (this.properties() == null) {
            this.properties = new QueryTextProperties();
        }
        this.properties().withQueryId(queryId);
        return this;
    }

    /**
     * Get the queryText property: Query text.
     *
     * @return the queryText value.
     */
    public String queryText() {
        return this.properties() == null ? null : this.properties().queryText();
    }

    /**
     * Set the queryText property: Query text.
     *
     * @param queryText the queryText value to set.
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryText(String queryText) {
        if (this.properties() == null) {
            this.properties = new QueryTextProperties();
        }
        this.properties().withQueryText(queryText);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
