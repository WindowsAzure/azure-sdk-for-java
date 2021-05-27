// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Skype channel definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "channelName")
@JsonTypeName("SkypeChannel")
@Fluent
public final class SkypeChannel extends Channel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkypeChannel.class);

    /*
     * The set of properties specific to Skype channel resource
     */
    @JsonProperty(value = "properties")
    private SkypeChannelProperties properties;

    /**
     * Get the properties property: The set of properties specific to Skype channel resource.
     *
     * @return the properties value.
     */
    public SkypeChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Skype channel resource.
     *
     * @param properties the properties value to set.
     * @return the SkypeChannel object itself.
     */
    public SkypeChannel withProperties(SkypeChannelProperties properties) {
        this.properties = properties;
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
        if (properties() != null) {
            properties().validate();
        }
    }
}
