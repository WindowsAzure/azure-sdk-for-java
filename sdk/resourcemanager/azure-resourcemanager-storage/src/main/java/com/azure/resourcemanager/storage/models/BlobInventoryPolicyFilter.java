// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** An object that defines the blob inventory rule filter conditions. */
@Fluent
public final class BlobInventoryPolicyFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BlobInventoryPolicyFilter.class);

    /*
     * An array of strings for blob prefixes to be matched.
     */
    @JsonProperty(value = "prefixMatch")
    private List<String> prefixMatch;

    /*
     * An array of predefined enum values. Valid values include blockBlob,
     * appendBlob, pageBlob. Hns accounts does not support pageBlobs.
     */
    @JsonProperty(value = "blobTypes", required = true)
    private List<String> blobTypes;

    /*
     * Includes blob versions in blob inventory when value set to true.
     */
    @JsonProperty(value = "includeBlobVersions")
    private Boolean includeBlobVersions;

    /*
     * Includes blob snapshots in blob inventory when value set to true.
     */
    @JsonProperty(value = "includeSnapshots")
    private Boolean includeSnapshots;

    /**
     * Get the prefixMatch property: An array of strings for blob prefixes to be matched.
     *
     * @return the prefixMatch value.
     */
    public List<String> prefixMatch() {
        return this.prefixMatch;
    }

    /**
     * Set the prefixMatch property: An array of strings for blob prefixes to be matched.
     *
     * @param prefixMatch the prefixMatch value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withPrefixMatch(List<String> prefixMatch) {
        this.prefixMatch = prefixMatch;
        return this;
    }

    /**
     * Get the blobTypes property: An array of predefined enum values. Valid values include blockBlob, appendBlob,
     * pageBlob. Hns accounts does not support pageBlobs.
     *
     * @return the blobTypes value.
     */
    public List<String> blobTypes() {
        return this.blobTypes;
    }

    /**
     * Set the blobTypes property: An array of predefined enum values. Valid values include blockBlob, appendBlob,
     * pageBlob. Hns accounts does not support pageBlobs.
     *
     * @param blobTypes the blobTypes value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withBlobTypes(List<String> blobTypes) {
        this.blobTypes = blobTypes;
        return this;
    }

    /**
     * Get the includeBlobVersions property: Includes blob versions in blob inventory when value set to true.
     *
     * @return the includeBlobVersions value.
     */
    public Boolean includeBlobVersions() {
        return this.includeBlobVersions;
    }

    /**
     * Set the includeBlobVersions property: Includes blob versions in blob inventory when value set to true.
     *
     * @param includeBlobVersions the includeBlobVersions value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeBlobVersions(Boolean includeBlobVersions) {
        this.includeBlobVersions = includeBlobVersions;
        return this;
    }

    /**
     * Get the includeSnapshots property: Includes blob snapshots in blob inventory when value set to true.
     *
     * @return the includeSnapshots value.
     */
    public Boolean includeSnapshots() {
        return this.includeSnapshots;
    }

    /**
     * Set the includeSnapshots property: Includes blob snapshots in blob inventory when value set to true.
     *
     * @param includeSnapshots the includeSnapshots value to set.
     * @return the BlobInventoryPolicyFilter object itself.
     */
    public BlobInventoryPolicyFilter withIncludeSnapshots(Boolean includeSnapshots) {
        this.includeSnapshots = includeSnapshots;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blobTypes() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property blobTypes in model BlobInventoryPolicyFilter"));
        }
    }
}
