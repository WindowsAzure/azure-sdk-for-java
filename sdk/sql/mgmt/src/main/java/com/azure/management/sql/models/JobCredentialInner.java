// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The JobCredential model. */
@JsonFlatten
@Fluent
public class JobCredentialInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(JobCredentialInner.class);

    /*
     * The credential user name.
     */
    @JsonProperty(value = "properties.username")
    private String username;

    /*
     * The credential password.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Get the username property: The credential user name.
     *
     * @return the username value.
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username property: The credential user name.
     *
     * @param username the username value to set.
     * @return the JobCredentialInner object itself.
     */
    public JobCredentialInner withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: The credential password.
     *
     * @return the password value.
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password property: The credential password.
     *
     * @param password the password value to set.
     * @return the JobCredentialInner object itself.
     */
    public JobCredentialInner withPassword(String password) {
        this.password = password;
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
