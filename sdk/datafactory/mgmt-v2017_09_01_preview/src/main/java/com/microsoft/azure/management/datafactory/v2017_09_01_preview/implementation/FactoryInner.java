/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.FactoryIdentity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.FactoryVSTSConfiguration;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Factory resource type.
 */
@JsonFlatten
@SkipParentValidation
public class FactoryInner extends Resource {
    /**
     * Unmatched properties from the message are deserialized this collection.
     */
    @JsonProperty(value = "")
    private Map<String, Object> additionalProperties;

    /**
     * Managed service identity of the factory.
     */
    @JsonProperty(value = "identity")
    private FactoryIdentity identity;

    /**
     * Factory provisioning state, example Succeeded.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Time the factory was created in ISO8601 format.
     */
    @JsonProperty(value = "properties.createTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime createTime;

    /**
     * Version of the factory.
     */
    @JsonProperty(value = "properties.version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * VSTS repo information of the factory.
     */
    @JsonProperty(value = "properties.vstsConfiguration")
    private FactoryVSTSConfiguration vstsConfiguration;

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
     * @return the FactoryInner object itself.
     */
    public FactoryInner withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    /**
     * Get managed service identity of the factory.
     *
     * @return the identity value
     */
    public FactoryIdentity identity() {
        return this.identity;
    }

    /**
     * Set managed service identity of the factory.
     *
     * @param identity the identity value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withIdentity(FactoryIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get factory provisioning state, example Succeeded.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get time the factory was created in ISO8601 format.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Get version of the factory.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get vSTS repo information of the factory.
     *
     * @return the vstsConfiguration value
     */
    public FactoryVSTSConfiguration vstsConfiguration() {
        return this.vstsConfiguration;
    }

    /**
     * Set vSTS repo information of the factory.
     *
     * @param vstsConfiguration the vstsConfiguration value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withVstsConfiguration(FactoryVSTSConfiguration vstsConfiguration) {
        this.vstsConfiguration = vstsConfiguration;
        return this;
    }

}
