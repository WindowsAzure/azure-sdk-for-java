/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2020_01_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Represents a Query Text.
 */
@JsonFlatten
public class QueryTextInner extends ProxyResource {
    /**
     * Query identifier unique to the server.
     */
    @JsonProperty(value = "properties.queryId")
    private String queryId;

    /**
     * Query text.
     */
    @JsonProperty(value = "properties.queryText")
    private String queryText;

    /**
     * Get query identifier unique to the server.
     *
     * @return the queryId value
     */
    public String queryId() {
        return this.queryId;
    }

    /**
     * Set query identifier unique to the server.
     *
     * @param queryId the queryId value to set
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryId(String queryId) {
        this.queryId = queryId;
        return this;
    }

    /**
     * Get query text.
     *
     * @return the queryText value
     */
    public String queryText() {
        return this.queryText;
    }

    /**
     * Set query text.
     *
     * @param queryText the queryText value to set
     * @return the QueryTextInner object itself.
     */
    public QueryTextInner withQueryText(String queryText) {
        this.queryText = queryText;
        return this;
    }

}
