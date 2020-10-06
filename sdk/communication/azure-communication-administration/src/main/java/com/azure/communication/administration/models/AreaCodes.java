// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.administration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The AreaCodes model. */
@Fluent
public final class AreaCodes {
    /*
     * Represents the list of primary area codes.
     */
    @JsonProperty(value = "primaryAreaCodes")
    private List<String> primaryAreaCodes;

    /*
     * Represents the list of secondary area codes.
     */
    @JsonProperty(value = "secondaryAreaCodes")
    private List<String> secondaryAreaCodes;

    /*
     * Represents the URL link to the next page
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the primaryAreaCodes property: Represents the list of primary area codes.
     *
     * @return the primaryAreaCodes value.
     */
    public List<String> getPrimaryAreaCodes() {
        return this.primaryAreaCodes;
    }

    /**
     * Set the primaryAreaCodes property: Represents the list of primary area codes.
     *
     * @param primaryAreaCodes the primaryAreaCodes value to set.
     * @return the AreaCodes object itself.
     */
    public AreaCodes setPrimaryAreaCodes(List<String> primaryAreaCodes) {
        this.primaryAreaCodes = primaryAreaCodes;
        return this;
    }

    /**
     * Get the secondaryAreaCodes property: Represents the list of secondary area codes.
     *
     * @return the secondaryAreaCodes value.
     */
    public List<String> getSecondaryAreaCodes() {
        return this.secondaryAreaCodes;
    }

    /**
     * Set the secondaryAreaCodes property: Represents the list of secondary area codes.
     *
     * @param secondaryAreaCodes the secondaryAreaCodes value to set.
     * @return the AreaCodes object itself.
     */
    public AreaCodes setSecondaryAreaCodes(List<String> secondaryAreaCodes) {
        this.secondaryAreaCodes = secondaryAreaCodes;
        return this;
    }

    /**
     * Get the nextLink property: Represents the URL link to the next page.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Represents the URL link to the next page.
     *
     * @param nextLink the nextLink value to set.
     * @return the AreaCodes object itself.
     */
    public AreaCodes setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
