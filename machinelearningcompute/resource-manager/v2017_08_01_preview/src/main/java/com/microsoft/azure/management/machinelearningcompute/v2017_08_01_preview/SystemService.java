/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about a system service deployed in the cluster.
 */
public class SystemService {
    /**
     * The system service type. Possible values include: 'None',
     * 'ScoringFrontEnd', 'BatchFrontEnd'.
     */
    @JsonProperty(value = "systemServiceType", required = true)
    private SystemServiceType systemServiceType;

    /**
     * The public IP address of the system service.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /**
     * The state of the system service.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private String version;

    /**
     * Get the system service type. Possible values include: 'None', 'ScoringFrontEnd', 'BatchFrontEnd'.
     *
     * @return the systemServiceType value
     */
    public SystemServiceType systemServiceType() {
        return this.systemServiceType;
    }

    /**
     * Set the system service type. Possible values include: 'None', 'ScoringFrontEnd', 'BatchFrontEnd'.
     *
     * @param systemServiceType the systemServiceType value to set
     * @return the SystemService object itself.
     */
    public SystemService withSystemServiceType(SystemServiceType systemServiceType) {
        this.systemServiceType = systemServiceType;
        return this;
    }

    /**
     * Get the public IP address of the system service.
     *
     * @return the publicIpAddress value
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get the state of the system service.
     *
     * @return the version value
     */
    public String version() {
        return this.version;
    }

}
