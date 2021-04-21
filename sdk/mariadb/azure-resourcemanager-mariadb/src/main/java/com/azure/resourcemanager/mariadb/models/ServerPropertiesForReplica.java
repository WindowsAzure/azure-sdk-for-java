// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mariadb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties to create a new replica. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("Replica")
@Fluent
public final class ServerPropertiesForReplica extends ServerPropertiesForCreate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerPropertiesForReplica.class);

    /*
     * The master server id to create replica from.
     */
    @JsonProperty(value = "sourceServerId", required = true)
    private String sourceServerId;

    /**
     * Get the sourceServerId property: The master server id to create replica from.
     *
     * @return the sourceServerId value.
     */
    public String sourceServerId() {
        return this.sourceServerId;
    }

    /**
     * Set the sourceServerId property: The master server id to create replica from.
     *
     * @param sourceServerId the sourceServerId value to set.
     * @return the ServerPropertiesForReplica object itself.
     */
    public ServerPropertiesForReplica withSourceServerId(String sourceServerId) {
        this.sourceServerId = sourceServerId;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForReplica withVersion(ServerVersion version) {
        super.withVersion(version);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForReplica withSslEnforcement(SslEnforcementEnum sslEnforcement) {
        super.withSslEnforcement(sslEnforcement);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForReplica withMinimalTlsVersion(MinimalTlsVersionEnum minimalTlsVersion) {
        super.withMinimalTlsVersion(minimalTlsVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForReplica withPublicNetworkAccess(PublicNetworkAccessEnum publicNetworkAccess) {
        super.withPublicNetworkAccess(publicNetworkAccess);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ServerPropertiesForReplica withStorageProfile(StorageProfile storageProfile) {
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
        if (sourceServerId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property sourceServerId in model ServerPropertiesForReplica"));
        }
    }
}
