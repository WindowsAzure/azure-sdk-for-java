// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.timeseriesinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Parameters supplied to the Update Environment operation to update a Gen2 environment. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("Gen2")
@JsonFlatten
@Fluent
public class Gen2EnvironmentUpdateParameters extends EnvironmentUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Gen2EnvironmentUpdateParameters.class);

    /*
     * The storage configuration provides the connection details that allows
     * the Time Series Insights service to connect to the customer storage
     * account that is used to store the environment's data.
     */
    @JsonProperty(value = "properties.storageConfiguration")
    private Gen2StorageConfigurationMutableProperties storageConfiguration;

    /*
     * The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for
     * faster query.
     */
    @JsonProperty(value = "properties.warmStoreConfiguration")
    private WarmStoreConfigurationProperties warmStoreConfiguration;

    /**
     * Get the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @return the storageConfiguration value.
     */
    public Gen2StorageConfigurationMutableProperties storageConfiguration() {
        return this.storageConfiguration;
    }

    /**
     * Set the storageConfiguration property: The storage configuration provides the connection details that allows the
     * Time Series Insights service to connect to the customer storage account that is used to store the environment's
     * data.
     *
     * @param storageConfiguration the storageConfiguration value to set.
     * @return the Gen2EnvironmentUpdateParameters object itself.
     */
    public Gen2EnvironmentUpdateParameters withStorageConfiguration(
        Gen2StorageConfigurationMutableProperties storageConfiguration) {
        this.storageConfiguration = storageConfiguration;
        return this;
    }

    /**
     * Get the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @return the warmStoreConfiguration value.
     */
    public WarmStoreConfigurationProperties warmStoreConfiguration() {
        return this.warmStoreConfiguration;
    }

    /**
     * Set the warmStoreConfiguration property: The warm store configuration provides the details to create a warm store
     * cache that will retain a copy of the environment's data available for faster query.
     *
     * @param warmStoreConfiguration the warmStoreConfiguration value to set.
     * @return the Gen2EnvironmentUpdateParameters object itself.
     */
    public Gen2EnvironmentUpdateParameters withWarmStoreConfiguration(
        WarmStoreConfigurationProperties warmStoreConfiguration) {
        this.warmStoreConfiguration = warmStoreConfiguration;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public Gen2EnvironmentUpdateParameters withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (storageConfiguration() != null) {
            storageConfiguration().validate();
        }
        if (warmStoreConfiguration() != null) {
            warmStoreConfiguration().validate();
        }
    }
}
