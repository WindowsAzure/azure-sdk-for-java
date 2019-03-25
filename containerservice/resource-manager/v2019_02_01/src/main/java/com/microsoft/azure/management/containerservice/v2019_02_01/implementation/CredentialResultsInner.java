/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2019_02_01.implementation;

import java.util.List;
import com.microsoft.azure.management.containerservice.v2019_02_01.CredentialResult;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The list of credential result response.
 */
public class CredentialResultsInner {
    /**
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "kubeconfigs", access = JsonProperty.Access.WRITE_ONLY)
    private List<CredentialResult> kubeconfigs;

    /**
     * Get base64-encoded Kubernetes configuration file.
     *
     * @return the kubeconfigs value
     */
    public List<CredentialResult> kubeconfigs() {
        return this.kubeconfigs;
    }

}
