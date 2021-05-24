// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Validation for inquired protectable items under a given container. */
@Fluent
public final class InquiryValidation {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(InquiryValidation.class);

    /*
     * Status for the Inquiry Validation.
     */
    @JsonProperty(value = "status")
    private String status;

    /*
     * Error Detail in case the status is non-success.
     */
    @JsonProperty(value = "errorDetail")
    private ErrorDetail errorDetail;

    /*
     * Error Additional Detail in case the status is non-success.
     */
    @JsonProperty(value = "additionalDetail", access = JsonProperty.Access.WRITE_ONLY)
    private String additionalDetail;

    /**
     * Get the status property: Status for the Inquiry Validation.
     *
     * @return the status value.
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the status property: Status for the Inquiry Validation.
     *
     * @param status the status value to set.
     * @return the InquiryValidation object itself.
     */
    public InquiryValidation withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the errorDetail property: Error Detail in case the status is non-success.
     *
     * @return the errorDetail value.
     */
    public ErrorDetail errorDetail() {
        return this.errorDetail;
    }

    /**
     * Set the errorDetail property: Error Detail in case the status is non-success.
     *
     * @param errorDetail the errorDetail value to set.
     * @return the InquiryValidation object itself.
     */
    public InquiryValidation withErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }

    /**
     * Get the additionalDetail property: Error Additional Detail in case the status is non-success.
     *
     * @return the additionalDetail value.
     */
    public String additionalDetail() {
        return this.additionalDetail;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorDetail() != null) {
            errorDetail().validate();
        }
    }
}
