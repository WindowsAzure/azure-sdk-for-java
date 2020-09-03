// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent.inner;

import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.trafficmanager.models.DnsConfig;
import com.azure.resourcemanager.trafficmanager.models.MonitorConfig;
import com.azure.resourcemanager.trafficmanager.models.ProfileStatus;
import com.azure.resourcemanager.trafficmanager.models.TrafficRoutingMethod;
import com.azure.resourcemanager.trafficmanager.models.TrafficViewEnrollmentStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The Profile model. */
@JsonFlatten
public class ProfileInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProfileInner.class);

    /*
     * The status of the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.profileStatus")
    private ProfileStatus profileStatus;

    /*
     * The traffic routing method of the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.trafficRoutingMethod")
    private TrafficRoutingMethod trafficRoutingMethod;

    /*
     * The DNS settings of the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.dnsConfig")
    private DnsConfig dnsConfig;

    /*
     * The endpoint monitoring settings of the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.monitorConfig")
    private MonitorConfig monitorConfig;

    /*
     * The list of endpoints in the Traffic Manager profile.
     */
    @JsonProperty(value = "properties.endpoints")
    private List<EndpointInner> endpoints;

    /*
     * Indicates whether Traffic View is 'Enabled' or 'Disabled' for the
     * Traffic Manager profile. Null, indicates 'Disabled'. Enabling this
     * feature will increase the cost of the Traffic Manage profile.
     */
    @JsonProperty(value = "properties.trafficViewEnrollmentStatus")
    private TrafficViewEnrollmentStatus trafficViewEnrollmentStatus;

    /*
     * Maximum number of endpoints to be returned for MultiValue routing type.
     */
    @JsonProperty(value = "properties.maxReturn")
    private Long maxReturn;

    /**
     * Get the profileStatus property: The status of the Traffic Manager profile.
     *
     * @return the profileStatus value.
     */
    public ProfileStatus profileStatus() {
        return this.profileStatus;
    }

    /**
     * Set the profileStatus property: The status of the Traffic Manager profile.
     *
     * @param profileStatus the profileStatus value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withProfileStatus(ProfileStatus profileStatus) {
        this.profileStatus = profileStatus;
        return this;
    }

    /**
     * Get the trafficRoutingMethod property: The traffic routing method of the Traffic Manager profile.
     *
     * @return the trafficRoutingMethod value.
     */
    public TrafficRoutingMethod trafficRoutingMethod() {
        return this.trafficRoutingMethod;
    }

    /**
     * Set the trafficRoutingMethod property: The traffic routing method of the Traffic Manager profile.
     *
     * @param trafficRoutingMethod the trafficRoutingMethod value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withTrafficRoutingMethod(TrafficRoutingMethod trafficRoutingMethod) {
        this.trafficRoutingMethod = trafficRoutingMethod;
        return this;
    }

    /**
     * Get the dnsConfig property: The DNS settings of the Traffic Manager profile.
     *
     * @return the dnsConfig value.
     */
    public DnsConfig dnsConfig() {
        return this.dnsConfig;
    }

    /**
     * Set the dnsConfig property: The DNS settings of the Traffic Manager profile.
     *
     * @param dnsConfig the dnsConfig value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withDnsConfig(DnsConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
        return this;
    }

    /**
     * Get the monitorConfig property: The endpoint monitoring settings of the Traffic Manager profile.
     *
     * @return the monitorConfig value.
     */
    public MonitorConfig monitorConfig() {
        return this.monitorConfig;
    }

    /**
     * Set the monitorConfig property: The endpoint monitoring settings of the Traffic Manager profile.
     *
     * @param monitorConfig the monitorConfig value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withMonitorConfig(MonitorConfig monitorConfig) {
        this.monitorConfig = monitorConfig;
        return this;
    }

    /**
     * Get the endpoints property: The list of endpoints in the Traffic Manager profile.
     *
     * @return the endpoints value.
     */
    public List<EndpointInner> endpoints() {
        return this.endpoints;
    }

    /**
     * Set the endpoints property: The list of endpoints in the Traffic Manager profile.
     *
     * @param endpoints the endpoints value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withEndpoints(List<EndpointInner> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    /**
     * Get the trafficViewEnrollmentStatus property: Indicates whether Traffic View is 'Enabled' or 'Disabled' for the
     * Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic
     * Manage profile.
     *
     * @return the trafficViewEnrollmentStatus value.
     */
    public TrafficViewEnrollmentStatus trafficViewEnrollmentStatus() {
        return this.trafficViewEnrollmentStatus;
    }

    /**
     * Set the trafficViewEnrollmentStatus property: Indicates whether Traffic View is 'Enabled' or 'Disabled' for the
     * Traffic Manager profile. Null, indicates 'Disabled'. Enabling this feature will increase the cost of the Traffic
     * Manage profile.
     *
     * @param trafficViewEnrollmentStatus the trafficViewEnrollmentStatus value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withTrafficViewEnrollmentStatus(TrafficViewEnrollmentStatus trafficViewEnrollmentStatus) {
        this.trafficViewEnrollmentStatus = trafficViewEnrollmentStatus;
        return this;
    }

    /**
     * Get the maxReturn property: Maximum number of endpoints to be returned for MultiValue routing type.
     *
     * @return the maxReturn value.
     */
    public Long maxReturn() {
        return this.maxReturn;
    }

    /**
     * Set the maxReturn property: Maximum number of endpoints to be returned for MultiValue routing type.
     *
     * @param maxReturn the maxReturn value to set.
     * @return the ProfileInner object itself.
     */
    public ProfileInner withMaxReturn(Long maxReturn) {
        this.maxReturn = maxReturn;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (dnsConfig() != null) {
            dnsConfig().validate();
        }
        if (monitorConfig() != null) {
            monitorConfig().validate();
        }
        if (endpoints() != null) {
            endpoints().forEach(e -> e.validate());
        }
    }
}
