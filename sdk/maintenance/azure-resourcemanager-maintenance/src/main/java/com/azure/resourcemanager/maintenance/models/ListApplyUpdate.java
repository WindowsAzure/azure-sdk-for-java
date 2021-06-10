// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.maintenance.fluent.models.ApplyUpdateInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ApplyUpdate list. */
@Fluent
public final class ListApplyUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ListApplyUpdate.class);

    /*
     * The list of apply updates
     */
    @JsonProperty(value = "value")
    private List<ApplyUpdateInner> value;

    /**
     * Get the value property: The list of apply updates.
     *
     * @return the value value.
     */
    public List<ApplyUpdateInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of apply updates.
     *
     * @param value the value value to set.
     * @return the ListApplyUpdate object itself.
     */
    public ListApplyUpdate withValue(List<ApplyUpdateInner> value) {
        this.value = value;
        return this;
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
