/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2015_10_01_preview.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data Lake Store firewall rule properties information.
 */
public class FirewallRuleProperties {
    /**
     * the start IP address for the firewall rule.
     */
    @JsonProperty(value = "startIpAddress")
    private String startIpAddress;

    /**
     * the end IP address for the firewall rule.
     */
    @JsonProperty(value = "endIpAddress")
    private String endIpAddress;

    /**
     * Get the start IP address for the firewall rule.
     *
     * @return the startIpAddress value
     */
    public String startIpAddress() {
        return this.startIpAddress;
    }

    /**
     * Set the start IP address for the firewall rule.
     *
     * @param startIpAddress the startIpAddress value to set
     * @return the FirewallRuleProperties object itself.
     */
    public FirewallRuleProperties withStartIpAddress(String startIpAddress) {
        this.startIpAddress = startIpAddress;
        return this;
    }

    /**
     * Get the end IP address for the firewall rule.
     *
     * @return the endIpAddress value
     */
    public String endIpAddress() {
        return this.endIpAddress;
    }

    /**
     * Set the end IP address for the firewall rule.
     *
     * @param endIpAddress the endIpAddress value to set
     * @return the FirewallRuleProperties object itself.
     */
    public FirewallRuleProperties withEndIpAddress(String endIpAddress) {
        this.endIpAddress = endIpAddress;
        return this;
    }

}
