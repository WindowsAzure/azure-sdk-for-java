/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class to represent shoebox properties in json client discovery.
 */
public class ClientDiscoveryForProperties {
    /**
     * Operation properties.
     */
    @JsonProperty(value = "serviceSpecification")
    private ClientDiscoveryForServiceSpecification serviceSpecification;

    /**
     * Get operation properties.
     *
     * @return the serviceSpecification value
     */
    public ClientDiscoveryForServiceSpecification serviceSpecification() {
        return this.serviceSpecification;
    }

    /**
     * Set operation properties.
     *
     * @param serviceSpecification the serviceSpecification value to set
     * @return the ClientDiscoveryForProperties object itself.
     */
    public ClientDiscoveryForProperties withServiceSpecification(ClientDiscoveryForServiceSpecification serviceSpecification) {
        this.serviceSpecification = serviceSpecification;
        return this;
    }

}
