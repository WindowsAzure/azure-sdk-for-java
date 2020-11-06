/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Metadata pertaining to creation and last modification of the resource.
 */
public class SystemData {
    /**
     * The identity that created the resource.
     */
    @JsonProperty(value = "createdBy")
    private String createdBy;

    /**
     * The type of identity that created the resource. Possible values include:
     * 'User', 'Application', 'ManagedIdentity', 'Key'.
     */
    @JsonProperty(value = "createdByType")
    private CreatedByType createdByType;

    /**
     * The timestamp of resource creation (UTC).
     */
    @JsonProperty(value = "createdAt")
    private DateTime createdAt;

    /**
     * The identity that last modified the resource.
     */
    @JsonProperty(value = "lastModifiedBy")
    private String lastModifiedBy;

    /**
     * The type of identity that last modified the resource. Possible values
     * include: 'User', 'Application', 'ManagedIdentity', 'Key'.
     */
    @JsonProperty(value = "lastModifiedByType")
    private CreatedByType lastModifiedByType;

    /**
     * The type of identity that last modified the resource.
     */
    @JsonProperty(value = "lastModifiedAt")
    private DateTime lastModifiedAt;

    /**
     * Get the identity that created the resource.
     *
     * @return the createdBy value
     */
    public String createdBy() {
        return this.createdBy;
    }

    /**
     * Set the identity that created the resource.
     *
     * @param createdBy the createdBy value to set
     * @return the SystemData object itself.
     */
    public SystemData withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get the type of identity that created the resource. Possible values include: 'User', 'Application', 'ManagedIdentity', 'Key'.
     *
     * @return the createdByType value
     */
    public CreatedByType createdByType() {
        return this.createdByType;
    }

    /**
     * Set the type of identity that created the resource. Possible values include: 'User', 'Application', 'ManagedIdentity', 'Key'.
     *
     * @param createdByType the createdByType value to set
     * @return the SystemData object itself.
     */
    public SystemData withCreatedByType(CreatedByType createdByType) {
        this.createdByType = createdByType;
        return this;
    }

    /**
     * Get the timestamp of resource creation (UTC).
     *
     * @return the createdAt value
     */
    public DateTime createdAt() {
        return this.createdAt;
    }

    /**
     * Set the timestamp of resource creation (UTC).
     *
     * @param createdAt the createdAt value to set
     * @return the SystemData object itself.
     */
    public SystemData withCreatedAt(DateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get the identity that last modified the resource.
     *
     * @return the lastModifiedBy value
     */
    public String lastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * Set the identity that last modified the resource.
     *
     * @param lastModifiedBy the lastModifiedBy value to set
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     * Get the type of identity that last modified the resource. Possible values include: 'User', 'Application', 'ManagedIdentity', 'Key'.
     *
     * @return the lastModifiedByType value
     */
    public CreatedByType lastModifiedByType() {
        return this.lastModifiedByType;
    }

    /**
     * Set the type of identity that last modified the resource. Possible values include: 'User', 'Application', 'ManagedIdentity', 'Key'.
     *
     * @param lastModifiedByType the lastModifiedByType value to set
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedByType(CreatedByType lastModifiedByType) {
        this.lastModifiedByType = lastModifiedByType;
        return this;
    }

    /**
     * Get the type of identity that last modified the resource.
     *
     * @return the lastModifiedAt value
     */
    public DateTime lastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * Set the type of identity that last modified the resource.
     *
     * @param lastModifiedAt the lastModifiedAt value to set
     * @return the SystemData object itself.
     */
    public SystemData withLastModifiedAt(DateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

}
