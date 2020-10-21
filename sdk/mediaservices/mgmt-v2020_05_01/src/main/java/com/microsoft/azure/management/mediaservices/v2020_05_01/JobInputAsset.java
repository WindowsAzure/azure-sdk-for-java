/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Represents an Asset for input into a Job.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type", defaultImpl = JobInputAsset.class)
@JsonTypeName("#Microsoft.Media.JobInputAsset")
public class JobInputAsset extends JobInputClip {
    /**
     * The name of the input Asset.
     */
    @JsonProperty(value = "assetName", required = true)
    private String assetName;

    /**
     * Get the name of the input Asset.
     *
     * @return the assetName value
     */
    public String assetName() {
        return this.assetName;
    }

    /**
     * Set the name of the input Asset.
     *
     * @param assetName the assetName value to set
     * @return the JobInputAsset object itself.
     */
    public JobInputAsset withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

}
