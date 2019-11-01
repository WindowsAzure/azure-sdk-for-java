/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagecache.v2019_11_01.implementation;

import com.microsoft.azure.management.storagecache.v2019_11_01.UsageModelDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A usage model.
 */
public class UsageModelInner {
    /**
     * Localized information describing this usage model.
     */
    @JsonProperty(value = "display")
    private UsageModelDisplay display;

    /**
     * Non-localized keyword name for this usage model.
     */
    @JsonProperty(value = "modelName")
    private String modelName;

    /**
     * The type of Storage Target to which this model is applicable (only nfs3
     * as of this version).
     */
    @JsonProperty(value = "targetType")
    private String targetType;

    /**
     * Get localized information describing this usage model.
     *
     * @return the display value
     */
    public UsageModelDisplay display() {
        return this.display;
    }

    /**
     * Set localized information describing this usage model.
     *
     * @param display the display value to set
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withDisplay(UsageModelDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get non-localized keyword name for this usage model.
     *
     * @return the modelName value
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Set non-localized keyword name for this usage model.
     *
     * @param modelName the modelName value to set
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Get the type of Storage Target to which this model is applicable (only nfs3 as of this version).
     *
     * @return the targetType value
     */
    public String targetType() {
        return this.targetType;
    }

    /**
     * Set the type of Storage Target to which this model is applicable (only nfs3 as of this version).
     *
     * @param targetType the targetType value to set
     * @return the UsageModelInner object itself.
     */
    public UsageModelInner withTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }

}
