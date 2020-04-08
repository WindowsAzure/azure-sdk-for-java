// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The TableCreateUpdateParameters model. */
@JsonFlatten
@Fluent
public class TableCreateUpdateParameters extends ARMResourceProperties {
    /*
     * The standard JSON format of a Table
     */
    @JsonProperty(value = "properties.resource", required = true)
    private TableResource resource;

    /*
     * A key-value pair of options to be applied for the request. This
     * corresponds to the headers sent with the request.
     */
    @JsonProperty(value = "properties.options", required = true)
    private Map<String, String> options;

    /**
     * Get the resource property: The standard JSON format of a Table.
     *
     * @return the resource value.
     */
    public TableResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The standard JSON format of a Table.
     *
     * @param resource the resource value to set.
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withResource(TableResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @return the options value.
     */
    public Map<String, String> options() {
        return this.options;
    }

    /**
     * Set the options property: A key-value pair of options to be applied for the request. This corresponds to the
     * headers sent with the request.
     *
     * @param options the options value to set.
     * @return the TableCreateUpdateParameters object itself.
     */
    public TableCreateUpdateParameters withOptions(Map<String, String> options) {
        this.options = options;
        return this;
    }
}
