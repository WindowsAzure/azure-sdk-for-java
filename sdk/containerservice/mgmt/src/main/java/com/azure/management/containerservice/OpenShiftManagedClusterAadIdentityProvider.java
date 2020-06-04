// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The OpenShiftManagedClusterAadIdentityProvider model. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("AADIdentityProvider")
@Fluent
public final class OpenShiftManagedClusterAadIdentityProvider extends OpenShiftManagedClusterBaseIdentityProvider {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenShiftManagedClusterAadIdentityProvider.class);

    /*
     * The clientId password associated with the provider.
     */
    @JsonProperty(value = "clientId")
    private String clientId;

    /*
     * The secret password associated with the provider.
     */
    @JsonProperty(value = "secret")
    private String secret;

    /*
     * The tenantId associated with the provider.
     */
    @JsonProperty(value = "tenantId")
    private String tenantId;

    /*
     * The groupId to be granted cluster admin role.
     */
    @JsonProperty(value = "customerAdminGroupId")
    private String customerAdminGroupId;

    /**
     * Get the clientId property: The clientId password associated with the provider.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The clientId password associated with the provider.
     *
     * @param clientId the clientId value to set.
     * @return the OpenShiftManagedClusterAadIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAadIdentityProvider withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secret property: The secret password associated with the provider.
     *
     * @return the secret value.
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret property: The secret password associated with the provider.
     *
     * @param secret the secret value to set.
     * @return the OpenShiftManagedClusterAadIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAadIdentityProvider withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Get the tenantId property: The tenantId associated with the provider.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenantId associated with the provider.
     *
     * @param tenantId the tenantId value to set.
     * @return the OpenShiftManagedClusterAadIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAadIdentityProvider withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the customerAdminGroupId property: The groupId to be granted cluster admin role.
     *
     * @return the customerAdminGroupId value.
     */
    public String customerAdminGroupId() {
        return this.customerAdminGroupId;
    }

    /**
     * Set the customerAdminGroupId property: The groupId to be granted cluster admin role.
     *
     * @param customerAdminGroupId the customerAdminGroupId value to set.
     * @return the OpenShiftManagedClusterAadIdentityProvider object itself.
     */
    public OpenShiftManagedClusterAadIdentityProvider withCustomerAdminGroupId(String customerAdminGroupId) {
        this.customerAdminGroupId = customerAdminGroupId;
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
    }
}
