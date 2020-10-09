/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Specifies information about the SSH public key.
 */
@JsonFlatten
public class SshPublicKeyResourceInner extends Resource {
    /**
     * SSH public key used to authenticate to a virtual machine through ssh. If
     * this property is not initially provided when the resource is created,
     * the publicKey property will be populated when generateKeyPair is called.
     * If the public key is provided upon resource creation, the provided
     * public key needs to be at least 2048-bit and in ssh-rsa format.
     */
    @JsonProperty(value = "properties.publicKey")
    private String publicKey;

    /**
     * Get sSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     *
     * @return the publicKey value
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set sSH public key used to authenticate to a virtual machine through ssh. If this property is not initially provided when the resource is created, the publicKey property will be populated when generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to be at least 2048-bit and in ssh-rsa format.
     *
     * @param publicKey the publicKey value to set
     * @return the SshPublicKeyResourceInner object itself.
     */
    public SshPublicKeyResourceInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

}
