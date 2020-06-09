// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The PacketCaptureStorageLocation model. */
@Fluent
public final class PacketCaptureStorageLocation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PacketCaptureStorageLocation.class);

    /*
     * The ID of the storage account to save the packet capture session.
     * Required if no local file path is provided.
     */
    @JsonProperty(value = "storageId")
    private String storageId;

    /*
     * The URI of the storage path to save the packet capture. Must be a
     * well-formed URI describing the location to save the packet capture.
     */
    @JsonProperty(value = "storagePath")
    private String storagePath;

    /*
     * A valid local path on the targeting VM. Must include the name of the
     * capture file (*.cap). For linux virtual machine it must start with
     * /var/captures. Required if no storage ID is provided, otherwise
     * optional.
     */
    @JsonProperty(value = "filePath")
    private String filePath;

    /**
     * Get the storageId property: The ID of the storage account to save the packet capture session. Required if no
     * local file path is provided.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the storageId property: The ID of the storage account to save the packet capture session. Required if no
     * local file path is provided.
     *
     * @param storageId the storageId value to set.
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the storagePath property: The URI of the storage path to save the packet capture. Must be a well-formed URI
     * describing the location to save the packet capture.
     *
     * @return the storagePath value.
     */
    public String storagePath() {
        return this.storagePath;
    }

    /**
     * Set the storagePath property: The URI of the storage path to save the packet capture. Must be a well-formed URI
     * describing the location to save the packet capture.
     *
     * @param storagePath the storagePath value to set.
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

    /**
     * Get the filePath property: A valid local path on the targeting VM. Must include the name of the capture file
     * (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided,
     * otherwise optional.
     *
     * @return the filePath value.
     */
    public String filePath() {
        return this.filePath;
    }

    /**
     * Set the filePath property: A valid local path on the targeting VM. Must include the name of the capture file
     * (*.cap). For linux virtual machine it must start with /var/captures. Required if no storage ID is provided,
     * otherwise optional.
     *
     * @param filePath the filePath value to set.
     * @return the PacketCaptureStorageLocation object itself.
     */
    public PacketCaptureStorageLocation withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
