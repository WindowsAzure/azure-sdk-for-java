// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.service.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for TileSize. */
public final class TileSize extends ExpandableStringEnum<TileSize> {
    /** Static value 256 for TileSize. */
    public static final TileSize TWO_HUNDRED_FIFTY_SIX = fromString("256");

    /** Static value 512 for TileSize. */
    public static final TileSize FIVE_HUNDRED_TWELVE = fromString("512");

    /**
     * Creates or finds a TileSize from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TileSize.
     */
    @JsonCreator
    public static TileSize fromString(String name) {
        return fromString(name, TileSize.class);
    }

    /** @return known TileSize values. */
    public static Collection<TileSize> values() {
        return values(TileSize.class);
    }
}
