/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2020_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The mapping between a particular client IP and the type of access client has
 * on the NFS share.
 */
public class ClientAccessRight {
    /**
     * IP of the client.
     */
    @JsonProperty(value = "client", required = true)
    private String client;

    /**
     * Type of access to be allowed for the client. Possible values include:
     * 'NoAccess', 'ReadOnly', 'ReadWrite'.
     */
    @JsonProperty(value = "accessPermission", required = true)
    private ClientPermissionType accessPermission;

    /**
     * Get iP of the client.
     *
     * @return the client value
     */
    public String client() {
        return this.client;
    }

    /**
     * Set iP of the client.
     *
     * @param client the client value to set
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withClient(String client) {
        this.client = client;
        return this;
    }

    /**
     * Get type of access to be allowed for the client. Possible values include: 'NoAccess', 'ReadOnly', 'ReadWrite'.
     *
     * @return the accessPermission value
     */
    public ClientPermissionType accessPermission() {
        return this.accessPermission;
    }

    /**
     * Set type of access to be allowed for the client. Possible values include: 'NoAccess', 'ReadOnly', 'ReadWrite'.
     *
     * @param accessPermission the accessPermission value to set
     * @return the ClientAccessRight object itself.
     */
    public ClientAccessRight withAccessPermission(ClientPermissionType accessPermission) {
        this.accessPermission = accessPermission;
        return this;
    }

}
