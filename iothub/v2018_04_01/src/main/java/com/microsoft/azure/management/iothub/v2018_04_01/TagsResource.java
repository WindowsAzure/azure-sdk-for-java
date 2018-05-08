/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A container holding only the Tags for a resource, allowing the user to
 * update the tags on an IoT Hub instance.
 */
public class TagsResource {
    /**
     * Resource tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the TagsResource object itself.
     */
    public TagsResource withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
