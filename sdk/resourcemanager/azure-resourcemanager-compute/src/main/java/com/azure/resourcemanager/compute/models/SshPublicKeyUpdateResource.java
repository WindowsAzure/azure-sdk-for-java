// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Specifies information about the SSH public key. */
@JsonFlatten
@Fluent
public class SshPublicKeyUpdateResource extends UpdateResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SshPublicKeyUpdateResource.class);

    /*
     * SSH public key used to authenticate to a virtual machine through ssh. If
     * this property is not initially provided when the resource is created,
     * the publicKey property will be populated when generateKeyPair is called.
     * If the public key is provided upon resource creation, the provided
     * public key needs to be at least 2048-bit and in ssh-rsa format.
     */
    @JsonProperty(value = "properties.publicKey")
    private String publicKey;

    /**
     * Get the publicKey property: SSH public key used to authenticate to a virtual machine through ssh. If this
     * property is not initially provided when the resource is created, the publicKey property will be populated when
     * generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to
     * be at least 2048-bit and in ssh-rsa format.
     *
     * @return the publicKey value.
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set the publicKey property: SSH public key used to authenticate to a virtual machine through ssh. If this
     * property is not initially provided when the resource is created, the publicKey property will be populated when
     * generateKeyPair is called. If the public key is provided upon resource creation, the provided public key needs to
     * be at least 2048-bit and in ssh-rsa format.
     *
     * @param publicKey the publicKey value to set.
     * @return the SshPublicKeyUpdateResource object itself.
     */
    public SshPublicKeyUpdateResource withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
