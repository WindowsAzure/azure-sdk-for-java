/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings properties for Active Directory (AD).
 */
public class ActiveDirectoryProperties {
    /**
     * Specifies the primary domain that the AD DNS server is authoritative
     * for.
     */
    @JsonProperty(value = "domainName", required = true)
    private String domainName;

    /**
     * Specifies the NetBIOS domain name.
     */
    @JsonProperty(value = "netBiosDomainName", required = true)
    private String netBiosDomainName;

    /**
     * Specifies the Active Directory forest to get.
     */
    @JsonProperty(value = "forestName", required = true)
    private String forestName;

    /**
     * Specifies the domain GUID.
     */
    @JsonProperty(value = "domainGuid", required = true)
    private String domainGuid;

    /**
     * Specifies the security identifier (SID).
     */
    @JsonProperty(value = "domainSid", required = true)
    private String domainSid;

    /**
     * Specifies the security identifier (SID) for Azure Storage.
     */
    @JsonProperty(value = "azureStorageSid", required = true)
    private String azureStorageSid;

    /**
     * Get specifies the primary domain that the AD DNS server is authoritative for.
     *
     * @return the domainName value
     */
    public String domainName() {
        return this.domainName;
    }

    /**
     * Set specifies the primary domain that the AD DNS server is authoritative for.
     *
     * @param domainName the domainName value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * Get specifies the NetBIOS domain name.
     *
     * @return the netBiosDomainName value
     */
    public String netBiosDomainName() {
        return this.netBiosDomainName;
    }

    /**
     * Set specifies the NetBIOS domain name.
     *
     * @param netBiosDomainName the netBiosDomainName value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withNetBiosDomainName(String netBiosDomainName) {
        this.netBiosDomainName = netBiosDomainName;
        return this;
    }

    /**
     * Get specifies the Active Directory forest to get.
     *
     * @return the forestName value
     */
    public String forestName() {
        return this.forestName;
    }

    /**
     * Set specifies the Active Directory forest to get.
     *
     * @param forestName the forestName value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withForestName(String forestName) {
        this.forestName = forestName;
        return this;
    }

    /**
     * Get specifies the domain GUID.
     *
     * @return the domainGuid value
     */
    public String domainGuid() {
        return this.domainGuid;
    }

    /**
     * Set specifies the domain GUID.
     *
     * @param domainGuid the domainGuid value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainGuid(String domainGuid) {
        this.domainGuid = domainGuid;
        return this;
    }

    /**
     * Get specifies the security identifier (SID).
     *
     * @return the domainSid value
     */
    public String domainSid() {
        return this.domainSid;
    }

    /**
     * Set specifies the security identifier (SID).
     *
     * @param domainSid the domainSid value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withDomainSid(String domainSid) {
        this.domainSid = domainSid;
        return this;
    }

    /**
     * Get specifies the security identifier (SID) for Azure Storage.
     *
     * @return the azureStorageSid value
     */
    public String azureStorageSid() {
        return this.azureStorageSid;
    }

    /**
     * Set specifies the security identifier (SID) for Azure Storage.
     *
     * @param azureStorageSid the azureStorageSid value to set
     * @return the ActiveDirectoryProperties object itself.
     */
    public ActiveDirectoryProperties withAzureStorageSid(String azureStorageSid) {
        this.azureStorageSid = azureStorageSid;
        return this;
    }

}
