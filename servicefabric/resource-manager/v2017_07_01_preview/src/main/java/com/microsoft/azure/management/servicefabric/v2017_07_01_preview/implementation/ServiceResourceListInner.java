/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of service resources.
 */
public class ServiceResourceListInner {
    /**
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ServiceResourceInner> value;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<ServiceResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the ServiceResourceListInner object itself.
     */
    public ServiceResourceListInner withValue(List<ServiceResourceInner> value) {
        this.value = value;
        return this;
    }

}
