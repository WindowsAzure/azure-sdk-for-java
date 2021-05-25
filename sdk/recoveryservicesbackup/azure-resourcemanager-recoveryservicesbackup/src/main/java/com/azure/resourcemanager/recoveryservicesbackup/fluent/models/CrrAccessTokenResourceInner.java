// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicesbackup.models.CrrAccessToken;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The CrrAccessTokenResource model. */
@Fluent
public final class CrrAccessTokenResourceInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CrrAccessTokenResourceInner.class);

    /*
     * CrrAccessTokenResource properties
     */
    @JsonProperty(value = "properties")
    private CrrAccessToken properties;

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /**
     * Get the properties property: CrrAccessTokenResource properties.
     *
     * @return the properties value.
     */
    public CrrAccessToken properties() {
        return this.properties;
    }

    /**
     * Set the properties property: CrrAccessTokenResource properties.
     *
     * @param properties the properties value to set.
     * @return the CrrAccessTokenResourceInner object itself.
     */
    public CrrAccessTokenResourceInner withProperties(CrrAccessToken properties) {
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
     * @return the CrrAccessTokenResourceInner object itself.
     */
    public CrrAccessTokenResourceInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CrrAccessTokenResourceInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CrrAccessTokenResourceInner withTags(Map<String, String> tags) {
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
