// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.spatial;

import java.util.Map;

/**
 * Represents properties about a {@link Geometry}.
 */
public final class GeometryProperties {
    private final GeometryBoundingBox boundingBox;
    private final Map<String, Object> additionalProperties;

    /**
     * Constructs an empty properties.
     */
    public GeometryProperties() {
        this(null, null);
    }

    /**
     * Constructs properties about a {@link Geometry}.
     *
     * @param boundingBox The bounding box for a geometry.
     * @param additionalProperties Addtional properties about a geometry.
     */
    public GeometryProperties(GeometryBoundingBox boundingBox, Map<String, Object> additionalProperties) {
        this.boundingBox = boundingBox;
        this.additionalProperties = additionalProperties;
    }

    /**
     * Bounding box of the geometry.
     *
     * @return The bounding box of the geometry.
     */
    public GeometryBoundingBox getBoundingBox() {
        return boundingBox;
    }

    /**
     * Additional properties of the geometry.
     *
     * @return The additional properties of the geometry.
     */
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }
}
