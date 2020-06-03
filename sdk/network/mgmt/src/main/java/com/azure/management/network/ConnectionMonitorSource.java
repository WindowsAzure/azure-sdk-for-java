// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionMonitorSource model. */
@Fluent
public final class ConnectionMonitorSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorSource.class);

    /*
     * The ID of the resource used as the source by connection monitor.
     */
    @JsonProperty(value = "resourceId", required = true)
    private String resourceId;

    /*
     * The source port used by connection monitor.
     */
    @JsonProperty(value = "port")
    private Integer port;

    /**
     * Get the resourceId property: The ID of the resource used as the source by connection monitor.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: The ID of the resource used as the source by connection monitor.
     *
     * @param resourceId the resourceId value to set.
     * @return the ConnectionMonitorSource object itself.
     */
    public ConnectionMonitorSource withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the port property: The source port used by connection monitor.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The source port used by connection monitor.
     *
     * @param port the port value to set.
     * @return the ConnectionMonitorSource object itself.
     */
    public ConnectionMonitorSource withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (resourceId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property resourceId in model ConnectionMonitorSource"));
        }
    }
}
