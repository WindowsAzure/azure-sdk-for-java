// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Metadata pertaining to creation and last modification of the resource. */
@Fluent
public final class SystemData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SystemData.class);

    /*
     * The identity that created the resource.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /*
     * The type of identity that created the resource.
     */
    @JsonProperty(value = "createdByType")
    private CreatedByType createdByType;

    /*
     * The timestamp of resource creation (UTC).
     */
    @JsonProperty(value = "createdAt")
    private OffsetDateTime createdAt;

    /*
     * The identity that last modified the resource.
     */
    @JsonProperty(value = "lastModifiedBy")
    private String lastModifiedBy;

    /*
     * The type of identity that last modified the resource.
     */
    @JsonProperty(value = "lastModifiedByType")
    private CreatedByType lastModifiedByType;

    /*
     * The type of identity that last modified the resource.
     */
    @JsonProperty(value = "lastModifiedAt")
    private OffsetDateTime lastModifiedAt;

    /**
     * Get the createdBy property: The identity that created the resource.
     *
     * @return the createdBy value.
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the createdBy property: The identity that created the resource.
     *
     * @param createdBy the createdBy value to set.
     * @return the SystemData object itself.
     */
    public SystemData withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the createdByType property: The type of identity that created the resource.
     *
     * @return the createdByType value.
     */
    public CreatedByType createdByType() {
        return this.createdByType;
    }

    /**
     * Set the createdByType property: The type of identity that created the resource.
     *
     * @param createdByType the createdByType value to set.
     * @return the SystemData object itself.
     */
    public SystemData withCreatedByType(CreatedByType createdByType) {
        this.createdByType = createdByType;
        return this;
    }

    /**
     * Get the createdAt property: The timestamp of resource creation (UTC).
     *
     * @return the createdAt value.
     */
    public OffsetDateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the createdAt property: The timestamp of resource creation (UTC).
     *
     * @param createdAt the createdAt value to set.
     * @return the SystemData object itself.
     */
    public SystemData withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the lastModifiedBy property: The identity that last modified the resource.
     *
     * @return the lastModifiedBy value.
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the lastModifiedBy property: The identity that last modified the resource.
     *
     * @param lastModifiedBy the lastModifiedBy value to set.
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the lastModifiedByType property: The type of identity that last modified the resource.
     *
     * @return the lastModifiedByType value.
     */
    public CreatedByType lastModifiedByType() {
        return this.lastModifiedByType;
    }

    /**
     * Set the lastModifiedByType property: The type of identity that last modified the resource.
     *
     * @param lastModifiedByType the lastModifiedByType value to set.
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedByType(CreatedByType lastModifiedByType) {
        this.lastModifiedByType = lastModifiedByType;
        return this;
    }

    /**
     * Get the lastModifiedAt property: The type of identity that last modified the resource.
     *
     * @return the lastModifiedAt value.
     */
    public OffsetDateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Set the lastModifiedAt property: The type of identity that last modified the resource.
     *
     * @param lastModifiedAt the lastModifiedAt value to set.
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedAt(OffsetDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
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
