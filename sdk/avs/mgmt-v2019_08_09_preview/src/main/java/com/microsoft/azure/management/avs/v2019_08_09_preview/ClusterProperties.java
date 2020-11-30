/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2019_08_09_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a cluster.
 */
public class ClusterProperties extends DefaultClusterProperties {
    /**
     * The state of the cluster provisioning. Possible values include:
     * 'Succeeded', 'Failed', 'Cancelled', 'Updating'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ClusterProvisioningState provisioningState;

    /**
     * Get the state of the cluster provisioning. Possible values include: 'Succeeded', 'Failed', 'Cancelled', 'Updating'.
     *
     * @return the provisioningState value
     */
    public ClusterProvisioningState provisioningState() {
        return this.provisioningState;
    }

}
