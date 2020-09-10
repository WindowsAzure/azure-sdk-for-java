/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Capture storage details for capture description.
 */
@JsonFlatten
public class Destination {
    /**
     * Name for capture destination.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Resource id of the storage account to be used to create the blobs.
     */
    @JsonProperty(value = "properties.storageAccountResourceId")
    private String storageAccountResourceId;

    /**
     * Blob container Name.
     */
    @JsonProperty(value = "properties.blobContainer")
    private String blobContainer;

    /**
     * Blob naming convention for archive, e.g.
     * {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}.
     * Here all the parameters (Namespace,EventHub .. etc) are mandatory
     * irrespective of order.
     */
    @JsonProperty(value = "properties.archiveNameFormat")
    private String archiveNameFormat;

    /**
     * Get name for capture destination.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name for capture destination.
     *
     * @param name the name value to set
     * @return the Destination object itself.
     */
    public Destination withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get resource id of the storage account to be used to create the blobs.
     *
     * @return the storageAccountResourceId value
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set resource id of the storage account to be used to create the blobs.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set
     * @return the Destination object itself.
     */
    public Destination withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get blob container Name.
     *
     * @return the blobContainer value
     */
    public String blobContainer() {
        return this.blobContainer;
    }

    /**
     * Set blob container Name.
     *
     * @param blobContainer the blobContainer value to set
     * @return the Destination object itself.
     */
    public Destination withBlobContainer(String blobContainer) {
        this.blobContainer = blobContainer;
        return this;
    }

    /**
     * Get blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @return the archiveNameFormat value
     */
    public String archiveNameFormat() {
        return this.archiveNameFormat;
    }

    /**
     * Set blob naming convention for archive, e.g. {Namespace}/{EventHub}/{PartitionId}/{Year}/{Month}/{Day}/{Hour}/{Minute}/{Second}. Here all the parameters (Namespace,EventHub .. etc) are mandatory irrespective of order.
     *
     * @param archiveNameFormat the archiveNameFormat value to set
     * @return the Destination object itself.
     */
    public Destination withArchiveNameFormat(String archiveNameFormat) {
        this.archiveNameFormat = archiveNameFormat;
        return this;
    }

}
