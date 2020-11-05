/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.implementation;

import java.util.List;
import com.microsoft.azure.management.desktopvirtualization.v2020_10_19_preview.ResourceProviderOperation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to list operations.
 */
public class ResourceProviderOperationListInner {
    /**
     * List of operations supported by this resource provider.
     */
    @JsonProperty(value = "value")
    private List<ResourceProviderOperation> value;

    /**
     * Get list of operations supported by this resource provider.
     *
     * @return the value value
     */
    public List<ResourceProviderOperation> value() {
        return this.value;
    }

    /**
     * Set list of operations supported by this resource provider.
     *
     * @param value the value value to set
     * @return the ResourceProviderOperationListInner object itself.
     */
    public ResourceProviderOperationListInner withValue(List<ResourceProviderOperation> value) {
        this.value = value;
        return this;
    }

}
