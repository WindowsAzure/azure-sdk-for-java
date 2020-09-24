// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.monitor.fluent.inner.ActionGroupResourceInner;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ActionGroupList model. */
@Fluent
public final class ActionGroupList {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ActionGroupList.class);

    /*
     * The list of action groups.
     */
    @JsonProperty(value = "value")
    private List<ActionGroupResourceInner> value;

    /*
     * Provides the link to retrieve the next set of elements.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of action groups.
     *
     * @return the value value.
     */
    public List<ActionGroupResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of action groups.
     *
     * @param value the value value to set.
     * @return the ActionGroupList object itself.
     */
    public ActionGroupList withValue(List<ActionGroupResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Provides the link to retrieve the next set of elements.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Provides the link to retrieve the next set of elements.
     *
     * @param nextLink the nextLink value to set.
     * @return the ActionGroupList object itself.
     */
    public ActionGroupList withNextLink(String nextLink) {
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
