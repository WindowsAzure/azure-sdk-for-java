// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage mapping input properties. */
@Fluent
public final class StorageMappingInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageMappingInputProperties.class);

    /*
     * The ID of the storage object.
     */
    @JsonProperty(value = "targetStorageClassificationId")
    private String targetStorageClassificationId;

    /**
     * Get the targetStorageClassificationId property: The ID of the storage object.
     *
     * @return the targetStorageClassificationId value.
     */
    public String targetStorageClassificationId() {
        return this.targetStorageClassificationId;
    }

    /**
     * Set the targetStorageClassificationId property: The ID of the storage object.
     *
     * @param targetStorageClassificationId the targetStorageClassificationId value to set.
     * @return the StorageMappingInputProperties object itself.
     */
    public StorageMappingInputProperties withTargetStorageClassificationId(String targetStorageClassificationId) {
        this.targetStorageClassificationId = targetStorageClassificationId;
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
