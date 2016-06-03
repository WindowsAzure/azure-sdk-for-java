/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.implementation.api;


/**
 * Name value pair.
 */
public class NameValuePair {
    /**
     * Pair name.
     */
    private String name;

    /**
     * Pair value.
     */
    private String value;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the NameValuePair object itself.
     */
    public NameValuePair withValue(String value) {
        this.value = value;
        return this;
    }

}
