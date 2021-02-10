// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The response for a single table. */
@Fluent
public final class TableResponse extends TableResponseProperties {
    /*
     * The metadata response of the table.
     */
    @JsonProperty(value = "odata.metadata")
    private String odataMetadata;

    /**
     * Get the odataMetadata property: The metadata response of the table.
     *
     * @return the odataMetadata value.
     */
    public String getOdataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The metadata response of the table.
     *
     * @param odataMetadata the odataMetadata value to set.
     * @return the TableResponse object itself.
     */
    public TableResponse setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
        return this;
    }
}
