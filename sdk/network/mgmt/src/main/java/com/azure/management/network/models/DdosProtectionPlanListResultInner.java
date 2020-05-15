// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DdosProtectionPlanListResult model. */
@Fluent
public final class DdosProtectionPlanListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DdosProtectionPlanListResultInner.class);

    /*
     * A list of DDoS protection plans.
     */
    @JsonProperty(value = "value")
    private List<DdosProtectionPlanInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: A list of DDoS protection plans.
     *
     * @return the value value.
     */
    public List<DdosProtectionPlanInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of DDoS protection plans.
     *
     * @param value the value value to set.
     * @return the DdosProtectionPlanListResultInner object itself.
     */
    public DdosProtectionPlanListResultInner withValue(List<DdosProtectionPlanInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
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
