// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The TargetRegion model. */
@Fluent
public final class TargetRegion {
    /*
     * The name of the region.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * The number of replicas of the Image Version to be created per region.
     * This property is updatable.
     */
    @JsonProperty(value = "regionalReplicaCount")
    private Integer regionalReplicaCount;

    /*
     * Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     */
    @JsonProperty(value = "storageAccountType")
    private StorageAccountType storageAccountType;

    /**
     * Get the name property: The name of the region.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the region.
     *
     * @param name the name value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the regionalReplicaCount property: The number of replicas of the Image Version to be created per region. This
     * property is updatable.
     *
     * @return the regionalReplicaCount value.
     */
    public Integer regionalReplicaCount() {
        return this.regionalReplicaCount;
    }

    /**
     * Set the regionalReplicaCount property: The number of replicas of the Image Version to be created per region. This
     * property is updatable.
     *
     * @param regionalReplicaCount the regionalReplicaCount value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withRegionalReplicaCount(Integer regionalReplicaCount) {
        this.regionalReplicaCount = regionalReplicaCount;
        return this;
    }

    /**
     * Get the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @return the storageAccountType value.
     */
    public StorageAccountType storageAccountType() {
        return this.storageAccountType;
    }

    /**
     * Set the storageAccountType property: Specifies the storage account type to be used to store the image. This
     * property is not updatable.
     *
     * @param storageAccountType the storageAccountType value to set.
     * @return the TargetRegion object itself.
     */
    public TargetRegion withStorageAccountType(StorageAccountType storageAccountType) {
        this.storageAccountType = storageAccountType;
        return this;
    }
}
