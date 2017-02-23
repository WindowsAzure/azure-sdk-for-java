/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a single certificate reference in a Key Vault, and where the
 * certificate should reside on the VM.
 */
public class VaultCertificate {
    /**
     * The URL referencing a secret in a Key Vault which contains a properly
     * formatted certificate.
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * The Certificate store in LocalMachine to add the certificate to on
     * Windows, leave empty on Linux.
     */
    @JsonProperty(value = "certificateStore")
    private String certificateStore;

    /**
     * Get the certificateUrl value.
     *
     * @return the certificateUrl value
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl value.
     *
     * @param certificateUrl the certificateUrl value to set
     * @return the VaultCertificate object itself.
     */
    public VaultCertificate withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

    /**
     * Get the certificateStore value.
     *
     * @return the certificateStore value
     */
    public String certificateStore() {
        return this.certificateStore;
    }

    /**
     * Set the certificateStore value.
     *
     * @param certificateStore the certificateStore value to set
     * @return the VaultCertificate object itself.
     */
    public VaultCertificate withCertificateStore(String certificateStore) {
        this.certificateStore = certificateStore;
        return this;
    }

}
