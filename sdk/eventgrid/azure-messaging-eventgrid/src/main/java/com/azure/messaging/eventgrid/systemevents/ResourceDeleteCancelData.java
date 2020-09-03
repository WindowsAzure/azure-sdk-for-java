// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ResourceDeleteCancelData model. */
@Fluent
public final class ResourceDeleteCancelData {
    /*
     * The tenant ID of the resource.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The subscription ID of the resource.
     */
    @JsonProperty(value = "subscriptionId")
    private String subscriptionId;

    /*
     * The resource group of the resource.
     */
    @JsonProperty(value = "resourceGroup")
    private String resourceGroup;

    /*
     * The resource provider performing the operation.
     */
    @JsonProperty(value = "resourceProvider")
    private String resourceProvider;

    /*
     * The URI of the resource in the operation.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /*
     * The operation that was performed.
     */
    @JsonProperty(value = "operationName")
    private String operationName;

    /*
     * The status of the operation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * The requested authorization for the operation.
     */
    @JsonProperty(value = "authorization")
    private String authorization;

    /*
     * The properties of the claims.
     */
    @JsonProperty(value = "claims")
    private String claims;

    /*
     * An operation ID used for troubleshooting.
     */
    @JsonProperty(value = "correlationId")
    private String correlationId;

    /*
     * The details of the operation.
     */
    @JsonProperty(value = "httpRequest")
    private String httpRequest;

    /**
     * Get the tenantId property: The tenant ID of the resource.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant ID of the resource.
     *
     * @param tenantId the tenantId value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription ID of the resource.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription ID of the resource.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The resource group of the resource.
     *
     * @return the resourceGroup value.
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The resource group of the resource.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the resourceProvider property: The resource provider performing the operation.
     *
     * @return the resourceProvider value.
     */
    public String getResourceProvider() {
        return this.resourceProvider;
    }

    /**
     * Set the resourceProvider property: The resource provider performing the operation.
     *
     * @param resourceProvider the resourceProvider value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * Get the resourceUri property: The URI of the resource in the operation.
     *
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The URI of the resource in the operation.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the operationName property: The operation that was performed.
     *
     * @return the operationName value.
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * Set the operationName property: The operation that was performed.
     *
     * @param operationName the operationName value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the authorization property: The requested authorization for the operation.
     *
     * @return the authorization value.
     */
    public String getAuthorization() {
        return this.authorization;
    }

    /**
     * Set the authorization property: The requested authorization for the operation.
     *
     * @param authorization the authorization value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get the claims property: The properties of the claims.
     *
     * @return the claims value.
     */
    public String getClaims() {
        return this.claims;
    }

    /**
     * Set the claims property: The properties of the claims.
     *
     * @param claims the claims value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setClaims(String claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Get the correlationId property: An operation ID used for troubleshooting.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: An operation ID used for troubleshooting.
     *
     * @param correlationId the correlationId value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the httpRequest property: The details of the operation.
     *
     * @return the httpRequest value.
     */
    public String getHttpRequest() {
        return this.httpRequest;
    }

    /**
     * Set the httpRequest property: The details of the operation.
     *
     * @param httpRequest the httpRequest value to set.
     * @return the ResourceDeleteCancelData object itself.
     */
    public ResourceDeleteCancelData setHttpRequest(String httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }
}
