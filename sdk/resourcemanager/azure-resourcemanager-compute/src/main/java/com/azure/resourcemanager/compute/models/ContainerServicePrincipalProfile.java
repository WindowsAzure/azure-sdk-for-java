// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Information about a service principal identity for the cluster to use for manipulating Azure APIs. */
@Fluent
public final class ContainerServicePrincipalProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServicePrincipalProfile.class);

    /*
     * The ID for the service principal.
     */
    @JsonProperty(value = "clientId", required = true)
    private String clientId;

    /*
     * The secret password associated with the service principal.
     */
    @JsonProperty(value = "secret", required = true)
    private String secret;

    /**
     * Get the clientId property: The ID for the service principal.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.clientId;
    }

    /**
     * Set the clientId property: The ID for the service principal.
     *
     * @param clientId the clientId value to set.
     * @return the ContainerServicePrincipalProfile object itself.
     */
    public ContainerServicePrincipalProfile withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get the secret property: The secret password associated with the service principal.
     *
     * @return the secret value.
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret property: The secret password associated with the service principal.
     *
     * @param secret the secret value to set.
     * @return the ContainerServicePrincipalProfile object itself.
     */
    public ContainerServicePrincipalProfile withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientId in model ContainerServicePrincipalProfile"));
        }
        if (secret() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secret in model ContainerServicePrincipalProfile"));
        }
    }
}
