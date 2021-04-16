// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Filter details to transfer Azure Blobs. */
@Fluent
public final class BlobFilterDetails {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobFilterDetails.class);

    /*
     * Prefix list of the Azure blobs to be transferred.
     */
    @JsonProperty(value = "blobPrefixList")
    private List<String> blobPrefixList;

    /*
     * List of full path of the blobs to be transferred.
     */
    @JsonProperty(value = "blobPathList")
    private List<String> blobPathList;

    /*
     * List of blob containers to be transferred.
     */
    @JsonProperty(value = "containerList")
    private List<String> containerList;

    /**
     * Get the blobPrefixList property: Prefix list of the Azure blobs to be transferred.
     *
     * @return the blobPrefixList value.
     */
    public List<String> blobPrefixList() {
        return this.blobPrefixList;
    }

    /**
     * Set the blobPrefixList property: Prefix list of the Azure blobs to be transferred.
     *
     * @param blobPrefixList the blobPrefixList value to set.
     * @return the BlobFilterDetails object itself.
     */
    public BlobFilterDetails withBlobPrefixList(List<String> blobPrefixList) {
        this.blobPrefixList = blobPrefixList;
        return this;
    }

    /**
     * Get the blobPathList property: List of full path of the blobs to be transferred.
     *
     * @return the blobPathList value.
     */
    public List<String> blobPathList() {
        return this.blobPathList;
    }

    /**
     * Set the blobPathList property: List of full path of the blobs to be transferred.
     *
     * @param blobPathList the blobPathList value to set.
     * @return the BlobFilterDetails object itself.
     */
    public BlobFilterDetails withBlobPathList(List<String> blobPathList) {
        this.blobPathList = blobPathList;
        return this;
    }

    /**
     * Get the containerList property: List of blob containers to be transferred.
     *
     * @return the containerList value.
     */
    public List<String> containerList() {
        return this.containerList;
    }

    /**
     * Set the containerList property: List of blob containers to be transferred.
     *
     * @param containerList the containerList value to set.
     * @return the BlobFilterDetails object itself.
     */
    public BlobFilterDetails withContainerList(List<String> containerList) {
        this.containerList = containerList;
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
