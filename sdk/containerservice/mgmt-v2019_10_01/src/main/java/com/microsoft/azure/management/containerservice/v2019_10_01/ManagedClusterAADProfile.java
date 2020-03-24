/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AADProfile specifies attributes for Azure Active Directory integration.
 */
public class ManagedClusterAADProfile {
    /**
     * The client AAD application ID.
     */
    @JsonProperty(value = "clientAppID", required = true)
    private String clientAppID;

    /**
     * The server AAD application ID.
     */
    @JsonProperty(value = "serverAppID", required = true)
    private String serverAppID;

    /**
     * The server AAD application secret.
     */
    @JsonProperty(value = "serverAppSecret")
    private String serverAppSecret;

    /**
     * The AAD tenant ID to use for authentication. If not specified, will use
     * the tenant of the deployment subscription.
     */
    @JsonProperty(value = "tenantID")
    private String tenantID;

    /**
     * Get the client AAD application ID.
     *
     * @return the clientAppID value
     */
    public String clientAppID() {
        return this.clientAppID;
    }

    /**
     * Set the client AAD application ID.
     *
     * @param clientAppID the clientAppID value to set
     * @return the ManagedClusterAADProfile object itself.
     */
    public ManagedClusterAADProfile withClientAppID(String clientAppID) {
        this.clientAppID = clientAppID;
        return this;
    }

    /**
     * Get the server AAD application ID.
     *
     * @return the serverAppID value
     */
    public String serverAppID() {
        return this.serverAppID;
    }

    /**
     * Set the server AAD application ID.
     *
     * @param serverAppID the serverAppID value to set
     * @return the ManagedClusterAADProfile object itself.
     */
    public ManagedClusterAADProfile withServerAppID(String serverAppID) {
        this.serverAppID = serverAppID;
        return this;
    }

    /**
     * Get the server AAD application secret.
     *
     * @return the serverAppSecret value
     */
    public String serverAppSecret() {
        return this.serverAppSecret;
    }

    /**
     * Set the server AAD application secret.
     *
     * @param serverAppSecret the serverAppSecret value to set
     * @return the ManagedClusterAADProfile object itself.
     */
    public ManagedClusterAADProfile withServerAppSecret(String serverAppSecret) {
        this.serverAppSecret = serverAppSecret;
        return this;
    }

    /**
     * Get the AAD tenant ID to use for authentication. If not specified, will use the tenant of the deployment subscription.
     *
     * @return the tenantID value
     */
    public String tenantID() {
        return this.tenantID;
    }

    /**
     * Set the AAD tenant ID to use for authentication. If not specified, will use the tenant of the deployment subscription.
     *
     * @param tenantID the tenantID value to set
     * @return the ManagedClusterAADProfile object itself.
     */
    public ManagedClusterAADProfile withTenantID(String tenantID) {
        this.tenantID = tenantID;
        return this;
    }

}
