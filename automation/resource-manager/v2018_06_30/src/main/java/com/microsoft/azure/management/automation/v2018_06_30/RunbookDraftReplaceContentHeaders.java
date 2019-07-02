/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2018_06_30;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines headers for ReplaceContent operation.
 */
public class RunbookDraftReplaceContentHeaders {
    /**
     * URL to query for status of the operation.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * Get uRL to query for status of the operation.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set uRL to query for status of the operation.
     *
     * @param location the location value to set
     * @return the RunbookDraftReplaceContentHeaders object itself.
     */
    public RunbookDraftReplaceContentHeaders withLocation(String location) {
        this.location = location;
        return this;
    }

}
