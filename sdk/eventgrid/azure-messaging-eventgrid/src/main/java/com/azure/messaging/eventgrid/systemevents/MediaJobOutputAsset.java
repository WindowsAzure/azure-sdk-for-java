// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The event data for a Job output asset. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("#Microsoft.Media.JobOutputAsset")
@JsonFlatten
@Fluent
public class MediaJobOutputAsset extends MediaJobOutput {
    /*
     * Gets the Job output asset name.
     */
    @JsonProperty(value = "assetName")
    private String assetName;

    /**
     * Get the assetName property: Gets the Job output asset name.
     *
     * @return the assetName value.
     */
    public String getAssetName() {
        return this.assetName;
    }

    /**
     * Set the assetName property: Gets the Job output asset name.
     *
     * @param assetName the assetName value to set.
     * @return the MediaJobOutputAsset object itself.
     */
    public MediaJobOutputAsset setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputAsset setError(MediaJobError error) {
        super.setError(error);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputAsset setLabel(String label) {
        super.setLabel(label);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputAsset setProgress(long progress) {
        super.setProgress(progress);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MediaJobOutputAsset setState(MediaJobState state) {
        super.setState(state);
        return this;
    }
}
