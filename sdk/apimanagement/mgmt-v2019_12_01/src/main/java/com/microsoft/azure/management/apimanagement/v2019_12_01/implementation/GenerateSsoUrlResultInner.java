/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Generate SSO Url operations response details.
 */
public class GenerateSsoUrlResultInner {
    /**
     * Redirect Url containing the SSO URL value.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get redirect Url containing the SSO URL value.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Set redirect Url containing the SSO URL value.
     *
     * @param value the value value to set
     * @return the GenerateSsoUrlResultInner object itself.
     */
    public GenerateSsoUrlResultInner withValue(String value) {
        this.value = value;
        return this;
    }

}
