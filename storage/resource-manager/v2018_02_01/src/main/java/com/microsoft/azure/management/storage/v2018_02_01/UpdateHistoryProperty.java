/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An update history of the ImmutabilityPolicy of a blob container.
 */
public class UpdateHistoryProperty {
    /**
     * The ImmutabilityPolicy update type of a blob container, possible values
     * include: put, lock and extend. Possible values include: 'put', 'lock',
     * 'extend'.
     */
    @JsonProperty(value = "update", access = JsonProperty.Access.WRITE_ONLY)
    private ImmutabilityPolicyUpdateType update;

    /**
     * The immutability period for the blobs in the container since the policy
     * creation, in days.
     */
    @JsonProperty(value = "immutabilityPeriodSinceCreationInDays", access = JsonProperty.Access.WRITE_ONLY)
    private Integer immutabilityPeriodSinceCreationInDays;

    /**
     * Returns the date and time the ImmutabilityPolicy was updated.
     */
    @JsonProperty(value = "timestamp", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime timestamp;

    /**
     * Returns the Object ID of the user who updated the ImmutabilityPolicy.
     */
    @JsonProperty(value = "objectIdentifier", access = JsonProperty.Access.WRITE_ONLY)
    private String objectIdentifier;

    /**
     * Returns the Tenant ID that issued the token for the user who updated the
     * ImmutabilityPolicy.
     */
    @JsonProperty(value = "tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private String tenantId;

    /**
     * Returns the User Principal Name of the user who updated the
     * ImmutabilityPolicy.
     */
    @JsonProperty(value = "upn", access = JsonProperty.Access.WRITE_ONLY)
    private String upn;

    /**
     * Get the ImmutabilityPolicy update type of a blob container, possible values include: put, lock and extend. Possible values include: 'put', 'lock', 'extend'.
     *
     * @return the update value
     */
    public ImmutabilityPolicyUpdateType update() {
        return this.update;
    }

    /**
     * Get the immutability period for the blobs in the container since the policy creation, in days.
     *
     * @return the immutabilityPeriodSinceCreationInDays value
     */
    public Integer immutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Get returns the date and time the ImmutabilityPolicy was updated.
     *
     * @return the timestamp value
     */
    public DateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get returns the Object ID of the user who updated the ImmutabilityPolicy.
     *
     * @return the objectIdentifier value
     */
    public String objectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Get returns the Tenant ID that issued the token for the user who updated the ImmutabilityPolicy.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Get returns the User Principal Name of the user who updated the ImmutabilityPolicy.
     *
     * @return the upn value
     */
    public String upn() {
        return this.upn;
    }

}
