/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ProvisioningState;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.NetworkRuleSet;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Cognitive Services Account is an Azure resource representing the provisioned
 * account, its type, location and SKU.
 */
@JsonFlatten
public class CognitiveServicesAccountInner extends Resource {
    /**
     * Entity Tag.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of cognitive service account.
     */
    @JsonProperty(value = "kind")
    private String kind;

    /**
     * Gets the status of the cognitive services account at the time the
     * operation was called. Possible values include: 'Creating',
     * 'ResolvingDNS', 'Moving', 'Deleting', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Endpoint of the created account.
     */
    @JsonProperty(value = "properties.endpoint")
    private String endpoint;

    /**
     * The internal identifier.
     */
    @JsonProperty(value = "properties.internalId")
    private String internalId;

    /**
     * Optional subdomain name used for token-based authentication.
     */
    @JsonProperty(value = "properties.customSubDomainName")
    private String customSubDomainName;

    /**
     * A collection of rules governing the accessibility from specific network
     * locations.
     */
    @JsonProperty(value = "properties.networkAcls")
    private NetworkRuleSet networkAcls;

    /**
     * The SKU of Cognitive Services account.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get entity Tag.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set entity Tag.
     *
     * @param etag the etag value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of cognitive service account.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set type of cognitive service account.
     *
     * @param kind the kind value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get gets the status of the cognitive services account at the time the operation was called. Possible values include: 'Creating', 'ResolvingDNS', 'Moving', 'Deleting', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get endpoint of the created account.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set endpoint of the created account.
     *
     * @param endpoint the endpoint value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the internal identifier.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Set the internal identifier.
     *
     * @param internalId the internalId value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    /**
     * Get optional subdomain name used for token-based authentication.
     *
     * @return the customSubDomainName value
     */
    public String customSubDomainName() {
        return this.customSubDomainName;
    }

    /**
     * Set optional subdomain name used for token-based authentication.
     *
     * @param customSubDomainName the customSubDomainName value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withCustomSubDomainName(String customSubDomainName) {
        this.customSubDomainName = customSubDomainName;
        return this;
    }

    /**
     * Get a collection of rules governing the accessibility from specific network locations.
     *
     * @return the networkAcls value
     */
    public NetworkRuleSet networkAcls() {
        return this.networkAcls;
    }

    /**
     * Set a collection of rules governing the accessibility from specific network locations.
     *
     * @param networkAcls the networkAcls value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withNetworkAcls(NetworkRuleSet networkAcls) {
        this.networkAcls = networkAcls;
        return this;
    }

    /**
     * Get the SKU of Cognitive Services account.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU of Cognitive Services account.
     *
     * @param sku the sku value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

}
