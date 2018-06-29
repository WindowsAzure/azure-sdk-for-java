/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The name of usage.
 */
public class NameInfo {
    /**
     * Value of usage.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Localized value of usage.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get value of usage.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set value of usage.
     *
     * @param value the value value to set
     * @return the NameInfo object itself.
     */
    public NameInfo withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get localized value of usage.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set localized value of usage.
     *
     * @param localizedValue the localizedValue value to set
     * @return the NameInfo object itself.
     */
    public NameInfo withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
