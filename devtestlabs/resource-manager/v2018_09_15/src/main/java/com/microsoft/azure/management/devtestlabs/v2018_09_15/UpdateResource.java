/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2018_09_15;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an update resource.
 */
public class UpdateResource {
    /**
     * The tags of the resource.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags of the resource.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags of the resource.
     *
     * @param tags the tags value to set
     * @return the UpdateResource object itself.
     */
    public UpdateResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
