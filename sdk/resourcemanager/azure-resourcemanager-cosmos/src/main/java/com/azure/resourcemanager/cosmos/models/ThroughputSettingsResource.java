// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Cosmos DB resource throughput object. Either throughput is required or autoscaleSettings is required, but not both.
 */
@Fluent
public class ThroughputSettingsResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ThroughputSettingsResource.class);

    /*
     * Value of the Cosmos DB resource throughput. Either throughput is
     * required or autoscaleSettings is required, but not both.
     */
    @JsonProperty(value = "throughput")
    private Integer throughput;

    /*
     * Cosmos DB resource for autoscale settings. Either throughput is required
     * or autoscaleSettings is required, but not both.
     */
    @JsonProperty(value = "autoscaleSettings")
    private AutoscaleSettingsResource autoscaleSettings;

    /*
     * The minimum throughput of the resource
     */
    @JsonProperty(value = "minimumThroughput", access = JsonProperty.Access.WRITE_ONLY)
    private String minimumThroughput;

    /*
     * The throughput replace is pending
     */
    @JsonProperty(value = "offerReplacePending", access = JsonProperty.Access.WRITE_ONLY)
    private String offerReplacePending;

    /**
     * Get the throughput property: Value of the Cosmos DB resource throughput. Either throughput is required or
     * autoscaleSettings is required, but not both.
     *
     * @return the throughput value.
     */
    public Integer throughput() {
        return this.throughput;
    }

    /**
     * Set the throughput property: Value of the Cosmos DB resource throughput. Either throughput is required or
     * autoscaleSettings is required, but not both.
     *
     * @param throughput the throughput value to set.
     * @return the ThroughputSettingsResource object itself.
     */
    public ThroughputSettingsResource withThroughput(Integer throughput) {
        this.throughput = throughput;
        return this;
    }

    /**
     * Get the autoscaleSettings property: Cosmos DB resource for autoscale settings. Either throughput is required or
     * autoscaleSettings is required, but not both.
     *
     * @return the autoscaleSettings value.
     */
    public AutoscaleSettingsResource autoscaleSettings() {
        return this.autoscaleSettings;
    }

    /**
     * Set the autoscaleSettings property: Cosmos DB resource for autoscale settings. Either throughput is required or
     * autoscaleSettings is required, but not both.
     *
     * @param autoscaleSettings the autoscaleSettings value to set.
     * @return the ThroughputSettingsResource object itself.
     */
    public ThroughputSettingsResource withAutoscaleSettings(AutoscaleSettingsResource autoscaleSettings) {
        this.autoscaleSettings = autoscaleSettings;
        return this;
    }

    /**
     * Get the minimumThroughput property: The minimum throughput of the resource.
     *
     * @return the minimumThroughput value.
     */
    public String minimumThroughput() {
        return this.minimumThroughput;
    }

    /**
     * Get the offerReplacePending property: The throughput replace is pending.
     *
     * @return the offerReplacePending value.
     */
    public String offerReplacePending() {
        return this.offerReplacePending;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (autoscaleSettings() != null) {
            autoscaleSettings().validate();
        }
    }
}
