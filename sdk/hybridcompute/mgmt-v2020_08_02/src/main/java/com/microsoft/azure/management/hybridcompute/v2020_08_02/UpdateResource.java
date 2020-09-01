/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hybridcompute.v2020_08_02;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Update Resource model definition.
 */
public class UpdateResource {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get resource tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set resource tags.
     *
     * @param tags the tags value to set
     * @return the UpdateResource object itself.
     */
    public UpdateResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
