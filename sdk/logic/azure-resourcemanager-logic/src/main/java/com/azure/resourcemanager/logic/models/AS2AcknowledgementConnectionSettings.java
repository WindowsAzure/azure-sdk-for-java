// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AS2 agreement acknowledgement connection settings. */
@Fluent
public final class AS2AcknowledgementConnectionSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AS2AcknowledgementConnectionSettings.class);

    /*
     * Indicates whether to ignore mismatch in certificate name.
     */
    @JsonProperty(value = "ignoreCertificateNameMismatch", required = true)
    private boolean ignoreCertificateNameMismatch;

    /*
     * Indicates whether to support HTTP status code 'CONTINUE'.
     */
    @JsonProperty(value = "supportHttpStatusCodeContinue", required = true)
    private boolean supportHttpStatusCodeContinue;

    /*
     * Indicates whether to keep the connection alive.
     */
    @JsonProperty(value = "keepHttpConnectionAlive", required = true)
    private boolean keepHttpConnectionAlive;

    /*
     * Indicates whether to unfold the HTTP headers.
     */
    @JsonProperty(value = "unfoldHttpHeaders", required = true)
    private boolean unfoldHttpHeaders;

    /**
     * Get the ignoreCertificateNameMismatch property: Indicates whether to ignore mismatch in certificate name.
     *
     * @return the ignoreCertificateNameMismatch value.
     */
    public boolean ignoreCertificateNameMismatch() {
        return this.ignoreCertificateNameMismatch;
    }

    /**
     * Set the ignoreCertificateNameMismatch property: Indicates whether to ignore mismatch in certificate name.
     *
     * @param ignoreCertificateNameMismatch the ignoreCertificateNameMismatch value to set.
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withIgnoreCertificateNameMismatch(
        boolean ignoreCertificateNameMismatch) {
        this.ignoreCertificateNameMismatch = ignoreCertificateNameMismatch;
        return this;
    }

    /**
     * Get the supportHttpStatusCodeContinue property: Indicates whether to support HTTP status code 'CONTINUE'.
     *
     * @return the supportHttpStatusCodeContinue value.
     */
    public boolean supportHttpStatusCodeContinue() {
        return this.supportHttpStatusCodeContinue;
    }

    /**
     * Set the supportHttpStatusCodeContinue property: Indicates whether to support HTTP status code 'CONTINUE'.
     *
     * @param supportHttpStatusCodeContinue the supportHttpStatusCodeContinue value to set.
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withSupportHttpStatusCodeContinue(
        boolean supportHttpStatusCodeContinue) {
        this.supportHttpStatusCodeContinue = supportHttpStatusCodeContinue;
        return this;
    }

    /**
     * Get the keepHttpConnectionAlive property: Indicates whether to keep the connection alive.
     *
     * @return the keepHttpConnectionAlive value.
     */
    public boolean keepHttpConnectionAlive() {
        return this.keepHttpConnectionAlive;
    }

    /**
     * Set the keepHttpConnectionAlive property: Indicates whether to keep the connection alive.
     *
     * @param keepHttpConnectionAlive the keepHttpConnectionAlive value to set.
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withKeepHttpConnectionAlive(boolean keepHttpConnectionAlive) {
        this.keepHttpConnectionAlive = keepHttpConnectionAlive;
        return this;
    }

    /**
     * Get the unfoldHttpHeaders property: Indicates whether to unfold the HTTP headers.
     *
     * @return the unfoldHttpHeaders value.
     */
    public boolean unfoldHttpHeaders() {
        return this.unfoldHttpHeaders;
    }

    /**
     * Set the unfoldHttpHeaders property: Indicates whether to unfold the HTTP headers.
     *
     * @param unfoldHttpHeaders the unfoldHttpHeaders value to set.
     * @return the AS2AcknowledgementConnectionSettings object itself.
     */
    public AS2AcknowledgementConnectionSettings withUnfoldHttpHeaders(boolean unfoldHttpHeaders) {
        this.unfoldHttpHeaders = unfoldHttpHeaders;
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
