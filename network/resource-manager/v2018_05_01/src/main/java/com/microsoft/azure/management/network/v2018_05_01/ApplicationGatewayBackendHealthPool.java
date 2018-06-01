/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application gateway BackendHealth pool.
 */
public class ApplicationGatewayBackendHealthPool {
    /**
     * Reference of an ApplicationGatewayBackendAddressPool resource.
     */
    @JsonProperty(value = "backendAddressPool")
    private ApplicationGatewayBackendAddressPool backendAddressPool;

    /**
     * List of ApplicationGatewayBackendHealthHttpSettings resources.
     */
    @JsonProperty(value = "backendHttpSettingsCollection")
    private List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection;

    /**
     * Get the backendAddressPool value.
     *
     * @return the backendAddressPool value
     */
    public ApplicationGatewayBackendAddressPool backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool value.
     *
     * @param backendAddressPool the backendAddressPool value to set
     * @return the ApplicationGatewayBackendHealthPool object itself.
     */
    public ApplicationGatewayBackendHealthPool withBackendAddressPool(ApplicationGatewayBackendAddressPool backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
        return this;
    }

    /**
     * Get the backendHttpSettingsCollection value.
     *
     * @return the backendHttpSettingsCollection value
     */
    public List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection() {
        return this.backendHttpSettingsCollection;
    }

    /**
     * Set the backendHttpSettingsCollection value.
     *
     * @param backendHttpSettingsCollection the backendHttpSettingsCollection value to set
     * @return the ApplicationGatewayBackendHealthPool object itself.
     */
    public ApplicationGatewayBackendHealthPool withBackendHttpSettingsCollection(List<ApplicationGatewayBackendHealthHttpSettings> backendHttpSettingsCollection) {
        this.backendHttpSettingsCollection = backendHttpSettingsCollection;
        return this;
    }

}
