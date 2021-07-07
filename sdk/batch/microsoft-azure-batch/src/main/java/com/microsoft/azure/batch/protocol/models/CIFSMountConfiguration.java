/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.batch.protocol.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information used to connect to a CIFS file system.
 */
public class CIFSMountConfiguration {
    /**
     * The user to use for authentication against the CIFS file system.
     */
    @JsonProperty(value = "username", required = true)
    private String username;

    /**
     * The URI of the file system to mount.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /**
     * The relative path on the compute node where the file system will be
     * mounted. All file systems are mounted relative to the Batch mounts
     * directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment
     * variable.
     */
    @JsonProperty(value = "relativeMountPath", required = true)
    private String relativeMountPath;

    /**
     * Additional command line options to pass to the mount command. These are
     * 'net use' options in Windows and 'mount' options in Linux.
     */
    @JsonProperty(value = "mountOptions")
    private String mountOptions;

    /**
     * The password to use for authentication against the CIFS file system.
     */
    @JsonProperty(value = "password", required = true)
    private String password;

    /**
     * Get the user to use for authentication against the CIFS file system.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set the user to use for authentication against the CIFS file system.
     *
     * @param username the username value to set
     * @return the CIFSMountConfiguration object itself.
     */
    public CIFSMountConfiguration withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get the URI of the file system to mount.
     *
     * @return the source value
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the URI of the file system to mount.
     *
     * @param source the source value to set
     * @return the CIFSMountConfiguration object itself.
     */
    public CIFSMountConfiguration withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the relative path on the compute node where the file system will be mounted. All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @return the relativeMountPath value
     */
    public String relativeMountPath() {
        return this.relativeMountPath;
    }

    /**
     * Set the relative path on the compute node where the file system will be mounted. All file systems are mounted relative to the Batch mounts directory, accessible via the AZ_BATCH_NODE_MOUNTS_DIR environment variable.
     *
     * @param relativeMountPath the relativeMountPath value to set
     * @return the CIFSMountConfiguration object itself.
     */
    public CIFSMountConfiguration withRelativeMountPath(String relativeMountPath) {
        this.relativeMountPath = relativeMountPath;
        return this;
    }

    /**
     * Get additional command line options to pass to the mount command. These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @return the mountOptions value
     */
    public String mountOptions() {
        return this.mountOptions;
    }

    /**
     * Set additional command line options to pass to the mount command. These are 'net use' options in Windows and 'mount' options in Linux.
     *
     * @param mountOptions the mountOptions value to set
     * @return the CIFSMountConfiguration object itself.
     */
    public CIFSMountConfiguration withMountOptions(String mountOptions) {
        this.mountOptions = mountOptions;
        return this;
    }

    /**
     * Get the password to use for authentication against the CIFS file system.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set the password to use for authentication against the CIFS file system.
     *
     * @param password the password value to set
     * @return the CIFSMountConfiguration object itself.
     */
    public CIFSMountConfiguration withPassword(String password) {
        this.password = password;
        return this;
    }

}
