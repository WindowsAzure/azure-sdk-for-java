// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datadog.models.IdentityProperties;
import com.azure.resourcemanager.datadog.models.MonitorProperties;
import com.azure.resourcemanager.datadog.models.ResourceSku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The DatadogMonitorResource model. */
@Fluent
public final class DatadogMonitorResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatadogMonitorResourceInner.class);

    /*
     * The sku property.
     */
    @JsonProperty(value = "sku")
    private ResourceSku sku;

    /*
     * Properties specific to the monitor resource.
     */
    @JsonProperty(value = "properties")
    private MonitorProperties properties;

    /*
     * The identity property.
     */
    @JsonProperty(value = "identity")
    private IdentityProperties identity;

    /**
     * Get the sku property: The sku property.
     *
     * @return the sku value.
     */
    public ResourceSku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The sku property.
     *
     * @param sku the sku value to set.
     * @return the DatadogMonitorResourceInner object itself.
     */
    public DatadogMonitorResourceInner withSku(ResourceSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Properties specific to the monitor resource.
     *
     * @return the properties value.
     */
    public MonitorProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties specific to the monitor resource.
     *
     * @param properties the properties value to set.
     * @return the DatadogMonitorResourceInner object itself.
     */
    public DatadogMonitorResourceInner withProperties(MonitorProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the identity property: The identity property.
     *
     * @return the identity value.
     */
    public IdentityProperties identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The identity property.
     *
     * @param identity the identity value to set.
     * @return the DatadogMonitorResourceInner object itself.
     */
    public DatadogMonitorResourceInner withIdentity(IdentityProperties identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatadogMonitorResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DatadogMonitorResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (identity() != null) {
            identity().validate();
        }
    }
}
