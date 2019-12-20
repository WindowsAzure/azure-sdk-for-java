/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2018_08_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Lists the operations response.
 */
public class OperationListResultInner {
    /**
     * List of operations available in the resourcehealth resource provider.
     */
    @JsonProperty(value = "value", required = true)
    private List<OperationInner> value;

    /**
     * Get list of operations available in the resourcehealth resource provider.
     *
     * @return the value value
     */
    public List<OperationInner> value() {
        return this.value;
    }

    /**
     * Set list of operations available in the resourcehealth resource provider.
     *
     * @param value the value value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<OperationInner> value) {
        this.value = value;
        return this;
    }

}
