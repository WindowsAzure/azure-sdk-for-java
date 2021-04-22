// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceLocationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The paginated list of peering service locations. */
@Fluent
public final class PeeringServiceLocationListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringServiceLocationListResult.class);

    /*
     * The list of peering service locations.
     */
    @JsonProperty(value = "value")
    private List<PeeringServiceLocationInner> value;

    /*
     * The link to fetch the next page of peering service locations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of peering service locations.
     *
     * @return the value value.
     */
    public List<PeeringServiceLocationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of peering service locations.
     *
     * @param value the value value to set.
     * @return the PeeringServiceLocationListResult object itself.
     */
    public PeeringServiceLocationListResult withValue(List<PeeringServiceLocationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to fetch the next page of peering service locations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to fetch the next page of peering service locations.
     *
     * @param nextLink the nextLink value to set.
     * @return the PeeringServiceLocationListResult object itself.
     */
    public PeeringServiceLocationListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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