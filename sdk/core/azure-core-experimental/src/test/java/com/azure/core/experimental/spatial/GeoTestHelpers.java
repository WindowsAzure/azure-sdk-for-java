// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.experimental.spatial;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.Supplier;

/**
 * Helper methods when running geo tests.
 */
public class GeoTestHelpers {
    public static final Supplier<GeoPosition> PIKES_PLACE_POSITION = () ->
        new GeoPosition(-122.342148, 47.609657);

    public static final Supplier<GeoBoundingBox> PIKES_PLACE_BOUNDING_BOX = () ->
        new GeoBoundingBox(-122.349408, 47.604448, -122.334368, 47.610870);

    public static final Supplier<GeoPosition> MT_RAINIER_POSITION = () ->
        new GeoPosition(-121.726906, 46.879967, 4392D);

    public static final Supplier<GeoBoundingBox> MT_RAINIER_BOUNDING_BOX = () ->
        new GeoBoundingBox(-121.993999, 46.713820, -121.528334, 47.035690, 0D, 4500D);

    public static final Supplier<GeoLine> TRIANGLE_LINE = () ->
        new GeoLine(Arrays.asList(
            new GeoPosition(0, 0), new GeoPosition(1, 1),
            new GeoPosition(0, 1), new GeoPosition(0, 0)
        ));

    public static final Supplier<GeoPolygon> TRIANGLE_POLYGON = () ->
        new GeoPolygon(Collections.singletonList(TRIANGLE_LINE.get()));

    public static final Supplier<GeoLine> SQUARE_LINE = () ->
        new GeoLine(Arrays.asList(
            new GeoPosition(0, 0), new GeoPosition(0, 1), new GeoPosition(1, 1),
            new GeoPosition(1, 0), new GeoPosition(0, 0)
        ));

    public static final Supplier<GeoPolygon> SQUARE_POLYGON = () ->
        new GeoPolygon(Collections.singletonList(SQUARE_LINE.get()));

    public static final Supplier<GeoLine> RECTANGLE_LINE = () ->
        new GeoLine(Arrays.asList(
            new GeoPosition(0, 0), new GeoPosition(0, 2), new GeoPosition(1, 2),
            new GeoPosition(1, 0), new GeoPosition(0, 0)
        ));

    public static final Supplier<GeoPolygon> RECTANGLE_POLYGON = () ->
        new GeoPolygon(Collections.singletonList(RECTANGLE_LINE.get()));
}
