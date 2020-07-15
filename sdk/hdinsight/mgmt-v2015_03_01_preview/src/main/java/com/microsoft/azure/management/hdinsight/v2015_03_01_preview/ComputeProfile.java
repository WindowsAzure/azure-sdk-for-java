/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the compute profile.
 */
public class ComputeProfile {
    /**
     * The list of roles in the cluster.
     */
    @JsonProperty(value = "roles")
    private List<Role> roles;

    /**
     * Get the list of roles in the cluster.
     *
     * @return the roles value
     */
    public List<Role> roles() {
        return this.roles;
    }

    /**
     * Set the list of roles in the cluster.
     *
     * @param roles the roles value to set
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

}
