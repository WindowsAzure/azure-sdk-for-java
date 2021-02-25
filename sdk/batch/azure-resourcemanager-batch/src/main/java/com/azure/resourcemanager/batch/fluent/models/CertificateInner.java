// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.batch.models.CertificateFormat;
import com.azure.resourcemanager.batch.models.CertificateProvisioningState;
import com.azure.resourcemanager.batch.models.DeleteCertificateError;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Contains information about a certificate. */
@JsonFlatten
@Fluent
public class CertificateInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificateInner.class);

    /*
     * This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     */
    @JsonProperty(value = "properties.thumbprintAlgorithm")
    private String thumbprintAlgorithm;

    /*
     * This must match the thumbprint from the name.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /*
     * The format of the certificate - either Pfx or Cer. If omitted, the
     * default is Pfx.
     */
    @JsonProperty(value = "properties.format")
    private CertificateFormat format;

    /*
     * The provisioningState property.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState provisioningState;

    /*
     * The time at which the certificate entered its current state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStateTransitionTime;

    /*
     * The previous provisioned state of the resource
     */
    @JsonProperty(value = "properties.previousProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState previousProvisioningState;

    /*
     * The time at which the certificate entered its previous state.
     */
    @JsonProperty(value = "properties.previousProvisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime previousProvisioningStateTransitionTime;

    /*
     * The public key of the certificate.
     */
    @JsonProperty(value = "properties.publicData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicData;

    /*
     * This is only returned when the certificate provisioningState is
     * 'Failed'.
     */
    @JsonProperty(value = "properties.deleteCertificateError", access = JsonProperty.Access.WRITE_ONLY)
    private DeleteCertificateError deleteCertificateError;

    /*
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the thumbprintAlgorithm property: This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     *
     * @return the thumbprintAlgorithm value.
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the thumbprintAlgorithm property: This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the thumbprint property: This must match the thumbprint from the name.
     *
     * @return the thumbprint value.
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the thumbprint property: This must match the thumbprint from the name.
     *
     * @param thumbprint the thumbprint value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @return the format value.
     */
    public CertificateFormat format() {
        return this.format;
    }

    /**
     * Set the format property: The format of the certificate - either Pfx or Cer. If omitted, the default is Pfx.
     *
     * @param format the format value to set.
     * @return the CertificateInner object itself.
     */
    public CertificateInner withFormat(CertificateFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioningState property.
     *
     * @return the provisioningState value.
     */
    public CertificateProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime property: The time at which the certificate entered its current state.
     *
     * @return the provisioningStateTransitionTime value.
     */
    public OffsetDateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the previousProvisioningState property: The previous provisioned state of the resource.
     *
     * @return the previousProvisioningState value.
     */
    public CertificateProvisioningState previousProvisioningState() {
        return this.previousProvisioningState;
    }

    /**
     * Get the previousProvisioningStateTransitionTime property: The time at which the certificate entered its previous
     * state.
     *
     * @return the previousProvisioningStateTransitionTime value.
     */
    public OffsetDateTime previousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }

    /**
     * Get the publicData property: The public key of the certificate.
     *
     * @return the publicData value.
     */
    public String publicData() {
        return this.publicData;
    }

    /**
     * Get the deleteCertificateError property: This is only returned when the certificate provisioningState is
     * 'Failed'.
     *
     * @return the deleteCertificateError value.
     */
    public DeleteCertificateError deleteCertificateError() {
        return this.deleteCertificateError;
    }

    /**
     * Get the etag property: The ETag of the resource, used for concurrency statements.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (deleteCertificateError() != null) {
            deleteCertificateError().validate();
        }
    }
}
