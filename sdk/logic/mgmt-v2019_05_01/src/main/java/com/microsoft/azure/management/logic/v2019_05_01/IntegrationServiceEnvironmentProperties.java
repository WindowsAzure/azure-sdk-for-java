/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.logic.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The integration service environment properties.
 */
public class IntegrationServiceEnvironmentProperties {
    /**
     * The provisioning state. Possible values include: 'NotSpecified',
     * 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting',
     * 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating',
     * 'Registering', 'Registered', 'Unregistering', 'Unregistered',
     * 'Completed'.
     */
    @JsonProperty(value = "provisioningState")
    private WorkflowProvisioningState provisioningState;

    /**
     * The integration service environment state. Possible values include:
     * 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted',
     * 'Suspended'.
     */
    @JsonProperty(value = "state")
    private WorkflowState state;

    /**
     * Gets the tracking id.
     */
    @JsonProperty(value = "integrationServiceEnvironmentId")
    private String integrationServiceEnvironmentId;

    /**
     * The endpoints configuration.
     */
    @JsonProperty(value = "endpointsConfiguration")
    private FlowEndpointsConfiguration endpointsConfiguration;

    /**
     * The network configuration.
     */
    @JsonProperty(value = "networkConfiguration")
    private NetworkConfiguration networkConfiguration;

    /**
     * Get the provisioning state. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating', 'Registering', 'Registered', 'Unregistering', 'Unregistered', 'Completed'.
     *
     * @return the provisioningState value
     */
    public WorkflowProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state. Possible values include: 'NotSpecified', 'Accepted', 'Running', 'Ready', 'Creating', 'Created', 'Deleting', 'Deleted', 'Canceled', 'Failed', 'Succeeded', 'Moving', 'Updating', 'Registering', 'Registered', 'Unregistering', 'Unregistered', 'Completed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withProvisioningState(WorkflowProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the integration service environment state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     *
     * @return the state value
     */
    public WorkflowState state() {
        return this.state;
    }

    /**
     * Set the integration service environment state. Possible values include: 'NotSpecified', 'Completed', 'Enabled', 'Disabled', 'Deleted', 'Suspended'.
     *
     * @param state the state value to set
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withState(WorkflowState state) {
        this.state = state;
        return this;
    }

    /**
     * Get gets the tracking id.
     *
     * @return the integrationServiceEnvironmentId value
     */
    public String integrationServiceEnvironmentId() {
        return this.integrationServiceEnvironmentId;
    }

    /**
     * Set gets the tracking id.
     *
     * @param integrationServiceEnvironmentId the integrationServiceEnvironmentId value to set
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withIntegrationServiceEnvironmentId(String integrationServiceEnvironmentId) {
        this.integrationServiceEnvironmentId = integrationServiceEnvironmentId;
        return this;
    }

    /**
     * Get the endpoints configuration.
     *
     * @return the endpointsConfiguration value
     */
    public FlowEndpointsConfiguration endpointsConfiguration() {
        return this.endpointsConfiguration;
    }

    /**
     * Set the endpoints configuration.
     *
     * @param endpointsConfiguration the endpointsConfiguration value to set
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withEndpointsConfiguration(FlowEndpointsConfiguration endpointsConfiguration) {
        this.endpointsConfiguration = endpointsConfiguration;
        return this;
    }

    /**
     * Get the network configuration.
     *
     * @return the networkConfiguration value
     */
    public NetworkConfiguration networkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * Set the network configuration.
     *
     * @param networkConfiguration the networkConfiguration value to set
     * @return the IntegrationServiceEnvironmentProperties object itself.
     */
    public IntegrationServiceEnvironmentProperties withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

}
