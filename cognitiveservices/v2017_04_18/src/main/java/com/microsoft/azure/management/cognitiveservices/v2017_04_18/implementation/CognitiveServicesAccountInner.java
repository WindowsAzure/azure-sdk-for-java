/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cognitiveservices.v2017_04_18.implementation;

import com.microsoft.azure.Resource;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.ProvisioningState;
import com.microsoft.azure.management.cognitiveservices.v2017_04_18.Sku;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

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
     * The SKU of Cognitive Services account.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the kind value.
     *
     * @return the kind value
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind value.
     *
     * @param kind the kind value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the endpoint value.
     *
     * @return the endpoint value
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint value.
     *
     * @param endpoint the endpoint value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the internalId value.
     *
     * @return the internalId value
     */
    public String internalId() {
        return this.internalId;
    }

    /**
     * Set the internalId value.
     *
     * @param internalId the internalId value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withInternalId(String internalId) {
        this.internalId = internalId;
        return this;
    }

    /**
     * Get the sku value.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set
     * @return the CognitiveServicesAccountInner object itself.
     */
    public CognitiveServicesAccountInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }
}
