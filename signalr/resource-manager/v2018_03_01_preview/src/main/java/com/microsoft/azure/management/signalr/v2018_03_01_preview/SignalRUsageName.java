/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2018_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Localizable String object containing the name and a localized value.
 */
public class SignalRUsageName {
    /**
     * The indentifier of the usage.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Localized name of the usage.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the indentifier of the usage.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the indentifier of the usage.
     *
     * @param value the value value to set
     * @return the SignalRUsageName object itself.
     */
    public SignalRUsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get localized name of the usage.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set localized name of the usage.
     *
     * @param localizedValue the localizedValue value to set
     * @return the SignalRUsageName object itself.
     */
    public SignalRUsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
