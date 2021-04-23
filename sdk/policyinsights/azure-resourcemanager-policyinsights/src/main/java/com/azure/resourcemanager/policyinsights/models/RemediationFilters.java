// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The filters that will be applied to determine which resources to remediate. */
@Fluent
public final class RemediationFilters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RemediationFilters.class);

    /*
     * The resource locations that will be remediated.
     */
    @JsonProperty(value = "locations")
    private List<String> locations;

    /**
     * Get the locations property: The resource locations that will be remediated.
     *
     * @return the locations value.
     */
    public List<String> locations() {
        return this.locations;
    }

    /**
     * Set the locations property: The resource locations that will be remediated.
     *
     * @param locations the locations value to set.
     * @return the RemediationFilters object itself.
     */
    public RemediationFilters withLocations(List<String> locations) {
        this.locations = locations;
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
