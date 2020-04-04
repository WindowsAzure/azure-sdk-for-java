// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SourceRegistryCredentials model.
 */
@Fluent
public final class SourceRegistryCredentials {
    /*
     * The authentication mode which determines the source registry login
     * scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used
     * to login to
     * the source registry during the run.
     */
    @JsonProperty(value = "loginMode")
    private SourceRegistryLoginMode loginMode;

    /**
     * Get the loginMode property: The authentication mode which determines the
     * source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used
     * to login to
     * the source registry during the run.
     * 
     * @return the loginMode value.
     */
    public SourceRegistryLoginMode loginMode() {
        return this.loginMode;
    }

    /**
     * Set the loginMode property: The authentication mode which determines the
     * source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used
     * to login to
     * the source registry during the run.
     * 
     * @param loginMode the loginMode value to set.
     * @return the SourceRegistryCredentials object itself.
     */
    public SourceRegistryCredentials withLoginMode(SourceRegistryLoginMode loginMode) {
        this.loginMode = loginMode;
        return this;
    }
}
