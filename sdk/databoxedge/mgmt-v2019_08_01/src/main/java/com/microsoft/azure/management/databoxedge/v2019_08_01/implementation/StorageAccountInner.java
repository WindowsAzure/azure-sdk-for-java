/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_08_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_08_01.StorageAccountStatus;
import com.microsoft.azure.management.databoxedge.v2019_08_01.DataPolicy;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.databoxedge.v2019_08_01.ARMBaseModel;

/**
 * Represents a Storage Account on the  Data Box Edge/Gateway device.
 */
@JsonFlatten
public class StorageAccountInner extends ARMBaseModel {
    /**
     * Description for the storage Account.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Current status of the storage account. Possible values include: 'OK',
     * 'Offline', 'Unknown', 'Updating', 'NeedsAttention'.
     */
    @JsonProperty(value = "properties.storageAccountStatus")
    private StorageAccountStatus storageAccountStatus;

    /**
     * Data policy of the storage Account. Possible values include: 'Cloud',
     * 'Local'.
     */
    @JsonProperty(value = "properties.dataPolicy")
    private DataPolicy dataPolicy;

    /**
     * Storage Account Credential Id.
     */
    @JsonProperty(value = "properties.storageAccountCredentialId")
    private String storageAccountCredentialId;

    /**
     * BlobEndpoint of Storage Account.
     */
    @JsonProperty(value = "properties.blobEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String blobEndpoint;

    /**
     * The Container Count. Present only for Storage Accounts with DataPolicy
     * set to Cloud.
     */
    @JsonProperty(value = "properties.containerCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer containerCount;

    /**
     * Get description for the storage Account.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description for the storage Account.
     *
     * @param description the description value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get current status of the storage account. Possible values include: 'OK', 'Offline', 'Unknown', 'Updating', 'NeedsAttention'.
     *
     * @return the storageAccountStatus value
     */
    public StorageAccountStatus storageAccountStatus() {
        return this.storageAccountStatus;
    }

    /**
     * Set current status of the storage account. Possible values include: 'OK', 'Offline', 'Unknown', 'Updating', 'NeedsAttention'.
     *
     * @param storageAccountStatus the storageAccountStatus value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withStorageAccountStatus(StorageAccountStatus storageAccountStatus) {
        this.storageAccountStatus = storageAccountStatus;
        return this;
    }

    /**
     * Get data policy of the storage Account. Possible values include: 'Cloud', 'Local'.
     *
     * @return the dataPolicy value
     */
    public DataPolicy dataPolicy() {
        return this.dataPolicy;
    }

    /**
     * Set data policy of the storage Account. Possible values include: 'Cloud', 'Local'.
     *
     * @param dataPolicy the dataPolicy value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withDataPolicy(DataPolicy dataPolicy) {
        this.dataPolicy = dataPolicy;
        return this;
    }

    /**
     * Get storage Account Credential Id.
     *
     * @return the storageAccountCredentialId value
     */
    public String storageAccountCredentialId() {
        return this.storageAccountCredentialId;
    }

    /**
     * Set storage Account Credential Id.
     *
     * @param storageAccountCredentialId the storageAccountCredentialId value to set
     * @return the StorageAccountInner object itself.
     */
    public StorageAccountInner withStorageAccountCredentialId(String storageAccountCredentialId) {
        this.storageAccountCredentialId = storageAccountCredentialId;
        return this;
    }

    /**
     * Get blobEndpoint of Storage Account.
     *
     * @return the blobEndpoint value
     */
    public String blobEndpoint() {
        return this.blobEndpoint;
    }

    /**
     * Get the Container Count. Present only for Storage Accounts with DataPolicy set to Cloud.
     *
     * @return the containerCount value
     */
    public Integer containerCount() {
        return this.containerCount;
    }

}
