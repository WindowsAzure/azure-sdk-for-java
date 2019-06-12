/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of the service tag information.
 */
public class ServiceTagInformationPropertiesFormat {
    /**
     * The iteration number of service tag.
     */
    @JsonProperty(value = "changeNumber", access = JsonProperty.Access.WRITE_ONLY)
    private String changeNumber;

    /**
     * The region of service tag.
     */
    @JsonProperty(value = "region", access = JsonProperty.Access.WRITE_ONLY)
    private String region;

    /**
     * The name of system service.
     */
    @JsonProperty(value = "systemService", access = JsonProperty.Access.WRITE_ONLY)
    private String systemService;

    /**
     * The list of IP address prefixes.
     */
    @JsonProperty(value = "addressPrefixes", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> addressPrefixes;

    /**
     * Get the iteration number of service tag.
     *
     * @return the changeNumber value
     */
    public String changeNumber() {
        return this.changeNumber;
    }

    /**
     * Get the region of service tag.
     *
     * @return the region value
     */
    public String region() {
        return this.region;
    }

    /**
     * Get the name of system service.
     *
     * @return the systemService value
     */
    public String systemService() {
        return this.systemService;
    }

    /**
     * Get the list of IP address prefixes.
     *
     * @return the addressPrefixes value
     */
    public List<String> addressPrefixes() {
        return this.addressPrefixes;
    }

}
