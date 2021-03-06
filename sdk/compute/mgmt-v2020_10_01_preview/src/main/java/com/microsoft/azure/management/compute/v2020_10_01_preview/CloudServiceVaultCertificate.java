/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes a single certificate reference in a Key Vault, and where the
 * certificate should reside on the role instance.
 */
public class CloudServiceVaultCertificate {
    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as
     * a secret.
     */
    @JsonProperty(value = "certificateUrl")
    private String certificateUrl;

    /**
     * Get this is the URL of a certificate that has been uploaded to Key Vault as a secret.
     *
     * @return the certificateUrl value
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set this is the URL of a certificate that has been uploaded to Key Vault as a secret.
     *
     * @param certificateUrl the certificateUrl value to set
     * @return the CloudServiceVaultCertificate object itself.
     */
    public CloudServiceVaultCertificate withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

}
