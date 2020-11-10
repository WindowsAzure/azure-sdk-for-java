/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.IntegrationRuntimeInner;

/**
 * Self-hosted integration runtime.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = SelfHostedIntegrationRuntime.class)
@JsonTypeName("SelfHosted")
@JsonFlatten
public class SelfHostedIntegrationRuntime extends IntegrationRuntimeInner {
    /**
     * Linked integration runtime type from data factory.
     */
    @JsonProperty(value = "typeProperties.linkedInfo")
    private LinkedIntegrationRuntimeType linkedInfo;

    /**
     * Get linked integration runtime type from data factory.
     *
     * @return the linkedInfo value
     */
    public LinkedIntegrationRuntimeType linkedInfo() {
        return this.linkedInfo;
    }

    /**
     * Set linked integration runtime type from data factory.
     *
     * @param linkedInfo the linkedInfo value to set
     * @return the SelfHostedIntegrationRuntime object itself.
     */
    public SelfHostedIntegrationRuntime withLinkedInfo(LinkedIntegrationRuntimeType linkedInfo) {
        this.linkedInfo = linkedInfo;
        return this;
    }

}
