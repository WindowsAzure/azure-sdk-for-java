/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Active Directory.
 */
public class ActiveDirectory {
    /**
     * Id of the Active Directory.
     */
    @JsonProperty(value = "activeDirectoryId")
    private String activeDirectoryId;

    /**
     * Username of Active Directory domain administrator.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Plain text password of Active Directory domain administrator.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Name of the Active Directory domain.
     */
    @JsonProperty(value = "domain")
    private String domain;

    /**
     * Comma separated list of DNS server IP addresses for the Active Directory
     * domain.
     */
    @JsonProperty(value = "dns")
    private String dns;

    /**
     * Status of the Active Directory.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * NetBIOS name of the SMB server. This name will be registered as a
     * computer account in the AD and used to mount volumes.
     */
    @JsonProperty(value = "smbServerName")
    private String smbServerName;

    /**
     * The Organizational Unit (OU) within the Windows Active Directory.
     */
    @JsonProperty(value = "organizationalUnit")
    private String organizationalUnit;

    /**
     * Get id of the Active Directory.
     *
     * @return the activeDirectoryId value
     */
    public String activeDirectoryId() {
        return this.activeDirectoryId;
    }

    /**
     * Set id of the Active Directory.
     *
     * @param activeDirectoryId the activeDirectoryId value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withActiveDirectoryId(String activeDirectoryId) {
        this.activeDirectoryId = activeDirectoryId;
        return this;
    }

    /**
     * Get username of Active Directory domain administrator.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set username of Active Directory domain administrator.
     *
     * @param username the username value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get plain text password of Active Directory domain administrator.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set plain text password of Active Directory domain administrator.
     *
     * @param password the password value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get name of the Active Directory domain.
     *
     * @return the domain value
     */
    public String domain() {
        return this.domain;
    }

    /**
     * Set name of the Active Directory domain.
     *
     * @param domain the domain value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get comma separated list of DNS server IP addresses for the Active Directory domain.
     *
     * @return the dns value
     */
    public String dns() {
        return this.dns;
    }

    /**
     * Set comma separated list of DNS server IP addresses for the Active Directory domain.
     *
     * @param dns the dns value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withDns(String dns) {
        this.dns = dns;
        return this;
    }

    /**
     * Get status of the Active Directory.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set status of the Active Directory.
     *
     * @param status the status value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get netBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes.
     *
     * @return the smbServerName value
     */
    public String smbServerName() {
        return this.smbServerName;
    }

    /**
     * Set netBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes.
     *
     * @param smbServerName the smbServerName value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withSmbServerName(String smbServerName) {
        this.smbServerName = smbServerName;
        return this;
    }

    /**
     * Get the Organizational Unit (OU) within the Windows Active Directory.
     *
     * @return the organizationalUnit value
     */
    public String organizationalUnit() {
        return this.organizationalUnit;
    }

    /**
     * Set the Organizational Unit (OU) within the Windows Active Directory.
     *
     * @param organizationalUnit the organizationalUnit value to set
     * @return the ActiveDirectory object itself.
     */
    public ActiveDirectory withOrganizationalUnit(String organizationalUnit) {
        this.organizationalUnit = organizationalUnit;
        return this;
    }

}
