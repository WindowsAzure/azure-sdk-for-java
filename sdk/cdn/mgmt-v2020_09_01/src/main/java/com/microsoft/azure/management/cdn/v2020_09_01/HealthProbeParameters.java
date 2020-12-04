/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The JSON object that contains the properties to send health probes to
 * origin.
 */
public class HealthProbeParameters {
    /**
     * The path relative to the origin that is used to determine the health of
     * the origin.
     */
    @JsonProperty(value = "probePath")
    private String probePath;

    /**
     * The type of health probe request that is made. Possible values include:
     * 'NotSet', 'GET', 'HEAD'.
     */
    @JsonProperty(value = "probeRequestType")
    private HealthProbeRequestType probeRequestType;

    /**
     * Protocol to use for health probe. Possible values include: 'NotSet',
     * 'Http', 'Https'.
     */
    @JsonProperty(value = "probeProtocol")
    private ProbeProtocol probeProtocol;

    /**
     * The number of seconds between health probes.Default is 240sec.
     */
    @JsonProperty(value = "probeIntervalInSeconds")
    private Integer probeIntervalInSeconds;

    /**
     * Get the path relative to the origin that is used to determine the health of the origin.
     *
     * @return the probePath value
     */
    public String probePath() {
        return this.probePath;
    }

    /**
     * Set the path relative to the origin that is used to determine the health of the origin.
     *
     * @param probePath the probePath value to set
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbePath(String probePath) {
        this.probePath = probePath;
        return this;
    }

    /**
     * Get the type of health probe request that is made. Possible values include: 'NotSet', 'GET', 'HEAD'.
     *
     * @return the probeRequestType value
     */
    public HealthProbeRequestType probeRequestType() {
        return this.probeRequestType;
    }

    /**
     * Set the type of health probe request that is made. Possible values include: 'NotSet', 'GET', 'HEAD'.
     *
     * @param probeRequestType the probeRequestType value to set
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeRequestType(HealthProbeRequestType probeRequestType) {
        this.probeRequestType = probeRequestType;
        return this;
    }

    /**
     * Get protocol to use for health probe. Possible values include: 'NotSet', 'Http', 'Https'.
     *
     * @return the probeProtocol value
     */
    public ProbeProtocol probeProtocol() {
        return this.probeProtocol;
    }

    /**
     * Set protocol to use for health probe. Possible values include: 'NotSet', 'Http', 'Https'.
     *
     * @param probeProtocol the probeProtocol value to set
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeProtocol(ProbeProtocol probeProtocol) {
        this.probeProtocol = probeProtocol;
        return this;
    }

    /**
     * Get the number of seconds between health probes.Default is 240sec.
     *
     * @return the probeIntervalInSeconds value
     */
    public Integer probeIntervalInSeconds() {
        return this.probeIntervalInSeconds;
    }

    /**
     * Set the number of seconds between health probes.Default is 240sec.
     *
     * @param probeIntervalInSeconds the probeIntervalInSeconds value to set
     * @return the HealthProbeParameters object itself.
     */
    public HealthProbeParameters withProbeIntervalInSeconds(Integer probeIntervalInSeconds) {
        this.probeIntervalInSeconds = probeIntervalInSeconds;
        return this;
    }

}
