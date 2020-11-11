/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * SSH configuration for Linux-based VMs running on Azure.
 */
public class ContainerServiceSshConfiguration {
    /**
     * The list of SSH public keys used to authenticate with Linux-based VMs.
     * Only expect one key specified.
     */
    @JsonProperty(value = "publicKeys", required = true)
    private List<ContainerServiceSshPublicKey> publicKeys;

    /**
     * Get the list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     *
     * @return the publicKeys value
     */
    public List<ContainerServiceSshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     *
     * @param publicKeys the publicKeys value to set
     * @return the ContainerServiceSshConfiguration object itself.
     */
    public ContainerServiceSshConfiguration withPublicKeys(List<ContainerServiceSshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

}
