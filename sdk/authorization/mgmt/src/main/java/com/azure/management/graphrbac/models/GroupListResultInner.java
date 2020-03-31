// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The GroupListResult model.
 */
@Fluent
public final class GroupListResultInner {
    /*
     * A collection of Active Directory groups.
     */
    @JsonProperty(value = "value")
    private List<ADGroupInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: A collection of Active Directory groups.
     * 
     * @return the value value.
     */
    public List<ADGroupInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of Active Directory groups.
     * 
     * @param value the value value to set.
     * @return the GroupListResultInner object itself.
     */
    public GroupListResultInner withValue(List<ADGroupInner> value) {
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
     * @return the GroupListResultInner object itself.
     */
    public GroupListResultInner withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }
}
