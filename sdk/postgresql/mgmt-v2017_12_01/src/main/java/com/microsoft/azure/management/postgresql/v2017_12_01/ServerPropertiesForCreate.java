/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * The properties used to create a new server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode", defaultImpl = ServerPropertiesForCreate.class)
@JsonTypeName("ServerPropertiesForCreate")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Default", value = ServerPropertiesForDefaultCreate.class),
    @JsonSubTypes.Type(name = "PointInTimeRestore", value = ServerPropertiesForRestore.class),
    @JsonSubTypes.Type(name = "GeoRestore", value = ServerPropertiesForGeoRestore.class),
    @JsonSubTypes.Type(name = "Replica", value = ServerPropertiesForReplica.class)
})
public class ServerPropertiesForCreate {
    /**
     * Server version. Possible values include: '9.5', '9.6', '10', '10.0',
     * '10.2', '11'.
     */
    @JsonProperty(value = "version")
    private ServerVersion version;

    /**
     * Enable ssl enforcement or not when connect to server. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "sslEnforcement")
    private SslEnforcementEnum sslEnforcement;

    /**
     * Enforce a minimal Tls version for the server. Possible values include:
     * 'TLS1_0', 'TLS1_1', 'TLS1_2', 'TLSEnforcementDisabled'.
     */
    @JsonProperty(value = "minimalTlsVersion")
    private MinimalTlsVersionEnum minimalTlsVersion;

    /**
     * Storage profile of a server.
     */
    @JsonProperty(value = "storageProfile")
    private StorageProfile storageProfile;

    /**
     * Get server version. Possible values include: '9.5', '9.6', '10', '10.0', '10.2', '11'.
     *
     * @return the version value
     */
    public ServerVersion version() {
        return this.version;
    }

    /**
     * Set server version. Possible values include: '9.5', '9.6', '10', '10.0', '10.2', '11'.
     *
     * @param version the version value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withVersion(ServerVersion version) {
        this.version = version;
        return this;
    }

    /**
     * Get enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @return the sslEnforcement value
     */
    public SslEnforcementEnum sslEnforcement() {
        return this.sslEnforcement;
    }

    /**
     * Set enable ssl enforcement or not when connect to server. Possible values include: 'Enabled', 'Disabled'.
     *
     * @param sslEnforcement the sslEnforcement value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        this.sslEnforcement = sslEnforcement;
        return this;
    }

    /**
     * Get enforce a minimal Tls version for the server. Possible values include: 'TLS1_0', 'TLS1_1', 'TLS1_2', 'TLSEnforcementDisabled'.
     *
     * @return the minimalTlsVersion value
     */
    public MinimalTlsVersionEnum minimalTlsVersion() {
        return this.minimalTlsVersion;
    }

    /**
     * Set enforce a minimal Tls version for the server. Possible values include: 'TLS1_0', 'TLS1_1', 'TLS1_2', 'TLSEnforcementDisabled'.
     *
     * @param minimalTlsVersion the minimalTlsVersion value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        this.minimalTlsVersion = minimalTlsVersion;
        return this;
    }

    /**
     * Get storage profile of a server.
     *
     * @return the storageProfile value
     */
    public StorageProfile storageProfile() {
        return this.storageProfile;
    }

    /**
     * Set storage profile of a server.
     *
     * @param storageProfile the storageProfile value to set
     * @return the ServerPropertiesForCreate object itself.
     */
    public ServerPropertiesForCreate withStorageProfile(StorageProfile storageProfile) {
        this.storageProfile = storageProfile;
        return this;
    }

}
