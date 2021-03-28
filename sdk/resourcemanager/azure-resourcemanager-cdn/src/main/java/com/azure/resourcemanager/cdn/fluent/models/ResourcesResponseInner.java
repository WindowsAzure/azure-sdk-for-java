// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cdn.models.ResourcesResponseCustomDomainsItem;
import com.azure.resourcemanager.cdn.models.ResourcesResponseEndpointsItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Resources Response. */
@Fluent
public final class ResourcesResponseInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ResourcesResponseInner.class);

    /*
     * The endpoints property.
     */
    @JsonProperty(value = "endpoints")
    private List<ResourcesResponseEndpointsItem> endpoints;

    /*
     * The customDomains property.
     */
    @JsonProperty(value = "customDomains")
    private List<ResourcesResponseCustomDomainsItem> customDomains;

    /**
     * Get the endpoints property: The endpoints property.
     *
     * @return the endpoints value.
     */
    public List<ResourcesResponseEndpointsItem> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The endpoints property.
     *
     * @param endpoints the endpoints value to set.
     * @return the ResourcesResponseInner object itself.
     */
    public ResourcesResponseInner withEndpoints(List<ResourcesResponseEndpointsItem> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the customDomains property: The customDomains property.
     *
     * @return the customDomains value.
     */
    public List<ResourcesResponseCustomDomainsItem> customDomains() {
        return this.customDomains;
    }

    /**
     * Set the customDomains property: The customDomains property.
     *
     * @param customDomains the customDomains value to set.
     * @return the ResourcesResponseInner object itself.
     */
    public ResourcesResponseInner withCustomDomains(List<ResourcesResponseCustomDomainsItem> customDomains) {
        this.customDomains = customDomains;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
        if (customDomains() != null) {
            customDomains().forEach(e -> e.validate());
        }
    }
}
