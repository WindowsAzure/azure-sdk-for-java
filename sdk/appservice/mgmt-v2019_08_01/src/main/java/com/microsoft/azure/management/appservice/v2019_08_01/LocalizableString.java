/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localizable string object containing the name and a localized value.
 */
public class LocalizableString {
    /**
     * Non-localized name.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Localized name.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get non-localized name.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set non-localized name.
     *
     * @param value the value value to set
     * @return the LocalizableString object itself.
     */
    public LocalizableString withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get localized name.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set localized name.
     *
     * @param localizedValue the localizedValue value to set
     * @return the LocalizableString object itself.
     */
    public LocalizableString withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
