/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_12_01_preview;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters for updating a replication.
 */
public class ReplicationUpdateParameters {
    /**
     * The tags for the replication.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the tags for the replication.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags for the replication.
     *
     * @param tags the tags value to set
     * @return the ReplicationUpdateParameters object itself.
     */
    public ReplicationUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
