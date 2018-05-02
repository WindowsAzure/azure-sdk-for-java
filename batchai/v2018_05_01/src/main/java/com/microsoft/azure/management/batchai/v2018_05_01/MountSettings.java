/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of the File Server.
 */
public class MountSettings {
    /**
     * Path where the NFS is mounted on the Server.
     */
    @JsonProperty(value = "mountPoint")
    private String mountPoint;

    /**
     * Public IP of the File Server VM.
     */
    @JsonProperty(value = "fileServerPublicIP")
    private String fileServerPublicIP;

    /**
     * Internal subnet IP which can be used to access the file Server from
     * within the subnet.
     */
    @JsonProperty(value = "fileServerInternalIP")
    private String fileServerInternalIP;

    /**
     * Get the mountPoint value.
     *
     * @return the mountPoint value
     */
    public String mountPoint() {
        return this.mountPoint;
    }

    /**
     * Set the mountPoint value.
     *
     * @param mountPoint the mountPoint value to set
     * @return the MountSettings object itself.
     */
    public MountSettings withMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }

    /**
     * Get the fileServerPublicIP value.
     *
     * @return the fileServerPublicIP value
     */
    public String fileServerPublicIP() {
        return this.fileServerPublicIP;
    }

    /**
     * Set the fileServerPublicIP value.
     *
     * @param fileServerPublicIP the fileServerPublicIP value to set
     * @return the MountSettings object itself.
     */
    public MountSettings withFileServerPublicIP(String fileServerPublicIP) {
        this.fileServerPublicIP = fileServerPublicIP;
        return this;
    }

    /**
     * Get the fileServerInternalIP value.
     *
     * @return the fileServerInternalIP value
     */
    public String fileServerInternalIP() {
        return this.fileServerInternalIP;
    }

    /**
     * Set the fileServerInternalIP value.
     *
     * @param fileServerInternalIP the fileServerInternalIP value to set
     * @return the MountSettings object itself.
     */
    public MountSettings withFileServerInternalIP(String fileServerInternalIP) {
        this.fileServerInternalIP = fileServerInternalIP;
        return this;
    }

}
