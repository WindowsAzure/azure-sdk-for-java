/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from generation of an SSH key pair.
 */
public class SshPublicKeyGenerateKeyPairResultInner {
    /**
     * Private key portion of the key pair used to authenticate to a virtual
     * machine through ssh. The private key is returned in RFC3447 format and
     * should be treated as a secret.
     */
    @JsonProperty(value = "privateKey", required = true)
    private String privateKey;

    /**
     * Public key portion of the key pair used to authenticate to a virtual
     * machine through ssh. The public key is in ssh-rsa format.
     */
    @JsonProperty(value = "publicKey", required = true)
    private String publicKey;

    /**
     * The ARM resource id in the form of
     * /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /**
     * Get private key portion of the key pair used to authenticate to a virtual machine through ssh. The private key is returned in RFC3447 format and should be treated as a secret.
     *
     * @return the privateKey value
     */
    public String privateKey() {
        return this.privateKey;
    }

    /**
     * Set private key portion of the key pair used to authenticate to a virtual machine through ssh. The private key is returned in RFC3447 format and should be treated as a secret.
     *
     * @param privateKey the privateKey value to set
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * Get public key portion of the key pair used to authenticate to a virtual machine through ssh. The public key is in ssh-rsa format.
     *
     * @return the publicKey value
     */
    public String publicKey() {
        return this.publicKey;
    }

    /**
     * Set public key portion of the key pair used to authenticate to a virtual machine through ssh. The public key is in ssh-rsa format.
     *
     * @param publicKey the publicKey value to set
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withPublicKey(String publicKey) {
        this.publicKey = publicKey;
        return this;
    }

    /**
     * Get the ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ARM resource id in the form of /subscriptions/{SubscriptionId}/resourceGroups/{ResourceGroupName}/providers/Microsoft.Compute/sshPublicKeys/{SshPublicKeyName}.
     *
     * @param id the id value to set
     * @return the SshPublicKeyGenerateKeyPairResultInner object itself.
     */
    public SshPublicKeyGenerateKeyPairResultInner withId(String id) {
        this.id = id;
        return this;
    }

}
