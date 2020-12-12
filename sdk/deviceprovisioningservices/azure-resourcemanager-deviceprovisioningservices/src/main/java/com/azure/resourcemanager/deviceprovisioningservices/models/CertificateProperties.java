// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceprovisioningservices.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.DateTimeRfc1123;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The description of an X509 CA Certificate. */
@Immutable
public final class CertificateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateProperties.class);

    /*
     * The certificate's subject name.
     */
    @JsonProperty(value = "subject", access = JsonProperty.Access.WRITE_ONLY)
    private String subject;

    /*
     * The certificate's expiration date and time.
     */
    @JsonProperty(value = "expiry", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 expiry;

    /*
     * The certificate's thumbprint.
     */
    @JsonProperty(value = "thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Determines whether certificate has been verified.
     */
    @JsonProperty(value = "isVerified", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isVerified;

    /*
     * The certificate's creation date and time.
     */
    @JsonProperty(value = "created", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 created;

    /*
     * The certificate's last update date and time.
     */
    @JsonProperty(value = "updated", access = JsonProperty.Access.WRITE_ONLY)
    private DateTimeRfc1123 updated;

    /**
     * Get the subject property: The certificate's subject name.
     *
     * @return the subject value.
     */
    public String subject() {
        return this.subject;
    }

    /**
     * Get the expiry property: The certificate's expiration date and time.
     *
     * @return the expiry value.
     */
    public OffsetDateTime expiry() {
        if (this.expiry == null) {
            return null;
        }
        return this.expiry.getDateTime();
    }

    /**
     * Get the thumbprint property: The certificate's thumbprint.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the isVerified property: Determines whether certificate has been verified.
     *
     * @return the isVerified value.
     */
    public Boolean isVerified() {
        return this.isVerified;
    }

    /**
     * Get the created property: The certificate's creation date and time.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        if (this.created == null) {
            return null;
        }
        return this.created.getDateTime();
    }

    /**
     * Get the updated property: The certificate's last update date and time.
     *
     * @return the updated value.
     */
    public OffsetDateTime updated() {
        if (this.updated == null) {
            return null;
        }
        return this.updated.getDateTime();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
