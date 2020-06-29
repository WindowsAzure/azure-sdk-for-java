/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters to create and update Cosmos DB storedProcedure.
 */
@JsonFlatten
public class SqlStoredProcedureCreateUpdateParameters extends ARMResourceProperties {
    /**
     * The standard JSON format of a storedProcedure.
     */
    @JsonProperty(value = "properties.resource", required = true)
    private SqlStoredProcedureResource resource;

    /**
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private CreateUpdateOptions options;

    /**
     * Get the standard JSON format of a storedProcedure.
     *
     * @return the resource value
     */
    public SqlStoredProcedureResource resource() {
        return this.resource;
    }

    /**
     * Set the standard JSON format of a storedProcedure.
     *
     * @param resource the resource value to set
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withResource(SqlStoredProcedureResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @return the options value
     */
    public CreateUpdateOptions options() {
        return this.options;
    }

    /**
     * Set a key-value pair of options to be applied for the request. This corresponds to the headers sent with the request.
     *
     * @param options the options value to set
     * @return the SqlStoredProcedureCreateUpdateParameters object itself.
     */
    public SqlStoredProcedureCreateUpdateParameters withOptions(CreateUpdateOptions options) {
        this.options = options;
        return this;
    }

}
