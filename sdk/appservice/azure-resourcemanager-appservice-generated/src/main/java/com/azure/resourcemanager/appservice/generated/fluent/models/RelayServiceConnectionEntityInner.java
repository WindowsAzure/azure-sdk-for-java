// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Hybrid Connection for an App Service app. */
@JsonFlatten
@Fluent
public class RelayServiceConnectionEntityInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RelayServiceConnectionEntityInner.class);

    /*
     * The entityName property.
     */
    @JsonProperty(value = "properties.entityName")
    private String entityName;

    /*
     * The entityConnectionString property.
     */
    @JsonProperty(value = "properties.entityConnectionString")
    private String entityConnectionString;

    /*
     * The resourceType property.
     */
    @JsonProperty(value = "properties.resourceType")
    private String resourceType;

    /*
     * The resourceConnectionString property.
     */
    @JsonProperty(value = "properties.resourceConnectionString")
    private String resourceConnectionString;

    /*
     * The hostname property.
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /*
     * The port property.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /*
     * The biztalkUri property.
     */
    @JsonProperty(value = "properties.biztalkUri")
    private String biztalkUri;

    /**
     * Get the entityName property: The entityName property.
     *
     * @return the entityName value.
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName property: The entityName property.
     *
     * @param entityName the entityName value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the entityConnectionString property: The entityConnectionString property.
     *
     * @return the entityConnectionString value.
     */
    public String entityConnectionString() {
        return this.entityConnectionString;
    }

    /**
     * Set the entityConnectionString property: The entityConnectionString property.
     *
     * @param entityConnectionString the entityConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityConnectionString(String entityConnectionString) {
        this.entityConnectionString = entityConnectionString;
        return this;
    }

    /**
     * Get the resourceType property: The resourceType property.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resourceType property.
     *
     * @param resourceType the resourceType value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceConnectionString property: The resourceConnectionString property.
     *
     * @return the resourceConnectionString value.
     */
    public String resourceConnectionString() {
        return this.resourceConnectionString;
    }

    /**
     * Set the resourceConnectionString property: The resourceConnectionString property.
     *
     * @param resourceConnectionString the resourceConnectionString value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceConnectionString(String resourceConnectionString) {
        this.resourceConnectionString = resourceConnectionString;
        return this;
    }

    /**
     * Get the hostname property: The hostname property.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The hostname property.
     *
     * @param hostname the hostname value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port property: The port property.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The port property.
     *
     * @param port the port value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the biztalkUri property: The biztalkUri property.
     *
     * @return the biztalkUri value.
     */
    public String biztalkUri() {
        return this.biztalkUri;
    }

    /**
     * Set the biztalkUri property: The biztalkUri property.
     *
     * @param biztalkUri the biztalkUri value to set.
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withBiztalkUri(String biztalkUri) {
        this.biztalkUri = biztalkUri;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RelayServiceConnectionEntityInner withKind(String kind) {
        super.withKind(kind);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
