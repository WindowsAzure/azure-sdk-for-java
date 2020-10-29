/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The description of the service.
 */
public class ServicesPatchDescription {
    /**
     * Instance tags.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get instance tags.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set instance tags.
     *
     * @param tags the tags value to set
     * @return the ServicesPatchDescription object itself.
     */
    public ServicesPatchDescription withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
