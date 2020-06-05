// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The ContainerServiceSshConfiguration model. */
@Fluent
public final class ContainerServiceSshConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContainerServiceSshConfiguration.class);

    /*
     * The list of SSH public keys used to authenticate with Linux-based VMs.
     * Only expect one key specified.
     */
    @JsonProperty(value = "publicKeys", required = true)
    private List<ContainerServiceSshPublicKey> publicKeys;

    /**
     * Get the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. Only expect
     * one key specified.
     *
     * @return the publicKeys value.
     */
    public List<ContainerServiceSshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to authenticate with Linux-based VMs. Only expect
     * one key specified.
     *
     * @param publicKeys the publicKeys value to set.
     * @return the ContainerServiceSshConfiguration object itself.
     */
    public ContainerServiceSshConfiguration withPublicKeys(List<ContainerServiceSshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (publicKeys() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property publicKeys in model ContainerServiceSshConfiguration"));
        } else {
            publicKeys().forEach(e -> e.validate());
        }
    }
}
