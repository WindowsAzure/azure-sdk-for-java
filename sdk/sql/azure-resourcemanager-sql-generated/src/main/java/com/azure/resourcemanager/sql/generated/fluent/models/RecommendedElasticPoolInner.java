// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolEdition;
import com.azure.resourcemanager.sql.generated.models.TrackedResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Represents a recommended elastic pool. */
@JsonFlatten
@Fluent
public class RecommendedElasticPoolInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendedElasticPoolInner.class);

    /*
     * The edition of the recommended elastic pool. The ElasticPoolEdition
     * enumeration contains all the valid editions.
     */
    @JsonProperty(value = "properties.databaseEdition", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolEdition databaseEdition;

    /*
     * The DTU for the recommended elastic pool.
     */
    @JsonProperty(value = "properties.dtu")
    private Double dtu;

    /*
     * The minimum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMin")
    private Double databaseDtuMin;

    /*
     * The maximum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMax")
    private Double databaseDtuMax;

    /*
     * Gets storage size in megabytes.
     */
    @JsonProperty(value = "properties.storageMB")
    private Double storageMB;

    /*
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodStart", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodStart;

    /*
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodEnd", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime observationPeriodEnd;

    /*
     * Gets maximum observed DTU.
     */
    @JsonProperty(value = "properties.maxObservedDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedDtu;

    /*
     * Gets maximum observed storage in megabytes.
     */
    @JsonProperty(value = "properties.maxObservedStorageMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedStorageMB;

    /*
     * The list of databases in this pool. Expanded property
     */
    @JsonProperty(value = "properties.databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<TrackedResource> databases;

    /*
     * The list of databases housed in the server. Expanded property
     */
    @JsonProperty(value = "properties.metrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedElasticPoolMetricInner> metrics;

    /**
     * Get the databaseEdition property: The edition of the recommended elastic pool. The ElasticPoolEdition enumeration
     * contains all the valid editions.
     *
     * @return the databaseEdition value.
     */
    public ElasticPoolEdition databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Get the dtu property: The DTU for the recommended elastic pool.
     *
     * @return the dtu value.
     */
    public Double dtu() {
        return this.dtu;
    }

    /**
     * Set the dtu property: The DTU for the recommended elastic pool.
     *
     * @param dtu the dtu value to set.
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDtu(Double dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the databaseDtuMin property: The minimum DTU for the database.
     *
     * @return the databaseDtuMin value.
     */
    public Double databaseDtuMin() {
        return this.databaseDtuMin;
    }

    /**
     * Set the databaseDtuMin property: The minimum DTU for the database.
     *
     * @param databaseDtuMin the databaseDtuMin value to set.
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMin(Double databaseDtuMin) {
        this.databaseDtuMin = databaseDtuMin;
        return this;
    }

    /**
     * Get the databaseDtuMax property: The maximum DTU for the database.
     *
     * @return the databaseDtuMax value.
     */
    public Double databaseDtuMax() {
        return this.databaseDtuMax;
    }

    /**
     * Set the databaseDtuMax property: The maximum DTU for the database.
     *
     * @param databaseDtuMax the databaseDtuMax value to set.
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMax(Double databaseDtuMax) {
        this.databaseDtuMax = databaseDtuMax;
        return this;
    }

    /**
     * Get the storageMB property: Gets storage size in megabytes.
     *
     * @return the storageMB value.
     */
    public Double storageMB() {
        return this.storageMB;
    }

    /**
     * Set the storageMB property: Gets storage size in megabytes.
     *
     * @param storageMB the storageMB value to set.
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withStorageMB(Double storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get the observationPeriodStart property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodStart value.
     */
    public OffsetDateTime observationPeriodStart() {
        return this.observationPeriodStart;
    }

    /**
     * Get the observationPeriodEnd property: The observation period start (ISO8601 format).
     *
     * @return the observationPeriodEnd value.
     */
    public OffsetDateTime observationPeriodEnd() {
        return this.observationPeriodEnd;
    }

    /**
     * Get the maxObservedDtu property: Gets maximum observed DTU.
     *
     * @return the maxObservedDtu value.
     */
    public Double maxObservedDtu() {
        return this.maxObservedDtu;
    }

    /**
     * Get the maxObservedStorageMB property: Gets maximum observed storage in megabytes.
     *
     * @return the maxObservedStorageMB value.
     */
    public Double maxObservedStorageMB() {
        return this.maxObservedStorageMB;
    }

    /**
     * Get the databases property: The list of databases in this pool. Expanded property.
     *
     * @return the databases value.
     */
    public List<TrackedResource> databases() {
        return this.databases;
    }

    /**
     * Get the metrics property: The list of databases housed in the server. Expanded property.
     *
     * @return the metrics value.
     */
    public List<RecommendedElasticPoolMetricInner> metrics() {
        return this.metrics;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (databases() != null) {
            databases().forEach(e -> e.validate());
        }
        if (metrics() != null) {
            metrics().forEach(e -> e.validate());
        }
    }
}
