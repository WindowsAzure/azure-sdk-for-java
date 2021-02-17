// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.providerhub.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.providerhub.models.TrafficRegions;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The CustomRolloutSpecification model. */
@Fluent
public class CustomRolloutSpecificationInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomRolloutSpecificationInner.class);

    /*
     * The canary property.
     */
    @JsonProperty(value = "canary", required = true)
    private TrafficRegions canary;

    /*
     * The providerRegistration property.
     */
    @JsonProperty(value = "providerRegistration")
    private ProviderRegistrationInner providerRegistration;

    /*
     * The resourceTypeRegistrations property.
     */
    @JsonProperty(value = "resourceTypeRegistrations")
    private List<ResourceTypeRegistrationInner> resourceTypeRegistrations;

    /**
     * Get the canary property: The canary property.
     *
     * @return the canary value.
     */
    public TrafficRegions canary() {
        return this.canary;
    }

    /**
     * Set the canary property: The canary property.
     *
     * @param canary the canary value to set.
     * @return the CustomRolloutSpecificationInner object itself.
     */
    public CustomRolloutSpecificationInner withCanary(TrafficRegions canary) {
        this.canary = canary;
        return this;
    }

    /**
     * Get the providerRegistration property: The providerRegistration property.
     *
     * @return the providerRegistration value.
     */
    public ProviderRegistrationInner providerRegistration() {
        return this.providerRegistration;
    }

    /**
     * Set the providerRegistration property: The providerRegistration property.
     *
     * @param providerRegistration the providerRegistration value to set.
     * @return the CustomRolloutSpecificationInner object itself.
     */
    public CustomRolloutSpecificationInner withProviderRegistration(ProviderRegistrationInner providerRegistration) {
        this.providerRegistration = providerRegistration;
        return this;
    }

    /**
     * Get the resourceTypeRegistrations property: The resourceTypeRegistrations property.
     *
     * @return the resourceTypeRegistrations value.
     */
    public List<ResourceTypeRegistrationInner> resourceTypeRegistrations() {
        return this.resourceTypeRegistrations;
    }

    /**
     * Set the resourceTypeRegistrations property: The resourceTypeRegistrations property.
     *
     * @param resourceTypeRegistrations the resourceTypeRegistrations value to set.
     * @return the CustomRolloutSpecificationInner object itself.
     */
    public CustomRolloutSpecificationInner withResourceTypeRegistrations(
        List<ResourceTypeRegistrationInner> resourceTypeRegistrations) {
        this.resourceTypeRegistrations = resourceTypeRegistrations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (canary() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property canary in model CustomRolloutSpecificationInner"));
        } else {
            canary().validate();
        }
        if (providerRegistration() != null) {
            providerRegistration().validate();
        }
        if (resourceTypeRegistrations() != null) {
            resourceTypeRegistrations().forEach(e -> e.validate());
        }
    }
}
