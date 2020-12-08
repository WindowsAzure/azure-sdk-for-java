// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolLicenseType;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolPerDatabaseSettings;
import com.azure.resourcemanager.sql.generated.models.ElasticPoolState;
import com.azure.resourcemanager.sql.generated.models.Sku;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** An elastic pool. */
@JsonFlatten
@Fluent
public class ElasticPoolInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ElasticPoolInner.class);

    /*
     * The elastic pool SKU.
     *
     * The list of SKUs may vary by region and support offer. To determine the
     * SKUs (including the SKU name, tier/edition, family, and capacity) that
     * are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * ```azurecli
     * az sql elastic-pool list-editions -l <location> -o table
     * ````
     *
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Kind of elastic pool. This is metadata used for the Azure portal
     * experience.
     */
    @JsonProperty(value = "kind", access = JsonProperty.Access.WRITE_ONLY)
    private String kind;

    /*
     * The state of the elastic pool.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private ElasticPoolState state;

    /*
     * The creation date of the elastic pool (ISO8601 format).
     */
    @JsonProperty(value = "properties.creationDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationDate;

    /*
     * The storage limit for the database elastic pool in bytes.
     */
    @JsonProperty(value = "properties.maxSizeBytes")
    private Long maxSizeBytes;

    /*
     * The per database settings for the elastic pool.
     */
    @JsonProperty(value = "properties.perDatabaseSettings")
    private ElasticPoolPerDatabaseSettings perDatabaseSettings;

    /*
     * Whether or not this elastic pool is zone redundant, which means the
     * replicas of this elastic pool will be spread across multiple
     * availability zones.
     */
    @JsonProperty(value = "properties.zoneRedundant")
    private Boolean zoneRedundant;

    /*
     * The license type to apply for this elastic pool.
     */
    @JsonProperty(value = "properties.licenseType")
    private ElasticPoolLicenseType licenseType;

    /*
     * Maintenance configuration id assigned to the elastic pool. This
     * configuration defines the period when the maintenance updates will will
     * occur.
     */
    @JsonProperty(value = "properties.maintenanceConfigurationId")
    private String maintenanceConfigurationId;

    /**
     * Get the sku property: The elastic pool SKU.
     *
     * <p>The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name,
     * tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * <p>```azurecli az sql elastic-pool list-editions -l &lt;location&gt; -o table ````.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The elastic pool SKU.
     *
     * <p>The list of SKUs may vary by region and support offer. To determine the SKUs (including the SKU name,
     * tier/edition, family, and capacity) that are available to your subscription in an Azure region, use the
     * `Capabilities_ListByLocation` REST API or the following command:
     *
     * <p>```azurecli az sql elastic-pool list-editions -l &lt;location&gt; -o table ````.
     *
     * @param sku the sku value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the kind property: Kind of elastic pool. This is metadata used for the Azure portal experience.
     *
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Get the state property: The state of the elastic pool.
     *
     * @return the state value.
     */
    public ElasticPoolState state() {
        return this.state;
    }

    /**
     * Get the creationDate property: The creation date of the elastic pool (ISO8601 format).
     *
     * @return the creationDate value.
     */
    public OffsetDateTime creationDate() {
        return this.creationDate;
    }

    /**
     * Get the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @return the maxSizeBytes value.
     */
    public Long maxSizeBytes() {
        return this.maxSizeBytes;
    }

    /**
     * Set the maxSizeBytes property: The storage limit for the database elastic pool in bytes.
     *
     * @param maxSizeBytes the maxSizeBytes value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withMaxSizeBytes(Long maxSizeBytes) {
        this.maxSizeBytes = maxSizeBytes;
        return this;
    }

    /**
     * Get the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @return the perDatabaseSettings value.
     */
    public ElasticPoolPerDatabaseSettings perDatabaseSettings() {
        return this.perDatabaseSettings;
    }

    /**
     * Set the perDatabaseSettings property: The per database settings for the elastic pool.
     *
     * @param perDatabaseSettings the perDatabaseSettings value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withPerDatabaseSettings(ElasticPoolPerDatabaseSettings perDatabaseSettings) {
        this.perDatabaseSettings = perDatabaseSettings;
        return this;
    }

    /**
     * Get the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @return the zoneRedundant value.
     */
    public Boolean zoneRedundant() {
        return this.zoneRedundant;
    }

    /**
     * Set the zoneRedundant property: Whether or not this elastic pool is zone redundant, which means the replicas of
     * this elastic pool will be spread across multiple availability zones.
     *
     * @param zoneRedundant the zoneRedundant value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withZoneRedundant(Boolean zoneRedundant) {
        this.zoneRedundant = zoneRedundant;
        return this;
    }

    /**
     * Get the licenseType property: The license type to apply for this elastic pool.
     *
     * @return the licenseType value.
     */
    public ElasticPoolLicenseType licenseType() {
        return this.licenseType;
    }

    /**
     * Set the licenseType property: The license type to apply for this elastic pool.
     *
     * @param licenseType the licenseType value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withLicenseType(ElasticPoolLicenseType licenseType) {
        this.licenseType = licenseType;
        return this;
    }

    /**
     * Get the maintenanceConfigurationId property: Maintenance configuration id assigned to the elastic pool. This
     * configuration defines the period when the maintenance updates will will occur.
     *
     * @return the maintenanceConfigurationId value.
     */
    public String maintenanceConfigurationId() {
        return this.maintenanceConfigurationId;
    }

    /**
     * Set the maintenanceConfigurationId property: Maintenance configuration id assigned to the elastic pool. This
     * configuration defines the period when the maintenance updates will will occur.
     *
     * @param maintenanceConfigurationId the maintenanceConfigurationId value to set.
     * @return the ElasticPoolInner object itself.
     */
    public ElasticPoolInner withMaintenanceConfigurationId(String maintenanceConfigurationId) {
        this.maintenanceConfigurationId = maintenanceConfigurationId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ElasticPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ElasticPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (perDatabaseSettings() != null) {
            perDatabaseSettings().validate();
        }
    }
}
