/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.17.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.keyvault.models;

import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.azure.keyvault.CertificateOperationIdentifier;

/**
 * A certificate operation is returned in case of async requests.
 */
public class CertificateOperation {
    /**
     * The certificate id.
     */
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * Reference to the issuer of the X509 component of a certificate.
     */
    @JsonProperty(value = "issuer")
    private IssuerReference issuerReference;

    /**
     * The Certificate Signing Request (CSR) that is being used in the
     * certificate operation.
     */
    private byte[] csr;

    /**
     * Indicates if cancellation was requested on the certificate operation.
     */
    @JsonProperty(value = "cancellation_requested")
    private Boolean cancellationRequested;

    /**
     * Status of the certificate operation.
     */
    private String status;

    /**
     * The status details of the certificate operation.
     */
    @JsonProperty(value = "status_details")
    private String statusDetails;

    /**
     * Error encountered, if any, during the certificate operation.
     */
    private Error error;

    /**
     * Location which contains the result of the certificate operation.
     */
    private String target;

    /**
     * Identifier for the certificate operation.
     */
    @JsonProperty(value = "request_id")
    private String requestId;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the issuerReference value.
     *
     * @return the issuerReference value
     */
    public IssuerReference issuerReference() {
        return this.issuerReference;
    }

    /**
     * Set the issuerReference value.
     *
     * @param issuerReference the issuerReference value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withIssuerReference(IssuerReference issuerReference) {
        this.issuerReference = issuerReference;
        return this;
    }

    /**
     * Get the csr value.
     *
     * @return the csr value
     */
    public byte[] csr() {
        return this.csr;
    }

    /**
     * Set the csr value.
     *
     * @param csr the csr value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withCsr(byte[] csr) {
        this.csr = csr;
        return this;
    }

    /**
     * Get the cancellationRequested value.
     *
     * @return the cancellationRequested value
     */
    public Boolean cancellationRequested() {
        return this.cancellationRequested;
    }

    /**
     * Set the cancellationRequested value.
     *
     * @param cancellationRequested the cancellationRequested value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withCancellationRequested(Boolean cancellationRequested) {
        this.cancellationRequested = cancellationRequested;
        return this;
    }

    /**
     * Get the status value.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status value.
     *
     * @param status the status value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the statusDetails value.
     *
     * @return the statusDetails value
     */
    public String statusDetails() {
        return this.statusDetails;
    }

    /**
     * Set the statusDetails value.
     *
     * @param statusDetails the statusDetails value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
        return this;
    }

    /**
     * Get the error value.
     *
     * @return the error value
     */
    public Error error() {
        return this.error;
    }

    /**
     * Set the error value.
     *
     * @param error the error value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withError(Error error) {
        this.error = error;
        return this;
    }

    /**
     * Get the target value.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target value.
     *
     * @param target the target value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set
     * @return the CertificateOperation object itself.
     */
    public CertificateOperation withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * The certificate operation identifier.
     * @return the identifier value
     */
    public CertificateOperationIdentifier certificateOperationIdentifier() {
        if (id() == null || id().isEmpty()) {
            return null;
        }
        return new CertificateOperationIdentifier(id());
    }

    @Override
    public String toString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (JsonGenerationException e) {
            throw new IllegalStateException(e);
        } catch (JsonMappingException e) {
            throw new IllegalStateException(e);
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}
