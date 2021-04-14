// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.signalr.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Feature of a SignalR resource, which controls the SignalR runtime behavior. */
@Fluent
public final class SignalRFeature {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SignalRFeature.class);

    /*
     * FeatureFlags is the supported features of Azure SignalR service.
     * - ServiceMode: Flag for backend server for SignalR service. Values
     * allowed: "Default": have your own backend server; "Serverless": your
     * application doesn't have a backend server; "Classic": for backward
     * compatibility. Support both Default and Serverless mode but not
     * recommended; "PredefinedOnly": for future use.
     * - EnableConnectivityLogs: "true"/"false", to enable/disable the
     * connectivity log category respectively.
     * - EnableMessagingLogs: "true"/"false", to enable/disable the
     * connectivity log category respectively.
     * - EnableLiveTrace: Live Trace allows you to know what's happening inside
     * Azure SignalR service, it will give you live traces in real time, it
     * will be helpful when you developing your own Azure SignalR based web
     * application or self-troubleshooting some issues. Please note that live
     * traces are counted as outbound messages that will be charged. Values
     * allowed: "true"/"false", to enable/disable live trace feature.
     */
    @JsonProperty(value = "flag", required = true)
    private FeatureFlags flag;

    /*
     * Value of the feature flag. See Azure SignalR service document
     * https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     */
    @JsonProperty(value = "value", required = true)
    private String value;

    /*
     * Optional properties related to this feature.
     */
    @JsonProperty(value = "properties")
    private Map<String, String> properties;

    /**
     * Get the flag property: FeatureFlags is the supported features of Azure SignalR service. - ServiceMode: Flag for
     * backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your
     * application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and
     * Serverless mode but not recommended; "PredefinedOnly": for future use. - EnableConnectivityLogs: "true"/"false",
     * to enable/disable the connectivity log category respectively. - EnableMessagingLogs: "true"/"false", to
     * enable/disable the connectivity log category respectively. - EnableLiveTrace: Live Trace allows you to know
     * what's happening inside Azure SignalR service, it will give you live traces in real time, it will be helpful when
     * you developing your own Azure SignalR based web application or self-troubleshooting some issues. Please note that
     * live traces are counted as outbound messages that will be charged. Values allowed: "true"/"false", to
     * enable/disable live trace feature.
     *
     * @return the flag value.
     */
    public FeatureFlags flag() {
        return this.flag;
    }

    /**
     * Set the flag property: FeatureFlags is the supported features of Azure SignalR service. - ServiceMode: Flag for
     * backend server for SignalR service. Values allowed: "Default": have your own backend server; "Serverless": your
     * application doesn't have a backend server; "Classic": for backward compatibility. Support both Default and
     * Serverless mode but not recommended; "PredefinedOnly": for future use. - EnableConnectivityLogs: "true"/"false",
     * to enable/disable the connectivity log category respectively. - EnableMessagingLogs: "true"/"false", to
     * enable/disable the connectivity log category respectively. - EnableLiveTrace: Live Trace allows you to know
     * what's happening inside Azure SignalR service, it will give you live traces in real time, it will be helpful when
     * you developing your own Azure SignalR based web application or self-troubleshooting some issues. Please note that
     * live traces are counted as outbound messages that will be charged. Values allowed: "true"/"false", to
     * enable/disable live trace feature.
     *
     * @param flag the flag value to set.
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withFlag(FeatureFlags flag) {
        this.flag = flag;
        return this;
    }

    /**
     * Get the value property: Value of the feature flag. See Azure SignalR service document
     * https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value of the feature flag. See Azure SignalR service document
     * https://docs.microsoft.com/azure/azure-signalr/ for allowed values.
     *
     * @param value the value value to set.
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the properties property: Optional properties related to this feature.
     *
     * @return the properties value.
     */
    public Map<String, String> properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Optional properties related to this feature.
     *
     * @param properties the properties value to set.
     * @return the SignalRFeature object itself.
     */
    public SignalRFeature withProperties(Map<String, String> properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (flag() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property flag in model SignalRFeature"));
        }
        if (value() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model SignalRFeature"));
        }
    }
}
