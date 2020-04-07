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
 * The ServicePrincipalListResult model.
 */
@Fluent
public final class ServicePrincipalListResultInner {
    /*
     * the list of service principals.
     */
    @JsonProperty(value = "value")
    private List<ServicePrincipalInner> value;

    /*
     * the URL to get the next set of results.
     */
    @JsonProperty(value = "odata.nextLink")
    private String odataNextLink;

    /**
     * Get the value property: the list of service principals.
     * 
     * @return the value value.
     */
    public List<ServicePrincipalInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of service principals.
     * 
     * @param value the value value to set.
     * @return the ServicePrincipalListResultInner object itself.
     */
    public ServicePrincipalListResultInner withValue(List<ServicePrincipalInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the odataNextLink property: the URL to get the next set of results.
     * 
     * @return the odataNextLink value.
     */
    public String odataNextLink() {
        return this.odataNextLink;
    }

    /**
     * Set the odataNextLink property: the URL to get the next set of results.
     * 
     * @param odataNextLink the odataNextLink value to set.
     * @return the ServicePrincipalListResultInner object itself.
     */
    public ServicePrincipalListResultInner withOdataNextLink(String odataNextLink) {
        this.odataNextLink = odataNextLink;
        return this;
    }
}
