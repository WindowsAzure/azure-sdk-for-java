/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2019_08_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2019_08_01.ProxyOnlyResource;

/**
 * Hybrid Connection for an App Service app.
 */
@JsonFlatten
public class RelayServiceConnectionEntityInner extends ProxyOnlyResource {
    /**
     * The entityName property.
     */
    @JsonProperty(value = "properties.entityName")
    private String entityName;

    /**
     * The entityConnectionString property.
     */
    @JsonProperty(value = "properties.entityConnectionString")
    private String entityConnectionString;

    /**
     * The resourceType property.
     */
    @JsonProperty(value = "properties.resourceType")
    private String resourceType;

    /**
     * The resourceConnectionString property.
     */
    @JsonProperty(value = "properties.resourceConnectionString")
    private String resourceConnectionString;

    /**
     * The hostname property.
     */
    @JsonProperty(value = "properties.hostname")
    private String hostname;

    /**
     * The port property.
     */
    @JsonProperty(value = "properties.port")
    private Integer port;

    /**
     * The biztalkUri property.
     */
    @JsonProperty(value = "properties.biztalkUri")
    private String biztalkUri;

    /**
     * Get the entityName value.
     *
     * @return the entityName value
     */
    public String entityName() {
        return this.entityName;
    }

    /**
     * Set the entityName value.
     *
     * @param entityName the entityName value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityName(String entityName) {
        this.entityName = entityName;
        return this;
    }

    /**
     * Get the entityConnectionString value.
     *
     * @return the entityConnectionString value
     */
    public String entityConnectionString() {
        return this.entityConnectionString;
    }

    /**
     * Set the entityConnectionString value.
     *
     * @param entityConnectionString the entityConnectionString value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withEntityConnectionString(String entityConnectionString) {
        this.entityConnectionString = entityConnectionString;
        return this;
    }

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the resourceConnectionString value.
     *
     * @return the resourceConnectionString value
     */
    public String resourceConnectionString() {
        return this.resourceConnectionString;
    }

    /**
     * Set the resourceConnectionString value.
     *
     * @param resourceConnectionString the resourceConnectionString value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withResourceConnectionString(String resourceConnectionString) {
        this.resourceConnectionString = resourceConnectionString;
        return this;
    }

    /**
     * Get the hostname value.
     *
     * @return the hostname value
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname value.
     *
     * @param hostname the hostname value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Get the port value.
     *
     * @return the port value
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port value.
     *
     * @param port the port value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the biztalkUri value.
     *
     * @return the biztalkUri value
     */
    public String biztalkUri() {
        return this.biztalkUri;
    }

    /**
     * Set the biztalkUri value.
     *
     * @param biztalkUri the biztalkUri value to set
     * @return the RelayServiceConnectionEntityInner object itself.
     */
    public RelayServiceConnectionEntityInner withBiztalkUri(String biztalkUri) {
        this.biztalkUri = biztalkUri;
        return this;
    }

}
