// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JobCredential model.
 */
@JsonFlatten
@Fluent
public class JobCredentialInner extends ProxyResource {
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
}
