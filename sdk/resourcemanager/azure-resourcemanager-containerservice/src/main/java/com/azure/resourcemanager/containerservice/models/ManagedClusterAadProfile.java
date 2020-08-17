// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ManagedClusterAadProfile model. */
@Fluent
public final class ManagedClusterAadProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterAadProfile.class);

    /*
     * Whether to enable managed AAD.
     */
    @JsonProperty(value = "managed")
    private Boolean managed;

    /*
     * Whether to enable Azure RBAC for Kubernetes authorization.
     */
    @JsonProperty(value = "enableAzureRBAC")
    private Boolean enableAzureRbac;

    /*
     * AAD group object IDs that will have admin role of the cluster.
     */
    @JsonProperty(value = "adminGroupObjectIDs")
    private List<String> adminGroupObjectIDs;

    /*
     * The client AAD application ID.
     */
    @JsonProperty(value = "clientAppID")
    private String clientAppId;

    /*
     * The server AAD application ID.
     */
    @JsonProperty(value = "serverAppID")
    private String serverAppId;

    /*
     * The server AAD application secret.
     */
    @JsonProperty(value = "serverAppSecret")
    private String serverAppSecret;

    /*
     * The AAD tenant ID to use for authentication. If not specified, will use
     * the tenant of the deployment subscription.
     */
    @JsonProperty(value = "tenantID")
    private String tenantId;

    /**
     * Get the managed property: Whether to enable managed AAD.
     *
     * @return the managed value.
     */
    public Boolean managed() {
        return this.managed;
    }

    /**
     * Set the managed property: Whether to enable managed AAD.
     *
     * @param managed the managed value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withManaged(Boolean managed) {
        this.managed = managed;
        return this;
    }

    /**
     * Get the enableAzureRbac property: Whether to enable Azure RBAC for Kubernetes authorization.
     *
     * @return the enableAzureRbac value.
     */
    public Boolean enableAzureRbac() {
        return this.enableAzureRbac;
    }

    /**
     * Set the enableAzureRbac property: Whether to enable Azure RBAC for Kubernetes authorization.
     *
     * @param enableAzureRbac the enableAzureRbac value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withEnableAzureRbac(Boolean enableAzureRbac) {
        this.enableAzureRbac = enableAzureRbac;
        return this;
    }

    /**
     * Get the adminGroupObjectIDs property: AAD group object IDs that will have admin role of the cluster.
     *
     * @return the adminGroupObjectIDs value.
     */
    public List<String> adminGroupObjectIDs() {
        return this.adminGroupObjectIDs;
    }

    /**
     * Set the adminGroupObjectIDs property: AAD group object IDs that will have admin role of the cluster.
     *
     * @param adminGroupObjectIDs the adminGroupObjectIDs value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withAdminGroupObjectIDs(List<String> adminGroupObjectIDs) {
        this.adminGroupObjectIDs = adminGroupObjectIDs;
        return this;
    }

    /**
     * Get the clientAppId property: The client AAD application ID.
     *
     * @return the clientAppId value.
     */
    public String clientAppId() {
        return this.clientAppId;
    }

    /**
     * Set the clientAppId property: The client AAD application ID.
     *
     * @param clientAppId the clientAppId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withClientAppId(String clientAppId) {
        this.clientAppId = clientAppId;
        return this;
    }

    /**
     * Get the serverAppId property: The server AAD application ID.
     *
     * @return the serverAppId value.
     */
    public String serverAppId() {
        return this.serverAppId;
    }

    /**
     * Set the serverAppId property: The server AAD application ID.
     *
     * @param serverAppId the serverAppId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withServerAppId(String serverAppId) {
        this.serverAppId = serverAppId;
        return this;
    }

    /**
     * Get the serverAppSecret property: The server AAD application secret.
     *
     * @return the serverAppSecret value.
     */
    public String serverAppSecret() {
        return this.serverAppSecret;
    }

    /**
     * Set the serverAppSecret property: The server AAD application secret.
     *
     * @param serverAppSecret the serverAppSecret value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withServerAppSecret(String serverAppSecret) {
        this.serverAppSecret = serverAppSecret;
        return this;
    }

    /**
     * Get the tenantId property: The AAD tenant ID to use for authentication. If not specified, will use the tenant of
     * the deployment subscription.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The AAD tenant ID to use for authentication. If not specified, will use the tenant of
     * the deployment subscription.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withTenantId(String tenantId) {
        this.tenantId = tenantId;
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
