// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.deviceprovisioning.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The DeviceTransferInfo model. */
@Fluent
public final class DeviceTransferInfo {
    /*
     * The Device Id. A case-insensitive string (up to 128 characters long) of
     * alphanumeric characters plus certain special characters : . _ -. No
     * special characters allowed at start or end.
     */
    @JsonProperty(value = "deviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String deviceId;

    /*
     * Id Scope of target DPS of the transfer request.
     */
    @JsonProperty(value = "targetDpsIdScope")
    private String targetDpsIdScope;

    /*
     * The desired validity time period of the device record transfer token, in
     * ISO8601 format. Example: 'P6DT5H5M'.
     */
    @JsonProperty(value = "validityPeriod", required = true)
    private String validityPeriod;

    /*
     * Token containing information for claiming a device belonging to another
     * DPS instance. This is returned upon a successful creation of device
     * transfer record.
     */
    @JsonProperty(value = "token", access = JsonProperty.Access.WRITE_ONLY)
    private String token;

    /*
     * The ETag of the device record.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * The DateTime this resource was created in UTC.
     */
    @JsonProperty(value = "createdOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdOn;

    /*
     * The DateTime this resource was last updated in UTC.
     */
    @JsonProperty(value = "lastUpdatedOn", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastUpdatedOn;

    /**
     * Creates an instance of DeviceTransferInfo class.
     *
     * @param validityPeriod the validityPeriod value to set.
     */
    @JsonCreator
    public DeviceTransferInfo(@JsonProperty(value = "validityPeriod", required = true) String validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    /**
     * Get the deviceId property: The Device Id. A case-insensitive string (up to 128 characters long) of alphanumeric
     * characters plus certain special characters : . _ -. No special characters allowed at start or end.
     *
     * @return the deviceId value.
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * Get the targetDpsIdScope property: Id Scope of target DPS of the transfer request.
     *
     * @return the targetDpsIdScope value.
     */
    public String getTargetDpsIdScope() {
        return this.targetDpsIdScope;
    }

    /**
     * Set the targetDpsIdScope property: Id Scope of target DPS of the transfer request.
     *
     * @param targetDpsIdScope the targetDpsIdScope value to set.
     * @return the DeviceTransferInfo object itself.
     */
    public DeviceTransferInfo setTargetDpsIdScope(String targetDpsIdScope) {
        this.targetDpsIdScope = targetDpsIdScope;
        return this;
    }

    /**
     * Get the validityPeriod property: The desired validity time period of the device record transfer token, in ISO8601
     * format. Example: 'P6DT5H5M'.
     *
     * @return the validityPeriod value.
     */
    public String getValidityPeriod() {
        return this.validityPeriod;
    }

    /**
     * Get the token property: Token containing information for claiming a device belonging to another DPS instance.
     * This is returned upon a successful creation of device transfer record.
     *
     * @return the token value.
     */
    public String getToken() {
        return this.token;
    }

    /**
     * Get the etag property: The ETag of the device record.
     *
     * @return the etag value.
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Get the createdOn property: The DateTime this resource was created in UTC.
     *
     * @return the createdOn value.
     */
    public OffsetDateTime getCreatedOn() {
        return this.createdOn;
    }

    /**
     * Get the lastUpdatedOn property: The DateTime this resource was last updated in UTC.
     *
     * @return the lastUpdatedOn value.
     */
    public OffsetDateTime getLastUpdatedOn() {
        return this.lastUpdatedOn;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (getValidityPeriod() == null) {
            throw new IllegalArgumentException("Missing required property validityPeriod in model DeviceTransferInfo");
        }
    }
}
