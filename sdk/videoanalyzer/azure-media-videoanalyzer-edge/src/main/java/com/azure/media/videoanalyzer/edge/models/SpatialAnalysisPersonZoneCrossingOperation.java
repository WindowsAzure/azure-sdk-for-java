// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.media.videoanalyzer.edge.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/**
 * Defines a Spatial Analysis person zone crossing operation. This requires the Azure Cognitive Services Spatial
 * analysis module to be deployed alongside the Video Analyzer module, please see https://aka.ms/ava-spatial-analysis
 * for more information.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
@JsonTypeName("#Microsoft.VideoAnalyzer.SpatialAnalysisPersonZoneCrossingOperation")
@Fluent
public final class SpatialAnalysisPersonZoneCrossingOperation extends SpatialAnalysisTypedOperationBase {
    /*
     * The list of zones with optional events.
     */
    @JsonProperty(value = "zones", required = true)
    private List<SpatialAnalysisPersonZoneCrossingZoneEvents> zones;

    /**
     * Creates an instance of SpatialAnalysisPersonZoneCrossingOperation class.
     *
     * @param zones the zones value to set.
     */
    @JsonCreator
    public SpatialAnalysisPersonZoneCrossingOperation(
            @JsonProperty(value = "zones", required = true) List<SpatialAnalysisPersonZoneCrossingZoneEvents> zones) {
        this.zones = zones;
    }

    /**
     * Get the zones property: The list of zones with optional events.
     *
     * @return the zones value.
     */
    public List<SpatialAnalysisPersonZoneCrossingZoneEvents> getZones() {
        return this.zones;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonZoneCrossingOperation setDebug(String debug) {
        super.setDebug(debug);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonZoneCrossingOperation setCameraConfiguration(String cameraConfiguration) {
        super.setCameraConfiguration(cameraConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonZoneCrossingOperation setDetectorNodeConfiguration(String detectorNodeConfiguration) {
        super.setDetectorNodeConfiguration(detectorNodeConfiguration);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SpatialAnalysisPersonZoneCrossingOperation setEnableFaceMaskClassifier(String enableFaceMaskClassifier) {
        super.setEnableFaceMaskClassifier(enableFaceMaskClassifier);
        return this;
    }
}
