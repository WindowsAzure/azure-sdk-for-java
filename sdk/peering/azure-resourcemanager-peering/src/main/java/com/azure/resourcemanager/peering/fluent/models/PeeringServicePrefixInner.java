// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.peering.models.LearnedType;
import com.azure.resourcemanager.peering.models.PeeringServicePrefixEvent;
import com.azure.resourcemanager.peering.models.PrefixValidationState;
import com.azure.resourcemanager.peering.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The peering service prefix class. */
@JsonFlatten
@Fluent
public class PeeringServicePrefixInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PeeringServicePrefixInner.class);

    /*
     * The prefix from which your traffic originates.
     */
    @JsonProperty(value = "properties.prefix")
    private String prefix;

    /*
     * The prefix validation state
     */
    @JsonProperty(value = "properties.prefixValidationState", access = JsonProperty.Access.WRITE_ONLY)
    private PrefixValidationState prefixValidationState;

    /*
     * The prefix learned type
     */
    @JsonProperty(value = "properties.learnedType", access = JsonProperty.Access.WRITE_ONLY)
    private LearnedType learnedType;

    /*
     * The error message for validation state
     */
    @JsonProperty(value = "properties.errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /*
     * The list of events for peering service prefix
     */
    @JsonProperty(value = "properties.events", access = JsonProperty.Access.WRITE_ONLY)
    private List<PeeringServicePrefixEvent> events;

    /*
     * The peering service prefix key
     */
    @JsonProperty(value = "properties.peeringServicePrefixKey")
    private String peeringServicePrefixKey;

    /*
     * The provisioning state of the resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Get the prefix property: The prefix from which your traffic originates.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.prefix;
    }

    /**
     * Set the prefix property: The prefix from which your traffic originates.
     *
     * @param prefix the prefix value to set.
     * @return the PeeringServicePrefixInner object itself.
     */
    public PeeringServicePrefixInner withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * Get the prefixValidationState property: The prefix validation state.
     *
     * @return the prefixValidationState value.
     */
    public PrefixValidationState prefixValidationState() {
        return this.prefixValidationState;
    }

    /**
     * Get the learnedType property: The prefix learned type.
     *
     * @return the learnedType value.
     */
    public LearnedType learnedType() {
        return this.learnedType;
    }

    /**
     * Get the errorMessage property: The error message for validation state.
     *
     * @return the errorMessage value.
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the events property: The list of events for peering service prefix.
     *
     * @return the events value.
     */
    public List<PeeringServicePrefixEvent> events() {
        return this.events;
    }

    /**
     * Get the peeringServicePrefixKey property: The peering service prefix key.
     *
     * @return the peeringServicePrefixKey value.
     */
    public String peeringServicePrefixKey() {
        return this.peeringServicePrefixKey;
    }

    /**
     * Set the peeringServicePrefixKey property: The peering service prefix key.
     *
     * @param peeringServicePrefixKey the peeringServicePrefixKey value to set.
     * @return the PeeringServicePrefixInner object itself.
     */
    public PeeringServicePrefixInner withPeeringServicePrefixKey(String peeringServicePrefixKey) {
        this.peeringServicePrefixKey = peeringServicePrefixKey;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
    }
}
