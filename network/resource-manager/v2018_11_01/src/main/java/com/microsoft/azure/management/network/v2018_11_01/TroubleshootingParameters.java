/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters that define the resource to troubleshoot.
 */
@JsonFlatten
public class TroubleshootingParameters {
    /**
     * The target resource to troubleshoot.
     */
    @JsonProperty(value = "targetResourceId", required = true)
    private String targetResourceId;

    /**
     * The ID for the storage account to save the troubleshoot result.
     */
    @JsonProperty(value = "properties.storageId", required = true)
    private String storageId;

    /**
     * The path to the blob to save the troubleshoot result in.
     */
    @JsonProperty(value = "properties.storagePath", required = true)
    private String storagePath;

    /**
     * Get the target resource to troubleshoot.
     *
     * @return the targetResourceId value
     */
    public String targetResourceId() {
        return this.targetResourceId;
    }

    /**
     * Set the target resource to troubleshoot.
     *
     * @param targetResourceId the targetResourceId value to set
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withTargetResourceId(String targetResourceId) {
        this.targetResourceId = targetResourceId;
        return this;
    }

    /**
     * Get the ID for the storage account to save the troubleshoot result.
     *
     * @return the storageId value
     */
    public String storageId() {
        return this.storageId;
    }

    /**
     * Set the ID for the storage account to save the troubleshoot result.
     *
     * @param storageId the storageId value to set
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStorageId(String storageId) {
        this.storageId = storageId;
        return this;
    }

    /**
     * Get the path to the blob to save the troubleshoot result in.
     *
     * @return the storagePath value
     */
    public String storagePath() {
        return this.storagePath;
    }

    /**
     * Set the path to the blob to save the troubleshoot result in.
     *
     * @param storagePath the storagePath value to set
     * @return the TroubleshootingParameters object itself.
     */
    public TroubleshootingParameters withStoragePath(String storagePath) {
        this.storagePath = storagePath;
        return this;
    }

}
