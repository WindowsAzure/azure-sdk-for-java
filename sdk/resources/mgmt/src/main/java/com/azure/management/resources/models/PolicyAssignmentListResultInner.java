// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PolicyAssignmentListResult model. */
@Fluent
public final class PolicyAssignmentListResultInner {
    /*
     * An array of policy assignments.
     */
    @JsonProperty(value = "value")
    private List<PolicyAssignmentInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: An array of policy assignments.
     *
     * @return the value value.
     */
    public List<PolicyAssignmentInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of policy assignments.
     *
     * @param value the value value to set.
     * @return the PolicyAssignmentListResultInner object itself.
     */
    public PolicyAssignmentListResultInner withValue(List<PolicyAssignmentInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to use for getting the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to use for getting the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the PolicyAssignmentListResultInner object itself.
     */
    public PolicyAssignmentListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
