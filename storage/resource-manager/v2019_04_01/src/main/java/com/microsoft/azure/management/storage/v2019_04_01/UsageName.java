/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The usage names that can be used; currently limited to StorageAccount.
 */
public class UsageName {
    /**
     * Gets a string describing the resource name.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Gets a localized string describing the resource name.
     */
    @JsonProperty(value = "localizedValue", access = JsonProperty.Access.WRITE_ONLY)
    private String localizedValue;

    /**
     * Get gets a string describing the resource name.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get gets a localized string describing the resource name.
     *
     * @return the localizedValue value
     */
    public String localizedValue() {
        return this.localizedValue;
    }

}
