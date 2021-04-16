// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Defines values for WafMetricsResponseSeriesItemUnit. */
public enum WafMetricsResponseSeriesItemUnit {
    /** Enum value count. */
    COUNT("count");

    /** The actual serialized value for a WafMetricsResponseSeriesItemUnit instance. */
    private final String value;

    WafMetricsResponseSeriesItemUnit(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a WafMetricsResponseSeriesItemUnit instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed WafMetricsResponseSeriesItemUnit object, or null if unable to parse.
     */
    @JsonCreator
    public static WafMetricsResponseSeriesItemUnit fromString(String value) {
        WafMetricsResponseSeriesItemUnit[] items = WafMetricsResponseSeriesItemUnit.values();
        for (WafMetricsResponseSeriesItemUnit item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
