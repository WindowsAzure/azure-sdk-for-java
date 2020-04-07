// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The LogAnalyticsOutput model.
 */
@Immutable
public final class LogAnalyticsOutput {
    /*
     * Output file Uri path to blob container.
     */
    @JsonProperty(value = "output", access = JsonProperty.Access.WRITE_ONLY)
    private String output;

    /**
     * Get the output property: Output file Uri path to blob container.
     * 
     * @return the output value.
     */
    public String output() {
        return this.output;
    }
}
