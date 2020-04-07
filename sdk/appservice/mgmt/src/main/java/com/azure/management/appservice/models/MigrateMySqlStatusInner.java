// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.azure.management.appservice.OperationStatus;
import com.azure.management.appservice.ProxyOnlyResource;

/**
 * The MigrateMySqlStatus model.
 */
@JsonFlatten
@Immutable
public class MigrateMySqlStatusInner extends ProxyOnlyResource {
    /*
     * The current status of the operation.
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
     * Get the migrationOperationStatus property: The current status of the
     * operation.
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
     * Get the localMySqlEnabled property: True if the web app has in app MySql
     * enabled.
     * 
     * @return the localMySqlEnabled value.
     */
    public Boolean localMySqlEnabled() {
        return this.localMySqlEnabled;
    }
}
