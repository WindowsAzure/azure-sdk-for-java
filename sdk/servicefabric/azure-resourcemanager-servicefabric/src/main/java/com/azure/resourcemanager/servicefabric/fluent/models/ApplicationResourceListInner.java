// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of application resources. */
@Fluent
public final class ApplicationResourceListInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApplicationResourceListInner.class);

    /*
     * The value property.
     */
    @JsonProperty(value = "value")
    private List<ApplicationResourceInner> value;

    /*
     * URL to get the next set of application list results if there are any.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: The value property.
     *
     * @return the value value.
     */
    public List<ApplicationResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The value property.
     *
     * @param value the value value to set.
     * @return the ApplicationResourceListInner object itself.
     */
    public ApplicationResourceListInner withValue(List<ApplicationResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of application list results if there are any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
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
