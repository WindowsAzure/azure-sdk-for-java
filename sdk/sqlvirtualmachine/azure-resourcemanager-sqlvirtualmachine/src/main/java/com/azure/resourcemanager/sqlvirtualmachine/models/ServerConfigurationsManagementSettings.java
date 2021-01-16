// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Set the connectivity, storage and workload settings. */
@Fluent
public final class ServerConfigurationsManagementSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerConfigurationsManagementSettings.class);

    /*
     * SQL connectivity type settings.
     */
    @JsonProperty(value = "sqlConnectivityUpdateSettings")
    private SqlConnectivityUpdateSettings sqlConnectivityUpdateSettings;

    /*
     * SQL workload type settings.
     */
    @JsonProperty(value = "sqlWorkloadTypeUpdateSettings")
    private SqlWorkloadTypeUpdateSettings sqlWorkloadTypeUpdateSettings;

    /*
     * SQL storage update settings.
     */
    @JsonProperty(value = "sqlStorageUpdateSettings")
    private SqlStorageUpdateSettings sqlStorageUpdateSettings;

    /*
     * Additional SQL feature settings.
     */
    @JsonProperty(value = "additionalFeaturesServerConfigurations")
    private AdditionalFeaturesServerConfigurations additionalFeaturesServerConfigurations;

    /**
     * Get the sqlConnectivityUpdateSettings property: SQL connectivity type settings.
     *
     * @return the sqlConnectivityUpdateSettings value.
     */
    public SqlConnectivityUpdateSettings sqlConnectivityUpdateSettings() {
        return this.sqlConnectivityUpdateSettings;
    }

    /**
     * Set the sqlConnectivityUpdateSettings property: SQL connectivity type settings.
     *
     * @param sqlConnectivityUpdateSettings the sqlConnectivityUpdateSettings value to set.
     * @return the ServerConfigurationsManagementSettings object itself.
     */
    public ServerConfigurationsManagementSettings withSqlConnectivityUpdateSettings(
        SqlConnectivityUpdateSettings sqlConnectivityUpdateSettings) {
        this.sqlConnectivityUpdateSettings = sqlConnectivityUpdateSettings;
        return this;
    }

    /**
     * Get the sqlWorkloadTypeUpdateSettings property: SQL workload type settings.
     *
     * @return the sqlWorkloadTypeUpdateSettings value.
     */
    public SqlWorkloadTypeUpdateSettings sqlWorkloadTypeUpdateSettings() {
        return this.sqlWorkloadTypeUpdateSettings;
    }

    /**
     * Set the sqlWorkloadTypeUpdateSettings property: SQL workload type settings.
     *
     * @param sqlWorkloadTypeUpdateSettings the sqlWorkloadTypeUpdateSettings value to set.
     * @return the ServerConfigurationsManagementSettings object itself.
     */
    public ServerConfigurationsManagementSettings withSqlWorkloadTypeUpdateSettings(
        SqlWorkloadTypeUpdateSettings sqlWorkloadTypeUpdateSettings) {
        this.sqlWorkloadTypeUpdateSettings = sqlWorkloadTypeUpdateSettings;
        return this;
    }

    /**
     * Get the sqlStorageUpdateSettings property: SQL storage update settings.
     *
     * @return the sqlStorageUpdateSettings value.
     */
    public SqlStorageUpdateSettings sqlStorageUpdateSettings() {
        return this.sqlStorageUpdateSettings;
    }

    /**
     * Set the sqlStorageUpdateSettings property: SQL storage update settings.
     *
     * @param sqlStorageUpdateSettings the sqlStorageUpdateSettings value to set.
     * @return the ServerConfigurationsManagementSettings object itself.
     */
    public ServerConfigurationsManagementSettings withSqlStorageUpdateSettings(
        SqlStorageUpdateSettings sqlStorageUpdateSettings) {
        this.sqlStorageUpdateSettings = sqlStorageUpdateSettings;
        return this;
    }

    /**
     * Get the additionalFeaturesServerConfigurations property: Additional SQL feature settings.
     *
     * @return the additionalFeaturesServerConfigurations value.
     */
    public AdditionalFeaturesServerConfigurations additionalFeaturesServerConfigurations() {
        return this.additionalFeaturesServerConfigurations;
    }

    /**
     * Set the additionalFeaturesServerConfigurations property: Additional SQL feature settings.
     *
     * @param additionalFeaturesServerConfigurations the additionalFeaturesServerConfigurations value to set.
     * @return the ServerConfigurationsManagementSettings object itself.
     */
    public ServerConfigurationsManagementSettings withAdditionalFeaturesServerConfigurations(
        AdditionalFeaturesServerConfigurations additionalFeaturesServerConfigurations) {
        this.additionalFeaturesServerConfigurations = additionalFeaturesServerConfigurations;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sqlConnectivityUpdateSettings() != null) {
            sqlConnectivityUpdateSettings().validate();
        }
        if (sqlWorkloadTypeUpdateSettings() != null) {
            sqlWorkloadTypeUpdateSettings().validate();
        }
        if (sqlStorageUpdateSettings() != null) {
            sqlStorageUpdateSettings().validate();
        }
        if (additionalFeaturesServerConfigurations() != null) {
            additionalFeaturesServerConfigurations().validate();
        }
    }
}
