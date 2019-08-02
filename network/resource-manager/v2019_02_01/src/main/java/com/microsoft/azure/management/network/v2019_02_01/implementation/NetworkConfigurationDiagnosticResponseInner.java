/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.network.v2019_02_01.NetworkConfigurationDiagnosticResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Results of network configuration diagnostic on the target resource.
 */
public class NetworkConfigurationDiagnosticResponseInner {
    /**
     * List of network configuration diagnostic results.
     */
    @JsonProperty(value = "results", access = JsonProperty.Access.WRITE_ONLY)
    private List<NetworkConfigurationDiagnosticResult> results;

    /**
     * Get list of network configuration diagnostic results.
     *
     * @return the results value
     */
    public List<NetworkConfigurationDiagnosticResult> results() {
        return this.results;
    }

}
