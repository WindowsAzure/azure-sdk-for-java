/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details to transfer all data.
 */
public class TransferAllDetails {
    /**
     * Type of the account of data. Possible values include: 'StorageAccount',
     * 'ManagedDisk'.
     */
    @JsonProperty(value = "dataAccountType", required = true)
    private DataAccountType dataAccountType;

    /**
     * To indicate if all Azure blobs have to be transferred.
     */
    @JsonProperty(value = "transferAllBlobs")
    private Boolean transferAllBlobs;

    /**
     * To indicate if all Azure Files have to be transferred.
     */
    @JsonProperty(value = "transferAllFiles")
    private Boolean transferAllFiles;

    /**
     * Get type of the account of data. Possible values include: 'StorageAccount', 'ManagedDisk'.
     *
     * @return the dataAccountType value
     */
    public DataAccountType dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Set type of the account of data. Possible values include: 'StorageAccount', 'ManagedDisk'.
     *
     * @param dataAccountType the dataAccountType value to set
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withDataAccountType(DataAccountType dataAccountType) {
        this.dataAccountType = dataAccountType;
        return this;
    }

    /**
     * Get to indicate if all Azure blobs have to be transferred.
     *
     * @return the transferAllBlobs value
     */
    public Boolean transferAllBlobs() {
        return this.transferAllBlobs;
    }

    /**
     * Set to indicate if all Azure blobs have to be transferred.
     *
     * @param transferAllBlobs the transferAllBlobs value to set
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withTransferAllBlobs(Boolean transferAllBlobs) {
        this.transferAllBlobs = transferAllBlobs;
        return this;
    }

    /**
     * Get to indicate if all Azure Files have to be transferred.
     *
     * @return the transferAllFiles value
     */
    public Boolean transferAllFiles() {
        return this.transferAllFiles;
    }

    /**
     * Set to indicate if all Azure Files have to be transferred.
     *
     * @param transferAllFiles the transferAllFiles value to set
     * @return the TransferAllDetails object itself.
     */
    public TransferAllDetails withTransferAllFiles(Boolean transferAllFiles) {
        this.transferAllFiles = transferAllFiles;
        return this;
    }

}
