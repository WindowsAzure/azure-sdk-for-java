// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AvailabilitySetListResult model. */
@Fluent
public final class AvailabilitySetListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AvailabilitySetListResultInner.class);

    /*
     * The list of availability sets
     */
    @JsonProperty(value = "value", required = true)
    private List<AvailabilitySetInner> value;

    /*
     * The URI to fetch the next page of AvailabilitySets. Call ListNext() with
     * this URI to fetch the next page of AvailabilitySets.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of availability sets.
     *
     * @return the value value.
     */
    public List<AvailabilitySetInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of availability sets.
     *
     * @param value the value value to set.
     * @return the AvailabilitySetListResultInner object itself.
     */
    public AvailabilitySetListResultInner withValue(List<AvailabilitySetInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of AvailabilitySets. Call ListNext() with this URI to
     * fetch the next page of AvailabilitySets.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of AvailabilitySets. Call ListNext() with this URI to
     * fetch the next page of AvailabilitySets.
     *
     * @param nextLink the nextLink value to set.
     * @return the AvailabilitySetListResultInner object itself.
     */
    public AvailabilitySetListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property value in model AvailabilitySetListResultInner"));
        } else {
            value().forEach(e -> e.validate());
        }
    }
}
