/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningcompute.v2017_08_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information about the Azure Container Registry which contains the images
 * deployed to the cluster.
 */
public class ContainerServiceCredentials {
    /**
     * The ACS kube config file.
     */
    @JsonProperty(value = "acsKubeConfig", access = JsonProperty.Access.WRITE_ONLY)
    private String acsKubeConfig;

    /**
     * Service principal configuration used by Kubernetes.
     */
    @JsonProperty(value = "servicePrincipalConfiguration", access = JsonProperty.Access.WRITE_ONLY)
    private ServicePrincipalProperties servicePrincipalConfiguration;

    /**
     * The ACR image pull secret name which was created in Kubernetes.
     */
    @JsonProperty(value = "imagePullSecretName", access = JsonProperty.Access.WRITE_ONLY)
    private String imagePullSecretName;

    /**
     * Get the ACS kube config file.
     *
     * @return the acsKubeConfig value
     */
    public String acsKubeConfig() {
        return this.acsKubeConfig;
    }

    /**
     * Get service principal configuration used by Kubernetes.
     *
     * @return the servicePrincipalConfiguration value
     */
    public ServicePrincipalProperties servicePrincipalConfiguration() {
        return this.servicePrincipalConfiguration;
    }

    /**
     * Get the ACR image pull secret name which was created in Kubernetes.
     *
     * @return the imagePullSecretName value
     */
    public String imagePullSecretName() {
        return this.imagePullSecretName;
    }

}
