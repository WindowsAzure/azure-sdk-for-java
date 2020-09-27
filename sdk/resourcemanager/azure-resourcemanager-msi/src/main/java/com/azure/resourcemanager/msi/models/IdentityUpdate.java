// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.msi.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;
import java.util.UUID;

/** Describes an identity resource. */
@JsonFlatten
@Fluent
public class IdentityUpdate extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IdentityUpdate.class);

    /*
     * The geo-location where the resource lives
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * Resource tags
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * The id of the tenant which the identity belongs to.
     */
    @JsonProperty(value = "properties.tenantId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID tenantId;

    /*
     * The id of the service principal object associated with the created
     * identity.
     */
    @JsonProperty(value = "properties.principalId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID principalId;

    /*
     * The id of the app associated with the identity. This is a random
     * generated UUID by MSI.
     */
    @JsonProperty(value = "properties.clientId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID clientId;

    /**
     * Get the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The geo-location where the resource lives.
     *
     * @param location the location value to set.
     * @return the IdentityUpdate object itself.
     */
    public IdentityUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     *
     * @param tags the tags value to set.
     * @return the IdentityUpdate object itself.
     */
    public IdentityUpdate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the tenantId property: The id of the tenant which the identity belongs to.
     *
     * @return the tenantId value.
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Get the principalId property: The id of the service principal object associated with the created identity.
     *
     * @return the principalId value.
     */
    public UUID principalId() {
        return this.principalId;
    }

    /**
     * Get the clientId property: The id of the app associated with the identity. This is a random generated UUID by
     * MSI.
     *
     * @return the clientId value.
     */
    public UUID clientId() {
        return this.clientId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
