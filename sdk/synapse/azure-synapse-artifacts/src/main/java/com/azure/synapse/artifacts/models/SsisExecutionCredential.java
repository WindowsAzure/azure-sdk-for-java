// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SSIS package execution credential. */
@Fluent
public final class SsisExecutionCredential {
    /*
     * Domain for windows authentication.
     */
    @JsonProperty(value = "domain", required = true)
    private Object domain;

    /*
     * UseName for windows authentication.
     */
    @JsonProperty(value = "userName", required = true)
    private Object userName;

    /*
     * Password for windows authentication.
     */
    @JsonProperty(value = "password", required = true)
    private SecureString password;

    /**
     * Get the domain property: Domain for windows authentication.
     *
     * @return the domain value.
     */
    public Object getDomain() {
        return this.domain;
    }

    /**
     * Set the domain property: Domain for windows authentication.
     *
     * @param domain the domain value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential setDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the userName property: UseName for windows authentication.
     *
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: UseName for windows authentication.
     *
     * @param userName the userName value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password for windows authentication.
     *
     * @return the password value.
     */
    public SecureString getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password for windows authentication.
     *
     * @param password the password value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential setPassword(SecureString password) {
        this.password = password;
        return this;
    }
}
