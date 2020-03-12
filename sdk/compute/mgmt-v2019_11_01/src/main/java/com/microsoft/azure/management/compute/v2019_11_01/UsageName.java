/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Usage Names.
 */
public class UsageName {
    /**
     * The name of the resource.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * The localized name of the resource.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Get the name of the resource.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the name of the resource.
     *
     * @param value the value value to set
     * @return the UsageName object itself.
     */
    public UsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localized name of the resource.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localized name of the resource.
     *
     * @param localizedValue the localizedValue value to set
     * @return the UsageName object itself.
     */
    public UsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
        return this;
    }

}
