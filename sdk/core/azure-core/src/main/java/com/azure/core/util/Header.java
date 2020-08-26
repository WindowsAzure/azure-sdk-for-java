// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.util;

import java.util.Objects;

/**
 * A single header within for a request.
 *
 * If multiple header values are added to a request or response with
 * the same name (case-insensitive), then the values will be appended
 * to the end of the same Header with commas separating them.
 */
public class Header {
    private final String name;
    private String value;

    /**
     * Create a Header instance using the provided name and value.
     *
     * @param name the name
     * @param value the value
     * @throws NullPointerException if {@code name} or {@code value} is null.
     */
    public Header(String name, String value) {
        Objects.requireNonNull(name, "'name' cannot be null.");
        Objects.requireNonNull(value, "'value' cannot be null.");

        this.name = name;
        this.value = value;
    }

    /**
     * Get the header name.
     *
     * @return the name of this Header
     */
    public String getName() {
        return name;
    }

    /**
     * Get the header value.
     *
     * @return the value of this Header
     */
    public String getValue() {
        return value;
    }

    /**
     * Get the comma separated value as an array.
     *
     * @return the values of this Header that are separated by a comma
     */
    public String[] getValues() {
        return value == null ? null : value.split(",");
    }

    /**
     * Add a new value to the end of the Header.
     *
     * @param value the value to add
     * @throws NullPointerException if {@code value} is null.
     */
    public void addValue(String value) {
        Objects.requireNonNull(value, "'value' cannot be null.");
        this.value += "," + value;
    }

    /**
     * Get the String representation of the header.
     *
     * @return the String representation of this Header.
     */
    @Override
    public String toString() {
        return name + ":" + value;
    }
}
