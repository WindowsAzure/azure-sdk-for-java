/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains bgp community information offered in Service Community resources.
 */
public class BGPCommunity {
    /**
     * The region which the service support. e.g. For O365, region is Global.
     */
    @JsonProperty(value = "region")
    private String region;

    /**
     * The name of the bgp community. e.g. Skype.
     */
    @JsonProperty(value = "communityName")
    private String communityName;

    /**
     * The value of the bgp community. For more information:
     * https://docs.microsoft.com/en-us/azure/expressroute/expressroute-routing.
     */
    @JsonProperty(value = "communityValue")
    private String communityValue;

    /**
     * The prefixes that the bgp community contains.
     */
    @JsonProperty(value = "communityPrefixes")
    private List<String> communityPrefixes;

    /**
     * Get the region value.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Set the region value.
     *
     * @param region the region value to set
     * @return the BGPCommunity object itself.
     */
    public BGPCommunity withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * Get the communityName value.
     *
     * @return the communityName value
     */
    public String communityName() {
        return this.communityName;
    }

    /**
     * Set the communityName value.
     *
     * @param communityName the communityName value to set
     * @return the BGPCommunity object itself.
     */
    public BGPCommunity withCommunityName(String communityName) {
        this.communityName = communityName;
        return this;
    }

    /**
     * Get the communityValue value.
     *
     * @return the communityValue value
     */
    public String communityValue() {
        return this.communityValue;
    }

    /**
     * Set the communityValue value.
     *
     * @param communityValue the communityValue value to set
     * @return the BGPCommunity object itself.
     */
    public BGPCommunity withCommunityValue(String communityValue) {
        this.communityValue = communityValue;
        return this;
    }

    /**
     * Get the communityPrefixes value.
     *
     * @return the communityPrefixes value
     */
    public List<String> communityPrefixes() {
        return this.communityPrefixes;
    }

    /**
     * Set the communityPrefixes value.
     *
     * @param communityPrefixes the communityPrefixes value to set
     * @return the BGPCommunity object itself.
     */
    public BGPCommunity withCommunityPrefixes(List<String> communityPrefixes) {
        this.communityPrefixes = communityPrefixes;
        return this;
    }

}
