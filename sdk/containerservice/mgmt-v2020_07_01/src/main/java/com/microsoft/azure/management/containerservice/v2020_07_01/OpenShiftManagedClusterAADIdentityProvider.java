/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Defines the Identity provider for MS AAD.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind", defaultImpl = OpenShiftManagedClusterAADIdentityProvider.class)
@JsonTypeName("AADIdentityProvider")
public class OpenShiftManagedClusterAADIdentityProvider extends OpenShiftManagedClusterBaseIdentityProvider {
    /**
     * The clientId password associated with the provider.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /**
     * The secret password associated with the provider.
     */
    @JsonProperty(value = "secret")
    private String secret;

    /**
     * The tenantId associated with the provider.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /**
     * The groupId to be granted cluster admin role.
     */
    @JsonProperty(value = "customerAdminGroupId")
    private String customerAdminGroupId;

    /**
     * Get the clientId password associated with the provider.
     *
     * @return the clientId value
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId password associated with the provider.
     *
     * @param clientId the clientId value to set
     * @return the OpenShiftManagedClusterAADIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAADIdentityProvider withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secret password associated with the provider.
     *
     * @return the secret value
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret password associated with the provider.
     *
     * @param secret the secret value to set
     * @return the OpenShiftManagedClusterAADIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAADIdentityProvider withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get the tenantId associated with the provider.
     *
     * @return the tenantId value
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId associated with the provider.
     *
     * @param tenantId the tenantId value to set
     * @return the OpenShiftManagedClusterAADIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAADIdentityProvider withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the groupId to be granted cluster admin role.
     *
     * @return the customerAdminGroupId value
     */
    public String customerAdminGroupId() {
        return this.customerAdminGroupId;
    }

    /**
     * Set the groupId to be granted cluster admin role.
     *
     * @param customerAdminGroupId the customerAdminGroupId value to set
     * @return the OpenShiftManagedClusterAADIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAADIdentityProvider withCustomerAdminGroupId(String customerAdminGroupId) {
        this.customerAdminGroupId = customerAdminGroupId;
        return this;
    }

}
