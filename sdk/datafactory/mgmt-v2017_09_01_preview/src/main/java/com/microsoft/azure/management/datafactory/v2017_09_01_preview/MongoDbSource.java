/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A copy activity source for a MongoDB database.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = MongoDbSource.class)
@JsonTypeName("MongoDbSource")
public class MongoDbSource extends CopySource {
    /**
     * Database query. Should be a SQL-92 query expression. Type: string (or
     * Expression with resultType string).
     */
    @JsonProperty(value = "query")
    private Object query;

    /**
     * Get database query. Should be a SQL-92 query expression. Type: string (or Expression with resultType string).
     *
     * @return the query value
     */
    public Object query() {
        return this.query;
    }

    /**
     * Set database query. Should be a SQL-92 query expression. Type: string (or Expression with resultType string).
     *
     * @param query the query value to set
     * @return the MongoDbSource object itself.
     */
    public MongoDbSource withQuery(Object query) {
        this.query = query;
        return this;
    }

}
