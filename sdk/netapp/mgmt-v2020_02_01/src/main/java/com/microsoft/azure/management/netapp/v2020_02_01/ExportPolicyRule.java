/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Volume Export Policy Rule.
 */
public class ExportPolicyRule {
    /**
     * Order index.
     */
    @JsonProperty(value = "ruleIndex")
    private Integer ruleIndex;

    /**
     * Read only access.
     */
    @JsonProperty(value = "unixReadOnly")
    private Boolean unixReadOnly;

    /**
     * Read and write access.
     */
    @JsonProperty(value = "unixReadWrite")
    private Boolean unixReadWrite;

    /**
     * Allows CIFS protocol.
     */
    @JsonProperty(value = "cifs")
    private Boolean cifs;

    /**
     * Allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     */
    @JsonProperty(value = "nfsv3")
    private Boolean nfsv3;

    /**
     * Allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     */
    @JsonProperty(value = "nfsv41")
    private Boolean nfsv41;

    /**
     * Client ingress specification as comma separated string with IPv4 CIDRs,
     * IPv4 host addresses and host names.
     */
    @JsonProperty(value = "allowedClients")
    private String allowedClients;

    /**
     * Get order index.
     *
     * @return the ruleIndex value
     */
    public Integer ruleIndex() {
        return this.ruleIndex;
    }

    /**
     * Set order index.
     *
     * @param ruleIndex the ruleIndex value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withRuleIndex(Integer ruleIndex) {
        this.ruleIndex = ruleIndex;
        return this;
    }

    /**
     * Get read only access.
     *
     * @return the unixReadOnly value
     */
    public Boolean unixReadOnly() {
        return this.unixReadOnly;
    }

    /**
     * Set read only access.
     *
     * @param unixReadOnly the unixReadOnly value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadOnly(Boolean unixReadOnly) {
        this.unixReadOnly = unixReadOnly;
        return this;
    }

    /**
     * Get read and write access.
     *
     * @return the unixReadWrite value
     */
    public Boolean unixReadWrite() {
        return this.unixReadWrite;
    }

    /**
     * Set read and write access.
     *
     * @param unixReadWrite the unixReadWrite value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withUnixReadWrite(Boolean unixReadWrite) {
        this.unixReadWrite = unixReadWrite;
        return this;
    }

    /**
     * Get allows CIFS protocol.
     *
     * @return the cifs value
     */
    public Boolean cifs() {
        return this.cifs;
    }

    /**
     * Set allows CIFS protocol.
     *
     * @param cifs the cifs value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withCifs(Boolean cifs) {
        this.cifs = cifs;
        return this;
    }

    /**
     * Get allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @return the nfsv3 value
     */
    public Boolean nfsv3() {
        return this.nfsv3;
    }

    /**
     * Set allows NFSv3 protocol. Enable only for NFSv3 type volumes.
     *
     * @param nfsv3 the nfsv3 value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv3(Boolean nfsv3) {
        this.nfsv3 = nfsv3;
        return this;
    }

    /**
     * Get allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @return the nfsv41 value
     */
    public Boolean nfsv41() {
        return this.nfsv41;
    }

    /**
     * Set allows NFSv4.1 protocol. Enable only for NFSv4.1 type volumes.
     *
     * @param nfsv41 the nfsv41 value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withNfsv41(Boolean nfsv41) {
        this.nfsv41 = nfsv41;
        return this;
    }

    /**
     * Get client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names.
     *
     * @return the allowedClients value
     */
    public String allowedClients() {
        return this.allowedClients;
    }

    /**
     * Set client ingress specification as comma separated string with IPv4 CIDRs, IPv4 host addresses and host names.
     *
     * @param allowedClients the allowedClients value to set
     * @return the ExportPolicyRule object itself.
     */
    public ExportPolicyRule withAllowedClients(String allowedClients) {
        this.allowedClients = allowedClients;
        return this;
    }

}
