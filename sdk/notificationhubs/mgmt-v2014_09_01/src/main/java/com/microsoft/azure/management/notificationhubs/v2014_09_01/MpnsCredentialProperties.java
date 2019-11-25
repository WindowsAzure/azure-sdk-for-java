/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub MpnsCredential.
 */
public class MpnsCredentialProperties {
    /**
     * Gets or sets the MPNS certificate.
     */
    @JsonProperty(value = "mpnsCertificate")
    private String mpnsCertificate;

    /**
     * Gets or sets the certificate key for this credential.
     */
    @JsonProperty(value = "certificateKey")
    private String certificateKey;

    /**
     * Gets or sets the Mpns certificate Thumbprint.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * Get gets or sets the MPNS certificate.
     *
     * @return the mpnsCertificate value
     */
    public String mpnsCertificate() {
        return this.mpnsCertificate;
    }

    /**
     * Set gets or sets the MPNS certificate.
     *
     * @param mpnsCertificate the mpnsCertificate value to set
     * @return the MpnsCredentialProperties object itself.
     */
    public MpnsCredentialProperties withMpnsCertificate(String mpnsCertificate) {
        this.mpnsCertificate = mpnsCertificate;
        return this;
    }

    /**
     * Get gets or sets the certificate key for this credential.
     *
     * @return the certificateKey value
     */
    public String certificateKey() {
        return this.certificateKey;
    }

    /**
     * Set gets or sets the certificate key for this credential.
     *
     * @param certificateKey the certificateKey value to set
     * @return the MpnsCredentialProperties object itself.
     */
    public MpnsCredentialProperties withCertificateKey(String certificateKey) {
        this.certificateKey = certificateKey;
        return this;
    }

    /**
     * Get gets or sets the Mpns certificate Thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set gets or sets the Mpns certificate Thumbprint.
     *
     * @param thumbprint the thumbprint value to set
     * @return the MpnsCredentialProperties object itself.
     */
    public MpnsCredentialProperties withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

}
