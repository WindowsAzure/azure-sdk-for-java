// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storage.generated.fluent.models.UsageInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response from the List Usages operation. */
@Fluent
public final class UsageListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UsageListResult.class);

    /*
     * Gets or sets the list of Storage Resource Usages.
     */
    @JsonProperty(value = "value")
    private List<UsageInner> value;

    /**
     * Get the value property: Gets or sets the list of Storage Resource Usages.
     *
     * @return the value value.
     */
    public List<UsageInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets the list of Storage Resource Usages.
     *
     * @param value the value value to set.
     * @return the UsageListResult object itself.
     */
    public UsageListResult withValue(List<UsageInner> value) {
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
