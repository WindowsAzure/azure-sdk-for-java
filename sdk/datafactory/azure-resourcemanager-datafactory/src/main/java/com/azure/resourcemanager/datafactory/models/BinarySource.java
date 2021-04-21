// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A copy activity Binary source. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("BinarySource")
@Fluent
public final class BinarySource extends CopySource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(BinarySource.class);

    /*
     * Binary store settings.
     */
    @JsonProperty(value = "storeSettings")
    private StoreReadSettings storeSettings;

    /*
     * Binary format settings.
     */
    @JsonProperty(value = "formatSettings")
    private BinaryReadSettings formatSettings;

    /**
     * Get the storeSettings property: Binary store settings.
     *
     * @return the storeSettings value.
     */
    public StoreReadSettings storeSettings() {
        return this.storeSettings;
    }

    /**
     * Set the storeSettings property: Binary store settings.
     *
     * @param storeSettings the storeSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource withStoreSettings(StoreReadSettings storeSettings) {
        this.storeSettings = storeSettings;
        return this;
    }

    /**
     * Get the formatSettings property: Binary format settings.
     *
     * @return the formatSettings value.
     */
    public BinaryReadSettings formatSettings() {
        return this.formatSettings;
    }

    /**
     * Set the formatSettings property: Binary format settings.
     *
     * @param formatSettings the formatSettings value to set.
     * @return the BinarySource object itself.
     */
    public BinarySource withFormatSettings(BinaryReadSettings formatSettings) {
        this.formatSettings = formatSettings;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource withSourceRetryCount(Object sourceRetryCount) {
        super.withSourceRetryCount(sourceRetryCount);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource withSourceRetryWait(Object sourceRetryWait) {
        super.withSourceRetryWait(sourceRetryWait);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public BinarySource withMaxConcurrentConnections(Object maxConcurrentConnections) {
        super.withMaxConcurrentConnections(maxConcurrentConnections);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (storeSettings() != null) {
            storeSettings().validate();
        }
        if (formatSettings() != null) {
            formatSettings().validate();
        }
    }
}
