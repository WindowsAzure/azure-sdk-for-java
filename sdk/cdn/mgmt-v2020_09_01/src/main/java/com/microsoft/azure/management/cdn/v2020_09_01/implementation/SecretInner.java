/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.management.cdn.v2020_09_01.AfdProvisioningState;
import com.microsoft.azure.management.cdn.v2020_09_01.DeploymentStatus;
import com.microsoft.azure.management.cdn.v2020_09_01.SecretParameters;
import com.microsoft.azure.management.cdn.v2020_09_01.SystemData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Friendly Secret name mapping to the any Secret or secret related
 * information.
 */
@JsonFlatten
public class SecretInner extends ProxyResource {
    /**
     * Provisioning status. Possible values include: 'Succeeded', 'Failed',
     * 'Updating', 'Deleting', 'Creating'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private AfdProvisioningState provisioningState;

    /**
     * Possible values include: 'NotStarted', 'InProgress', 'Succeeded',
     * 'Failed'.
     */
    @JsonProperty(value = "properties.deploymentStatus", access = JsonProperty.Access.WRITE_ONLY)
    private DeploymentStatus deploymentStatus;

    /**
     * object which contains secret parameters.
     */
    @JsonProperty(value = "properties.parameters")
    private SecretParameters parameters;

    /**
     * The systemData property.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get provisioning status. Possible values include: 'Succeeded', 'Failed', 'Updating', 'Deleting', 'Creating'.
     *
     * @return the provisioningState value
     */
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get possible values include: 'NotStarted', 'InProgress', 'Succeeded', 'Failed'.
     *
     * @return the deploymentStatus value
     */
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get object which contains secret parameters.
     *
     * @return the parameters value
     */
    public SecretParameters parameters() {
        return this.parameters;
    }

    /**
     * Set object which contains secret parameters.
     *
     * @param parameters the parameters value to set
     * @return the SecretInner object itself.
     */
    public SecretInner withParameters(SecretParameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Get the systemData value.
     *
     * @return the systemData value
     */
    public SystemData systemData() {
        return this.systemData;
    }

}
