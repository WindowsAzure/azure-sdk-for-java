/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Specifies the operating system settings for the HANA instance.
 */
public class OSProfile {
    /**
     * Specifies the host OS name of the HANA instance.
     */
    @JsonProperty(value = "computerName")
    private String computerName;

    /**
     * This property allows you to specify the type of the OS.
     */
    @JsonProperty(value = "osType", access = JsonProperty.Access.WRITE_ONLY)
    private String osType;

    /**
     * Specifies version of operating system.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Specifies the SSH public key used to access the operating system.
     */
    @JsonProperty(value = "sshPublicKey")
    private String sshPublicKey;

    /**
     * Get specifies the host OS name of the HANA instance.
     *
     * @return the computerName value
     */
    public String computerName() {
        return this.computerName;
    }

    /**
     * Set specifies the host OS name of the HANA instance.
     *
     * @param computerName the computerName value to set
     * @return the OSProfile object itself.
     */
    public OSProfile withComputerName(String computerName) {
        this.computerName = computerName;
        return this;
    }

    /**
     * Get this property allows you to specify the type of the OS.
     *
     * @return the osType value
     */
    public String osType() {
        return this.osType;
    }

    /**
     * Get specifies version of operating system.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

    /**
     * Get specifies the SSH public key used to access the operating system.
     *
     * @return the sshPublicKey value
     */
    public String sshPublicKey() {
        return this.sshPublicKey;
    }

    /**
     * Set specifies the SSH public key used to access the operating system.
     *
     * @param sshPublicKey the sshPublicKey value to set
     * @return the OSProfile object itself.
     */
    public OSProfile withSshPublicKey(String sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

}
