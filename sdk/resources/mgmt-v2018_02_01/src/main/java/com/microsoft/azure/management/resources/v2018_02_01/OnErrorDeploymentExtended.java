/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2018_02_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Deployment on error behavior with additional details.
 */
public class OnErrorDeploymentExtended {
    /**
     * The state of the provisioning for the on error deployment.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * The deployment on error behavior type. Possible values are
     * LastSuccessful and SpecificDeployment. Possible values include:
     * 'LastSuccessful', 'SpecificDeployment'.
     */
    @JsonProperty(value = "type")
    private OnErrorDeploymentType type;

    /**
     * The deployment to be used on error case.
     */
    @JsonProperty(value = "deploymentName")
    private String deploymentName;

    /**
     * Get the state of the provisioning for the on error deployment.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'.
     *
     * @return the type value
     */
    public OnErrorDeploymentType type() {
        return this.type;
    }

    /**
     * Set the deployment on error behavior type. Possible values are LastSuccessful and SpecificDeployment. Possible values include: 'LastSuccessful', 'SpecificDeployment'.
     *
     * @param type the type value to set
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended withType(OnErrorDeploymentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the deployment to be used on error case.
     *
     * @return the deploymentName value
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deployment to be used on error case.
     *
     * @param deploymentName the deploymentName value to set
     * @return the OnErrorDeploymentExtended object itself.
     */
    public OnErrorDeploymentExtended withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
        return this;
    }

}
