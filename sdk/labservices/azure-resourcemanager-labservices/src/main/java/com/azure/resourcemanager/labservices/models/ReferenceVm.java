// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of a Reference Vm. */
@Fluent
public final class ReferenceVm {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReferenceVm.class);

    /*
     * The username of the virtual machine
     */
    @JsonProperty(value = "userName", required = true)
    private String username;

    /*
     * The password of the virtual machine. This will be set to null in GET
     * resource API
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * The state details for the reference virtual machine.
     */
    @JsonProperty(value = "vmStateDetails", access = JsonProperty.Access.WRITE_ONLY)
    private VmStateDetails vmStateDetails;

    /*
     * VM resource Id for the environment
     */
    @JsonProperty(value = "vmResourceId", access = JsonProperty.Access.WRITE_ONLY)
    private String vmResourceId;

    /**
     * Get the username property: The username of the virtual machine.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The username of the virtual machine.
     *
     * @param username the username value to set.
     * @return the ReferenceVm object itself.
     */
    public ReferenceVm withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The password of the virtual machine. This will be set to null in GET resource API.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The password of the virtual machine. This will be set to null in GET resource API.
     *
     * @param password the password value to set.
     * @return the ReferenceVm object itself.
     */
    public ReferenceVm withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the vmStateDetails property: The state details for the reference virtual machine.
     *
     * @return the vmStateDetails value.
     */
    public VmStateDetails vmStateDetails() {
        return this.vmStateDetails;
    }

    /**
     * Get the vmResourceId property: VM resource Id for the environment.
     *
     * @return the vmResourceId value.
     */
    public String vmResourceId() {
        return this.vmResourceId;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (username() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property username in model ReferenceVm"));
        }
        if (vmStateDetails() != null) {
            vmStateDetails().validate();
        }
    }
}
