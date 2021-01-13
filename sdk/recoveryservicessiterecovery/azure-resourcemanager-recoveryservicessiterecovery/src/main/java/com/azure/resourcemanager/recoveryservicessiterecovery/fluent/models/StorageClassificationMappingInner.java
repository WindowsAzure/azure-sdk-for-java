// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.StorageClassificationMappingProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Storage mapping object. */
@Fluent
public final class StorageClassificationMappingInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StorageClassificationMappingInner.class);

    /*
     * Properties of the storage mapping object.
     */
    @JsonProperty(value = "properties")
    private StorageClassificationMappingProperties properties;

    /*
     * Resource Location
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get the properties property: Properties of the storage mapping object.
     *
     * @return the properties value.
     */
    public StorageClassificationMappingProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the storage mapping object.
     *
     * @param properties the properties value to set.
     * @return the StorageClassificationMappingInner object itself.
     */
    public StorageClassificationMappingInner withProperties(StorageClassificationMappingProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location property: Resource Location.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Resource Location.
     *
     * @param location the location value to set.
     * @return the StorageClassificationMappingInner object itself.
     */
    public StorageClassificationMappingInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
