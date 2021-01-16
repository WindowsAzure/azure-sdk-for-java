// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties used to create a new server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("Default")
@Fluent
public final class ServerPropertiesForDefaultCreate extends ServerPropertiesForCreate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerPropertiesForDefaultCreate.class);

    /*
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "administratorLogin", required = true)
    private String administratorLogin;

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /**
     * Get the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @return the administratorLogin value.
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administratorLogin property: The administrator's login name of a server. Can only be specified when the
     * server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set.
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the administratorLoginPassword property: The password of the administrator login.
     *
     * @return the administratorLoginPassword value.
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the administratorLoginPassword property: The password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set.
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withInfrastructureEncryption(
        InfrastructureEncryption infrastructureEncryption) {
        super.withInfrastructureEncryption(infrastructureEncryption);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForDefaultCreate withStorageProfile(StorageProfile storageProfile) {
        super.withStorageProfile(storageProfile);
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
        if (administratorLogin() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLogin in model ServerPropertiesForDefaultCreate"));
        }
        if (administratorLoginPassword() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property administratorLoginPassword in model"
                            + " ServerPropertiesForDefaultCreate"));
        }
    }
}
