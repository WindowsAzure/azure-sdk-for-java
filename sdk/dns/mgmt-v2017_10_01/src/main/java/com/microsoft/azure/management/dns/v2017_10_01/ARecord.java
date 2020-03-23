/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2017_10_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An A record.
 */
public class ARecord {
    /**
     * The IPv4 address of this A record.
     */
    @JsonProperty(value = "ipv4Address")
    private String ipv4Address;

    /**
     * Get the IPv4 address of this A record.
     *
     * @return the ipv4Address value
     */
    public String ipv4Address() {
        return this.ipv4Address;
    }

    /**
     * Set the IPv4 address of this A record.
     *
     * @param ipv4Address the ipv4Address value to set
     * @return the ARecord object itself.
     */
    public ARecord withIpv4Address(String ipv4Address) {
        this.ipv4Address = ipv4Address;
        return this;
    }

}
