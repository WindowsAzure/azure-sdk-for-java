/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of a stateless service resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceKind")
@JsonTypeName("Stateless")
public class StatelessServiceProperties extends ServiceProperties {
    /**
     * The instance count.
     */
    @JsonProperty(value = "instanceCount")
    private Integer instanceCount;

    /**
     * Get the instance count.
     *
     * @return the instanceCount value
     */
    public Integer instanceCount() {
        return this.instanceCount;
    }

    /**
     * Set the instance count.
     *
     * @param instanceCount the instanceCount value to set
     * @return the StatelessServiceProperties object itself.
     */
    public StatelessServiceProperties withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

}
