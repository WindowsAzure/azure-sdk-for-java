// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * A rule management event data source. The discriminator fields is always RuleManagementEventDataSource in this case.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "odata\\.type")
@JsonTypeName("Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource")
@JsonFlatten
@Fluent
public class RuleManagementEventDataSource extends RuleDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleManagementEventDataSource.class);

    /*
     * the event name.
     */
    @JsonProperty(value = "eventName")
    private String eventName;

    /*
     * the event source.
     */
    @JsonProperty(value = "eventSource")
    private String eventSource;

    /*
     * the level.
     */
    @JsonProperty(value = "level")
    private String level;

    /*
     * The name of the operation that should be checked for. If no name is
     * provided, any operation will match.
     */
    @JsonProperty(value = "operationName")
    private String operationName;

    /*
     * the resource group name.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /*
     * the resource provider name.
     */
    @JsonProperty(value = "resourceProviderName")
    private String resourceProviderName;

    /*
     * The status of the operation that should be checked for. If no status is
     * provided, any status will match.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * the substatus.
     */
    @JsonProperty(value = "subStatus")
    private String subStatus;

    /*
     * the claims.
     */
    @JsonProperty(value = "claims")
    private RuleManagementEventClaimsDataSource claims;

    /**
     * Get the eventName property: the event name.
     *
     * @return the eventName value.
     */
    public String eventName() {
        return this.eventName;
    }

    /**
     * Set the eventName property: the event name.
     *
     * @param eventName the eventName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }

    /**
     * Get the eventSource property: the event source.
     *
     * @return the eventSource value.
     */
    public String eventSource() {
        return this.eventSource;
    }

    /**
     * Set the eventSource property: the event source.
     *
     * @param eventSource the eventSource value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withEventSource(String eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * Get the level property: the level.
     *
     * @return the level value.
     */
    public String level() {
        return this.level;
    }

    /**
     * Set the level property: the level.
     *
     * @param level the level value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withLevel(String level) {
        this.level = level;
        return this;
    }

    /**
     * Get the operationName property: The name of the operation that should be checked for. If no name is provided, any
     * operation will match.
     *
     * @return the operationName value.
     */
    public String operationName() {
        return this.operationName;
    }

    /**
     * Set the operationName property: The name of the operation that should be checked for. If no name is provided, any
     * operation will match.
     *
     * @param operationName the operationName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the resourceGroupName property: the resource group name.
     *
     * @return the resourceGroupName value.
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resourceGroupName property: the resource group name.
     *
     * @param resourceGroupName the resourceGroupName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get the resourceProviderName property: the resource provider name.
     *
     * @return the resourceProviderName value.
     */
    public String resourceProviderName() {
        return this.resourceProviderName;
    }

    /**
     * Set the resourceProviderName property: the resource provider name.
     *
     * @param resourceProviderName the resourceProviderName value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withResourceProviderName(String resourceProviderName) {
        this.resourceProviderName = resourceProviderName;
        return this;
    }

    /**
     * Get the status property: The status of the operation that should be checked for. If no status is provided, any
     * status will match.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation that should be checked for. If no status is provided, any
     * status will match.
     *
     * @param status the status value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the subStatus property: the substatus.
     *
     * @return the subStatus value.
     */
    public String subStatus() {
        return this.subStatus;
    }

    /**
     * Set the subStatus property: the substatus.
     *
     * @param subStatus the subStatus value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withSubStatus(String subStatus) {
        this.subStatus = subStatus;
        return this;
    }

    /**
     * Get the claims property: the claims.
     *
     * @return the claims value.
     */
    public RuleManagementEventClaimsDataSource claims() {
        return this.claims;
    }

    /**
     * Set the claims property: the claims.
     *
     * @param claims the claims value to set.
     * @return the RuleManagementEventDataSource object itself.
     */
    public RuleManagementEventDataSource withClaims(RuleManagementEventClaimsDataSource claims) {
        this.claims = claims;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleManagementEventDataSource withResourceUri(String resourceUri) {
        super.withResourceUri(resourceUri);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleManagementEventDataSource withLegacyResourceId(String legacyResourceId) {
        super.withLegacyResourceId(legacyResourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleManagementEventDataSource withResourceLocation(String resourceLocation) {
        super.withResourceLocation(resourceLocation);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public RuleManagementEventDataSource withMetricNamespace(String metricNamespace) {
        super.withMetricNamespace(metricNamespace);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (claims() != null) {
            claims().validate();
        }
    }
}
