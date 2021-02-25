/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import java.util.Map;
import com.microsoft.azure.management.datafactory.v2018_06_01.FactoryIdentity;
import org.joda.time.DateTime;
import com.microsoft.azure.management.datafactory.v2018_06_01.FactoryRepoConfiguration;
import com.microsoft.azure.management.datafactory.v2018_06_01.GlobalParameterSpecification;
import com.microsoft.azure.management.datafactory.v2018_06_01.EncryptionConfiguration;
import com.microsoft.azure.management.datafactory.v2018_06_01.PublicNetworkAccess;
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
     * Git repo information of the factory.
     */
    @JsonProperty(value = "properties.repoConfiguration")
    private FactoryRepoConfiguration repoConfiguration;

    /**
     * List of parameters for factory.
     */
    @JsonProperty(value = "properties.globalParameters")
    private Map<String, GlobalParameterSpecification> globalParameters;

    /**
     * Properties to enable Customer Managed Key for the factory.
     */
    @JsonProperty(value = "properties.encryption")
    private EncryptionConfiguration encryption;

    /**
     * Whether or not public network access is allowed for the data factory.
     * Possible values include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /**
     * Etag identifies change in the resource.
     */
    @JsonProperty(value = "eTag", access = JsonProperty.Access.WRITE_ONLY)
    private String eTag;

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
     * Get git repo information of the factory.
     *
     * @return the repoConfiguration value
     */
    public FactoryRepoConfiguration repoConfiguration() {
        return this.repoConfiguration;
    }

    /**
     * Set git repo information of the factory.
     *
     * @param repoConfiguration the repoConfiguration value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withRepoConfiguration(FactoryRepoConfiguration repoConfiguration) {
        this.repoConfiguration = repoConfiguration;
        return this;
    }

    /**
     * Get list of parameters for factory.
     *
     * @return the globalParameters value
     */
    public Map<String, GlobalParameterSpecification> globalParameters() {
        return this.globalParameters;
    }

    /**
     * Set list of parameters for factory.
     *
     * @param globalParameters the globalParameters value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withGlobalParameters(Map<String, GlobalParameterSpecification> globalParameters) {
        this.globalParameters = globalParameters;
        return this;
    }

    /**
     * Get properties to enable Customer Managed Key for the factory.
     *
     * @return the encryption value
     */
    public EncryptionConfiguration encryption() {
        return this.encryption;
    }

    /**
     * Set properties to enable Customer Managed Key for the factory.
     *
     * @param encryption the encryption value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withEncryption(EncryptionConfiguration encryption) {
        this.encryption = encryption;
        return this;
    }

    /**
     * Get whether or not public network access is allowed for the data factory. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the publicNetworkAccess value
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set whether or not public network access is allowed for the data factory. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set
     * @return the FactoryInner object itself.
     */
    public FactoryInner withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get etag identifies change in the resource.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

}
