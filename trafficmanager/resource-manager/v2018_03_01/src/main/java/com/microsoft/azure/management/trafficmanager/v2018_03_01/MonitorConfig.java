/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.trafficmanager.v2018_03_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class containing endpoint monitoring settings in a Traffic Manager profile.
 */
public class MonitorConfig {
    /**
     * The profile-level monitoring status of the Traffic Manager profile.
     * Possible values include: 'CheckingEndpoints', 'Online', 'Degraded',
     * 'Disabled', 'Inactive'.
     */
    @JsonProperty(value = "profileMonitorStatus")
    private ProfileMonitorStatus profileMonitorStatus;

    /**
     * The protocol (HTTP, HTTPS or TCP) used to probe for endpoint health.
     * Possible values include: 'HTTP', 'HTTPS', 'TCP'.
     */
    @JsonProperty(value = "protocol")
    private MonitorProtocol protocol;

    /**
     * The TCP port used to probe for endpoint health.
     */
    @JsonProperty(value = "port")
    private Long port;

    /**
     * The path relative to the endpoint domain name used to probe for endpoint
     * health.
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * The monitor interval for endpoints in this profile. This is the interval
     * at which Traffic Manager will check the health of each endpoint in this
     * profile.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Long intervalInSeconds;

    /**
     * The monitor timeout for endpoints in this profile. This is the time that
     * Traffic Manager allows endpoints in this profile to response to the
     * health check.
     */
    @JsonProperty(value = "timeoutInSeconds")
    private Long timeoutInSeconds;

    /**
     * The number of consecutive failed health check that Traffic Manager
     * tolerates before declaring an endpoint in this profile Degraded after
     * the next failed health check.
     */
    @JsonProperty(value = "toleratedNumberOfFailures")
    private Long toleratedNumberOfFailures;

    /**
     * List of custom headers.
     */
    @JsonProperty(value = "customHeaders")
    private List<MonitorConfigCustomHeadersItem> customHeaders;

    /**
     * List of expected status code ranges.
     */
    @JsonProperty(value = "expectedStatusCodeRanges")
    private List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges;

    /**
     * Get the profile-level monitoring status of the Traffic Manager profile. Possible values include: 'CheckingEndpoints', 'Online', 'Degraded', 'Disabled', 'Inactive'.
     *
     * @return the profileMonitorStatus value
     */
    public ProfileMonitorStatus profileMonitorStatus() {
        return this.profileMonitorStatus;
    }

    /**
     * Set the profile-level monitoring status of the Traffic Manager profile. Possible values include: 'CheckingEndpoints', 'Online', 'Degraded', 'Disabled', 'Inactive'.
     *
     * @param profileMonitorStatus the profileMonitorStatus value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProfileMonitorStatus(ProfileMonitorStatus profileMonitorStatus) {
        this.profileMonitorStatus = profileMonitorStatus;
        return this;
    }

    /**
     * Get the protocol (HTTP, HTTPS or TCP) used to probe for endpoint health. Possible values include: 'HTTP', 'HTTPS', 'TCP'.
     *
     * @return the protocol value
     */
    public MonitorProtocol protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol (HTTP, HTTPS or TCP) used to probe for endpoint health. Possible values include: 'HTTP', 'HTTPS', 'TCP'.
     *
     * @param protocol the protocol value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withProtocol(MonitorProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the TCP port used to probe for endpoint health.
     *
     * @return the port value
     */
    public Long port() {
        return this.port;
    }

    /**
     * Set the TCP port used to probe for endpoint health.
     *
     * @param port the port value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPort(Long port) {
        this.port = port;
        return this;
    }

    /**
     * Get the path relative to the endpoint domain name used to probe for endpoint health.
     *
     * @return the path value
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path relative to the endpoint domain name used to probe for endpoint health.
     *
     * @param path the path value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     *
     * @return the intervalInSeconds value
     */
    public Long intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the monitor interval for endpoints in this profile. This is the interval at which Traffic Manager will check the health of each endpoint in this profile.
     *
     * @param intervalInSeconds the intervalInSeconds value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withIntervalInSeconds(Long intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
        return this;
    }

    /**
     * Get the monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     *
     * @return the timeoutInSeconds value
     */
    public Long timeoutInSeconds() {
        return this.timeoutInSeconds;
    }

    /**
     * Set the monitor timeout for endpoints in this profile. This is the time that Traffic Manager allows endpoints in this profile to response to the health check.
     *
     * @param timeoutInSeconds the timeoutInSeconds value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withTimeoutInSeconds(Long timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * Get the number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     *
     * @return the toleratedNumberOfFailures value
     */
    public Long toleratedNumberOfFailures() {
        return this.toleratedNumberOfFailures;
    }

    /**
     * Set the number of consecutive failed health check that Traffic Manager tolerates before declaring an endpoint in this profile Degraded after the next failed health check.
     *
     * @param toleratedNumberOfFailures the toleratedNumberOfFailures value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withToleratedNumberOfFailures(Long toleratedNumberOfFailures) {
        this.toleratedNumberOfFailures = toleratedNumberOfFailures;
        return this;
    }

    /**
     * Get list of custom headers.
     *
     * @return the customHeaders value
     */
    public List<MonitorConfigCustomHeadersItem> customHeaders() {
        return this.customHeaders;
    }

    /**
     * Set list of custom headers.
     *
     * @param customHeaders the customHeaders value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withCustomHeaders(List<MonitorConfigCustomHeadersItem> customHeaders) {
        this.customHeaders = customHeaders;
        return this;
    }

    /**
     * Get list of expected status code ranges.
     *
     * @return the expectedStatusCodeRanges value
     */
    public List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges() {
        return this.expectedStatusCodeRanges;
    }

    /**
     * Set list of expected status code ranges.
     *
     * @param expectedStatusCodeRanges the expectedStatusCodeRanges value to set
     * @return the MonitorConfig object itself.
     */
    public MonitorConfig withExpectedStatusCodeRanges(List<MonitorConfigExpectedStatusCodeRangesItem> expectedStatusCodeRanges) {
        this.expectedStatusCodeRanges = expectedStatusCodeRanges;
        return this;
    }

}
