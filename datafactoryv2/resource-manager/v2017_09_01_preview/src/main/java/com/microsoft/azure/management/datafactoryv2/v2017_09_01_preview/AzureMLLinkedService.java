/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Azure ML Web Service linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureML")
@JsonFlatten
public class AzureMLLinkedService extends LinkedServiceInner {
    /**
     * The Batch Execution REST URL for an Azure ML Web Service endpoint. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.mlEndpoint", required = true)
    private Object mlEndpoint;

    /**
     * The API key for accessing the Azure ML model endpoint.
     */
    @JsonProperty(value = "typeProperties.apiKey", required = true)
    private SecretBase apiKey;

    /**
     * The Update Resource REST URL for an Azure ML Web Service endpoint. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.updateResourceEndpoint")
    private Object updateResourceEndpoint;

    /**
     * The ID of the service principal used to authenticate against the
     * ARM-based updateResourceEndpoint of an Azure ML web service. Type:
     * string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.servicePrincipalId")
    private Object servicePrincipalId;

    /**
     * The key of the service principal used to authenticate against the
     * ARM-based updateResourceEndpoint of an Azure ML web service.
     */
    @JsonProperty(value = "typeProperties.servicePrincipalKey")
    private SecretBase servicePrincipalKey;

    /**
     * The name or ID of the tenant to which the service principal belongs.
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.tenant")
    private Object tenant;

    /**
     * The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /**
     * Get the Batch Execution REST URL for an Azure ML Web Service endpoint. Type: string (or Expression with resultType string).
     *
     * @return the mlEndpoint value
     */
    public Object mlEndpoint() {
        return this.mlEndpoint;
    }

    /**
     * Set the Batch Execution REST URL for an Azure ML Web Service endpoint. Type: string (or Expression with resultType string).
     *
     * @param mlEndpoint the mlEndpoint value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withMlEndpoint(Object mlEndpoint) {
        this.mlEndpoint = mlEndpoint;
        return this;
    }

    /**
     * Get the API key for accessing the Azure ML model endpoint.
     *
     * @return the apiKey value
     */
    public SecretBase apiKey() {
        return this.apiKey;
    }

    /**
     * Set the API key for accessing the Azure ML model endpoint.
     *
     * @param apiKey the apiKey value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withApiKey(SecretBase apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    /**
     * Get the Update Resource REST URL for an Azure ML Web Service endpoint. Type: string (or Expression with resultType string).
     *
     * @return the updateResourceEndpoint value
     */
    public Object updateResourceEndpoint() {
        return this.updateResourceEndpoint;
    }

    /**
     * Set the Update Resource REST URL for an Azure ML Web Service endpoint. Type: string (or Expression with resultType string).
     *
     * @param updateResourceEndpoint the updateResourceEndpoint value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withUpdateResourceEndpoint(Object updateResourceEndpoint) {
        this.updateResourceEndpoint = updateResourceEndpoint;
        return this;
    }

    /**
     * Get the ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML web service. Type: string (or Expression with resultType string).
     *
     * @return the servicePrincipalId value
     */
    public Object servicePrincipalId() {
        return this.servicePrincipalId;
    }

    /**
     * Set the ID of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML web service. Type: string (or Expression with resultType string).
     *
     * @param servicePrincipalId the servicePrincipalId value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withServicePrincipalId(Object servicePrincipalId) {
        this.servicePrincipalId = servicePrincipalId;
        return this;
    }

    /**
     * Get the key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML web service.
     *
     * @return the servicePrincipalKey value
     */
    public SecretBase servicePrincipalKey() {
        return this.servicePrincipalKey;
    }

    /**
     * Set the key of the service principal used to authenticate against the ARM-based updateResourceEndpoint of an Azure ML web service.
     *
     * @param servicePrincipalKey the servicePrincipalKey value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withServicePrincipalKey(SecretBase servicePrincipalKey) {
        this.servicePrincipalKey = servicePrincipalKey;
        return this;
    }

    /**
     * Get the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @return the tenant value
     */
    public Object tenant() {
        return this.tenant;
    }

    /**
     * Set the name or ID of the tenant to which the service principal belongs. Type: string (or Expression with resultType string).
     *
     * @param tenant the tenant value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withTenant(Object tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Get the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value
     */
    public Object encryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encrypted credential used for authentication. Credentials are encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set
     * @return the AzureMLLinkedService object itself.
     */
    public AzureMLLinkedService withEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

}
