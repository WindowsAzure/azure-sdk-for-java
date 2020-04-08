// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The CustomRegistryCredentials model. */
@Fluent
public final class CustomRegistryCredentials {
    /*
     * The username for logging into the custom registry.
     */
    @JsonProperty(value = "userName")
    private SecretObject userName;

    /*
     * The password for logging into the custom registry. The password is a
     * secret
     * object that allows multiple ways of providing the value for it.
     */
    @JsonProperty(value = "password")
    private SecretObject password;

    /**
     * Get the userName property: The username for logging into the custom registry.
     *
     * @return the userName value.
     */
    public SecretObject userName() {
        return this.userName;
    }

    /**
     * Set the userName property: The username for logging into the custom registry.
     *
     * @param userName the userName value to set.
     * @return the CustomRegistryCredentials object itself.
     */
    public CustomRegistryCredentials withUserName(SecretObject userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password for logging into the custom registry. The password is a secret object
     * that allows multiple ways of providing the value for it.
     *
     * @return the password value.
     */
    public SecretObject password() {
        return this.password;
    }

    /**
     * Set the password property: The password for logging into the custom registry. The password is a secret object
     * that allows multiple ways of providing the value for it.
     *
     * @param password the password value to set.
     * @return the CustomRegistryCredentials object itself.
     */
    public CustomRegistryCredentials withPassword(SecretObject password) {
        this.password = password;
        return this;
    }
}
