// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The GenericResourceFilter model. */
@Fluent
public final class GenericResourceFilter {
    /*
     * The resource type.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /*
     * The tag name.
     */
    @JsonProperty(value = "tagname")
    private String tagname;

    /*
     * The tag value.
     */
    @JsonProperty(value = "tagvalue")
    private String tagvalue;

    /**
     * Get the resourceType property: The resource type.
     *
     * @return the resourceType value.
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType property: The resource type.
     *
     * @param resourceType the resourceType value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the tagname property: The tag name.
     *
     * @return the tagname value.
     */
    public String tagname() {
        return this.tagname;
    }

    /**
     * Set the tagname property: The tag name.
     *
     * @param tagname the tagname value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withTagname(String tagname) {
        this.tagname = tagname;
        return this;
    }

    /**
     * Get the tagvalue property: The tag value.
     *
     * @return the tagvalue value.
     */
    public String tagvalue() {
        return this.tagvalue;
    }

    /**
     * Set the tagvalue property: The tag value.
     *
     * @param tagvalue the tagvalue value to set.
     * @return the GenericResourceFilter object itself.
     */
    public GenericResourceFilter withTagvalue(String tagvalue) {
        this.tagvalue = tagvalue;
        return this;
    }
}
