/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import java.util.List;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The response to a list usage request.
 */
public class UsagesResultInner {
    /**
     * The list of usages for Cognitive Service account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<Usage> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Usage> value() {
        return this.value;
    }

}
