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
import java.util.List;
import java.util.Map;

/** DataBox Disk Job Details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobDetailsType")
@JsonTypeName("DataBoxDisk")
@Fluent
public final class DataBoxDiskJobDetails extends JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataBoxDiskJobDetails.class);

    /*
     * User preference on what size disks are needed for the job. The map is
     * from the disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB
     * size. Key is string but will be checked against an int.
     */
    @JsonProperty(value = "preferredDisks")
    private Map<String, Integer> preferredDisks;

    /*
     * Copy progress per disk.
     */
    @JsonProperty(value = "copyProgress", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataBoxDiskCopyProgress> copyProgress;

    /*
     * Contains the map of disk serial number to the disk size being used for
     * the job. Is returned only after the disks are shipped to the customer.
     */
    @JsonProperty(value = "disksAndSizeDetails", access = JsonProperty.Access.WRITE_ONLY)
    private Map<String, Integer> disksAndSizeDetails;

    /*
     * User entered passkey for DataBox Disk job.
     */
    @JsonProperty(value = "passkey")
    private String passkey;

    /**
     * Get the preferredDisks property: User preference on what size disks are needed for the job. The map is from the
     * disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an
     * int.
     *
     * @return the preferredDisks value.
     */
    public Map<String, Integer> preferredDisks() {
        return this.preferredDisks;
    }

    /**
     * Set the preferredDisks property: User preference on what size disks are needed for the job. The map is from the
     * disk size in TB to the count. Eg. {2,5} means 5 disks of 2 TB size. Key is string but will be checked against an
     * int.
     *
     * @param preferredDisks the preferredDisks value to set.
     * @return the DataBoxDiskJobDetails object itself.
     */
    public DataBoxDiskJobDetails withPreferredDisks(Map<String, Integer> preferredDisks) {
        this.preferredDisks = preferredDisks;
        return this;
    }

    /**
     * Get the copyProgress property: Copy progress per disk.
     *
     * @return the copyProgress value.
     */
    public List<DataBoxDiskCopyProgress> copyProgress() {
        return this.copyProgress;
    }

    /**
     * Get the disksAndSizeDetails property: Contains the map of disk serial number to the disk size being used for the
     * job. Is returned only after the disks are shipped to the customer.
     *
     * @return the disksAndSizeDetails value.
     */
    public Map<String, Integer> disksAndSizeDetails() {
        return this.disksAndSizeDetails;
    }

    /**
     * Get the passkey property: User entered passkey for DataBox Disk job.
     *
     * @return the passkey value.
     */
    public String passkey() {
        return this.passkey;
    }

    /**
     * Set the passkey property: User entered passkey for DataBox Disk job.
     *
     * @param passkey the passkey value to set.
     * @return the DataBoxDiskJobDetails object itself.
     */
    public DataBoxDiskJobDetails withPasskey(String passkey) {
        this.passkey = passkey;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withContactDetails(ContactDetails contactDetails) {
        super.withContactDetails(contactDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        super.withShippingAddress(shippingAddress);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withDataImportDetails(List<DataImportDetails> dataImportDetails) {
        super.withDataImportDetails(dataImportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withDataExportDetails(List<DataExportDetails> dataExportDetails) {
        super.withDataExportDetails(dataExportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withPreferences(Preferences preferences) {
        super.withPreferences(preferences);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxDiskJobDetails withExpectedDataSizeInTerabytes(Integer expectedDataSizeInTerabytes) {
        super.withExpectedDataSizeInTerabytes(expectedDataSizeInTerabytes);
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
        if (copyProgress() != null) {
            copyProgress().forEach(e -> e.validate());
        }
    }
}
