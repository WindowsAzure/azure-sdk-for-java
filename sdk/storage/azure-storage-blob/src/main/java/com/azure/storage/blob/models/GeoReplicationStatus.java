// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for GeoReplicationStatus.
 */
public final class GeoReplicationStatus extends ExpandableStringEnum<GeoReplicationStatus> {
    /**
     * Static value live for GeoReplicationStatus.
     */
    public static final GeoReplicationStatus LIVE = fromString("live");

    /**
     * Static value bootstrap for GeoReplicationStatus.
     */
    public static final GeoReplicationStatus BOOTSTRAP = fromString("bootstrap");

    /**
     * Static value unavailable for GeoReplicationStatus.
     */
    public static final GeoReplicationStatus UNAVAILABLE = fromString("unavailable");

    /**
     * Creates or finds a GeoReplicationStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoReplicationStatus.
     */
    @JsonCreator
    public static GeoReplicationStatus fromString(String name) {
        return fromString(name, GeoReplicationStatus.class);
    }

    /**
     * @return known GeoReplicationStatus values.
     */
    public static Collection<GeoReplicationStatus> values() {
        return values(GeoReplicationStatus.class);
    }
}
