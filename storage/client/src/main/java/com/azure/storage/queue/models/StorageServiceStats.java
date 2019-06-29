// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.queue.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

/**
 * Stats for the storage service.
 */
@JacksonXmlRootElement(localName = "StorageServiceStats")
public final class StorageServiceStats {
    /*
     * Geo-Replication information for the Secondary Storage Service
     */
    @JsonProperty(value = "GeoReplication")
    private GeoReplication geoReplication;

    /**
     * Get the geoReplication property: Geo-Replication information for the
     * Secondary Storage Service.
     *
     * @return the geoReplication value.
     */
    public GeoReplication geoReplication() {
        return this.geoReplication;
    }

    /**
     * Set the geoReplication property: Geo-Replication information for the
     * Secondary Storage Service.
     *
     * @param geoReplication the geoReplication value to set.
     * @return the StorageServiceStats object itself.
     */
    public StorageServiceStats geoReplication(GeoReplication geoReplication) {
        this.geoReplication = geoReplication;
        return this;
    }
}
