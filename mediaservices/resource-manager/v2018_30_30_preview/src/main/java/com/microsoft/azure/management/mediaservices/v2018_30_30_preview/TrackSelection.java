/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_30_30_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to select a track.
 */
public class TrackSelection {
    /**
     * TrackSelections is a track property condition list which can specify
     * track(s).
     */
    @JsonProperty(value = "trackSelections")
    private List<TrackPropertyCondition> trackSelections;

    /**
     * Get the trackSelections value.
     *
     * @return the trackSelections value
     */
    public List<TrackPropertyCondition> trackSelections() {
        return this.trackSelections;
    }

    /**
     * Set the trackSelections value.
     *
     * @param trackSelections the trackSelections value to set
     * @return the TrackSelection object itself.
     */
    public TrackSelection withTrackSelections(List<TrackPropertyCondition> trackSelections) {
        this.trackSelections = trackSelections;
        return this;
    }

}
