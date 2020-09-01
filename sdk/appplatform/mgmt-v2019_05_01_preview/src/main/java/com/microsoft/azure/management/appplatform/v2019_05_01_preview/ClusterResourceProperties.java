/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2019_05_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Service properties payload.
 */
public class ClusterResourceProperties {
    /**
     * Provisioning state of the Service. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Deleted', 'Succeeded', 'Failed', 'Moving',
     * 'Moved', 'MoveFailed'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * Config server git properties of the Service.
     */
    @JsonProperty(value = "configServerProperties")
    private ConfigServerProperties configServerProperties;

    /**
     * Trace properties of the Service.
     */
    @JsonProperty(value = "trace")
    private TraceProperties trace;

    /**
     * Network profile of the Service.
     */
    @JsonProperty(value = "networkProfile")
    private NetworkProfile networkProfile;

    /**
     * Version of the Service.
     */
    @JsonProperty(value = "version", access = JsonProperty.Access.WRITE_ONLY)
    private Integer version;

    /**
     * ServiceInstanceEntity GUID which uniquely identifies a created resource.
     */
    @JsonProperty(value = "serviceId", access = JsonProperty.Access.WRITE_ONLY)
    private String serviceId;

    /**
     * Get provisioning state of the Service. Possible values include: 'Creating', 'Updating', 'Deleting', 'Deleted', 'Succeeded', 'Failed', 'Moving', 'Moved', 'MoveFailed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get config server git properties of the Service.
     *
     * @return the configServerProperties value
     */
    public ConfigServerProperties configServerProperties() {
        return this.configServerProperties;
    }

    /**
     * Set config server git properties of the Service.
     *
     * @param configServerProperties the configServerProperties value to set
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withConfigServerProperties(ConfigServerProperties configServerProperties) {
        this.configServerProperties = configServerProperties;
        return this;
    }

    /**
     * Get trace properties of the Service.
     *
     * @return the trace value
     */
    public TraceProperties trace() {
        return this.trace;
    }

    /**
     * Set trace properties of the Service.
     *
     * @param trace the trace value to set
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withTrace(TraceProperties trace) {
        this.trace = trace;
        return this;
    }

    /**
     * Get network profile of the Service.
     *
     * @return the networkProfile value
     */
    public NetworkProfile networkProfile() {
        return this.networkProfile;
    }

    /**
     * Set network profile of the Service.
     *
     * @param networkProfile the networkProfile value to set
     * @return the ClusterResourceProperties object itself.
     */
    public ClusterResourceProperties withNetworkProfile(NetworkProfile networkProfile) {
        this.networkProfile = networkProfile;
        return this;
    }

    /**
     * Get version of the Service.
     *
     * @return the version value
     */
    public Integer version() {
        return this.version;
    }

    /**
     * Get serviceInstanceEntity GUID which uniquely identifies a created resource.
     *
     * @return the serviceId value
     */
    public String serviceId() {
        return this.serviceId;
    }

}
