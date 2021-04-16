// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details to transfer all data. */
@Fluent
public final class TransferAllDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TransferAllDetails.class);

    /*
     * Type of the account of data
     */
    @JsonProperty(value = "dataAccountType", required = true)
    private DataAccountType dataAccountType;

    /*
     * To indicate if all Azure blobs have to be transferred
     */
    @JsonProperty(value = "transferAllBlobs")
    private Boolean transferAllBlobs;

    /*
     * To indicate if all Azure Files have to be transferred
     */
    @JsonProperty(value = "transferAllFiles")
    private Boolean transferAllFiles;

    /**
     * Get the dataAccountType property: Type of the account of data.
     *
     * @return the dataAccountType value.
     */
    public DataAccountType dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Set the dataAccountType property: Type of the account of data.
     *
     * @param dataAccountType the dataAccountType value to set.
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withDataAccountType(DataAccountType dataAccountType) {
        this.dataAccountType = dataAccountType;
        return this;
    }

    /**
     * Get the transferAllBlobs property: To indicate if all Azure blobs have to be transferred.
     *
     * @return the transferAllBlobs value.
     */
    public Boolean transferAllBlobs() {
        return this.transferAllBlobs;
    }

    /**
     * Set the transferAllBlobs property: To indicate if all Azure blobs have to be transferred.
     *
     * @param transferAllBlobs the transferAllBlobs value to set.
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withTransferAllBlobs(Boolean transferAllBlobs) {
        this.transferAllBlobs = transferAllBlobs;
        return this;
    }

    /**
     * Get the transferAllFiles property: To indicate if all Azure Files have to be transferred.
     *
     * @return the transferAllFiles value.
     */
    public Boolean transferAllFiles() {
        return this.transferAllFiles;
    }

    /**
     * Set the transferAllFiles property: To indicate if all Azure Files have to be transferred.
     *
     * @param transferAllFiles the transferAllFiles value to set.
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withTransferAllFiles(Boolean transferAllFiles) {
        this.transferAllFiles = transferAllFiles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dataAccountType() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property dataAccountType in model TransferAllDetails"));
        }
    }
}
