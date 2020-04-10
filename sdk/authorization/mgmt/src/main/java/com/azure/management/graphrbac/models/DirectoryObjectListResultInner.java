// Copyright (c) Microsoft Corporation. All rights reserved.// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DirectoryObjectListResult model. */
@Fluent
public final class DirectoryObjectListResultInner {
    /*
     * A collection of DirectoryObject.
     */
    @JsonProperty(value = "value")
    private List<DirectoryObjectInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: A collection of DirectoryObject.
     *
     * @return the value value.
     */
    public List<DirectoryObjectInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of DirectoryObject.
     *
     * @param value the value value to set.
     * @return the DirectoryObjectListResultInner object itself.
     */
    public DirectoryObjectListResultInner withValue(List<DirectoryObjectInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: The URL to get the next set of results.
     *
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: The URL to get the next set of results.
     *
     * @param odataNextLink the odataNextLink value to set.
     * @return the DirectoryObjectListResultInner object itself.
     */
    public DirectoryObjectListResultInner withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }
}
