// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Contains the ARM resources for which to create private endpoint connection. */
@Fluent
public final class NetworkIsolationSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkIsolationSettings.class);

    /*
     * The resource id for the storage account used to store BACPAC file. If
     * set, private endpoint connection will be created for the storage
     * account. Must match storage account used for StorageUri parameter.
     */
    @JsonProperty(value = "storageAccountResourceId")
    private String storageAccountResourceId;

    /*
     * The resource id for the SQL server which is the target of this request.
     * If set, private endpoint connection will be created for the SQL server.
     * Must match server which is target of the operation.
     */
    @JsonProperty(value = "sqlServerResourceId")
    private String sqlServerResourceId;

    /**
     * Get the storageAccountResourceId property: The resource id for the storage account used to store BACPAC file. If
     * set, private endpoint connection will be created for the storage account. Must match storage account used for
     * StorageUri parameter.
     *
     * @return the storageAccountResourceId value.
     */
    public String storageAccountResourceId() {
        return this.storageAccountResourceId;
    }

    /**
     * Set the storageAccountResourceId property: The resource id for the storage account used to store BACPAC file. If
     * set, private endpoint connection will be created for the storage account. Must match storage account used for
     * StorageUri parameter.
     *
     * @param storageAccountResourceId the storageAccountResourceId value to set.
     * @return the NetworkIsolationSettings object itself.
     */
    public NetworkIsolationSettings withStorageAccountResourceId(String storageAccountResourceId) {
        this.storageAccountResourceId = storageAccountResourceId;
        return this;
    }

    /**
     * Get the sqlServerResourceId property: The resource id for the SQL server which is the target of this request. If
     * set, private endpoint connection will be created for the SQL server. Must match server which is target of the
     * operation.
     *
     * @return the sqlServerResourceId value.
     */
    public String sqlServerResourceId() {
        return this.sqlServerResourceId;
    }

    /**
     * Set the sqlServerResourceId property: The resource id for the SQL server which is the target of this request. If
     * set, private endpoint connection will be created for the SQL server. Must match server which is target of the
     * operation.
     *
     * @param sqlServerResourceId the sqlServerResourceId value to set.
     * @return the NetworkIsolationSettings object itself.
     */
    public NetworkIsolationSettings withSqlServerResourceId(String sqlServerResourceId) {
        this.sqlServerResourceId = sqlServerResourceId;
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
