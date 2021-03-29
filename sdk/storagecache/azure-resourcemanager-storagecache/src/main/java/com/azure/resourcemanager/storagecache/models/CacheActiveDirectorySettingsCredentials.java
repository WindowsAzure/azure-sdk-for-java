// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Active Directory admin credentials used to join the HPC Cache to a domain. */
@Fluent
public final class CacheActiveDirectorySettingsCredentials {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CacheActiveDirectorySettingsCredentials.class);

    /*
     * Username of the Active Directory domain administrator. This value is
     * stored encrypted and not returned on response.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /*
     * Plain text password of the Active Directory domain administrator. This
     * value is stored encrypted and not returned on response.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the username property: Username of the Active Directory domain administrator. This value is stored encrypted
     * and not returned on response.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: Username of the Active Directory domain administrator. This value is stored encrypted
     * and not returned on response.
     *
     * @param username the username value to set.
     * @return the CacheActiveDirectorySettingsCredentials object itself.
     */
    public CacheActiveDirectorySettingsCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Plain text password of the Active Directory domain administrator. This value is stored
     * encrypted and not returned on response.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: Plain text password of the Active Directory domain administrator. This value is stored
     * encrypted and not returned on response.
     *
     * @param password the password value to set.
     * @return the CacheActiveDirectorySettingsCredentials object itself.
     */
    public CacheActiveDirectorySettingsCredentials withPassword(String password) {
        this.password = password;
        return this;
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
                    new IllegalArgumentException(
                        "Missing required property username in model CacheActiveDirectorySettingsCredentials"));
        }
        if (password() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property password in model CacheActiveDirectorySettingsCredentials"));
        }
    }
}
