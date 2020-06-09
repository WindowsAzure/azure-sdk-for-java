// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.OperationStatus;
import com.azure.resourcemanager.appservice.ProxyOnlyResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The MigrateMySqlStatus model. */
@JsonFlatten
@Immutable
public class MigrateMySqlStatusInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MigrateMySqlStatusInner.class);

    /*
     * Status of the migration task.
     */
    @JsonProperty(value = "properties.migrationOperationStatus", access = JsonProperty.Access.WRITE_ONLY)
    private OperationStatus migrationOperationStatus;

    /*
     * Operation ID for the migration task.
     */
    @JsonProperty(value = "properties.operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /*
     * True if the web app has in app MySql enabled
     */
    @JsonProperty(value = "properties.localMySqlEnabled", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean localMySqlEnabled;

    /**
     * Get the migrationOperationStatus property: Status of the migration task.
     *
     * @return the migrationOperationStatus value.
     */
    public OperationStatus migrationOperationStatus() {
        return this.migrationOperationStatus;
    }

    /**
     * Get the operationId property: Operation ID for the migration task.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the localMySqlEnabled property: True if the web app has in app MySql enabled.
     *
     * @return the localMySqlEnabled value.
     */
    public Boolean localMySqlEnabled() {
        return this.localMySqlEnabled;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
