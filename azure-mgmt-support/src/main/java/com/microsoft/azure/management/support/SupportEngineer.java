/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Support engineer information.
 */
public class SupportEngineer {
    /**
     * Support engineer email address.
     */
    @JsonProperty(value = "emailAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String emailAddress;

    /**
     * Get support engineer email address.
     *
     * @return the emailAddress value
     */
    public String emailAddress() {
        return this.emailAddress;
    }

}
