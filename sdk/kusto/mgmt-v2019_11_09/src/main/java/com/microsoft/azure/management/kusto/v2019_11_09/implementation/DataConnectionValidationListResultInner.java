/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_11_09.implementation;

import java.util.List;
import com.microsoft.azure.management.kusto.v2019_11_09.DataConnectionValidationResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list Kusto data connection validation result.
 */
public class DataConnectionValidationListResultInner {
    /**
     * The list of Kusto data connection validation errors.
     */
    @JsonProperty(value = "value")
    private List<DataConnectionValidationResult> value;

    /**
     * Get the list of Kusto data connection validation errors.
     *
     * @return the value value
     */
    public List<DataConnectionValidationResult> value() {
        return this.value;
    }

    /**
     * Set the list of Kusto data connection validation errors.
     *
     * @param value the value value to set
     * @return the DataConnectionValidationListResultInner object itself.
     */
    public DataConnectionValidationListResultInner withValue(List<DataConnectionValidationResult> value) {
        this.value = value;
        return this;
    }

}
