// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Customer Certificate used for https. */
@Fluent
public final class CustomerCertificate extends Certificate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CustomerCertificate.class);

    /*
     * Certificate version.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * Certificate issuing authority.
     */
    @JsonProperty(value = "certificateAuthority")
    private String certificateAuthority;

    /*
     * Complete Url to the certificate
     */
    @JsonProperty(value = "certificateUrl", required = true)
    private String certificateUrl;

    /*
     * Whether to use the latest version for the certificate
     */
    @JsonProperty(value = "useLatestVersion")
    private Boolean useLatestVersion;

    /*
     * The list of SANs.
     */
    @JsonProperty(value = "subjectAlternativeNames")
    private List<String> subjectAlternativeNames;

    /**
     * Get the version property: Certificate version.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Certificate version.
     *
     * @param version the version value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the certificateAuthority property: Certificate issuing authority.
     *
     * @return the certificateAuthority value.
     */
    public String certificateAuthority() {
        return this.certificateAuthority;
    }

    /**
     * Set the certificateAuthority property: Certificate issuing authority.
     *
     * @param certificateAuthority the certificateAuthority value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withCertificateAuthority(String certificateAuthority) {
        this.certificateAuthority = certificateAuthority;
        return this;
    }

    /**
     * Get the certificateUrl property: Complete Url to the certificate.
     *
     * @return the certificateUrl value.
     */
    public String certificateUrl() {
        return this.certificateUrl;
    }

    /**
     * Set the certificateUrl property: Complete Url to the certificate.
     *
     * @param certificateUrl the certificateUrl value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withCertificateUrl(String certificateUrl) {
        this.certificateUrl = certificateUrl;
        return this;
    }

    /**
     * Get the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @return the useLatestVersion value.
     */
    public Boolean useLatestVersion() {
        return this.useLatestVersion;
    }

    /**
     * Set the useLatestVersion property: Whether to use the latest version for the certificate.
     *
     * @param useLatestVersion the useLatestVersion value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withUseLatestVersion(Boolean useLatestVersion) {
        this.useLatestVersion = useLatestVersion;
        return this;
    }

    /**
     * Get the subjectAlternativeNames property: The list of SANs.
     *
     * @return the subjectAlternativeNames value.
     */
    public List<String> subjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    /**
     * Set the subjectAlternativeNames property: The list of SANs.
     *
     * @param subjectAlternativeNames the subjectAlternativeNames value to set.
     * @return the CustomerCertificate object itself.
     */
    public CustomerCertificate withSubjectAlternativeNames(List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomerCertificate withSubject(String subject) {
        super.withSubject(subject);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomerCertificate withExpirationDate(String expirationDate) {
        super.withExpirationDate(expirationDate);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CustomerCertificate withThumbprint(String thumbprint) {
        super.withThumbprint(thumbprint);
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
        if (certificateUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property certificateUrl in model CustomerCertificate"));
        }
    }
}
