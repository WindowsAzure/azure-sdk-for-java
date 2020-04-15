// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.cosmosdb.ARMResourceProperties;
import com.azure.management.cosmosdb.SqlStoredProcedureGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SqlStoredProcedureGetResults model. */
@JsonFlatten
@Fluent
public class SqlStoredProcedureGetResultsInner extends ARMResourceProperties {
    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private SqlStoredProcedureGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public SqlStoredProcedureGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the SqlStoredProcedureGetResultsInner object itself.
     */
    public SqlStoredProcedureGetResultsInner withResource(SqlStoredProcedureGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }
}
