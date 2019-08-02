/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The localizable string class.
 */
public class LocalizableString {
    /**
     * the invariant value.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /**
     * the locale specific value.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the invariant value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the invariant value.
     *
     * @param value the value value to set
     * @return the LocalizableString object itself.
     */
    public LocalizableString withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the locale specific value.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the locale specific value.
     *
     * @param localizedValue the localizedValue value to set
     * @return the LocalizableString object itself.
     */
    public LocalizableString withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
