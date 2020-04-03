// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.formrecognizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The TrainRequest model.
 */
@Fluent
public final class TrainRequest {
    /*
     * Source path containing the training documents.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /*
     * Filter to apply to the documents in the source path for training.
     */
    @JsonProperty(value = "sourceFilter")
    private TrainSourceFilter sourceFilter;

    /*
     * Use label file for training a model.
     */
    @JsonProperty(value = "useLabelFile")
    private Boolean useLabelFile;

    /**
     * Get the source property: Source path containing the training documents.
     * 
     * @return the source value.
     */
    public String getSource() {
        return this.source;
    }

    /**
     * Set the source property: Source path containing the training documents.
     * 
     * @param source the source value to set.
     * @return the TrainRequest object itself.
     */
    public TrainRequest setSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the sourceFilter property: Filter to apply to the documents in the
     * source path for training.
     * 
     * @return the sourceFilter value.
     */
    public TrainSourceFilter getSourceFilter() {
        return this.sourceFilter;
    }

    /**
     * Set the sourceFilter property: Filter to apply to the documents in the
     * source path for training.
     * 
     * @param sourceFilter the sourceFilter value to set.
     * @return the TrainRequest object itself.
     */
    public TrainRequest setSourceFilter(TrainSourceFilter sourceFilter) {
        this.sourceFilter = sourceFilter;
        return this;
    }

    /**
     * Get the useLabelFile property: Use label file for training a model.
     * 
     * @return the useLabelFile value.
     */
    public Boolean isUseLabelFile() {
        return this.useLabelFile;
    }

    /**
     * Set the useLabelFile property: Use label file for training a model.
     * 
     * @param useLabelFile the useLabelFile value to set.
     * @return the TrainRequest object itself.
     */
    public TrainRequest setUseLabelFile(Boolean useLabelFile) {
        this.useLabelFile = useLabelFile;
        return this;
    }
}
