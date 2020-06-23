/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Contains the IpTag associated with the object.
 */
public class IpTag {
    /**
     * The IP tag type. Example: FirstPartyUsage.
     */
    @JsonProperty(value = "ipTagType")
    private String ipTagType;

    /**
     * The value of the IP tag associated with the public IP. Example: SQL.
     */
    @JsonProperty(value = "tag")
    private String tag;

    /**
     * Get the IP tag type. Example: FirstPartyUsage.
     *
     * @return the ipTagType value
     */
    public String ipTagType() {
        return this.ipTagType;
    }

    /**
     * Set the IP tag type. Example: FirstPartyUsage.
     *
     * @param ipTagType the ipTagType value to set
     * @return the IpTag object itself.
     */
    public IpTag withIpTagType(String ipTagType) {
        this.ipTagType = ipTagType;
        return this;
    }

    /**
     * Get the value of the IP tag associated with the public IP. Example: SQL.
     *
     * @return the tag value
     */
    public String tag() {
        return this.tag;
    }

    /**
     * Set the value of the IP tag associated with the public IP. Example: SQL.
     *
     * @param tag the tag value to set
     * @return the IpTag object itself.
     */
    public IpTag withTag(String tag) {
        this.tag = tag;
        return this;
    }

}
