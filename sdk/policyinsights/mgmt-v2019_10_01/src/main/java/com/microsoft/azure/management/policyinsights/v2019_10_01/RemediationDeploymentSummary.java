/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The deployment status summary for all deployments created by the
 * remediation.
 */
public class RemediationDeploymentSummary {
    /**
     * The number of deployments required by the remediation.
     */
    @JsonProperty(value = "totalDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalDeployments;

    /**
     * The number of deployments required by the remediation that have
     * succeeded.
     */
    @JsonProperty(value = "successfulDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer successfulDeployments;

    /**
     * The number of deployments required by the remediation that have failed.
     */
    @JsonProperty(value = "failedDeployments", access = JsonProperty.Access.WRITE_ONLY)
    private Integer failedDeployments;

    /**
     * Get the number of deployments required by the remediation.
     *
     * @return the totalDeployments value
     */
    public Integer totalDeployments() {
        return this.totalDeployments;
    }

    /**
     * Get the number of deployments required by the remediation that have succeeded.
     *
     * @return the successfulDeployments value
     */
    public Integer successfulDeployments() {
        return this.successfulDeployments;
    }

    /**
     * Get the number of deployments required by the remediation that have failed.
     *
     * @return the failedDeployments value
     */
    public Integer failedDeployments() {
        return this.failedDeployments;
    }

}
