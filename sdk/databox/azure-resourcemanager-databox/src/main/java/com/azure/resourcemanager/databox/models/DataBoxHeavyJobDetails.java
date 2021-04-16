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

/** Databox Heavy Device Job Details. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "jobDetailsType")
@JsonTypeName("DataBoxHeavy")
@Fluent
public final class DataBoxHeavyJobDetails extends JobDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataBoxHeavyJobDetails.class);

    /*
     * Copy progress per account.
     */
    @JsonProperty(value = "copyProgress", access = JsonProperty.Access.WRITE_ONLY)
    private List<CopyProgress> copyProgress;

    /*
     * Set Device password for unlocking Databox Heavy. Should not be passed
     * for TransferType:ExportFromAzure jobs. If this is not passed, the
     * service will generate password itself. This will not be returned in Get
     * Call. Password Requirements :  Password must be minimum of 12 and
     * maximum of 64 characters. Password must have at least one uppercase
     * alphabet, one number and one special character. Password cannot have the
     * following characters : IilLoO0 Password can have only alphabets, numbers
     * and these characters : @#\-$%^!+=;:_()]+
     */
    @JsonProperty(value = "devicePassword")
    private String devicePassword;

    /**
     * Get the copyProgress property: Copy progress per account.
     *
     * @return the copyProgress value.
     */
    public List<CopyProgress> copyProgress() {
        return this.copyProgress;
    }

    /**
     * Get the devicePassword property: Set Device password for unlocking Databox Heavy. Should not be passed for
     * TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will
     * not be returned in Get Call. Password Requirements : Password must be minimum of 12 and maximum of 64 characters.
     * Password must have at least one uppercase alphabet, one number and one special character. Password cannot have
     * the following characters : IilLoO0 Password can have only alphabets, numbers and these characters
     * : @#\-$%^!+=;:_()]+.
     *
     * @return the devicePassword value.
     */
    public String devicePassword() {
        return this.devicePassword;
    }

    /**
     * Set the devicePassword property: Set Device password for unlocking Databox Heavy. Should not be passed for
     * TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will
     * not be returned in Get Call. Password Requirements : Password must be minimum of 12 and maximum of 64 characters.
     * Password must have at least one uppercase alphabet, one number and one special character. Password cannot have
     * the following characters : IilLoO0 Password can have only alphabets, numbers and these characters
     * : @#\-$%^!+=;:_()]+.
     *
     * @param devicePassword the devicePassword value to set.
     * @return the DataBoxHeavyJobDetails object itself.
     */
    public DataBoxHeavyJobDetails withDevicePassword(String devicePassword) {
        this.devicePassword = devicePassword;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withContactDetails(ContactDetails contactDetails) {
        super.withContactDetails(contactDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withShippingAddress(ShippingAddress shippingAddress) {
        super.withShippingAddress(shippingAddress);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withDataImportDetails(List<DataImportDetails> dataImportDetails) {
        super.withDataImportDetails(dataImportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withDataExportDetails(List<DataExportDetails> dataExportDetails) {
        super.withDataExportDetails(dataExportDetails);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withPreferences(Preferences preferences) {
        super.withPreferences(preferences);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withKeyEncryptionKey(KeyEncryptionKey keyEncryptionKey) {
        super.withKeyEncryptionKey(keyEncryptionKey);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataBoxHeavyJobDetails withExpectedDataSizeInTeraBytes(Integer expectedDataSizeInTeraBytes) {
        super.withExpectedDataSizeInTeraBytes(expectedDataSizeInTeraBytes);
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
