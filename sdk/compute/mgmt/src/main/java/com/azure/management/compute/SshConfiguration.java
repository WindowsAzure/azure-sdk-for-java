// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The SshConfiguration model.
 */
@Fluent
public final class SshConfiguration {
    /*
     * The list of SSH public keys used to authenticate with linux based VMs.
     */
    @JsonProperty(value = "publicKeys")
    private List<SshPublicKey> publicKeys;

    /**
     * Get the publicKeys property: The list of SSH public keys used to
     * authenticate with linux based VMs.
     * 
     * @return the publicKeys value.
     */
    public List<SshPublicKey> publicKeys() {
        return this.publicKeys;
    }

    /**
     * Set the publicKeys property: The list of SSH public keys used to
     * authenticate with linux based VMs.
     * 
     * @param publicKeys the publicKeys value to set.
     * @return the SshConfiguration object itself.
     */
    public SshConfiguration withPublicKeys(List<SshPublicKey> publicKeys) {
        this.publicKeys = publicKeys;
        return this;
    }
}
