// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.storage;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagementPolicyDefinition model. */
@Fluent
public final class ManagementPolicyDefinition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementPolicyDefinition.class);

    /*
     * An object that defines the action set.
     */
    @JsonProperty(value = "actions", required = true)
    private ManagementPolicyAction actions;

    /*
     * An object that defines the filter set.
     */
    @JsonProperty(value = "filters")
    private ManagementPolicyFilter filters;

    /**
     * Get the actions property: An object that defines the action set.
     *
     * @return the actions value.
     */
    public ManagementPolicyAction actions() {
        return this.actions;
    }

    /**
     * Set the actions property: An object that defines the action set.
     *
     * @param actions the actions value to set.
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withActions(ManagementPolicyAction actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Get the filters property: An object that defines the filter set.
     *
     * @return the filters value.
     */
    public ManagementPolicyFilter filters() {
        return this.filters;
    }

    /**
     * Set the filters property: An object that defines the filter set.
     *
     * @param filters the filters value to set.
     * @return the ManagementPolicyDefinition object itself.
     */
    public ManagementPolicyDefinition withFilters(ManagementPolicyFilter filters) {
        this.filters = filters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (actions() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property actions in model ManagementPolicyDefinition"));
        } else {
            actions().validate();
        }
        if (filters() != null) {
            filters().validate();
        }
    }
}
