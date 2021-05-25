// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Container identity information. */
@Fluent
public final class ContainerIdentityInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerIdentityInfo.class);

    /*
     * Unique name of the container
     */
    @JsonProperty(value = "uniqueName")
    private String uniqueName;

    /*
     * Protection container identity - AAD Tenant
     */
    @JsonProperty(value = "aadTenantId")
    private String aadTenantId;

    /*
     * Protection container identity - AAD Service Principal
     */
    @JsonProperty(value = "servicePrincipalClientId")
    private String servicePrincipalClientId;

    /*
     * Protection container identity - Audience
     */
    @JsonProperty(value = "audience")
    private String audience;

    /**
     * Get the uniqueName property: Unique name of the container.
     *
     * @return the uniqueName value.
     */
    public String uniqueName() {
        return this.uniqueName;
    }

    /**
     * Set the uniqueName property: Unique name of the container.
     *
     * @param uniqueName the uniqueName value to set.
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
        return this;
    }

    /**
     * Get the aadTenantId property: Protection container identity - AAD Tenant.
     *
     * @return the aadTenantId value.
     */
    public String aadTenantId() {
        return this.aadTenantId;
    }

    /**
     * Set the aadTenantId property: Protection container identity - AAD Tenant.
     *
     * @param aadTenantId the aadTenantId value to set.
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withAadTenantId(String aadTenantId) {
        this.aadTenantId = aadTenantId;
        return this;
    }

    /**
     * Get the servicePrincipalClientId property: Protection container identity - AAD Service Principal.
     *
     * @return the servicePrincipalClientId value.
     */
    public String servicePrincipalClientId() {
        return this.servicePrincipalClientId;
    }

    /**
     * Set the servicePrincipalClientId property: Protection container identity - AAD Service Principal.
     *
     * @param servicePrincipalClientId the servicePrincipalClientId value to set.
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withServicePrincipalClientId(String servicePrincipalClientId) {
        this.servicePrincipalClientId = servicePrincipalClientId;
        return this;
    }

    /**
     * Get the audience property: Protection container identity - Audience.
     *
     * @return the audience value.
     */
    public String audience() {
        return this.audience;
    }

    /**
     * Set the audience property: Protection container identity - Audience.
     *
     * @param audience the audience value to set.
     * @return the ContainerIdentityInfo object itself.
     */
    public ContainerIdentityInfo withAudience(String audience) {
        this.audience = audience;
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
