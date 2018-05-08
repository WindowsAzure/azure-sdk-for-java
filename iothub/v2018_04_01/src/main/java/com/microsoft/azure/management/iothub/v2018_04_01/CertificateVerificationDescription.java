/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON-serialized leaf certificate.
 */
public class CertificateVerificationDescription {
    /**
     * base-64 representation of X509 certificate .cer file or just .pem file
     * content.
     */
    @JsonProperty(value = "certificate")
    private String certificate;

    /**
     * Get the certificate value.
     *
     * @return the certificate value
     */
    public String certificate() {
        return this.certificate;
    }

    /**
     * Set the certificate value.
     *
     * @param certificate the certificate value to set
     * @return the CertificateVerificationDescription object itself.
     */
    public CertificateVerificationDescription withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

}
