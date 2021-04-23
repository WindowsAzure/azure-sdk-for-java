// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Request body to get the availability for scheduling disk orders. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "skuName")
@JsonTypeName("DataBoxDisk")
@Fluent
public final class DiskScheduleAvailabilityRequest extends ScheduleAvailabilityRequest {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskScheduleAvailabilityRequest.class);

    /*
     * The expected size of the data, which needs to be transferred in this
     * job, in terabytes.
     */
    @JsonProperty(value = "expectedDataSizeInTeraBytes", required = true)
    private int expectedDataSizeInTeraBytes;

    /**
     * Get the expectedDataSizeInTeraBytes property: The expected size of the data, which needs to be transferred in
     * this job, in terabytes.
     *
     * @return the expectedDataSizeInTeraBytes value.
     */
    public int expectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes;
    }

    /**
     * Set the expectedDataSizeInTeraBytes property: The expected size of the data, which needs to be transferred in
     * this job, in terabytes.
     *
     * @param expectedDataSizeInTeraBytes the expectedDataSizeInTeraBytes value to set.
     * @return the DiskScheduleAvailabilityRequest object itself.
     */
    public DiskScheduleAvailabilityRequest withExpectedDataSizeInTeraBytes(int expectedDataSizeInTeraBytes) {
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskScheduleAvailabilityRequest withStorageLocation(String storageLocation) {
        super.withStorageLocation(storageLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DiskScheduleAvailabilityRequest withCountry(String country) {
        super.withCountry(country);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
