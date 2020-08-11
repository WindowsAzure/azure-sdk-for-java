// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The UpsertManagedServerOperationParameters model. */
@Fluent
public final class UpsertManagedServerOperationParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UpsertManagedServerOperationParameters.class);

    /*
     * The family property.
     */
    @JsonProperty(value = "family")
    private String family;

    /*
     * The tier property.
     */
    @JsonProperty(value = "tier")
    private String tier;

    /*
     * The vCores property.
     */
    @JsonProperty(value = "vCores")
    private Integer vCores;

    /*
     * The storageSizeInGB property.
     */
    @JsonProperty(value = "storageSizeInGB")
    private Integer storageSizeInGB;

    /**
     * Get the family property: The family property.
     *
     * @return the family value.
     */
    public String family() {
        return this.family;
    }

    /**
     * Set the family property: The family property.
     *
     * @param family the family value to set.
     * @return the UpsertManagedServerOperationParameters object itself.
     */
    public UpsertManagedServerOperationParameters withFamily(String family) {
        this.family = family;
        return this;
    }

    /**
     * Get the tier property: The tier property.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.tier;
    }

    /**
     * Set the tier property: The tier property.
     *
     * @param tier the tier value to set.
     * @return the UpsertManagedServerOperationParameters object itself.
     */
    public UpsertManagedServerOperationParameters withTier(String tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the vCores property: The vCores property.
     *
     * @return the vCores value.
     */
    public Integer vCores() {
        return this.vCores;
    }

    /**
     * Set the vCores property: The vCores property.
     *
     * @param vCores the vCores value to set.
     * @return the UpsertManagedServerOperationParameters object itself.
     */
    public UpsertManagedServerOperationParameters withVCores(Integer vCores) {
        this.vCores = vCores;
        return this;
    }

    /**
     * Get the storageSizeInGB property: The storageSizeInGB property.
     *
     * @return the storageSizeInGB value.
     */
    public Integer storageSizeInGB() {
        return this.storageSizeInGB;
    }

    /**
     * Set the storageSizeInGB property: The storageSizeInGB property.
     *
     * @param storageSizeInGB the storageSizeInGB value to set.
     * @return the UpsertManagedServerOperationParameters object itself.
     */
    public UpsertManagedServerOperationParameters withStorageSizeInGB(Integer storageSizeInGB) {
        this.storageSizeInGB = storageSizeInGB;
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
