/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ResourcesResponseCustomDomainsItem model.
 */
public class ResourcesResponseCustomDomainsItem {
    /**
     * The id property.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name property.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The endpointId property.
     */
    @JsonProperty(value = "endpointId")
    private String endpointId;

    /**
     * The history property.
     */
    @JsonProperty(value = "history")
    private Boolean history;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the endpointId value.
     *
     * @return the endpointId value
     */
    public String endpointId() {
        return this.endpointId;
    }

    /**
     * Set the endpointId value.
     *
     * @param endpointId the endpointId value to set
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * Get the history value.
     *
     * @return the history value
     */
    public Boolean history() {
        return this.history;
    }

    /**
     * Set the history value.
     *
     * @param history the history value to set
     * @return the ResourcesResponseCustomDomainsItem object itself.
     */
    public ResourcesResponseCustomDomainsItem withHistory(Boolean history) {
        this.history = history;
        return this;
    }

}
