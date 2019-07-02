/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.EnvironmentDeploymentProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * An environment, which is essentially an ARM template deployment.
 */
@JsonFlatten
@SkipParentValidation
public class DtlEnvironmentInner extends Resource {
    /**
     * The deployment properties of the environment.
     */
    @JsonProperty(value = "properties.deploymentProperties")
    private EnvironmentDeploymentProperties deploymentProperties;

    /**
     * The display name of the Azure Resource Manager template that produced
     * the environment.
     */
    @JsonProperty(value = "properties.armTemplateDisplayName")
    private String armTemplateDisplayName;

    /**
     * The identifier of the resource group containing the environment's
     * resources.
     */
    @JsonProperty(value = "properties.resourceGroupId", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGroupId;

    /**
     * The creator of the environment.
     */
    @JsonProperty(value = "properties.createdByUser", access = JsonProperty.Access.WRITE_ONLY)
    private String createdByUser;

    /**
     * The provisioning status of the resource.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The unique immutable identifier of a resource (Guid).
     */
    @JsonProperty(value = "properties.uniqueIdentifier")
    private String uniqueIdentifier;

    /**
     * Get the deployment properties of the environment.
     *
     * @return the deploymentProperties value
     */
    public EnvironmentDeploymentProperties deploymentProperties() {
        return this.deploymentProperties;
    }

    /**
     * Set the deployment properties of the environment.
     *
     * @param deploymentProperties the deploymentProperties value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withDeploymentProperties(EnvironmentDeploymentProperties deploymentProperties) {
        this.deploymentProperties = deploymentProperties;
        return this;
    }

    /**
     * Get the display name of the Azure Resource Manager template that produced the environment.
     *
     * @return the armTemplateDisplayName value
     */
    public String armTemplateDisplayName() {
        return this.armTemplateDisplayName;
    }

    /**
     * Set the display name of the Azure Resource Manager template that produced the environment.
     *
     * @param armTemplateDisplayName the armTemplateDisplayName value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withArmTemplateDisplayName(String armTemplateDisplayName) {
        this.armTemplateDisplayName = armTemplateDisplayName;
        return this;
    }

    /**
     * Get the identifier of the resource group containing the environment's resources.
     *
     * @return the resourceGroupId value
     */
    public String resourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * Get the creator of the environment.
     *
     * @return the createdByUser value
     */
    public String createdByUser() {
        return this.createdByUser;
    }

    /**
     * Get the provisioning status of the resource.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning status of the resource.
     *
     * @param provisioningState the provisioningState value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the unique immutable identifier of a resource (Guid).
     *
     * @return the uniqueIdentifier value
     */
    public String uniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    /**
     * Set the unique immutable identifier of a resource (Guid).
     *
     * @param uniqueIdentifier the uniqueIdentifier value to set
     * @return the DtlEnvironmentInner object itself.
     */
    public DtlEnvironmentInner withUniqueIdentifier(String uniqueIdentifier) {
        this.uniqueIdentifier = uniqueIdentifier;
        return this;
    }

}
