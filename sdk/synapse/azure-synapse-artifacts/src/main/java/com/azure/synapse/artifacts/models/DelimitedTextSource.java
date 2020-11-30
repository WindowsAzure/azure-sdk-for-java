// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity DelimitedText source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("DelimitedTextSource")
@Fluent
public final class DelimitedTextSource extends CopySource {
    /*
     * DelimitedText store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /*
     * DelimitedText format settings.
     */
    @JsonProperty(value = "formatSettings")
    private DelimitedTextReadSettings formatSettings;

    /**
     * Get the storeSettings property: DelimitedText store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings getStoreSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: DelimitedText store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the DelimitedTextSource object itself.
     */
    public DelimitedTextSource setStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: DelimitedText format settings.
     *
     * @return the formatSettings value.
     */
    public DelimitedTextReadSettings getFormatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: DelimitedText format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the DelimitedTextSource object itself.
     */
    public DelimitedTextSource setFormatSettings(DelimitedTextReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }
}
