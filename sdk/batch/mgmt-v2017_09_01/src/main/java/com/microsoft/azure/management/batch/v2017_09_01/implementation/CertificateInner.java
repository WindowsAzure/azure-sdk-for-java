/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2017_09_01.implementation;

import com.microsoft.azure.management.batch.v2017_09_01.CertificateFormat;
import com.microsoft.azure.management.batch.v2017_09_01.CertificateProvisioningState;
import org.joda.time.DateTime;
import com.microsoft.azure.management.batch.v2017_09_01.DeleteCertificateError;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Contains information about a certificate.
 */
@JsonFlatten
public class CertificateInner extends ProxyResource {
    /**
     * The algorithm of the certificate thumbprint.
     * This must match the first portion of the certificate name. Currently
     * required to be 'SHA1'.
     */
    @JsonProperty(value = "properties.thumbprintAlgorithm")
    private String thumbprintAlgorithm;

    /**
     * The thumbprint of the certificate.
     * This must match the thumbprint from the name.
     */
    @JsonProperty(value = "properties.thumbprint")
    private String thumbprint;

    /**
     * The format of the certificate - either Pfx or Cer. If omitted, the
     * default is Pfx. Possible values include: 'Pfx', 'Cer'.
     */
    @JsonProperty(value = "properties.format")
    private CertificateFormat format;

    /**
     * The provisioned state of the resource.
     * Values are:
     *
     * Succeeded - The certificate is available for use in pools.
     * Deleting - The user has requested that the certificate be deleted, but
     * the delete operation has not yet completed. You may not reference the
     * certificate when creating or updating pools.
     * Failed - The user requested that the certificate be deleted, but there
     * are pools that still have references to the certificate, or it is still
     * installed on one or more compute nodes. (The latter can occur if the
     * certificate has been removed from the pool, but the node has not yet
     * restarted. Nodes refresh their certificates only when they restart.) You
     * may use the cancel certificate delete operation to cancel the delete, or
     * the delete certificate operation to retry the delete. Possible values
     * include: 'Succeeded', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState provisioningState;

    /**
     * The time at which the certificate entered its current state.
     */
    @JsonProperty(value = "properties.provisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime provisioningStateTransitionTime;

    /**
     * The previous provisioned state of the resource. Possible values include:
     * 'Succeeded', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.previousProvisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private CertificateProvisioningState previousProvisioningState;

    /**
     * The time at which the certificate entered its previous state.
     */
    @JsonProperty(value = "properties.previousProvisioningStateTransitionTime", access = JsonProperty.Access.WRITE_ONLY)
    private DateTime previousProvisioningStateTransitionTime;

    /**
     * The public key of the certificate.
     */
    @JsonProperty(value = "properties.publicData", access = JsonProperty.Access.WRITE_ONLY)
    private String publicData;

    /**
     * The error which occurred while deleting the certificate.
     * This is only returned when the certificate provisioningState is
     * 'Failed'.
     */
    @JsonProperty(value = "properties.deleteCertificateError", access = JsonProperty.Access.WRITE_ONLY)
    private DeleteCertificateError deleteCertificateError;

    /**
     * The ETag of the resource, used for concurrency statements.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get this must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @return the thumbprintAlgorithm value
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set this must match the first portion of the certificate name. Currently required to be 'SHA1'.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get this must match the thumbprint from the name.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set this must match the thumbprint from the name.
     *
     * @param thumbprint the thumbprint value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the format of the certificate - either Pfx or Cer. If omitted, the default is Pfx. Possible values include: 'Pfx', 'Cer'.
     *
     * @return the format value
     */
    public CertificateFormat format() {
        return this.format;
    }

    /**
     * Set the format of the certificate - either Pfx or Cer. If omitted, the default is Pfx. Possible values include: 'Pfx', 'Cer'.
     *
     * @param format the format value to set
     * @return the CertificateInner object itself.
     */
    public CertificateInner withFormat(CertificateFormat format) {
        this.format = format;
        return this;
    }

    /**
     * Get values are:
      Succeeded - The certificate is available for use in pools.
      Deleting - The user has requested that the certificate be deleted, but the delete operation has not yet completed. You may not reference the certificate when creating or updating pools.
      Failed - The user requested that the certificate be deleted, but there are pools that still have references to the certificate, or it is still installed on one or more compute nodes. (The latter can occur if the certificate has been removed from the pool, but the node has not yet restarted. Nodes refresh their certificates only when they restart.) You may use the cancel certificate delete operation to cancel the delete, or the delete certificate operation to retry the delete. Possible values include: 'Succeeded', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public CertificateProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the provisioningStateTransitionTime value.
     *
     * @return the provisioningStateTransitionTime value
     */
    public DateTime provisioningStateTransitionTime() {
        return this.provisioningStateTransitionTime;
    }

    /**
     * Get the previous provisioned state of the resource. Possible values include: 'Succeeded', 'Deleting', 'Failed'.
     *
     * @return the previousProvisioningState value
     */
    public CertificateProvisioningState previousProvisioningState() {
        return this.previousProvisioningState;
    }

    /**
     * Get the previousProvisioningStateTransitionTime value.
     *
     * @return the previousProvisioningStateTransitionTime value
     */
    public DateTime previousProvisioningStateTransitionTime() {
        return this.previousProvisioningStateTransitionTime;
    }

    /**
     * Get the public key of the certificate.
     *
     * @return the publicData value
     */
    public String publicData() {
        return this.publicData;
    }

    /**
     * Get this is only returned when the certificate provisioningState is 'Failed'.
     *
     * @return the deleteCertificateError value
     */
    public DeleteCertificateError deleteCertificateError() {
        return this.deleteCertificateError;
    }

    /**
     * Get the ETag of the resource, used for concurrency statements.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

}
