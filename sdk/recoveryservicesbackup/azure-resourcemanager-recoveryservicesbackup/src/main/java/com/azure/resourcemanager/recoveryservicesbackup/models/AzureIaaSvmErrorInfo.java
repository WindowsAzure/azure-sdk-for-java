// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Azure IaaS VM workload-specific error information. */
@Immutable
public final class AzureIaaSvmErrorInfo {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AzureIaaSvmErrorInfo.class);

    /*
     * Error code.
     */
    @JsonProperty(value = "errorCode", access = JsonProperty.Access.WRITE_ONLY)
    private Integer errorCode;

    /*
     * Title: Typically, the entity that the error pertains to.
     */
    @JsonProperty(value = "errorTitle", access = JsonProperty.Access.WRITE_ONLY)
    private String errorTitle;

    /*
     * Localized error string.
     */
    @JsonProperty(value = "errorString", access = JsonProperty.Access.WRITE_ONLY)
    private String errorString;

    /*
     * List of localized recommendations for above error code.
     */
    @JsonProperty(value = "recommendations", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> recommendations;

    /**
     * Get the errorCode property: Error code.
     *
     * @return the errorCode value.
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorTitle property: Title: Typically, the entity that the error pertains to.
     *
     * @return the errorTitle value.
     */
    public String errorTitle() {
        return this.errorTitle;
    }

    /**
     * Get the errorString property: Localized error string.
     *
     * @return the errorString value.
     */
    public String errorString() {
        return this.errorString;
    }

    /**
     * Get the recommendations property: List of localized recommendations for above error code.
     *
     * @return the recommendations value.
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
