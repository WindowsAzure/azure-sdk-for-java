// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies the windows configuration for update management. */
@JsonFlatten
@Fluent
public class OSProfileWindowsConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OSProfileWindowsConfiguration.class);

    /*
     * Specifies the assessment mode.
     */
    @JsonProperty(value = "patchSettings.assessmentMode")
    private String assessmentMode;

    /**
     * Get the assessmentMode property: Specifies the assessment mode.
     *
     * @return the assessmentMode value.
     */
    public String assessmentMode() {
        return this.assessmentMode;
    }

    /**
     * Set the assessmentMode property: Specifies the assessment mode.
     *
     * @param assessmentMode the assessmentMode value to set.
     * @return the OSProfileWindowsConfiguration object itself.
     */
    public OSProfileWindowsConfiguration withAssessmentMode(String assessmentMode) {
        this.assessmentMode = assessmentMode;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
