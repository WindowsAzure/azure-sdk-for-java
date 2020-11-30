// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.geojson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a geometric line.
 */
public final class GeoLine extends GeoObject {
    private final GeoArray<GeoPosition> coordinates;

    /**
     * Constructs a geometric line.
     *
     * @param positions Geometric positions that define the line.
     * @throws NullPointerException If {@code positions} is {@code null}.
     */
    public GeoLine(List<GeoPosition> positions) {
        this(positions, null, null);
    }

    /**
     * Constructs a geometric line.
     *
     * @param positions Geometric positions that define the line.
     * @param boundingBox Bounding box for the line.
     * @param customProperties Additional properties of the geometric line.
     * @throws NullPointerException If {@code positions} is {@code null}.
     */
    public GeoLine(List<GeoPosition> positions, GeoBoundingBox boundingBox, Map<String, Object> customProperties) {
        super(boundingBox, customProperties);

        Objects.requireNonNull(positions, "'positions' cannot be null.");
        this.coordinates = new GeoArray<>(new ArrayList<>(positions));
    }

    /**
     * Unmodifiable representation of the {@link GeoPosition geometric positions} representing this line.
     *
     * @return An unmodifiable representation of the {@link GeoPosition geometric positions} representing this line.
     */
    public GeoArray<GeoPosition> getCoordinates() {
        return coordinates;
    }

    @Override
    public GeoObjectType getType() {
        return GeoObjectType.LINE_STRING;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinates, super.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof GeoLine)) {
            return false;
        }

        if (this == obj) {
            return true;
        }

        GeoLine other = (GeoLine) obj;
        return super.equals(other) && Objects.equals(coordinates, other.coordinates);
    }
}
