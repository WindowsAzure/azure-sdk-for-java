// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.inner;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DeploymentListResult model. */
@Fluent
public final class DeploymentListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DeploymentListResultInner.class);

    /*
     * An array of deployments.
     */
    @JsonProperty(value = "value")
    private List<DeploymentExtendedInner> value;

    /*
     * The URL to use for getting the next set of results.
     */
    @JsonProperty(value = "nextLink", access = JsonProperty.Access.WRITE_ONLY)
    private String nextLink;

    /**
     * Get the value property: An array of deployments.
     *
     * @return the value value.
     */
    public List<DeploymentExtendedInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of deployments.
     *
     * @param value the value value to set.
     * @return the DeploymentListResultInner object itself.
     */
    public DeploymentListResultInner withValue(List<DeploymentExtendedInner> value) {
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
