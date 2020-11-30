// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cosmos.models.ArmResourceProperties;
import com.azure.resourcemanager.cosmos.models.ThroughputSettingsGetPropertiesResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Azure Cosmos DB resource throughput. */
@JsonFlatten
@Fluent
public class ThroughputSettingsGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThroughputSettingsGetResultsInner.class);

    /*
     * The resource property.
     */
    @JsonProperty(value = "properties.resource")
    private ThroughputSettingsGetPropertiesResource resource;

    /**
     * Get the resource property: The resource property.
     *
     * @return the resource value.
     */
    public ThroughputSettingsGetPropertiesResource resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The resource property.
     *
     * @param resource the resource value to set.
     * @return the ThroughputSettingsGetResultsInner object itself.
     */
    public ThroughputSettingsGetResultsInner withResource(ThroughputSettingsGetPropertiesResource resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (resource() != null) {
            resource().validate();
        }
    }
}
