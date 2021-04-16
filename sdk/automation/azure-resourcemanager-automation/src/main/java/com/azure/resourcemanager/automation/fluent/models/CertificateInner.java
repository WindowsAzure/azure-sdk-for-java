// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of the certificate. */
@JsonFlatten
@Fluent
public class CertificateInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateInner.class);

    /*
     * Gets the thumbprint of the certificate.
     */
    @JsonProperty(value = "properties.thumbprint", access = JsonProperty.Access.WRITE_ONLY)
    private String thumbprint;

    /*
     * Gets the expiry time of the certificate.
     */
    @JsonProperty(value = "properties.expiryTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime expiryTime;

    /*
     * Gets the is exportable flag of the certificate.
     */
    @JsonProperty(value = "properties.isExportable", access = JsonProperty.Access.WRITE_ONLY)
    private Boolean isExportable;

    /*
     * Gets the creation time.
     */
    @JsonProperty(value = "properties.creationTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime creationTime;

    /*
     * Gets the last modified time.
     */
    @JsonProperty(value = "properties.lastModifiedTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /**
     * Get the thumbprint property: Gets the thumbprint of the certificate.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Get the expiryTime property: Gets the expiry time of the certificate.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Get the isExportable property: Gets the is exportable flag of the certificate.
     *
     * @return the isExportable value.
     */
    public Boolean isExportable() {
        return this.isExportable;
    }

    /**
     * Get the creationTime property: Gets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Get the lastModifiedTime property: Gets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
