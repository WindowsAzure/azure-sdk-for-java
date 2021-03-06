// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an environment instance. */
@JsonFlatten
@Fluent
public class EnvironmentFragment extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EnvironmentFragment.class);

    /*
     * The set of a VM and the setting id it was created for
     */
    @JsonProperty(value = "properties.resourceSets")
    private ResourceSetFragment resourceSets;

    /*
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /*
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the resourceSets property: The set of a VM and the setting id it was created for.
     *
     * @return the resourceSets value.
     */
    public ResourceSetFragment resourceSets() {
        return this.resourceSets;
    }

    /**
     * Set the resourceSets property: The set of a VM and the setting id it was created for.
     *
     * @param resourceSets the resourceSets value to set.
     * @return the EnvironmentFragment object itself.
     */
    public EnvironmentFragment withResourceSets(ResourceSetFragment resourceSets) {
        this.resourceSets = resourceSets;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning status of the resource.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the EnvironmentFragment object itself.
     */
    public EnvironmentFragment withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value.
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the uniqueIdentifier property: The unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set.
     * @return the EnvironmentFragment object itself.
     */
    public EnvironmentFragment withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentFragment withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public EnvironmentFragment withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceSets() != null) {
            resourceSets().validate();
        }
    }
}
