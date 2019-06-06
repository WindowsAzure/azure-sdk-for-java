/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a server to be created.
 */
public class ServerForCreate {
    /**
     * The SKU (pricing tier) of the server.
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /**
     * Properties of the server.
     */
    @JsonProperty(value = "properties", required = true)
    private ServerPropertiesForCreate properties;

    /**
     * The location the resource resides in.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /**
     * Application-specific metadata in the form of key-value pairs.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /**
     * Get the SKU (pricing tier) of the server.
     *
     * @return the sku value
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the SKU (pricing tier) of the server.
     *
     * @param sku the sku value to set
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get properties of the server.
     *
     * @return the properties value
     */
    public ServerPropertiesForCreate properties() {
        return this.properties;
    }

    /**
     * Set properties of the server.
     *
     * @param properties the properties value to set
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withProperties(ServerPropertiesForCreate properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the location the resource resides in.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location the resource resides in.
     *
     * @param location the location value to set
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get application-specific metadata in the form of key-value pairs.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set application-specific metadata in the form of key-value pairs.
     *
     * @param tags the tags value to set
     * @return the ServerForCreate object itself.
     */
    public ServerForCreate withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

}
