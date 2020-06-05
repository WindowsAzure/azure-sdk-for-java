/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings used to provision or configure the resource.
 */
public class SignalRCreateOrUpdateProperties {
    /**
     * Prefix for the hostName of the SignalR service. Retained for future use.
     * The hostname will be of format:
     * &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     */
    @JsonProperty(value = "hostNamePrefix")
    private String hostNamePrefix;

    /**
     * List of SignalR featureFlags. e.g. ServiceMode.
     *
     * FeatureFlags that are not included in the parameters for the update
     * operation will not be modified.
     * And the response will only include featureFlags that are explicitly set.
     * When a featureFlag is not explicitly set, SignalR service will use its
     * globally default value.
     * But keep in mind, the default value doesn't mean "false". It varies in
     * terms of different FeatureFlags.
     */
    @JsonProperty(value = "features")
    private List<SignalRFeature> features;

    /**
     * Cross-Origin Resource Sharing (CORS) settings.
     */
    @JsonProperty(value = "cors")
    private SignalRCorsSettings cors;

    /**
     * Upstream settings when the Azure SignalR is in server-less mode.
     */
    @JsonProperty(value = "upstream")
    private ServerlessUpstreamSettings upstream;

    /**
     * Network ACLs.
     */
    @JsonProperty(value = "networkACLs")
    private SignalRNetworkACLs networkACLs;

    /**
     * Get prefix for the hostName of the SignalR service. Retained for future use.
     The hostname will be of format: &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     *
     * @return the hostNamePrefix value
     */
    public String hostNamePrefix() {
        return this.hostNamePrefix;
    }

    /**
     * Set prefix for the hostName of the SignalR service. Retained for future use.
     The hostname will be of format: &amp;lt;hostNamePrefix&amp;gt;.service.signalr.net.
     *
     * @param hostNamePrefix the hostNamePrefix value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withHostNamePrefix(String hostNamePrefix) {
        this.hostNamePrefix = hostNamePrefix;
        return this;
    }

    /**
     * Get list of SignalR featureFlags. e.g. ServiceMode.
     FeatureFlags that are not included in the parameters for the update operation will not be modified.
     And the response will only include featureFlags that are explicitly set.
     When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     *
     * @return the features value
     */
    public List<SignalRFeature> features() {
        return this.features;
    }

    /**
     * Set list of SignalR featureFlags. e.g. ServiceMode.
     FeatureFlags that are not included in the parameters for the update operation will not be modified.
     And the response will only include featureFlags that are explicitly set.
     When a featureFlag is not explicitly set, SignalR service will use its globally default value.
     But keep in mind, the default value doesn't mean "false". It varies in terms of different FeatureFlags.
     *
     * @param features the features value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withFeatures(List<SignalRFeature> features) {
        this.features = features;
        return this;
    }

    /**
     * Get cross-Origin Resource Sharing (CORS) settings.
     *
     * @return the cors value
     */
    public SignalRCorsSettings cors() {
        return this.cors;
    }

    /**
     * Set cross-Origin Resource Sharing (CORS) settings.
     *
     * @param cors the cors value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withCors(SignalRCorsSettings cors) {
        this.cors = cors;
        return this;
    }

    /**
     * Get upstream settings when the Azure SignalR is in server-less mode.
     *
     * @return the upstream value
     */
    public ServerlessUpstreamSettings upstream() {
        return this.upstream;
    }

    /**
     * Set upstream settings when the Azure SignalR is in server-less mode.
     *
     * @param upstream the upstream value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withUpstream(ServerlessUpstreamSettings upstream) {
        this.upstream = upstream;
        return this;
    }

    /**
     * Get network ACLs.
     *
     * @return the networkACLs value
     */
    public SignalRNetworkACLs networkACLs() {
        return this.networkACLs;
    }

    /**
     * Set network ACLs.
     *
     * @param networkACLs the networkACLs value to set
     * @return the SignalRCreateOrUpdateProperties object itself.
     */
    public SignalRCreateOrUpdateProperties withNetworkACLs(SignalRNetworkACLs networkACLs) {
        this.networkACLs = networkACLs;
        return this;
    }

}
