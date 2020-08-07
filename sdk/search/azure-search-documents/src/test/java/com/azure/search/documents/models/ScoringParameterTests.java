// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScoringParameterTests {
    private static final String DASH = "-";
    private static final String COMMA = ",";

    @Test
    public void testConstructorWithMap() {
        List<String> parameters = new ArrayList<>(Arrays.asList("hello", "tests"));
        ScoringParameter scoringParameter = new ScoringParameter("test", parameters);
        List<String> scoringParameterValues = scoringParameter.getValues();
        for (int i = 0; i < parameters.size(); i++) {
            assertEquals(parameters.get(i), scoringParameterValues.get(i));
        }
        parameters.add("test clone");
        assertNotEquals(parameters.size(), scoringParameterValues.size());
        scoringParameterValues.add("test getter");
        List<String> originalValues = scoringParameter.getValues();
        assertNotEquals(originalValues.size(), scoringParameterValues.size());
    }

    @Test
    public void testConstructorWithEscaper() {
        String actualValue = new ScoringParameter("test", Arrays.asList("Hello, O'Brien", "Smith")).toString();
        String expectValue = "test-'Hello, O''Brien',Smith";
        assertEquals(expectValue, actualValue);
    }

    @Test
    public void testConstructorWithNullOrEmptyValuesList() {
        assertThrows(IllegalArgumentException.class,
            () -> new ScoringParameter("test", Arrays.asList("", null)).toString());
    }

    @Test
    public void testConstructorWithMapNullName() {
        assertThrows(NullPointerException.class, () -> new ScoringParameter(null, Arrays.asList("hello", "tests")));
    }

    @Test
    public void testConstructorWithMapNullValues() {
        assertThrows(NullPointerException.class, () -> new ScoringParameter("null value", (List<String>) null));
    }

//    @Test
//    public void testConstructorWithGeopoint() {
//        PointGeometry geoPoint = createPointGeometry(92.0, -114.0);
//        String name = "mytest";
//        String expectValue = name + DASH + geoPoint.getPosition().getLongitude() + COMMA
//            + geoPoint.getPosition().getLatitude();
//        String toFlattenString = new ScoringParameter(name, geoPoint).toString();
//
//        assertEquals(expectValue, toFlattenString);
//    }

//    @Test
//    public void testConstructorWithNullGeopoint() {
//        assertThrows(NullPointerException.class, () -> new ScoringParameter("null geopoint", (PointGeometry) null));
//    }
}
