// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Per database settings of an elastic pool. */
@Fluent
public final class ElasticPoolPerDatabaseSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolPerDatabaseSettings.class);

    /*
     * The minimum capacity all databases are guaranteed.
     */
    @JsonProperty(value = "minCapacity")
    private Double minCapacity;

    /*
     * The maximum capacity any one database can consume.
     */
    @JsonProperty(value = "maxCapacity")
    private Double maxCapacity;

    /**
     * Get the minCapacity property: The minimum capacity all databases are guaranteed.
     *
     * @return the minCapacity value.
     */
    public Double minCapacity() {
        return this.minCapacity;
    }

    /**
     * Set the minCapacity property: The minimum capacity all databases are guaranteed.
     *
     * @param minCapacity the minCapacity value to set.
     * @return the ElasticPoolPerDatabaseSettings object itself.
     */
    public ElasticPoolPerDatabaseSettings withMinCapacity(Double minCapacity) {
        this.minCapacity = minCapacity;
        return this;
    }

    /**
     * Get the maxCapacity property: The maximum capacity any one database can consume.
     *
     * @return the maxCapacity value.
     */
    public Double maxCapacity() {
        return this.maxCapacity;
    }

    /**
     * Set the maxCapacity property: The maximum capacity any one database can consume.
     *
     * @param maxCapacity the maxCapacity value to set.
     * @return the ElasticPoolPerDatabaseSettings object itself.
     */
    public ElasticPoolPerDatabaseSettings withMaxCapacity(Double maxCapacity) {
        this.maxCapacity = maxCapacity;
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
