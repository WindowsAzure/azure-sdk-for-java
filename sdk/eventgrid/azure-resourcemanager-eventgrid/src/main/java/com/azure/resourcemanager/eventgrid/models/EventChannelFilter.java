// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Filter for the Event Channel. */
@Fluent
public final class EventChannelFilter {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventChannelFilter.class);

    /*
     * Allows advanced filters to be evaluated against an array of values
     * instead of expecting a singular value.
     */
    @JsonProperty(value = "enableAdvancedFilteringOnArrays")
    private Boolean enableAdvancedFilteringOnArrays;

    /*
     * An array of advanced filters that are used for filtering event channels.
     */
    @JsonProperty(value = "advancedFilters")
    private List<AdvancedFilter> advancedFilters;

    /**
     * Get the enableAdvancedFilteringOnArrays property: Allows advanced filters to be evaluated against an array of
     * values instead of expecting a singular value.
     *
     * @return the enableAdvancedFilteringOnArrays value.
     */
    public Boolean enableAdvancedFilteringOnArrays() {
        return this.enableAdvancedFilteringOnArrays;
    }

    /**
     * Set the enableAdvancedFilteringOnArrays property: Allows advanced filters to be evaluated against an array of
     * values instead of expecting a singular value.
     *
     * @param enableAdvancedFilteringOnArrays the enableAdvancedFilteringOnArrays value to set.
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withEnableAdvancedFilteringOnArrays(Boolean enableAdvancedFilteringOnArrays) {
        this.enableAdvancedFilteringOnArrays = enableAdvancedFilteringOnArrays;
        return this;
    }

    /**
     * Get the advancedFilters property: An array of advanced filters that are used for filtering event channels.
     *
     * @return the advancedFilters value.
     */
    public List<AdvancedFilter> advancedFilters() {
        return this.advancedFilters;
    }

    /**
     * Set the advancedFilters property: An array of advanced filters that are used for filtering event channels.
     *
     * @param advancedFilters the advancedFilters value to set.
     * @return the EventChannelFilter object itself.
     */
    public EventChannelFilter withAdvancedFilters(List<AdvancedFilter> advancedFilters) {
        this.advancedFilters = advancedFilters;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (advancedFilters() != null) {
            advancedFilters().forEach(e -> e.validate());
        }
    }
}
