// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The MongoDBDatabaseGetPropertiesResource model.
 */
@Immutable
public final class MongoDBDatabaseGetPropertiesResource extends MongoDBDatabaseResource {
    /*
     * A system generated property. A unique identifier.
     */
    @JsonProperty(value = "_rid", access = JsonProperty.Access.WRITE_ONLY)
    private String rid;

    /*
     * A system generated property that denotes the last updated timestamp of
     * the resource.
     */
    @JsonProperty(value = "_ts", access = JsonProperty.Access.WRITE_ONLY)
    private Object ts;

    /*
     * A system generated property representing the resource etag required for
     * optimistic concurrency control.
     */
    @JsonProperty(value = "_etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the rid property: A system generated property. A unique identifier.
     * 
     * @return the rid value.
     */
    public String rid() {
        return this.rid;
    }

    /**
     * Get the ts property: A system generated property that denotes the last
     * updated timestamp of the resource.
     * 
     * @return the ts value.
     */
    public Object ts() {
        return this.ts;
    }

    /**
     * Get the etag property: A system generated property representing the
     * resource etag required for optimistic concurrency control.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }
}
