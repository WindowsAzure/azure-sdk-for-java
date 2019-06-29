// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.blob.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for GeoReplicationStatusType.
 */
public final class GeoReplicationStatusType extends ExpandableStringEnum<GeoReplicationStatusType> {
    /**
     * Static value live for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType LIVE = fromString("live");

    /**
     * Static value bootstrap for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType BOOTSTRAP = fromString("bootstrap");

    /**
     * Static value unavailable for GeoReplicationStatusType.
     */
    public static final GeoReplicationStatusType UNAVAILABLE = fromString("unavailable");

    /**
     * Creates or finds a GeoReplicationStatusType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GeoReplicationStatusType.
     */
    @JsonCreator
    public static GeoReplicationStatusType fromString(String name) {
        return fromString(name, GeoReplicationStatusType.class);
    }

    /**
     * @return known GeoReplicationStatusType values.
     */
    public static Collection<GeoReplicationStatusType> values() {
        return values(GeoReplicationStatusType.class);
    }
}
