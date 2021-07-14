// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.Map;

/** The solution properties (correspond to the solution kind). */
@Fluent
public class ExternalSecuritySolutionProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ExternalSecuritySolutionProperties.class);

    /*
     * The deviceVendor property.
     */
    @JsonProperty(value = "deviceVendor")
    private String deviceVendor;

    /*
     * The deviceType property.
     */
    @JsonProperty(value = "deviceType")
    private String deviceType;

    /*
     * Represents an OMS workspace to which the solution is connected
     */
    @JsonProperty(value = "workspace")
    private ConnectedWorkspace workspace;

    /*
     * The solution properties (correspond to the solution kind)
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the deviceVendor property: The deviceVendor property.
     *
     * @return the deviceVendor value.
     */
    public String deviceVendor() {
        return this.deviceVendor;
    }

    /**
     * Set the deviceVendor property: The deviceVendor property.
     *
     * @param deviceVendor the deviceVendor value to set.
     * @return the ExternalSecuritySolutionProperties object itself.
     */
    public ExternalSecuritySolutionProperties withDeviceVendor(String deviceVendor) {
        this.deviceVendor = deviceVendor;
        return this;
    }

    /**
     * Get the deviceType property: The deviceType property.
     *
     * @return the deviceType value.
     */
    public String deviceType() {
        return this.deviceType;
    }

    /**
     * Set the deviceType property: The deviceType property.
     *
     * @param deviceType the deviceType value to set.
     * @return the ExternalSecuritySolutionProperties object itself.
     */
    public ExternalSecuritySolutionProperties withDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    /**
     * Get the workspace property: Represents an OMS workspace to which the solution is connected.
     *
     * @return the workspace value.
     */
    public ConnectedWorkspace workspace() {
        return this.workspace;
    }

    /**
     * Set the workspace property: Represents an OMS workspace to which the solution is connected.
     *
     * @param workspace the workspace value to set.
     * @return the ExternalSecuritySolutionProperties object itself.
     */
    public ExternalSecuritySolutionProperties withWorkspace(ConnectedWorkspace workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * Get the additionalProperties property: The solution properties (correspond to the solution kind).
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: The solution properties (correspond to the solution kind).
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the ExternalSecuritySolutionProperties object itself.
     */
    public ExternalSecuritySolutionProperties withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (workspace() != null) {
            workspace().validate();
        }
    }
}
