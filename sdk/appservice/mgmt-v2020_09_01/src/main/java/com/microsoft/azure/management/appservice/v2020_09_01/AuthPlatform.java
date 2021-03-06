/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The AuthPlatform model.
 */
@JsonFlatten
public class AuthPlatform extends ProxyOnlyResource {
    /**
     * The enabled property.
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * The runtimeVersion property.
     */
    @JsonProperty(value = "properties.runtimeVersion")
    private String runtimeVersion;

    /**
     * The configFilePath property.
     */
    @JsonProperty(value = "properties.configFilePath")
    private String configFilePath;

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the runtimeVersion value.
     *
     * @return the runtimeVersion value
     */
    public String runtimeVersion() {
        return this.runtimeVersion;
    }

    /**
     * Set the runtimeVersion value.
     *
     * @param runtimeVersion the runtimeVersion value to set
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withRuntimeVersion(String runtimeVersion) {
        this.runtimeVersion = runtimeVersion;
        return this;
    }

    /**
     * Get the configFilePath value.
     *
     * @return the configFilePath value
     */
    public String configFilePath() {
        return this.configFilePath;
    }

    /**
     * Set the configFilePath value.
     *
     * @param configFilePath the configFilePath value to set
     * @return the AuthPlatform object itself.
     */
    public AuthPlatform withConfigFilePath(String configFilePath) {
        this.configFilePath = configFilePath;
        return this;
    }

}
