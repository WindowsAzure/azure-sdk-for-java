// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IoT site model. */
@JsonFlatten
@Fluent
public class IotSitesModelInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotSitesModelInner.class);

    /*
     * Display name of the IoT site
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /*
     * Tags of the IoT site
     */
    @JsonProperty(value = "properties.tags")
    private Map<String, String> tags;

    /**
     * Get the displayName property: Display name of the IoT site.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Display name of the IoT site.
     *
     * @param displayName the displayName value to set.
     * @return the IotSitesModelInner object itself.
     */
    public IotSitesModelInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the tags property: Tags of the IoT site.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Tags of the IoT site.
     *
     * @param tags the tags value to set.
     * @return the IotSitesModelInner object itself.
     */
    public IotSitesModelInner withTags(Map<String, String> tags) {
        this.tags = tags;
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
