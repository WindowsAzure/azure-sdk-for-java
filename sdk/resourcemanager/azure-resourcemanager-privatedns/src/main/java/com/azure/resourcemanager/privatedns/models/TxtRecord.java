// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.privatedns.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The TxtRecord model. */
@Fluent
public final class TxtRecord {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TxtRecord.class);

    /*
     * The text value of this TXT record.
     */
    @JsonProperty(value = "value")
    private List<String> value;

    /**
     * Get the value property: The text value of this TXT record.
     *
     * @return the value value.
     */
    public List<String> value() {
        return this.value;
    }

    /**
     * Set the value property: The text value of this TXT record.
     *
     * @param value the value value to set.
     * @return the TxtRecord object itself.
     */
    public TxtRecord withValue(List<String> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
