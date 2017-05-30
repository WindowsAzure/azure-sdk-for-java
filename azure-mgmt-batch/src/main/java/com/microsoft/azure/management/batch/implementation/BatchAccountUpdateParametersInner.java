/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.implementation;

import java.util.Map;
import com.microsoft.azure.management.batch.AutoStorageBaseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Parameters for updating an Azure Batch account.
 */
@JsonFlatten
public class BatchAccountUpdateParametersInner {
    /**
     * The user-specified tags associated with the account.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * The properties related to the auto-storage account.
     */
    @JsonProperty(value = "properties.autoStorage")
    private AutoStorageBaseProperties autoStorage;

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
     * @return the BatchAccountUpdateParametersInner object itself.
     */
    public BatchAccountUpdateParametersInner withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the autoStorage value.
     *
     * @return the autoStorage value
     */
    public AutoStorageBaseProperties autoStorage() {
        return this.autoStorage;
    }

    /**
     * Set the autoStorage value.
     *
     * @param autoStorage the autoStorage value to set
     * @return the BatchAccountUpdateParametersInner object itself.
     */
    public BatchAccountUpdateParametersInner withAutoStorage(AutoStorageBaseProperties autoStorage) {
        this.autoStorage = autoStorage;
        return this;
    }

}
