/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mysql.v2017_12_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties used to create a new server.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "createMode")
@JsonTypeName("Default")
public class ServerPropertiesForDefaultCreate extends ServerPropertiesForCreate {
    /**
     * The administrator's login name of a server. Can only be specified when
     * the server is being created (and is required for creation).
     */
    @JsonProperty(value = "administratorLogin", required = true)
    private String administratorLogin;

    /**
     * The password of the administrator login.
     */
    @JsonProperty(value = "administratorLoginPassword", required = true)
    private String administratorLoginPassword;

    /**
     * Get the administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     *
     * @return the administratorLogin value
     */
    public String administratorLogin() {
        return this.administratorLogin;
    }

    /**
     * Set the administrator's login name of a server. Can only be specified when the server is being created (and is required for creation).
     *
     * @param administratorLogin the administratorLogin value to set
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLogin(String administratorLogin) {
        this.administratorLogin = administratorLogin;
        return this;
    }

    /**
     * Get the password of the administrator login.
     *
     * @return the administratorLoginPassword value
     */
    public String administratorLoginPassword() {
        return this.administratorLoginPassword;
    }

    /**
     * Set the password of the administrator login.
     *
     * @param administratorLoginPassword the administratorLoginPassword value to set
     * @return the ServerPropertiesForDefaultCreate object itself.
     */
    public ServerPropertiesForDefaultCreate withAdministratorLoginPassword(String administratorLoginPassword) {
        this.administratorLoginPassword = administratorLoginPassword;
        return this;
    }

}
