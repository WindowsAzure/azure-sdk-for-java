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

/** Web Chat channel definition. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "channelName")
@JsonTypeName("WebChatChannel")
@Fluent
public final class WebChatChannel extends Channel {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebChatChannel.class);

    /*
     * The set of properties specific to Web Chat channel resource
     */
    @JsonProperty(value = "properties")
    private WebChatChannelProperties properties;

    /**
     * Get the properties property: The set of properties specific to Web Chat channel resource.
     *
     * @return the properties value.
     */
    public WebChatChannelProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The set of properties specific to Web Chat channel resource.
     *
     * @param properties the properties value to set.
     * @return the WebChatChannel object itself.
     */
    public WebChatChannel withProperties(WebChatChannelProperties properties) {
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
