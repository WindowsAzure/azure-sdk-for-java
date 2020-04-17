// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ActivityLogAlertList model. */
@Fluent
public final class ActivityLogAlertListInner {
    /*
     * The list of activity log alerts.
     */
    @JsonProperty(value = "value")
    private List<ActivityLogAlertResourceInner> value;

    /*
     * Provides the link to retrieve the next set of elements.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of activity log alerts.
     *
     * @return the value value.
     */
    public List<ActivityLogAlertResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of activity log alerts.
     *
     * @param value the value value to set.
     * @return the ActivityLogAlertListInner object itself.
     */
    public ActivityLogAlertListInner withValue(List<ActivityLogAlertResourceInner> value) {
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
     * @return the ActivityLogAlertListInner object itself.
     */
    public ActivityLogAlertListInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
