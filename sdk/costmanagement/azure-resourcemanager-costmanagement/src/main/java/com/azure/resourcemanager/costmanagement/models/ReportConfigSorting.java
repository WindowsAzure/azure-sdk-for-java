// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The order by expression to be used in the report. */
@Fluent
public final class ReportConfigSorting {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReportConfigSorting.class);

    /*
     * Direction of sort.
     */
    @JsonProperty(value = "direction")
    private ReportConfigSortingDirection direction;

    /*
     * The name of the column to sort.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Get the direction property: Direction of sort.
     *
     * @return the direction value.
     */
    public ReportConfigSortingDirection direction() {
        return this.direction;
    }

    /**
     * Set the direction property: Direction of sort.
     *
     * @param direction the direction value to set.
     * @return the ReportConfigSorting object itself.
     */
    public ReportConfigSorting withDirection(ReportConfigSortingDirection direction) {
        this.direction = direction;
        return this;
    }

    /**
     * Get the name property: The name of the column to sort.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the column to sort.
     *
     * @param name the name value to set.
     * @return the ReportConfigSorting object itself.
     */
    public ReportConfigSorting withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model ReportConfigSorting"));
        }
    }
}
