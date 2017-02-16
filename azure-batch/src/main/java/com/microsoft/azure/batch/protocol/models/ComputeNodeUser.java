/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An user account on a compute node.
 */
public class ComputeNodeUser {
    /**
     * The user name of the account.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Whether the account should be an administrator on the compute node.
     * The default value is false.
     */
    @JsonProperty(value = "isAdmin")
    private Boolean isAdmin;

    /**
     * The time at which the account should expire.
     * If omitted, the default is 1 day from the current time. For Linux
     * compute nodes, the expiryTime has a precision up to a day.
     */
    @JsonProperty(value = "expiryTime")
    private DateTime expiryTime;

    /**
     * The password of the account.
     * The password is required for Windows nodes (those created with
     * 'cloudServiceConfiguration', or created with
     * 'virtualMachineConfiguration' using a Windows image reference). For
     * Linux compute nodes, the password can optionally be specified along with
     * the sshPublicKey property.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * The SSH public key that can be used for remote login to the compute
     * node.
     * The public key should be compatible with OpenSSH encoding and should be
     * base 64 encoded. This property can be specified only for Linux nodes. If
     * this is specified for a Windows node, then the Batch service rejects the
     * request; if you are calling the REST API directly, the HTTP status code
     * is 400 (Bad Request).
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isAdmin value.
     *
     * @return the isAdmin value
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }

    /**
     * Set the isAdmin value.
     *
     * @param isAdmin the isAdmin value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    /**
     * Get the expiryTime value.
     *
     * @return the expiryTime value
     */
    public DateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime value.
     *
     * @param expiryTime the expiryTime value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withExpiryTime(DateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the password value.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password value.
     *
     * @param password the password value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the sshPublicKey value.
     *
     * @return the sshPublicKey value
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set the sshPublicKey value.
     *
     * @param sshPublicKey the sshPublicKey value to set
     * @return the ComputeNodeUser object itself.
     */
    public ComputeNodeUser withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

}
