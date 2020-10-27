/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Representing a list of FilterTrackPropertyConditions to select a track.  The
 * filters are combined using a logical AND operation.
 */
public class FilterTrackSelection {
    /**
     * The track selections.
     */
    @JsonProperty(value = "trackSelections", required = true)
    private List<FilterTrackPropertyCondition> trackSelections;

    /**
     * Get the track selections.
     *
     * @return the trackSelections value
     */
    public List<FilterTrackPropertyCondition> trackSelections() {
        return this.trackSelections;
    }

    /**
     * Set the track selections.
     *
     * @param trackSelections the trackSelections value to set
     * @return the FilterTrackSelection object itself.
     */
    public FilterTrackSelection withTrackSelections(List<FilterTrackPropertyCondition> trackSelections) {
        this.trackSelections = trackSelections;
        return this;
    }

}
