/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.ManagedIntegrationRuntime;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.SelfHostedIntegrationRuntime;

/**
 * Azure Synapse nested object which serves as a compute resource for
 * activities.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type", defaultImpl = IntegrationRuntimeInner.class)
@JsonTypeName("IntegrationRuntime")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Managed", value = ManagedIntegrationRuntime.class),
    @JsonSubTypes.Type(name = "SelfHosted", value = SelfHostedIntegrationRuntime.class)
})
public class IntegrationRuntimeInner {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Integration runtime description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get unmatched properties from the message are deserialized this collection.
     *
     * @return the additionalProperties value
     */
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set unmatched properties from the message are deserialized this collection.
     *
     * @param additionalProperties the additionalProperties value to set
     * @return the IntegrationRuntimeInner object itself.
     */
    public IntegrationRuntimeInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get integration runtime description.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set integration runtime description.
     *
     * @param description the description value to set
     * @return the IntegrationRuntimeInner object itself.
     */
    public IntegrationRuntimeInner withDescription(String description) {
        this.description = description;
        return this;
    }

}
