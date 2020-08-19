/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Config server git properties payload.
 */
public class ConfigServerProperties {
    /**
     * State of the config server. Possible values include: 'NotAvailable',
     * 'Deleted', 'Failed', 'Succeeded', 'Updating'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ConfigServerState provisioningState;

    /**
     * Error when apply config server settings.
     */
    @JsonProperty(value = "error")
    private Error error;

    /**
     * Settings of config server.
     */
    @JsonProperty(value = "configServer")
    private ConfigServerSettings configServer;

    /**
     * Get state of the config server. Possible values include: 'NotAvailable', 'Deleted', 'Failed', 'Succeeded', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ConfigServerState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get error when apply config server settings.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set error when apply config server settings.
     *
     * @param error the error value to set
     * @return the ConfigServerProperties object itself.
     */
    public ConfigServerProperties withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get settings of config server.
     *
     * @return the configServer value
     */
    public ConfigServerSettings configServer() {
        return this.configServer;
    }

    /**
     * Set settings of config server.
     *
     * @param configServer the configServer value to set
     * @return the ConfigServerProperties object itself.
     */
    public ConfigServerProperties withConfigServer(ConfigServerSettings configServer) {
        this.configServer = configServer;
        return this;
    }

}
