// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.appservice.ContainerInfo;
import com.azure.management.appservice.ProxyOnlyResource;
import com.azure.management.appservice.SiteRuntimeState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The WebSiteInstanceStatus model. */
@JsonFlatten
@Fluent
public class WebSiteInstanceStatusInner extends ProxyOnlyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(WebSiteInstanceStatusInner.class);

    /*
     * The state property.
     */
    @JsonProperty(value = "properties.state")
    private SiteRuntimeState state;

    /*
     * Link to the GetStatusApi in Kudu
     */
    @JsonProperty(value = "properties.statusUrl")
    private String statusUrl;

    /*
     * Link to the Diagnose and Solve Portal
     */
    @JsonProperty(value = "properties.detectorUrl")
    private String detectorUrl;

    /*
     * Link to the Diagnose and Solve Portal
     */
    @JsonProperty(value = "properties.consoleUrl")
    private String consoleUrl;

    /*
     * Dictionary of <ContainerInfo>
     */
    @JsonProperty(value = "properties.containers")
    private Map<String, ContainerInfo> containers;

    /**
     * Get the state property: The state property.
     *
     * @return the state value.
     */
    public SiteRuntimeState state() {
        return this.state;
    }

    /**
     * Set the state property: The state property.
     *
     * @param state the state value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withState(SiteRuntimeState state) {
        this.state = state;
        return this;
    }

    /**
     * Get the statusUrl property: Link to the GetStatusApi in Kudu.
     *
     * @return the statusUrl value.
     */
    public String statusUrl() {
        return this.statusUrl;
    }

    /**
     * Set the statusUrl property: Link to the GetStatusApi in Kudu.
     *
     * @param statusUrl the statusUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withStatusUrl(String statusUrl) {
        this.statusUrl = statusUrl;
        return this;
    }

    /**
     * Get the detectorUrl property: Link to the Diagnose and Solve Portal.
     *
     * @return the detectorUrl value.
     */
    public String detectorUrl() {
        return this.detectorUrl;
    }

    /**
     * Set the detectorUrl property: Link to the Diagnose and Solve Portal.
     *
     * @param detectorUrl the detectorUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withDetectorUrl(String detectorUrl) {
        this.detectorUrl = detectorUrl;
        return this;
    }

    /**
     * Get the consoleUrl property: Link to the Diagnose and Solve Portal.
     *
     * @return the consoleUrl value.
     */
    public String consoleUrl() {
        return this.consoleUrl;
    }

    /**
     * Set the consoleUrl property: Link to the Diagnose and Solve Portal.
     *
     * @param consoleUrl the consoleUrl value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withConsoleUrl(String consoleUrl) {
        this.consoleUrl = consoleUrl;
        return this;
    }

    /**
     * Get the containers property: Dictionary of &lt;ContainerInfo&gt;.
     *
     * @return the containers value.
     */
    public Map<String, ContainerInfo> containers() {
        return this.containers;
    }

    /**
     * Set the containers property: Dictionary of &lt;ContainerInfo&gt;.
     *
     * @param containers the containers value to set.
     * @return the WebSiteInstanceStatusInner object itself.
     */
    public WebSiteInstanceStatusInner withContainers(Map<String, ContainerInfo> containers) {
        this.containers = containers;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (containers() != null) {
            containers().values().forEach(e -> e.validate());
        }
    }
}
