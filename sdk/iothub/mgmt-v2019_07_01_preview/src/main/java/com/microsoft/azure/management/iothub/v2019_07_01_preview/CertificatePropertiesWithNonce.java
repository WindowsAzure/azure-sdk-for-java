/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_07_01_preview;

import com.microsoft.rest.DateTimeRfc1123;
import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The description of an X509 CA Certificate including the challenge nonce
 * issued for the Proof-Of-Possession flow.
 */
public class CertificatePropertiesWithNonce {
    /**
     * The certificate's subject name.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /**
     * The certificate's expiration date and time.
     */
    @JsonProperty(value = "expiry", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 expiry;

    /**
     * The certificate's thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /**
     * Determines whether certificate has been verified.
     */
    @JsonProperty(value = "isVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isVerified;

    /**
     * The certificate's create date and time.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 created;

    /**
     * The certificate's last update date and time.
     */
    @JsonProperty(value = "updated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 updated;

    /**
     * The certificate's verification code that will be used for proof of
     * possession.
     */
    @JsonProperty(value = "verificationCode", access = JsonProperty.Access.WRITE_ONLY)
    private String verificationCode;

    /**
     * The certificate content.
     */
    @JsonProperty(value = "certificate", access = JsonProperty.Access.WRITE_ONLY)
    private String certificate;

    /**
     * Get the certificate's subject name.
     *
     * @return the subject value
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the certificate's expiration date and time.
     *
     * @return the expiry value
     */
    public DateTime expiry() {
        if (this.expiry == null) {
            return null;
        }
        return this.expiry.dateTime();
    }

    /**
     * Get the certificate's thumbprint.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get determines whether certificate has been verified.
     *
     * @return the isVerified value
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the certificate's create date and time.
     *
     * @return the created value
     */
    public DateTime created() {
        if (this.created == null) {
            return null;
        }
        return this.created.dateTime();
    }

    /**
     * Get the certificate's last update date and time.
     *
     * @return the updated value
     */
    public DateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return this.updated.dateTime();
    }

    /**
     * Get the certificate's verification code that will be used for proof of possession.
     *
     * @return the verificationCode value
     */
    public String verificationCode() {
        return this.verificationCode;
    }

    /**
     * Get the certificate content.
     *
     * @return the certificate value
     */
    public String certificate() {
        return this.certificate;
    }

}
