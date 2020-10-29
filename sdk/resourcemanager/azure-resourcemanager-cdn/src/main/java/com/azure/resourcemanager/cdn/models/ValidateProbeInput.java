// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Input of the validate probe API. */
@Fluent
public final class ValidateProbeInput {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ValidateProbeInput.class);

    /*
     * The probe URL to validate.
     */
    @JsonProperty(value = "probeURL", required = true)
    private String probeUrl;

    /**
     * Get the probeUrl property: The probe URL to validate.
     *
     * @return the probeUrl value.
     */
    public String probeUrl() {
        return this.probeUrl;
    }

    /**
     * Set the probeUrl property: The probe URL to validate.
     *
     * @param probeUrl the probeUrl value to set.
     * @return the ValidateProbeInput object itself.
     */
    public ValidateProbeInput withProbeUrl(String probeUrl) {
        this.probeUrl = probeUrl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (probeUrl() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property probeUrl in model ValidateProbeInput"));
        }
    }
}
