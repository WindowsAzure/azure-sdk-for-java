/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for Linux VMs in the container service cluster.
 */
public class ContainerServiceLinuxProfile {
    /**
     * The administrator username to use for Linux VMs.
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /**
     * SSH configuration for Linux-based VMs running on Azure.
     */
    @JsonProperty(value = "ssh", required = true)
    private ContainerServiceSshConfiguration ssh;

    /**
     * Get the adminUsername value.
     *
     * @return the adminUsername value
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername value.
     *
     * @param adminUsername the adminUsername value to set
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the ssh value.
     *
     * @return the ssh value
     */
    public ContainerServiceSshConfiguration ssh() {
        return this.ssh;
    }

    /**
     * Set the ssh value.
     *
     * @param ssh the ssh value to set
     * @return the ContainerServiceLinuxProfile object itself.
     */
    public ContainerServiceLinuxProfile withSsh(ContainerServiceSshConfiguration ssh) {
        this.ssh = ssh;
        return this;
    }

}
