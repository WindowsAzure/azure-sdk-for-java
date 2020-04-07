// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The ContainerServiceListResult model.
 */
@Fluent
public final class ContainerServiceListResultInner {
    /*
     * the list of container services.
     */
    @JsonProperty(value = "value")
    private List<ContainerServiceInner> value;

    /*
     * The URL to get the next set of container service results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: the list of container services.
     * 
     * @return the value value.
     */
    public List<ContainerServiceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: the list of container services.
     * 
     * @param value the value value to set.
     * @return the ContainerServiceListResultInner object itself.
     */
    public ContainerServiceListResultInner withValue(List<ContainerServiceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of container
     * service results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of container
     * service results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ContainerServiceListResultInner object itself.
     */
    public ContainerServiceListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
