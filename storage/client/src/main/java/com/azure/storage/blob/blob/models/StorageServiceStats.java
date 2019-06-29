// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.storage.blob.models.GeoReplication;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Stats for the storage service.
 */
@JacksonXmlRootElement(localName = "StorageServiceStats")
public final class StorageServiceStats {
    /*
     * The geoReplication property.
     */
    @JsonProperty(value = "GeoReplication")
    private com.azure.storage.blob.models.GeoReplication geoReplication;

    /**
     * Get the geoReplication property: The geoReplication property.
     *
     * @return the geoReplication value.
     */
    public com.azure.storage.blob.models.GeoReplication geoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication property: The geoReplication property.
     *
     * @param geoReplication the geoReplication value to set.
     * @return the StorageServiceStats object itself.
     */
    public StorageServiceStats geoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }
}
