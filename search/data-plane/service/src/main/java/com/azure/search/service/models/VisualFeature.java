/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.search.service.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VisualFeature.
 */
public enum VisualFeature {
    /**
     * Enum value categories.
     */
    CATEGORIES("categories"),

    /**
     * Enum value tags.
     */
    TAGS("tags"),

    /**
     * Enum value description.
     */
    DESCRIPTION("description"),

    /**
     * Enum value faces.
     */
    FACES("faces"),

    /**
     * Enum value imageType.
     */
    IMAGE_TYPE("imageType"),

    /**
     * Enum value color.
     */
    COLOR("color");

    /**
     * The actual serialized value for a VisualFeature instance.
     */
    private String value;

    VisualFeature(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a VisualFeature instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed VisualFeature object, or null if unable to parse.
     */
    @JsonCreator
    public static VisualFeature fromString(String value) {
        VisualFeature[] items = VisualFeature.values();
        for (VisualFeature item : items) {
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
