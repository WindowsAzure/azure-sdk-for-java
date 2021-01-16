// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.search.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes an resource type that has been onboarded to private link service, supported by Azure Cognitive Search. */
@Immutable
public final class ShareablePrivateLinkResourceType {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ShareablePrivateLinkResourceType.class);

    /*
     * The name of the resource type that has been onboarded to private link
     * service, supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Describes the properties of a resource type that has been onboarded to
     * private link service, supported by Azure Cognitive Search.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private ShareablePrivateLinkResourceProperties properties;

    /**
     * Get the name property: The name of the resource type that has been onboarded to private link service, supported
     * by Azure Cognitive Search.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the properties property: Describes the properties of a resource type that has been onboarded to private link
     * service, supported by Azure Cognitive Search.
     *
     * @return the properties value.
     */
    public ShareablePrivateLinkResourceProperties properties() {
        return this.properties;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}
