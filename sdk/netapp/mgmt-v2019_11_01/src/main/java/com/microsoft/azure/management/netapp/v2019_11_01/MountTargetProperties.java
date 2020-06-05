/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Mount target properties.
 */
public class MountTargetProperties {
    /**
     * mountTargetId.
     * UUID v4 used to identify the MountTarget.
     */
    @JsonProperty(value = "mountTargetId", access = JsonProperty.Access.WRITE_ONLY)
    private String mountTargetId;

    /**
     * fileSystemId.
     * UUID v4 used to identify the MountTarget.
     */
    @JsonProperty(value = "fileSystemId", required = true)
    private String fileSystemId;

    /**
     * ipAddress.
     * The mount target's IPv4 address.
     */
    @JsonProperty(value = "ipAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String ipAddress;

    /**
     * subnet.
     * The subnet.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * startIp.
     * The start of IPv4 address range to use when creating a new mount target.
     */
    @JsonProperty(value = "startIp")
    private String startIp;

    /**
     * endIp.
     * The end of IPv4 address range to use when creating a new mount target.
     */
    @JsonProperty(value = "endIp")
    private String endIp;

    /**
     * gateway.
     * The gateway of the IPv4 address range to use when creating a new mount
     * target.
     */
    @JsonProperty(value = "gateway")
    private String gateway;

    /**
     * netmask.
     * The netmask of the IPv4 address range to use when creating a new mount
     * target.
     */
    @JsonProperty(value = "netmask")
    private String netmask;

    /**
     * smbServerFQDN.
     * The SMB server's Fully Qualified Domain Name, FQDN.
     */
    @JsonProperty(value = "smbServerFqdn")
    private String smbServerFqdn;

    /**
     * Get uUID v4 used to identify the MountTarget.
     *
     * @return the mountTargetId value
     */
    public String mountTargetId() {
        return this.mountTargetId;
    }

    /**
     * Get uUID v4 used to identify the MountTarget.
     *
     * @return the fileSystemId value
     */
    public String fileSystemId() {
        return this.fileSystemId;
    }

    /**
     * Set uUID v4 used to identify the MountTarget.
     *
     * @param fileSystemId the fileSystemId value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }

    /**
     * Get the mount target's IPv4 address.
     *
     * @return the ipAddress value
     */
    public String ipAddress() {
        return this.ipAddress;
    }

    /**
     * Get the subnet.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet.
     *
     * @param subnet the subnet value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

    /**
     * Get the start of IPv4 address range to use when creating a new mount target.
     *
     * @return the startIp value
     */
    public String startIp() {
        return this.startIp;
    }

    /**
     * Set the start of IPv4 address range to use when creating a new mount target.
     *
     * @param startIp the startIp value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withStartIp(String startIp) {
        this.startIp = startIp;
        return this;
    }

    /**
     * Get the end of IPv4 address range to use when creating a new mount target.
     *
     * @return the endIp value
     */
    public String endIp() {
        return this.endIp;
    }

    /**
     * Set the end of IPv4 address range to use when creating a new mount target.
     *
     * @param endIp the endIp value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withEndIp(String endIp) {
        this.endIp = endIp;
        return this;
    }

    /**
     * Get the gateway of the IPv4 address range to use when creating a new mount target.
     *
     * @return the gateway value
     */
    public String gateway() {
        return this.gateway;
    }

    /**
     * Set the gateway of the IPv4 address range to use when creating a new mount target.
     *
     * @param gateway the gateway value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    /**
     * Get the netmask of the IPv4 address range to use when creating a new mount target.
     *
     * @return the netmask value
     */
    public String netmask() {
        return this.netmask;
    }

    /**
     * Set the netmask of the IPv4 address range to use when creating a new mount target.
     *
     * @param netmask the netmask value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withNetmask(String netmask) {
        this.netmask = netmask;
        return this;
    }

    /**
     * Get the SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @return the smbServerFqdn value
     */
    public String smbServerFqdn() {
        return this.smbServerFqdn;
    }

    /**
     * Set the SMB server's Fully Qualified Domain Name, FQDN.
     *
     * @param smbServerFqdn the smbServerFqdn value to set
     * @return the MountTargetProperties object itself.
     */
    public MountTargetProperties withSmbServerFqdn(String smbServerFqdn) {
        this.smbServerFqdn = smbServerFqdn;
        return this;
    }

}
