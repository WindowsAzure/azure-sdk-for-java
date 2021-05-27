// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectableContainer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Protectable Container Class. */
@Fluent
public final class ProtectableContainerResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectableContainerResourceInner.class);

    /*
     * ProtectableContainerResource properties
     */
    @JsonProperty(value = "properties")
    private ProtectableContainer properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the properties property: ProtectableContainerResource properties.
     *
     * @return the properties value.
     */
    public ProtectableContainer properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ProtectableContainerResource properties.
     *
     * @param properties the properties value to set.
     * @return the ProtectableContainerResourceInner object itself.
     */
    public ProtectableContainerResourceInner withProperties(ProtectableContainer properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the etag property: Optional ETag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: Optional ETag.
     *
     * @param etag the etag value to set.
     * @return the ProtectableContainerResourceInner object itself.
     */
    public ProtectableContainerResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectableContainerResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectableContainerResourceInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
