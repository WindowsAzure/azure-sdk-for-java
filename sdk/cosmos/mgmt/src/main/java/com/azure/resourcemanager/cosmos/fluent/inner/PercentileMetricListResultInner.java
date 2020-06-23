// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.fluent.inner;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PercentileMetricListResult model. */
@Immutable
public final class PercentileMetricListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PercentileMetricListResultInner.class);

    /*
     * The list of percentile metrics for the account.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private List<PercentileMetricInner> value;

    /**
     * Get the value property: The list of percentile metrics for the account.
     *
     * @return the value value.
     */
    public List<PercentileMetricInner> value() {
        return this.value;
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
