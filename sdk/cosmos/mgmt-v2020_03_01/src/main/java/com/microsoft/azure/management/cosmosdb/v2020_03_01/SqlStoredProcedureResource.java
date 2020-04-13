/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB SQL storedProcedure resource object.
 */
public class SqlStoredProcedureResource {
    /**
     * Name of the Cosmos DB SQL storedProcedure.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Body of the Stored Procedure.
     */
    @JsonProperty(value = "body")
    private String body;

    /**
     * Get name of the Cosmos DB SQL storedProcedure.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set name of the Cosmos DB SQL storedProcedure.
     *
     * @param id the id value to set
     * @return the SqlStoredProcedureResource object itself.
     */
    public SqlStoredProcedureResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get body of the Stored Procedure.
     *
     * @return the body value
     */
    public String body() {
        return this.body;
    }

    /**
     * Set body of the Stored Procedure.
     *
     * @param body the body value to set
     * @return the SqlStoredProcedureResource object itself.
     */
    public SqlStoredProcedureResource withBody(String body) {
        this.body = body;
        return this;
    }

}
