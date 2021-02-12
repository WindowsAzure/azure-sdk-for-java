// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.digitaltwins.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The description of the DigitalTwins service. */
@Fluent
public final class DigitalTwinsPatchDescription {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DigitalTwinsPatchDescription.class);

    /*
     * Instance patch properties
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The managed identity for the DigitalTwinsInstance.
     */
    @JsonProperty(value = "identity")
    private DigitalTwinsIdentity identity;

    /*
     * Properties for the DigitalTwinsInstance.
     */
    @JsonProperty(value = "properties")
    private DigitalTwinsPatchProperties properties;

    /**
     * Get the tags property: Instance patch properties.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Instance patch properties.
     *
     * @param tags the tags value to set.
     * @return the DigitalTwinsPatchDescription object itself.
     */
    public DigitalTwinsPatchDescription withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the identity property: The managed identity for the DigitalTwinsInstance.
     *
     * @return the identity value.
     */
    public DigitalTwinsIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity for the DigitalTwinsInstance.
     *
     * @param identity the identity value to set.
     * @return the DigitalTwinsPatchDescription object itself.
     */
    public DigitalTwinsPatchDescription withIdentity(DigitalTwinsIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: Properties for the DigitalTwinsInstance.
     *
     * @return the properties value.
     */
    public DigitalTwinsPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties for the DigitalTwinsInstance.
     *
     * @param properties the properties value to set.
     * @return the DigitalTwinsPatchDescription object itself.
     */
    public DigitalTwinsPatchDescription withProperties(DigitalTwinsPatchProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
