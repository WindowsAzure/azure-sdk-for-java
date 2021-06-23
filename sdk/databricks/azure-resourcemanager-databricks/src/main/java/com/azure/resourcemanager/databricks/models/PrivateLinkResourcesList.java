// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databricks.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.databricks.fluent.models.GroupIdInformationInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The available private link resources for a workspace. */
@Fluent
public final class PrivateLinkResourcesList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PrivateLinkResourcesList.class);

    /*
     * The list of available private link resources for a workspace
     */
    @JsonProperty(value = "value")
    private List<GroupIdInformationInner> value;

    /*
     * The URL to get the next set of private link resources.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of available private link resources for a workspace.
     *
     * @return the value value.
     */
    public List<GroupIdInformationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of available private link resources for a workspace.
     *
     * @param value the value value to set.
     * @return the PrivateLinkResourcesList object itself.
     */
    public PrivateLinkResourcesList withValue(List<GroupIdInformationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of private link resources.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of private link resources.
     *
     * @param nextLink the nextLink value to set.
     * @return the PrivateLinkResourcesList object itself.
     */
    public PrivateLinkResourcesList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
