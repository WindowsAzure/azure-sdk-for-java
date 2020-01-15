/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Policy metadata resource definition.
 */
@JsonFlatten
public class PolicyMetadataInner {
    /**
     * The policy metadata identifier.
     */
    @JsonProperty(value = "properties.metadataId", access = JsonProperty.Access.WRITE_ONLY)
    private String metadataId;

    /**
     * The category of the policy metadata.
     */
    @JsonProperty(value = "properties.category", access = JsonProperty.Access.WRITE_ONLY)
    private String category;

    /**
     * The title of the policy metadata.
     */
    @JsonProperty(value = "properties.title", access = JsonProperty.Access.WRITE_ONLY)
    private String title;

    /**
     * The owner of the policy metadata.
     */
    @JsonProperty(value = "properties.owner", access = JsonProperty.Access.WRITE_ONLY)
    private String owner;

    /**
     * Url for getting additional content about the resource metadata.
     */
    @JsonProperty(value = "properties.additionalContentUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalContentUrl;

    /**
     * Additional metadata.
     */
    @JsonProperty(value = "properties.metadata", access = JsonProperty.Access.WRITE_ONLY)
    private Object metadata;

    /**
     * The description of the policy metadata.
     */
    @JsonProperty(value = "properties.description", access = JsonProperty.Access.WRITE_ONLY)
    private String description;

    /**
     * The requirements of the policy metadata.
     */
    @JsonProperty(value = "properties.requirements", access = JsonProperty.Access.WRITE_ONLY)
    private String requirements;

    /**
     * The ID of the policy metadata.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the policy metadata.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the policy metadata.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Get the policy metadata identifier.
     *
     * @return the metadataId value
     */
    public String metadataId() {
        return this.metadataId;
    }

    /**
     * Get the category of the policy metadata.
     *
     * @return the category value
     */
    public String category() {
        return this.category;
    }

    /**
     * Get the title of the policy metadata.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Get the owner of the policy metadata.
     *
     * @return the owner value
     */
    public String owner() {
        return this.owner;
    }

    /**
     * Get url for getting additional content about the resource metadata.
     *
     * @return the additionalContentUrl value
     */
    public String additionalContentUrl() {
        return this.additionalContentUrl;
    }

    /**
     * Get additional metadata.
     *
     * @return the metadata value
     */
    public Object metadata() {
        return this.metadata;
    }

    /**
     * Get the description of the policy metadata.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Get the requirements of the policy metadata.
     *
     * @return the requirements value
     */
    public String requirements() {
        return this.requirements;
    }

    /**
     * Get the ID of the policy metadata.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the policy metadata.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the policy metadata.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

}
