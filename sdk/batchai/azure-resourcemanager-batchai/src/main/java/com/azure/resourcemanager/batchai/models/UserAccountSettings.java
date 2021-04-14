// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Settings for user account that gets created on each on the nodes of a cluster. */
@Fluent
public final class UserAccountSettings {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAccountSettings.class);

    /*
     * Name of the administrator user account which can be used to SSH to
     * nodes.
     */
    @JsonProperty(value = "adminUserName", required = true)
    private String adminUsername;

    /*
     * SSH public key of the administrator user account.
     */
    @JsonProperty(value = "adminUserSshPublicKey")
    private String adminUserSshPublicKey;

    /*
     * Password of the administrator user account.
     */
    @JsonProperty(value = "adminUserPassword")
    private String adminUserPassword;

    /**
     * Get the adminUsername property: Name of the administrator user account which can be used to SSH to nodes.
     *
     * @return the adminUsername value.
     */
    public String adminUsername() {
        return this.adminUsername;
    }

    /**
     * Set the adminUsername property: Name of the administrator user account which can be used to SSH to nodes.
     *
     * @param adminUsername the adminUsername value to set.
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * Get the adminUserSshPublicKey property: SSH public key of the administrator user account.
     *
     * @return the adminUserSshPublicKey value.
     */
    public String adminUserSshPublicKey() {
        return this.adminUserSshPublicKey;
    }

    /**
     * Set the adminUserSshPublicKey property: SSH public key of the administrator user account.
     *
     * @param adminUserSshPublicKey the adminUserSshPublicKey value to set.
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUserSshPublicKey(String adminUserSshPublicKey) {
        this.adminUserSshPublicKey = adminUserSshPublicKey;
        return this;
    }

    /**
     * Get the adminUserPassword property: Password of the administrator user account.
     *
     * @return the adminUserPassword value.
     */
    public String adminUserPassword() {
        return this.adminUserPassword;
    }

    /**
     * Set the adminUserPassword property: Password of the administrator user account.
     *
     * @param adminUserPassword the adminUserPassword value to set.
     * @return the UserAccountSettings object itself.
     */
    public UserAccountSettings withAdminUserPassword(String adminUserPassword) {
        this.adminUserPassword = adminUserPassword;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (adminUsername() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property adminUsername in model UserAccountSettings"));
        }
    }
}
