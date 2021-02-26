// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The DppTrackedResource model. */
@Fluent
public class DppTrackedResource extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DppTrackedResource.class);

    /*
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String etag;

    /*
     * Input Managed Identity Details
     */
    @JsonProperty(value = "identity")
    private DppIdentityDetails identity;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

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
     * @return the DppTrackedResource object itself.
     */
    public DppTrackedResource withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the identity property: Input Managed Identity Details.
     *
     * @return the identity value.
     */
    public DppIdentityDetails identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Input Managed Identity Details.
     *
     * @param identity the identity value to set.
     * @return the DppTrackedResource object itself.
     */
    public DppTrackedResource withIdentity(DppIdentityDetails identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public DppTrackedResource withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DppTrackedResource withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (systemData() != null) {
            systemData().validate();
        }
    }
}
