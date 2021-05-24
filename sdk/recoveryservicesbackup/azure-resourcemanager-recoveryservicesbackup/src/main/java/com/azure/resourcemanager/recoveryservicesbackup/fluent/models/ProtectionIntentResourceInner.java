// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.models.ProtectionIntent;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Base class for backup ProtectionIntent. */
@Fluent
public final class ProtectionIntentResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProtectionIntentResourceInner.class);

    /*
     * ProtectionIntentResource properties
     */
    @JsonProperty(value = "properties")
    private ProtectionIntent properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the properties property: ProtectionIntentResource properties.
     *
     * @return the properties value.
     */
    public ProtectionIntent properties() {
        return this.properties;
    }

    /**
     * Set the properties property: ProtectionIntentResource properties.
     *
     * @param properties the properties value to set.
     * @return the ProtectionIntentResourceInner object itself.
     */
    public ProtectionIntentResourceInner withProperties(ProtectionIntent properties) {
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
     * @return the ProtectionIntentResourceInner object itself.
     */
    public ProtectionIntentResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectionIntentResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProtectionIntentResourceInner withTags(Map<String, String> tags) {
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
