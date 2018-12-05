/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Image registry credential.
 */
public class ImageRegistryCredential {
    /**
     * Docker image registry server, without protocol such as `http` and
     * `https`.
     */
    @JsonProperty(value = "server", required = true)
    private String server;

    /**
     * The username for the private registry.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /**
     * The password for the private registry. The password is required for
     * create or update operations, however it is not returned in the get or
     * list operations.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Get docker image registry server, without protocol such as `http` and `https`.
     *
     * @return the server value
     */
    public String server() {
        return this.server;
    }

    /**
     * Set docker image registry server, without protocol such as `http` and `https`.
     *
     * @param server the server value to set
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withServer(String server) {
        this.server = server;
        return this;
    }

    /**
     * Get the username for the private registry.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the username for the private registry.
     *
     * @param username the username value to set
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password for the private registry. The password is required for create or update operations, however it is not returned in the get or list operations.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password for the private registry. The password is required for create or update operations, however it is not returned in the get or list operations.
     *
     * @param password the password value to set
     * @return the ImageRegistryCredential object itself.
     */
    public ImageRegistryCredential withPassword(String password) {
        this.password = password;
        return this;
    }

}
