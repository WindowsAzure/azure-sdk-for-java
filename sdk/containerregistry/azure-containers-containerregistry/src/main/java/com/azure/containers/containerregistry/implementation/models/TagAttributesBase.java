// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.ContentProperties;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Tag attribute details. */
@Immutable
public final class TagAttributesBase {
    /*
     * Tag name
     */
    @JsonProperty(value = "name", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Tag digest
     */
    @JsonProperty(value = "digest", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private String digest;

    /*
     * Tag created time
     */
    @JsonProperty(value = "createdTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * Tag last update time
     */
    @JsonProperty(value = "lastUpdateTime", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /*
     * Writeable properties of the resource
     */
    @JsonProperty(value = "changeableAttributes", required = true, access = JsonProperty.Access.WRITE_ONLY)
    private ContentProperties writeableProperties;

    /**
     * Get the name property: Tag name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the digest property: Tag digest.
     *
     * @return the digest value.
     */
    public String getDigest() {
        return this.digest;
    }

    /**
     * Get the createdOn property: Tag created time.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: Tag last update time.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Get the writeableProperties property: Writeable properties of the resource.
     *
     * @return the writeableProperties value.
     */
    public ContentProperties getWriteableProperties() {
        return this.writeableProperties;
    }
}
