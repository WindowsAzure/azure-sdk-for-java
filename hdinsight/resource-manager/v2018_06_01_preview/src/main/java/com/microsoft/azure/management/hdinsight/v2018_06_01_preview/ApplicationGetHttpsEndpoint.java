/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Gets the application HTTP endpoints.
 */
public class ApplicationGetHttpsEndpoint {
    /**
     * The list of access modes for the application.
     */
    @JsonProperty(value = "accessModes")
    private List<String> accessModes;

    /**
     * The location of the endpoint.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * The destination port to connect to.
     */
    @JsonProperty(value = "destinationPort")
    private Integer destinationPort;

    /**
     * The public port to connect to.
     */
    @JsonProperty(value = "publicPort")
    private Integer publicPort;

    /**
     * Get the list of access modes for the application.
     *
     * @return the accessModes value
     */
    public List<String> accessModes() {
        return this.accessModes;
    }

    /**
     * Set the list of access modes for the application.
     *
     * @param accessModes the accessModes value to set
     * @return the ApplicationGetHttpsEndpoint object itself.
     */
    public ApplicationGetHttpsEndpoint withAccessModes(List<String> accessModes) {
        this.accessModes = accessModes;
        return this;
    }

    /**
     * Get the location of the endpoint.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location of the endpoint.
     *
     * @param location the location value to set
     * @return the ApplicationGetHttpsEndpoint object itself.
     */
    public ApplicationGetHttpsEndpoint withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the destination port to connect to.
     *
     * @return the destinationPort value
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }

    /**
     * Set the destination port to connect to.
     *
     * @param destinationPort the destinationPort value to set
     * @return the ApplicationGetHttpsEndpoint object itself.
     */
    public ApplicationGetHttpsEndpoint withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * Get the public port to connect to.
     *
     * @return the publicPort value
     */
    public Integer publicPort() {
        return this.publicPort;
    }

    /**
     * Set the public port to connect to.
     *
     * @param publicPort the publicPort value to set
     * @return the ApplicationGetHttpsEndpoint object itself.
     */
    public ApplicationGetHttpsEndpoint withPublicPort(Integer publicPort) {
        this.publicPort = publicPort;
        return this;
    }

}
