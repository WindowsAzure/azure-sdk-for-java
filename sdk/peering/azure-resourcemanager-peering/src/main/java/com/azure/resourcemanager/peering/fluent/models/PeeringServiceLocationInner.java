// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PeeringService location. */
@JsonFlatten
@Fluent
public class PeeringServiceLocationInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringServiceLocationInner.class);

    /*
     * Country of the customer
     */
    @JsonProperty(value = "properties.country")
    private String country;

    /*
     * State of the customer
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /*
     * Azure region for the location
     */
    @JsonProperty(value = "properties.azureRegion")
    private String azureRegion;

    /**
     * Get the country property: Country of the customer.
     *
     * @return the country value.
     */
    public String country() {
        return this.country;
    }

    /**
     * Set the country property: Country of the customer.
     *
     * @param country the country value to set.
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * Get the state property: State of the customer.
     *
     * @return the state value.
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state property: State of the customer.
     *
     * @param state the state value to set.
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the azureRegion property: Azure region for the location.
     *
     * @return the azureRegion value.
     */
    public String azureRegion() {
        return this.azureRegion;
    }

    /**
     * Set the azureRegion property: Azure region for the location.
     *
     * @param azureRegion the azureRegion value to set.
     * @return the PeeringServiceLocationInner object itself.
     */
    public PeeringServiceLocationInner withAzureRegion(String azureRegion) {
        this.azureRegion = azureRegion;
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
