// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysql.implementation;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mysql.models.MinimalTlsVersionEnum;
import com.azure.resourcemanager.mysql.models.PublicNetworkAccessEnum;
import com.azure.resourcemanager.mysql.models.ServerVersion;
import com.azure.resourcemanager.mysql.models.SslEnforcementEnum;
import com.azure.resourcemanager.mysql.models.StorageProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties that can be updated for a server. */
@Fluent
public final class ServerUpdateParametersProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerUpdateParametersProperties.class);

    /*
     * Storage profile of a server.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /*
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword")
    private String administratorLoginPassword;

    /*
     * The version of a server.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /*
     * Enable ssl enforcement or not when connect to server.
     */
    @JsonProperty(value = "sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /*
     * Enforce a minimal Tls version for the server.
     */
    @JsonProperty(value = "minimalTlsVersion")
    private MinimalTlsVersionEnum minimalTlsVersion;

    /*
     * Whether or not public network access is allowed for this server. Value
     * is optional but if passed in, must be 'Enabled' or 'Disabled'
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccessEnum publicNetworkAccess;

    /*
     * The replication role of the server.
     */
    @JsonProperty(value = "replicationRole")
    private String replicationRole;

    /**
     * Get the storageProfile property: Storage profile of a server.
     *
     * @return the storageProfile value.
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set the storageProfile property: Storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
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
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

    /**
     * Get the version property: The version of a server.
     *
     * @return the version value.
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set the version property: The version of a server.
     *
     * @param version the version value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @return the sslEnforcement value.
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set the sslEnforcement property: Enable ssl enforcement or not when connect to server.
     *
     * @param sslEnforcement the sslEnforcement value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @return the minimalTlsVersion value.
     */
    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set the minimalTlsVersion property: Enforce a minimal Tls version for the server.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccessEnum publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Whether or not public network access is allowed for this server. Value is
     * optional but if passed in, must be 'Enabled' or 'Disabled'.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the replicationRole property: The replication role of the server.
     *
     * @return the replicationRole value.
     */
    public String replicationRole() {
        return this.replicationRole;
    }

    /**
     * Set the replicationRole property: The replication role of the server.
     *
     * @param replicationRole the replicationRole value to set.
     * @return the ServerUpdateParametersProperties object itself.
     */
    public ServerUpdateParametersProperties withReplicationRole(String replicationRole) {
        this.replicationRole = replicationRole;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (storageProfile() != null) {
            storageProfile().validate();
        }
    }
}
