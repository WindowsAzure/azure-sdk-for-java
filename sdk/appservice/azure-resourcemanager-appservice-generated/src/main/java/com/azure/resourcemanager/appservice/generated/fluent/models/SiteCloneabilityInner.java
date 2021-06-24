// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.models.CloneAbilityResult;
import com.azure.resourcemanager.appservice.generated.models.SiteCloneabilityCriterion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Represents whether or not an app is cloneable. */
@Fluent
public final class SiteCloneabilityInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SiteCloneabilityInner.class);

    /*
     * Name of app.
     */
    @JsonProperty(value = "result")
    private CloneAbilityResult result;

    /*
     * List of features enabled on app that prevent cloning.
     */
    @JsonProperty(value = "blockingFeatures")
    private List<SiteCloneabilityCriterion> blockingFeatures;

    /*
     * List of features enabled on app that are non-blocking but cannot be
     * cloned. The app can still be cloned
     * but the features in this list will not be set up on cloned app.
     */
    @JsonProperty(value = "unsupportedFeatures")
    private List<SiteCloneabilityCriterion> unsupportedFeatures;

    /*
     * List of blocking application characteristics.
     */
    @JsonProperty(value = "blockingCharacteristics")
    private List<SiteCloneabilityCriterion> blockingCharacteristics;

    /**
     * Get the result property: Name of app.
     *
     * @return the result value.
     */
    public CloneAbilityResult result() {
        return this.result;
    }

    /**
     * Set the result property: Name of app.
     *
     * @param result the result value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withResult(CloneAbilityResult result) {
        this.result = result;
        return this;
    }

    /**
     * Get the blockingFeatures property: List of features enabled on app that prevent cloning.
     *
     * @return the blockingFeatures value.
     */
    public List<SiteCloneabilityCriterion> blockingFeatures() {
        return this.blockingFeatures;
    }

    /**
     * Set the blockingFeatures property: List of features enabled on app that prevent cloning.
     *
     * @param blockingFeatures the blockingFeatures value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withBlockingFeatures(List<SiteCloneabilityCriterion> blockingFeatures) {
        this.blockingFeatures = blockingFeatures;
        return this;
    }

    /**
     * Get the unsupportedFeatures property: List of features enabled on app that are non-blocking but cannot be cloned.
     * The app can still be cloned but the features in this list will not be set up on cloned app.
     *
     * @return the unsupportedFeatures value.
     */
    public List<SiteCloneabilityCriterion> unsupportedFeatures() {
        return this.unsupportedFeatures;
    }

    /**
     * Set the unsupportedFeatures property: List of features enabled on app that are non-blocking but cannot be cloned.
     * The app can still be cloned but the features in this list will not be set up on cloned app.
     *
     * @param unsupportedFeatures the unsupportedFeatures value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withUnsupportedFeatures(List<SiteCloneabilityCriterion> unsupportedFeatures) {
        this.unsupportedFeatures = unsupportedFeatures;
        return this;
    }

    /**
     * Get the blockingCharacteristics property: List of blocking application characteristics.
     *
     * @return the blockingCharacteristics value.
     */
    public List<SiteCloneabilityCriterion> blockingCharacteristics() {
        return this.blockingCharacteristics;
    }

    /**
     * Set the blockingCharacteristics property: List of blocking application characteristics.
     *
     * @param blockingCharacteristics the blockingCharacteristics value to set.
     * @return the SiteCloneabilityInner object itself.
     */
    public SiteCloneabilityInner withBlockingCharacteristics(List<SiteCloneabilityCriterion> blockingCharacteristics) {
        this.blockingCharacteristics = blockingCharacteristics;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (blockingFeatures() != null) {
            blockingFeatures().forEach(e -> e.validate());
        }
        if (unsupportedFeatures() != null) {
            unsupportedFeatures().forEach(e -> e.validate());
        }
        if (blockingCharacteristics() != null) {
            blockingCharacteristics().forEach(e -> e.validate());
        }
    }
}
