// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.graphrbac;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PreAuthorizedApplication model. */
@Fluent
public final class PreAuthorizedApplication {
    /*
     * Represents the application id.
     */
    @JsonProperty(value = "appId")
    private String appId;

    /*
     * Collection of required app permissions/entitlements from the resource
     * application.
     */
    @JsonProperty(value = "permissions")
    private List<PreAuthorizedApplicationPermission> permissions;

    /*
     * Collection of extensions from the resource application.
     */
    @JsonProperty(value = "extensions")
    private List<PreAuthorizedApplicationExtension> extensions;

    /**
     * Get the appId property: Represents the application id.
     *
     * @return the appId value.
     */
    public String appId() {
        return this.appId;
    }

    /**
     * Set the appId property: Represents the application id.
     *
     * @param appId the appId value to set.
     * @return the PreAuthorizedApplication object itself.
     */
    public PreAuthorizedApplication withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * Get the permissions property: Collection of required app permissions/entitlements from the resource application.
     *
     * @return the permissions value.
     */
    public List<PreAuthorizedApplicationPermission> permissions() {
        return this.permissions;
    }

    /**
     * Set the permissions property: Collection of required app permissions/entitlements from the resource application.
     *
     * @param permissions the permissions value to set.
     * @return the PreAuthorizedApplication object itself.
     */
    public PreAuthorizedApplication withPermissions(List<PreAuthorizedApplicationPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get the extensions property: Collection of extensions from the resource application.
     *
     * @return the extensions value.
     */
    public List<PreAuthorizedApplicationExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: Collection of extensions from the resource application.
     *
     * @param extensions the extensions value to set.
     * @return the PreAuthorizedApplication object itself.
     */
    public PreAuthorizedApplication withExtensions(List<PreAuthorizedApplicationExtension> extensions) {
        this.extensions = extensions;
        return this;
    }
}
