// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.privatedns.fluent.models.RecordSetInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response to a record set list operation. */
@Fluent
public final class RecordSetListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecordSetListResult.class);

    /*
     * Information about the record sets in the response.
     */
    @JsonProperty(value = "value")
    private List<RecordSetInner> value;

    /*
     * The continuation token for the next page of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: Information about the record sets in the response.
     *
     * @return the value value.
     */
    public List<RecordSetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Information about the record sets in the response.
     *
     * @param value the value value to set.
     * @return the RecordSetListResult object itself.
     */
    public RecordSetListResult withValue(List<RecordSetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The continuation token for the next page of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
