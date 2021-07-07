/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A Certificate that can be installed on Compute Nodes and can be used to
 * authenticate operations on the machine.
 */
public class Certificate {
    /**
     * The X.509 thumbprint of the Certificate. This is a sequence of up to 40
     * hex digits.
     */
    @JsonProperty(value = "thumbprint")
    private String thumbprint;

    /**
     * The algorithm used to derive the thumbprint.
     */
    @JsonProperty(value = "thumbprintAlgorithm")
    private String thumbprintAlgorithm;

    /**
     * The URL of the Certificate.
     */
    @JsonProperty(value = "url")
    private String url;

    /**
     * The current state of the Certificate. Possible values include: 'active',
     * 'deleting', 'deleteFailed'.
     */
    @JsonProperty(value = "state")
    private CertificateState state;

    /**
     * The time at which the Certificate entered its current state.
     */
    @JsonProperty(value = "stateTransitionTime")
    private DateTime stateTransitionTime;

    /**
     * The previous state of the Certificate. This property is not set if the
     * Certificate is in its initial active state. Possible values include:
     * 'active', 'deleting', 'deleteFailed'.
     */
    @JsonProperty(value = "previousState")
    private CertificateState previousState;

    /**
     * The time at which the Certificate entered its previous state. This
     * property is not set if the Certificate is in its initial Active state.
     */
    @JsonProperty(value = "previousStateTransitionTime")
    private DateTime previousStateTransitionTime;

    /**
     * The public part of the Certificate as a base-64 encoded .cer file.
     */
    @JsonProperty(value = "publicData")
    private String publicData;

    /**
     * The error that occurred on the last attempt to delete this Certificate.
     * This property is set only if the Certificate is in the DeleteFailed
     * state.
     */
    @JsonProperty(value = "deleteCertificateError")
    private DeleteCertificateError deleteCertificateError;

    /**
     * Get the X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits.
     *
     * @return the thumbprint value
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    /**
     * Set the X.509 thumbprint of the Certificate. This is a sequence of up to 40 hex digits.
     *
     * @param thumbprint the thumbprint value to set
     * @return the Certificate object itself.
     */
    public Certificate withThumbprint(String thumbprint) {
        this.thumbprint = thumbprint;
        return this;
    }

    /**
     * Get the algorithm used to derive the thumbprint.
     *
     * @return the thumbprintAlgorithm value
     */
    public String thumbprintAlgorithm() {
        return this.thumbprintAlgorithm;
    }

    /**
     * Set the algorithm used to derive the thumbprint.
     *
     * @param thumbprintAlgorithm the thumbprintAlgorithm value to set
     * @return the Certificate object itself.
     */
    public Certificate withThumbprintAlgorithm(String thumbprintAlgorithm) {
        this.thumbprintAlgorithm = thumbprintAlgorithm;
        return this;
    }

    /**
     * Get the URL of the Certificate.
     *
     * @return the url value
     */
    public String url() {
        return this.url;
    }

    /**
     * Set the URL of the Certificate.
     *
     * @param url the url value to set
     * @return the Certificate object itself.
     */
    public Certificate withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get the current state of the Certificate. Possible values include: 'active', 'deleting', 'deleteFailed'.
     *
     * @return the state value
     */
    public CertificateState state() {
        return this.state;
    }

    /**
     * Set the current state of the Certificate. Possible values include: 'active', 'deleting', 'deleteFailed'.
     *
     * @param state the state value to set
     * @return the Certificate object itself.
     */
    public Certificate withState(CertificateState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the time at which the Certificate entered its current state.
     *
     * @return the stateTransitionTime value
     */
    public DateTime stateTransitionTime() {
        return this.stateTransitionTime;
    }

    /**
     * Set the time at which the Certificate entered its current state.
     *
     * @param stateTransitionTime the stateTransitionTime value to set
     * @return the Certificate object itself.
     */
    public Certificate withStateTransitionTime(DateTime stateTransitionTime) {
        this.stateTransitionTime = stateTransitionTime;
        return this;
    }

    /**
     * Get the previous state of the Certificate. This property is not set if the Certificate is in its initial active state. Possible values include: 'active', 'deleting', 'deleteFailed'.
     *
     * @return the previousState value
     */
    public CertificateState previousState() {
        return this.previousState;
    }

    /**
     * Set the previous state of the Certificate. This property is not set if the Certificate is in its initial active state. Possible values include: 'active', 'deleting', 'deleteFailed'.
     *
     * @param previousState the previousState value to set
     * @return the Certificate object itself.
     */
    public Certificate withPreviousState(CertificateState previousState) {
        this.previousState = previousState;
        return this;
    }

    /**
     * Get the time at which the Certificate entered its previous state. This property is not set if the Certificate is in its initial Active state.
     *
     * @return the previousStateTransitionTime value
     */
    public DateTime previousStateTransitionTime() {
        return this.previousStateTransitionTime;
    }

    /**
     * Set the time at which the Certificate entered its previous state. This property is not set if the Certificate is in its initial Active state.
     *
     * @param previousStateTransitionTime the previousStateTransitionTime value to set
     * @return the Certificate object itself.
     */
    public Certificate withPreviousStateTransitionTime(DateTime previousStateTransitionTime) {
        this.previousStateTransitionTime = previousStateTransitionTime;
        return this;
    }

    /**
     * Get the public part of the Certificate as a base-64 encoded .cer file.
     *
     * @return the publicData value
     */
    public String publicData() {
        return this.publicData;
    }

    /**
     * Set the public part of the Certificate as a base-64 encoded .cer file.
     *
     * @param publicData the publicData value to set
     * @return the Certificate object itself.
     */
    public Certificate withPublicData(String publicData) {
        this.publicData = publicData;
        return this;
    }

    /**
     * Get the error that occurred on the last attempt to delete this Certificate. This property is set only if the Certificate is in the DeleteFailed state.
     *
     * @return the deleteCertificateError value
     */
    public DeleteCertificateError deleteCertificateError() {
        return this.deleteCertificateError;
    }

    /**
     * Set the error that occurred on the last attempt to delete this Certificate. This property is set only if the Certificate is in the DeleteFailed state.
     *
     * @param deleteCertificateError the deleteCertificateError value to set
     * @return the Certificate object itself.
     */
    public Certificate withDeleteCertificateError(DeleteCertificateError deleteCertificateError) {
        this.deleteCertificateError = deleteCertificateError;
        return this;
    }

}
