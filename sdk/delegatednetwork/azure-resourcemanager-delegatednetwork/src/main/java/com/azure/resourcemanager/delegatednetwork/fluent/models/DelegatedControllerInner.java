// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.delegatednetwork.models.ControllerResource;
import com.azure.resourcemanager.delegatednetwork.models.DelegatedControllerProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an instance of a DNC controller. */
@Fluent
public final class DelegatedControllerInner extends ControllerResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DelegatedControllerInner.class);

    /*
     * Properties of the provision operation request.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private DelegatedControllerProperties properties;

    /**
     * Get the properties property: Properties of the provision operation request.
     *
     * @return the properties value.
     */
    public DelegatedControllerProperties properties() {
        return this.properties;
    }

    /** {@inheritDoc} */
    @Override
    public DelegatedControllerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DelegatedControllerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
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
