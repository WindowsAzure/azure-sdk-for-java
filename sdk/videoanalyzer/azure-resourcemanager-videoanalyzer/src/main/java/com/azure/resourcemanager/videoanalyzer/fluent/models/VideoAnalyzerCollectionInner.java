// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A collection of VideoAnalyzer items. */
@Fluent
public final class VideoAnalyzerCollectionInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideoAnalyzerCollectionInner.class);

    /*
     * A collection of VideoAnalyzer items.
     */
    @JsonProperty(value = "value")
    private List<VideoAnalyzerInner> value;

    /**
     * Get the value property: A collection of VideoAnalyzer items.
     *
     * @return the value value.
     */
    public List<VideoAnalyzerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: A collection of VideoAnalyzer items.
     *
     * @param value the value value to set.
     * @return the VideoAnalyzerCollectionInner object itself.
     */
    public VideoAnalyzerCollectionInner withValue(List<VideoAnalyzerInner> value) {
        this.value = value;
        return this;
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
