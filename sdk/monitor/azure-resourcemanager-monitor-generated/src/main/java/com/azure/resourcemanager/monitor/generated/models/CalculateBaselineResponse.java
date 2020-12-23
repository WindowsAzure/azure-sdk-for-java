// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.resourcemanager.monitor.generated.fluent.models.CalculateBaselineResponseInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of CalculateBaselineResponse. */
public interface CalculateBaselineResponse {
    /**
     * Gets the type property: the resource type of the baseline resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the timestamps property: the array of timestamps of the baselines.
     *
     * @return the timestamps value.
     */
    List<OffsetDateTime> timestamps();

    /**
     * Gets the baseline property: the baseline values for each sensitivity.
     *
     * @return the baseline value.
     */
    List<Baseline> baseline();

    /**
     * Gets the inner com.azure.resourcemanager.monitor.generated.fluent.models.CalculateBaselineResponseInner object.
     *
     * @return the inner object.
     */
    CalculateBaselineResponseInner innerModel();
}
