// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The resource model definition for an Azure Resource Manager resource with an etag. */
@Immutable
public class AzureEntityResource extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureEntityResource.class);

    /*
     * Resource Etag.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the etag property: Resource Etag.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
