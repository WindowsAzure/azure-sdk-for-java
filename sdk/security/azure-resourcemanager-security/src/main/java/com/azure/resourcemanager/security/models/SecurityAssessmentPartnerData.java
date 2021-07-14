// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Data regarding 3rd party partner integration. */
@Fluent
public final class SecurityAssessmentPartnerData {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SecurityAssessmentPartnerData.class);

    /*
     * Name of the company of the partner
     */
    @JsonProperty(value = "partnerName", required = true)
    private String partnerName;

    /*
     * secret to authenticate the partner - write only
     */
    @JsonProperty(value = "secret", required = true)
    private String secret;

    /**
     * Get the partnerName property: Name of the company of the partner.
     *
     * @return the partnerName value.
     */
    public String partnerName() {
        return this.partnerName;
    }

    /**
     * Set the partnerName property: Name of the company of the partner.
     *
     * @param partnerName the partnerName value to set.
     * @return the SecurityAssessmentPartnerData object itself.
     */
    public SecurityAssessmentPartnerData withPartnerName(String partnerName) {
        this.partnerName = partnerName;
        return this;
    }

    /**
     * Get the secret property: secret to authenticate the partner - write only.
     *
     * @return the secret value.
     */
    public String secret() {
        return this.secret;
    }

    /**
     * Set the secret property: secret to authenticate the partner - write only.
     *
     * @param secret the secret value to set.
     * @return the SecurityAssessmentPartnerData object itself.
     */
    public SecurityAssessmentPartnerData withSecret(String secret) {
        this.secret = secret;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (partnerName() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property partnerName in model SecurityAssessmentPartnerData"));
        }
        if (secret() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property secret in model SecurityAssessmentPartnerData"));
        }
    }
}
