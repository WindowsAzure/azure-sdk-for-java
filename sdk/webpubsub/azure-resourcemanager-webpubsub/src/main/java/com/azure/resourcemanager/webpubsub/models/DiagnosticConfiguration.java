// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Diagnostic configuration of a Microsoft.SignalRService resource. Used together with Azure monitor DiagnosticSettings.
 */
@Fluent
public final class DiagnosticConfiguration {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiagnosticConfiguration.class);

    /*
     * Indicate whether or not enable Connectivity logs.
     * Available values: Enabled, Disabled.
     * Case insensitive.
     */
    @JsonProperty(value = "enableConnectivityLogs")
    private String enableConnectivityLogs;

    /*
     * Indicate whether or not enable Messaging logs.
     * Available values: Enabled, Disabled.
     * Case insensitive.
     */
    @JsonProperty(value = "enableMessagingLogs")
    private String enableMessagingLogs;

    /*
     * Indicate whether or not enable Live Trace.
     * Available values: Enabled, Disabled.
     * Case insensitive.
     * Live Trace allows you to know what's happening inside Azure SignalR
     * service, it will give you live traces in real time, it will be helpful
     * when you developing your own Azure SignalR based web application or
     * self-troubleshooting some issues.
     */
    @JsonProperty(value = "enableLiveTrace")
    private String enableLiveTrace;

    /**
     * Get the enableConnectivityLogs property: Indicate whether or not enable Connectivity logs. Available values:
     * Enabled, Disabled. Case insensitive.
     *
     * @return the enableConnectivityLogs value.
     */
    public String enableConnectivityLogs() {
        return this.enableConnectivityLogs;
    }

    /**
     * Set the enableConnectivityLogs property: Indicate whether or not enable Connectivity logs. Available values:
     * Enabled, Disabled. Case insensitive.
     *
     * @param enableConnectivityLogs the enableConnectivityLogs value to set.
     * @return the DiagnosticConfiguration object itself.
     */
    public DiagnosticConfiguration withEnableConnectivityLogs(String enableConnectivityLogs) {
        this.enableConnectivityLogs = enableConnectivityLogs;
        return this;
    }

    /**
     * Get the enableMessagingLogs property: Indicate whether or not enable Messaging logs. Available values: Enabled,
     * Disabled. Case insensitive.
     *
     * @return the enableMessagingLogs value.
     */
    public String enableMessagingLogs() {
        return this.enableMessagingLogs;
    }

    /**
     * Set the enableMessagingLogs property: Indicate whether or not enable Messaging logs. Available values: Enabled,
     * Disabled. Case insensitive.
     *
     * @param enableMessagingLogs the enableMessagingLogs value to set.
     * @return the DiagnosticConfiguration object itself.
     */
    public DiagnosticConfiguration withEnableMessagingLogs(String enableMessagingLogs) {
        this.enableMessagingLogs = enableMessagingLogs;
        return this;
    }

    /**
     * Get the enableLiveTrace property: Indicate whether or not enable Live Trace. Available values: Enabled, Disabled.
     * Case insensitive. Live Trace allows you to know what's happening inside Azure SignalR service, it will give you
     * live traces in real time, it will be helpful when you developing your own Azure SignalR based web application or
     * self-troubleshooting some issues.
     *
     * @return the enableLiveTrace value.
     */
    public String enableLiveTrace() {
        return this.enableLiveTrace;
    }

    /**
     * Set the enableLiveTrace property: Indicate whether or not enable Live Trace. Available values: Enabled, Disabled.
     * Case insensitive. Live Trace allows you to know what's happening inside Azure SignalR service, it will give you
     * live traces in real time, it will be helpful when you developing your own Azure SignalR based web application or
     * self-troubleshooting some issues.
     *
     * @param enableLiveTrace the enableLiveTrace value to set.
     * @return the DiagnosticConfiguration object itself.
     */
    public DiagnosticConfiguration withEnableLiveTrace(String enableLiveTrace) {
        this.enableLiveTrace = enableLiveTrace;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
