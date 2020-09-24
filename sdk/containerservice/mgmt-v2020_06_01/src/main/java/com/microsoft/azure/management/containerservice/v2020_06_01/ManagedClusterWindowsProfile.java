/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Profile for Windows VMs in the container service cluster.
 */
public class ManagedClusterWindowsProfile {
    /**
     * The administrator username to use for Windows VMs.
     */
    @JsonProperty(value = "adminUsername", required = true)
    private String adminUsername;

    /**
     * The administrator password to use for Windows VMs.
     */
    @JsonProperty(value = "adminPassword")
    private String adminPassword;

    /**
     * Get the administrator username to use for Windows VMs.
     *
     * @return the adminUsername value
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the administrator username to use for Windows VMs.
     *
     * @param adminUsername the adminUsername value to set
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the administrator password to use for Windows VMs.
     *
     * @return the adminPassword value
     */
    public String adminPassword() {
        return this.adminPassword;
    }

    /**
     * Set the administrator password to use for Windows VMs.
     *
     * @param adminPassword the adminPassword value to set
     * @return the ManagedClusterWindowsProfile object itself.
     */
    public ManagedClusterWindowsProfile withAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

}
