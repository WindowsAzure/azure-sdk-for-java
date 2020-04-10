// Copyright (c) Microsoft Corporation. All rights reserved.// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServicePrincipalCreateParameters model. */
@Fluent
public final class ServicePrincipalCreateParameters extends ServicePrincipalBase {
    /*
     * The application ID.
     */
    @JsonProperty(value = "appId", required = true)
    private String appId;

    /**
     * Get the appId property: The application ID.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: The application ID.
     *
     * @param appId the appId value to set.
     * @return the ServicePrincipalCreateParameters object itself.
     */
    public ServicePrincipalCreateParameters withAppId(String appId) {
        this.appId = appId;
        return this;
    }
}
