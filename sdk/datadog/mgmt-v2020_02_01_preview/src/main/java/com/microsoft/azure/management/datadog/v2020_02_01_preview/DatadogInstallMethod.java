/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datadog.v2020_02_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DatadogInstallMethod model.
 */
public class DatadogInstallMethod {
    /**
     * The tool.
     */
    @JsonProperty(value = "tool")
    private String tool;

    /**
     * The tool version.
     */
    @JsonProperty(value = "toolVersion")
    private String toolVersion;

    /**
     * The installer version.
     */
    @JsonProperty(value = "installerVersion")
    private String installerVersion;

    /**
     * Get the tool.
     *
     * @return the tool value
     */
    public String tool() {
        return this.tool;
    }

    /**
     * Set the tool.
     *
     * @param tool the tool value to set
     * @return the DatadogInstallMethod object itself.
     */
    public DatadogInstallMethod withTool(String tool) {
        this.tool = tool;
        return this;
    }

    /**
     * Get the tool version.
     *
     * @return the toolVersion value
     */
    public String toolVersion() {
        return this.toolVersion;
    }

    /**
     * Set the tool version.
     *
     * @param toolVersion the toolVersion value to set
     * @return the DatadogInstallMethod object itself.
     */
    public DatadogInstallMethod withToolVersion(String toolVersion) {
        this.toolVersion = toolVersion;
        return this;
    }

    /**
     * Get the installer version.
     *
     * @return the installerVersion value
     */
    public String installerVersion() {
        return this.installerVersion;
    }

    /**
     * Set the installer version.
     *
     * @param installerVersion the installerVersion value to set
     * @return the DatadogInstallMethod object itself.
     */
    public DatadogInstallMethod withInstallerVersion(String installerVersion) {
        this.installerVersion = installerVersion;
        return this;
    }

}
