// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for MapTileSize. */
public final class MapTileSize extends ExpandableStringEnum<MapTileSize> {
    /** Static value 256 for MapTileSize. */
    public static final MapTileSize TWO_HUNDRED_FIFTY_SIX = fromString("256");

    /** Static value 512 for MapTileSize. */
    public static final MapTileSize FIVE_HUNDRED_TWELVE = fromString("512");

    /**
     * Creates or finds a MapTileSize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding MapTileSize.
     */
    @JsonCreator
    public static MapTileSize fromString(String name) {
        return fromString(name, MapTileSize.class);
    }

    /** @return known MapTileSize values. */
    public static Collection<MapTileSize> values() {
        return values(MapTileSize.class);
    }
}
