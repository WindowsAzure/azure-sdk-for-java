/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a Check Name availability request properties.
 */
public class CheckNameAvailability {
    /**
     * The Name to check the namespace name availability and The namespace name
     * can contain only letters, numbers, and hyphens. The namespace must start
     * with a letter, and it must end with a letter or number.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the Name to check the namespace name availability and The namespace name can contain only letters, numbers, and hyphens. The namespace must start with a letter, and it must end with a letter or number.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the Name to check the namespace name availability and The namespace name can contain only letters, numbers, and hyphens. The namespace must start with a letter, and it must end with a letter or number.
     *
     * @param name the name value to set
     * @return the CheckNameAvailability object itself.
     */
    public CheckNameAvailability withName(String name) {
        this.name = name;
        return this;
    }

}
