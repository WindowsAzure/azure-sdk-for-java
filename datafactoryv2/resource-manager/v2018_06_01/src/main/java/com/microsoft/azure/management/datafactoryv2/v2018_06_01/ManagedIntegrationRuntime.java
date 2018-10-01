/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.IntegrationRuntimeInner;

/**
 * Managed integration runtime, including managed elastic and managed dedicated
 * integration runtimes.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Managed")
@JsonFlatten
public class ManagedIntegrationRuntime extends IntegrationRuntimeInner {
    /**
     * Integration runtime state, only valid for managed dedicated integration
     * runtime. Possible values include: 'Initial', 'Stopped', 'Started',
     * 'Starting', 'Stopping', 'NeedRegistration', 'Online', 'Limited',
     * 'Offline', 'AccessDenied'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private IntegrationRuntimeState state;

    /**
     * The compute resource for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.computeProperties")
    private IntegrationRuntimeComputeProperties computeProperties;

    /**
     * SSIS properties for managed integration runtime.
     */
    @JsonProperty(value = "typeProperties.ssisProperties")
    private IntegrationRuntimeSsisProperties ssisProperties;

    /**
     * Get integration runtime state, only valid for managed dedicated integration runtime. Possible values include: 'Initial', 'Stopped', 'Started', 'Starting', 'Stopping', 'NeedRegistration', 'Online', 'Limited', 'Offline', 'AccessDenied'.
     *
     * @return the state value
     */
    public IntegrationRuntimeState state() {
        return this.state;
    }

    /**
     * Get the compute resource for managed integration runtime.
     *
     * @return the computeProperties value
     */
    public IntegrationRuntimeComputeProperties computeProperties() {
        return this.computeProperties;
    }

    /**
     * Set the compute resource for managed integration runtime.
     *
     * @param computeProperties the computeProperties value to set
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withComputeProperties(IntegrationRuntimeComputeProperties computeProperties) {
        this.computeProperties = computeProperties;
        return this;
    }

    /**
     * Get sSIS properties for managed integration runtime.
     *
     * @return the ssisProperties value
     */
    public IntegrationRuntimeSsisProperties ssisProperties() {
        return this.ssisProperties;
    }

    /**
     * Set sSIS properties for managed integration runtime.
     *
     * @param ssisProperties the ssisProperties value to set
     * @return the ManagedIntegrationRuntime object itself.
     */
    public ManagedIntegrationRuntime withSsisProperties(IntegrationRuntimeSsisProperties ssisProperties) {
        this.ssisProperties = ssisProperties;
        return this;
    }

}
