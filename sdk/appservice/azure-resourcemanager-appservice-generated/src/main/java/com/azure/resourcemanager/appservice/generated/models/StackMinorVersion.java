// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Application stack minor version. */
@Fluent
public final class StackMinorVersion {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(StackMinorVersion.class);

    /*
     * Application stack minor version (display only).
     */
    @JsonProperty(value = "displayVersion")
    private String displayVersion;

    /*
     * Application stack minor version (runtime only).
     */
    @JsonProperty(value = "runtimeVersion")
    private String runtimeVersion;

    /*
     * <code>true</code> if this is the default minor version; otherwise,
     * <code>false</code>.
     */
    @JsonProperty(value = "isDefault")
    private Boolean isDefault;

    /*
     * <code>true</code> if this supports Remote Debugging, otherwise
     * <code>false</code>.
     */
    @JsonProperty(value = "isRemoteDebuggingEnabled")
    private Boolean isRemoteDebuggingEnabled;

    /**
     * Get the displayVersion property: Application stack minor version (display only).
     *
     * @return the displayVersion value.
     */
    public String displayVersion() {
        return this.displayVersion;
    }

    /**
     * Set the displayVersion property: Application stack minor version (display only).
     *
     * @param displayVersion the displayVersion value to set.
     * @return the StackMinorVersion object itself.
     */
    public StackMinorVersion withDisplayVersion(String displayVersion) {
        this.displayVersion = displayVersion;
        return this;
    }

    /**
     * Get the runtimeVersion property: Application stack minor version (runtime only).
     *
     * @return the runtimeVersion value.
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion property: Application stack minor version (runtime only).
     *
     * @param runtimeVersion the runtimeVersion value to set.
     * @return the StackMinorVersion object itself.
     */
    public StackMinorVersion withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default minor version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isDefault value.
     */
    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * Set the isDefault property: &lt;code&gt;true&lt;/code&gt; if this is the default minor version; otherwise,
     * &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isDefault the isDefault value to set.
     * @return the StackMinorVersion object itself.
     */
    public StackMinorVersion withIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get the isRemoteDebuggingEnabled property: &lt;code&gt;true&lt;/code&gt; if this supports Remote Debugging,
     * otherwise &lt;code&gt;false&lt;/code&gt;.
     *
     * @return the isRemoteDebuggingEnabled value.
     */
    public Boolean isRemoteDebuggingEnabled() {
        return this.isRemoteDebuggingEnabled;
    }

    /**
     * Set the isRemoteDebuggingEnabled property: &lt;code&gt;true&lt;/code&gt; if this supports Remote Debugging,
     * otherwise &lt;code&gt;false&lt;/code&gt;.
     *
     * @param isRemoteDebuggingEnabled the isRemoteDebuggingEnabled value to set.
     * @return the StackMinorVersion object itself.
     */
    public StackMinorVersion withIsRemoteDebuggingEnabled(Boolean isRemoteDebuggingEnabled) {
        this.isRemoteDebuggingEnabled = isRemoteDebuggingEnabled;
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
