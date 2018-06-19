/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_11_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The details of a management group.
 */
public class ManagementGroupDetails {
    /**
     * The version number of the object.
     */
    @JsonProperty(value = "version")
    private Double version;

    /**
     * The date and time when this object was last updated.
     */
    @JsonProperty(value = "updatedTime")
    private DateTime updatedTime;

    /**
     * The identity of the principal or process that updated the object.
     */
    @JsonProperty(value = "updatedBy")
    private String updatedBy;

    /**
     * Parent.
     */
    @JsonProperty(value = "parent")
    private ParentGroupInfo parent;

    /**
     * Get the version number of the object.
     *
     * @return the version value
     */
    public Double version() {
        return this.version;
    }

    /**
     * Set the version number of the object.
     *
     * @param version the version value to set
     * @return the ManagementGroupDetails object itself.
     */
    public ManagementGroupDetails withVersion(Double version) {
        this.version = version;
        return this;
    }

    /**
     * Get the date and time when this object was last updated.
     *
     * @return the updatedTime value
     */
    public DateTime updatedTime() {
        return this.updatedTime;
    }

    /**
     * Set the date and time when this object was last updated.
     *
     * @param updatedTime the updatedTime value to set
     * @return the ManagementGroupDetails object itself.
     */
    public ManagementGroupDetails withUpdatedTime(DateTime updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * Get the identity of the principal or process that updated the object.
     *
     * @return the updatedBy value
     */
    public String updatedBy() {
        return this.updatedBy;
    }

    /**
     * Set the identity of the principal or process that updated the object.
     *
     * @param updatedBy the updatedBy value to set
     * @return the ManagementGroupDetails object itself.
     */
    public ManagementGroupDetails withUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
        return this;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public ParentGroupInfo parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the ManagementGroupDetails object itself.
     */
    public ManagementGroupDetails withParent(ParentGroupInfo parent) {
        this.parent = parent;
        return this;
    }

}
