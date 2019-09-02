/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2016_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Permissions the identity has for keys, secrets, certificates and storage.
 */
public class Permissions {
    /**
     * Permissions to keys.
     */
    @JsonProperty(value = "keys")
    private List<KeyPermissions> keys;

    /**
     * Permissions to secrets.
     */
    @JsonProperty(value = "secrets")
    private List<SecretPermissions> secrets;

    /**
     * Permissions to certificates.
     */
    @JsonProperty(value = "certificates")
    private List<CertificatePermissions> certificates;

    /**
     * Permissions to storage accounts.
     */
    @JsonProperty(value = "storage")
    private List<StoragePermissions> storage;

    /**
     * Get the keys value.
     *
     * @return the keys value
     */
    public List<KeyPermissions> keys() {
        return this.keys;
    }

    /**
     * Set the keys value.
     *
     * @param keys the keys value to set
     * @return the Permissions object itself.
     */
    public Permissions withKeys(List<KeyPermissions> keys) {
        this.keys = keys;
        return this;
    }

    /**
     * Get the secrets value.
     *
     * @return the secrets value
     */
    public List<SecretPermissions> secrets() {
        return this.secrets;
    }

    /**
     * Set the secrets value.
     *
     * @param secrets the secrets value to set
     * @return the Permissions object itself.
     */
    public Permissions withSecrets(List<SecretPermissions> secrets) {
        this.secrets = secrets;
        return this;
    }

    /**
     * Get the certificates value.
     *
     * @return the certificates value
     */
    public List<CertificatePermissions> certificates() {
        return this.certificates;
    }

    /**
     * Set the certificates value.
     *
     * @param certificates the certificates value to set
     * @return the Permissions object itself.
     */
    public Permissions withCertificates(List<CertificatePermissions> certificates) {
        this.certificates = certificates;
        return this;
    }

    /**
     * Get the storage value.
     *
     * @return the storage value
     */
    public List<StoragePermissions> storage() {
        return this.storage;
    }

    /**
     * Set the storage value.
     *
     * @param storage the storage value to set
     * @return the Permissions object itself.
     */
    public Permissions withStorage(List<StoragePermissions> storage) {
        this.storage = storage;
        return this;
    }

}
