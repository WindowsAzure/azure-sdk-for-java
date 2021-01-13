// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The properties of an add provider request. */
@Fluent
public final class AddRecoveryServicesProviderInputProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AddRecoveryServicesProviderInputProperties.class);

    /*
     * The name of the machine where the provider is getting added.
     */
    @JsonProperty(value = "machineName", required = true)
    private String machineName;

    /*
     * The Id of the machine where the provider is getting added.
     */
    @JsonProperty(value = "machineId")
    private String machineId;

    /*
     * The identity provider input for DRA authentication.
     */
    @JsonProperty(value = "authenticationIdentityInput", required = true)
    private IdentityProviderInput authenticationIdentityInput;

    /*
     * The identity provider input for resource access.
     */
    @JsonProperty(value = "resourceAccessIdentityInput", required = true)
    private IdentityProviderInput resourceAccessIdentityInput;

    /*
     * The identity provider input for data plane authentication.
     */
    @JsonProperty(value = "dataPlaneAuthenticationIdentityInput")
    private IdentityProviderInput dataPlaneAuthenticationIdentityInput;

    /**
     * Get the machineName property: The name of the machine where the provider is getting added.
     *
     * @return the machineName value.
     */
    public String machineName() {
        return this.machineName;
    }

    /**
     * Set the machineName property: The name of the machine where the provider is getting added.
     *
     * @param machineName the machineName value to set.
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withMachineName(String machineName) {
        this.machineName = machineName;
        return this;
    }

    /**
     * Get the machineId property: The Id of the machine where the provider is getting added.
     *
     * @return the machineId value.
     */
    public String machineId() {
        return this.machineId;
    }

    /**
     * Set the machineId property: The Id of the machine where the provider is getting added.
     *
     * @param machineId the machineId value to set.
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withMachineId(String machineId) {
        this.machineId = machineId;
        return this;
    }

    /**
     * Get the authenticationIdentityInput property: The identity provider input for DRA authentication.
     *
     * @return the authenticationIdentityInput value.
     */
    public IdentityProviderInput authenticationIdentityInput() {
        return this.authenticationIdentityInput;
    }

    /**
     * Set the authenticationIdentityInput property: The identity provider input for DRA authentication.
     *
     * @param authenticationIdentityInput the authenticationIdentityInput value to set.
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withAuthenticationIdentityInput(
        IdentityProviderInput authenticationIdentityInput) {
        this.authenticationIdentityInput = authenticationIdentityInput;
        return this;
    }

    /**
     * Get the resourceAccessIdentityInput property: The identity provider input for resource access.
     *
     * @return the resourceAccessIdentityInput value.
     */
    public IdentityProviderInput resourceAccessIdentityInput() {
        return this.resourceAccessIdentityInput;
    }

    /**
     * Set the resourceAccessIdentityInput property: The identity provider input for resource access.
     *
     * @param resourceAccessIdentityInput the resourceAccessIdentityInput value to set.
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withResourceAccessIdentityInput(
        IdentityProviderInput resourceAccessIdentityInput) {
        this.resourceAccessIdentityInput = resourceAccessIdentityInput;
        return this;
    }

    /**
     * Get the dataPlaneAuthenticationIdentityInput property: The identity provider input for data plane authentication.
     *
     * @return the dataPlaneAuthenticationIdentityInput value.
     */
    public IdentityProviderInput dataPlaneAuthenticationIdentityInput() {
        return this.dataPlaneAuthenticationIdentityInput;
    }

    /**
     * Set the dataPlaneAuthenticationIdentityInput property: The identity provider input for data plane authentication.
     *
     * @param dataPlaneAuthenticationIdentityInput the dataPlaneAuthenticationIdentityInput value to set.
     * @return the AddRecoveryServicesProviderInputProperties object itself.
     */
    public AddRecoveryServicesProviderInputProperties withDataPlaneAuthenticationIdentityInput(
        IdentityProviderInput dataPlaneAuthenticationIdentityInput) {
        this.dataPlaneAuthenticationIdentityInput = dataPlaneAuthenticationIdentityInput;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (machineName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property machineName in model AddRecoveryServicesProviderInputProperties"));
        }
        if (authenticationIdentityInput() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property authenticationIdentityInput in model"
                            + " AddRecoveryServicesProviderInputProperties"));
        } else {
            authenticationIdentityInput().validate();
        }
        if (resourceAccessIdentityInput() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceAccessIdentityInput in model"
                            + " AddRecoveryServicesProviderInputProperties"));
        } else {
            resourceAccessIdentityInput().validate();
        }
        if (dataPlaneAuthenticationIdentityInput() != null) {
            dataPlaneAuthenticationIdentityInput().validate();
        }
    }
}
