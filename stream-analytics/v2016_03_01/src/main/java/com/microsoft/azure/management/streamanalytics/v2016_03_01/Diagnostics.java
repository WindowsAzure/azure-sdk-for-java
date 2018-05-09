/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.streamanalytics.v2016_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes conditions applicable to the Input, Output, or the job overall,
 * that warrant customer attention.
 */
public class Diagnostics {
    /**
     * A collection of zero or more conditions applicable to the resource, or
     * to the job overall, that warrant customer attention.
     */
    @JsonProperty(value = "conditions", access = JsonProperty.Access.WRITE_ONLY)
    private List<DiagnosticCondition> conditions;

    /**
     * Get the conditions value.
     *
     * @return the conditions value
     */
    public List<DiagnosticCondition> conditions() {
        return this.conditions;
    }

}
