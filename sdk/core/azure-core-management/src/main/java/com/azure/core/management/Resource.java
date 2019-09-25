// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.core.management;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * The Resource model.
 */
public class Resource {
    /**
     * Resource Id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Resource name.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Resource type.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Resource location.
     */
    @JsonProperty(required = true)
    private String location;

    /**
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String getType() {
        return this.type;
    }

    /**
     * Get the location value.
     *
     * @return the location value
     */
    public String getLocation() {
        return this.location;
    }

    /**
     * Set the location value.
     *
     * @param location the location value to set
     * @return the resource itself
     */
    public Resource setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> getTags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the resource itself
     */
    public Resource setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
}
