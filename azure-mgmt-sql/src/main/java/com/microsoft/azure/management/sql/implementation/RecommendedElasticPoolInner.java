/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import com.microsoft.azure.management.sql.ElasticPoolEdition;
import org.joda.time.DateTime;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Represents a recommented elastic pool.
 */
@JsonFlatten
public class RecommendedElasticPoolInner extends ProxyResourceInner {
    /**
     * The edition of the recommended elastic pool. The ElasticPoolEdition
     * enumeration contains all the valid editions. Possible values include:
     * 'Basic', 'Standard', 'Premium'.
     */
    @JsonProperty(value = "properties.databaseEdition", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolEdition databaseEdition;

    /**
     * The DTU for the recommended elastic pool.
     */
    @JsonProperty(value = "properties.dtu")
    private Double dtu;

    /**
     * The minimum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMin")
    private Double databaseDtuMin;

    /**
     * The maximum DTU for the database.
     */
    @JsonProperty(value = "properties.databaseDtuMax")
    private Double databaseDtuMax;

    /**
     * Gets storage size in megabytes.
     */
    @JsonProperty(value = "properties.storageMB")
    private Double storageMB;

    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodStart", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime observationPeriodStart;

    /**
     * The observation period start (ISO8601 format).
     */
    @JsonProperty(value = "properties.observationPeriodEnd", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime observationPeriodEnd;

    /**
     * Gets maximum observed DTU.
     */
    @JsonProperty(value = "properties.maxObservedDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedDtu;

    /**
     * Gets maximum observed storage in megabytes.
     */
    @JsonProperty(value = "properties.maxObservedStorageMB", access = JsonProperty.Access.WRITE_ONLY)
    private Double maxObservedStorageMB;

    /**
     * The list of databases in this pool. Expanded property.
     */
    @JsonProperty(value = "properties.databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<DatabaseInner> databases;

    /**
     * The list of databases housed in the server. Expanded property.
     */
    @JsonProperty(value = "properties.metrics", access = JsonProperty.Access.WRITE_ONLY)
    private List<RecommendedElasticPoolMetricInner> metrics;

    /**
     * Get the databaseEdition value.
     *
     * @return the databaseEdition value
     */
    public ElasticPoolEdition databaseEdition() {
        return this.databaseEdition;
    }

    /**
     * Get the dtu value.
     *
     * @return the dtu value
     */
    public Double dtu() {
        return this.dtu;
    }

    /**
     * Set the dtu value.
     *
     * @param dtu the dtu value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDtu(Double dtu) {
        this.dtu = dtu;
        return this;
    }

    /**
     * Get the databaseDtuMin value.
     *
     * @return the databaseDtuMin value
     */
    public Double databaseDtuMin() {
        return this.databaseDtuMin;
    }

    /**
     * Set the databaseDtuMin value.
     *
     * @param databaseDtuMin the databaseDtuMin value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMin(Double databaseDtuMin) {
        this.databaseDtuMin = databaseDtuMin;
        return this;
    }

    /**
     * Get the databaseDtuMax value.
     *
     * @return the databaseDtuMax value
     */
    public Double databaseDtuMax() {
        return this.databaseDtuMax;
    }

    /**
     * Set the databaseDtuMax value.
     *
     * @param databaseDtuMax the databaseDtuMax value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withDatabaseDtuMax(Double databaseDtuMax) {
        this.databaseDtuMax = databaseDtuMax;
        return this;
    }

    /**
     * Get the storageMB value.
     *
     * @return the storageMB value
     */
    public Double storageMB() {
        return this.storageMB;
    }

    /**
     * Set the storageMB value.
     *
     * @param storageMB the storageMB value to set
     * @return the RecommendedElasticPoolInner object itself.
     */
    public RecommendedElasticPoolInner withStorageMB(Double storageMB) {
        this.storageMB = storageMB;
        return this;
    }

    /**
     * Get the observationPeriodStart value.
     *
     * @return the observationPeriodStart value
     */
    public DateTime observationPeriodStart() {
        return this.observationPeriodStart;
    }

    /**
     * Get the observationPeriodEnd value.
     *
     * @return the observationPeriodEnd value
     */
    public DateTime observationPeriodEnd() {
        return this.observationPeriodEnd;
    }

    /**
     * Get the maxObservedDtu value.
     *
     * @return the maxObservedDtu value
     */
    public Double maxObservedDtu() {
        return this.maxObservedDtu;
    }

    /**
     * Get the maxObservedStorageMB value.
     *
     * @return the maxObservedStorageMB value
     */
    public Double maxObservedStorageMB() {
        return this.maxObservedStorageMB;
    }

    /**
     * Get the databases value.
     *
     * @return the databases value
     */
    public List<DatabaseInner> databases() {
        return this.databases;
    }

    /**
     * Get the metrics value.
     *
     * @return the metrics value
     */
    public List<RecommendedElasticPoolMetricInner> metrics() {
        return this.metrics;
    }

}
