/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Represents the activity on an Azure SQL Elastic Pool.
 */
@JsonFlatten
public class ElasticPoolActivityInner extends Resource {
    /**
     * Gets the time the operation finished.
     */
    @JsonProperty(value = "properties.endTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime endTime;

    /**
     * Gets the error code if available.
     */
    @JsonProperty(value = "properties.errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /**
     * Gets the error message if available.
     */
    @JsonProperty(value = "properties.errorMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String errorMessage;

    /**
     * Gets the error severity if available.
     */
    @JsonProperty(value = "properties.errorSeverity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorSeverity;

    /**
     * Gets the operation name.
     */
    @JsonProperty(value = "properties.operation", access = JsonProperty.Access.WRITE_ONLY)
    private String operation;

    /**
     * Gets the unique operation ID.
     */
    @JsonProperty(value = "properties.operationId", access = JsonProperty.Access.WRITE_ONLY)
    private String operationId;

    /**
     * Gets the percentage complete if available.
     */
    @JsonProperty(value = "properties.percentComplete", access = JsonProperty.Access.WRITE_ONLY)
    private Integer percentComplete;

    /**
     * Gets the requested max DTU per database if available.
     */
    @JsonProperty(value = "properties.requestedDatabaseDtuMax", access = JsonProperty.Access.WRITE_ONLY)
    private Integer requestedDatabaseDtuMax;

    /**
     * Gets the requested min DTU per database if available.
     */
    @JsonProperty(value = "properties.requestedDatabaseDtuMin", access = JsonProperty.Access.WRITE_ONLY)
    private Integer requestedDatabaseDtuMin;

    /**
     * Gets the requested DTU for the pool if available.
     */
    @JsonProperty(value = "properties.requestedDtu", access = JsonProperty.Access.WRITE_ONLY)
    private Integer requestedDtu;

    /**
     * Gets the requested name for the Elastic Pool if available.
     */
    @JsonProperty(value = "properties.requestedElasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String requestedElasticPoolName;

    /**
     * Gets the requested storage limit for the pool in GB if available.
     */
    @JsonProperty(value = "properties.requestedStorageLimitInGB", access = JsonProperty.Access.WRITE_ONLY)
    private Long requestedStorageLimitInGB;

    /**
     * Gets the name of the Elastic Pool.
     */
    @JsonProperty(value = "properties.elasticPoolName", access = JsonProperty.Access.WRITE_ONLY)
    private String elasticPoolName;

    /**
     * Gets the name of the Azure SQL Server the Elastic Pool is in.
     */
    @JsonProperty(value = "properties.serverName", access = JsonProperty.Access.WRITE_ONLY)
    private String serverName;

    /**
     * Gets the time the operation started.
     */
    @JsonProperty(value = "properties.startTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime startTime;

    /**
     * Gets the current state of the operation.
     */
    @JsonProperty(value = "properties.state", access = JsonProperty.Access.WRITE_ONLY)
    private String state;

    /**
     * Get the endTime value.
     *
     * @return the endTime value
     */
    public DateTime endTime() {
        return this.endTime;
    }

    /**
     * Get the errorCode value.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorMessage value.
     *
     * @return the errorMessage value
     */
    public String errorMessage() {
        return this.errorMessage;
    }

    /**
     * Get the errorSeverity value.
     *
     * @return the errorSeverity value
     */
    public Integer errorSeverity() {
        return this.errorSeverity;
    }

    /**
     * Get the operation value.
     *
     * @return the operation value
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Get the operationId value.
     *
     * @return the operationId value
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Get the percentComplete value.
     *
     * @return the percentComplete value
     */
    public Integer percentComplete() {
        return this.percentComplete;
    }

    /**
     * Get the requestedDatabaseDtuMax value.
     *
     * @return the requestedDatabaseDtuMax value
     */
    public Integer requestedDatabaseDtuMax() {
        return this.requestedDatabaseDtuMax;
    }

    /**
     * Get the requestedDatabaseDtuMin value.
     *
     * @return the requestedDatabaseDtuMin value
     */
    public Integer requestedDatabaseDtuMin() {
        return this.requestedDatabaseDtuMin;
    }

    /**
     * Get the requestedDtu value.
     *
     * @return the requestedDtu value
     */
    public Integer requestedDtu() {
        return this.requestedDtu;
    }

    /**
     * Get the requestedElasticPoolName value.
     *
     * @return the requestedElasticPoolName value
     */
    public String requestedElasticPoolName() {
        return this.requestedElasticPoolName;
    }

    /**
     * Get the requestedStorageLimitInGB value.
     *
     * @return the requestedStorageLimitInGB value
     */
    public Long requestedStorageLimitInGB() {
        return this.requestedStorageLimitInGB;
    }

    /**
     * Get the elasticPoolName value.
     *
     * @return the elasticPoolName value
     */
    public String elasticPoolName() {
        return this.elasticPoolName;
    }

    /**
     * Get the serverName value.
     *
     * @return the serverName value
     */
    public String serverName() {
        return this.serverName;
    }

    /**
     * Get the startTime value.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

}
