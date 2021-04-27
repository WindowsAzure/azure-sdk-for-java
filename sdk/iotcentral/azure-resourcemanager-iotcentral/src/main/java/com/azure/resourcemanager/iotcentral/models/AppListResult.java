// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iotcentral.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.iotcentral.fluent.models.AppInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of IoT Central Applications with a next link. */
@Fluent
public final class AppListResult {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AppListResult.class);

    /*
     * The link used to get the next page of IoT Central Applications.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * A list of IoT Central Applications.
     */
    @JsonProperty(value = "value")
    private List<AppInner> value;

    /**
     * Get the nextLink property: The link used to get the next page of IoT Central Applications.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link used to get the next page of IoT Central Applications.
     *
     * @param nextLink the nextLink value to set.
     * @return the AppListResult object itself.
     */
    public AppListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: A list of IoT Central Applications.
     *
     * @return the value value.
     */
    public List<AppInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A list of IoT Central Applications.
     *
     * @param value the value value to set.
     * @return the AppListResult object itself.
     */
    public AppListResult withValue(List<AppInner> value) {
        this.value = value;
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
