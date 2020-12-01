/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines contents of a web application firewall global configuration.
 */
public class PolicySettings {
    /**
     * The state of the policy. Possible values include: 'Disabled', 'Enabled'.
     */
    @JsonProperty(value = "state")
    private WebApplicationFirewallEnabledState state;

    /**
     * The mode of the policy. Possible values include: 'Prevention',
     * 'Detection'.
     */
    @JsonProperty(value = "mode")
    private WebApplicationFirewallMode mode;

    /**
     * Whether to allow WAF to check request Body.
     */
    @JsonProperty(value = "requestBodyCheck")
    private Boolean requestBodyCheck;

    /**
     * Maximum request body size in Kb for WAF.
     */
    @JsonProperty(value = "maxRequestBodySizeInKb")
    private Integer maxRequestBodySizeInKb;

    /**
     * Maximum file upload size in Mb for WAF.
     */
    @JsonProperty(value = "fileUploadLimitInMb")
    private Integer fileUploadLimitInMb;

    /**
     * Get the state of the policy. Possible values include: 'Disabled', 'Enabled'.
     *
     * @return the state value
     */
    public WebApplicationFirewallEnabledState state() {
        return this.state;
    }

    /**
     * Set the state of the policy. Possible values include: 'Disabled', 'Enabled'.
     *
     * @param state the state value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withState(WebApplicationFirewallEnabledState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the mode of the policy. Possible values include: 'Prevention', 'Detection'.
     *
     * @return the mode value
     */
    public WebApplicationFirewallMode mode() {
        return this.mode;
    }

    /**
     * Set the mode of the policy. Possible values include: 'Prevention', 'Detection'.
     *
     * @param mode the mode value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMode(WebApplicationFirewallMode mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Get whether to allow WAF to check request Body.
     *
     * @return the requestBodyCheck value
     */
    public Boolean requestBodyCheck() {
        return this.requestBodyCheck;
    }

    /**
     * Set whether to allow WAF to check request Body.
     *
     * @param requestBodyCheck the requestBodyCheck value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withRequestBodyCheck(Boolean requestBodyCheck) {
        this.requestBodyCheck = requestBodyCheck;
        return this;
    }

    /**
     * Get maximum request body size in Kb for WAF.
     *
     * @return the maxRequestBodySizeInKb value
     */
    public Integer maxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb;
    }

    /**
     * Set maximum request body size in Kb for WAF.
     *
     * @param maxRequestBodySizeInKb the maxRequestBodySizeInKb value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withMaxRequestBodySizeInKb(Integer maxRequestBodySizeInKb) {
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        return this;
    }

    /**
     * Get maximum file upload size in Mb for WAF.
     *
     * @return the fileUploadLimitInMb value
     */
    public Integer fileUploadLimitInMb() {
        return this.fileUploadLimitInMb;
    }

    /**
     * Set maximum file upload size in Mb for WAF.
     *
     * @param fileUploadLimitInMb the fileUploadLimitInMb value to set
     * @return the PolicySettings object itself.
     */
    public PolicySettings withFileUploadLimitInMb(Integer fileUploadLimitInMb) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        return this;
    }

}
