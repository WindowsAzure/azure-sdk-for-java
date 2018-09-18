/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters for updating an Storage sync service.
 */
public class StorageSyncServiceUpdateParameters {
    /**
     * The user-specified tags associated with the storage sync service.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The properties of the storage sync service.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the user-specified tags associated with the storage sync service.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the user-specified tags associated with the storage sync service.
     *
     * @param tags the tags value to set
     * @return the StorageSyncServiceUpdateParameters object itself.
     */
    public StorageSyncServiceUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties of the storage sync service.
     *
     * @return the properties value
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties of the storage sync service.
     *
     * @param properties the properties value to set
     * @return the StorageSyncServiceUpdateParameters object itself.
     */
    public StorageSyncServiceUpdateParameters withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

}
