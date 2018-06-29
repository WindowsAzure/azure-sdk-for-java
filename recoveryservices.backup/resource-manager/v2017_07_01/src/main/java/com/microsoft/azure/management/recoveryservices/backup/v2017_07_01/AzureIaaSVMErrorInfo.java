/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Azure IaaS VM workload-specific error information.
 */
public class AzureIaaSVMErrorInfo {
    /**
     * Error code.
     */
    @JsonProperty(value = "errorCode")
    private Integer errorCode;

    /**
     * Title: Typically, the entity that the error pertains to.
     */
    @JsonProperty(value = "errorTitle")
    private String errorTitle;

    /**
     * Localized error string.
     */
    @JsonProperty(value = "errorString")
    private String errorString;

    /**
     * List of localized recommendations for above error code.
     */
    @JsonProperty(value = "recommendations")
    private List<String> recommendations;

    /**
     * Get error code.
     *
     * @return the errorCode value
     */
    public Integer errorCode() {
        return this.errorCode;
    }

    /**
     * Set error code.
     *
     * @param errorCode the errorCode value to set
     * @return the AzureIaaSVMErrorInfo object itself.
     */
    public AzureIaaSVMErrorInfo withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get title: Typically, the entity that the error pertains to.
     *
     * @return the errorTitle value
     */
    public String errorTitle() {
        return this.errorTitle;
    }

    /**
     * Set title: Typically, the entity that the error pertains to.
     *
     * @param errorTitle the errorTitle value to set
     * @return the AzureIaaSVMErrorInfo object itself.
     */
    public AzureIaaSVMErrorInfo withErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }

    /**
     * Get localized error string.
     *
     * @return the errorString value
     */
    public String errorString() {
        return this.errorString;
    }

    /**
     * Set localized error string.
     *
     * @param errorString the errorString value to set
     * @return the AzureIaaSVMErrorInfo object itself.
     */
    public AzureIaaSVMErrorInfo withErrorString(String errorString) {
        this.errorString = errorString;
        return this;
    }

    /**
     * Get list of localized recommendations for above error code.
     *
     * @return the recommendations value
     */
    public List<String> recommendations() {
        return this.recommendations;
    }

    /**
     * Set list of localized recommendations for above error code.
     *
     * @param recommendations the recommendations value to set
     * @return the AzureIaaSVMErrorInfo object itself.
     */
    public AzureIaaSVMErrorInfo withRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
        return this;
    }

}
