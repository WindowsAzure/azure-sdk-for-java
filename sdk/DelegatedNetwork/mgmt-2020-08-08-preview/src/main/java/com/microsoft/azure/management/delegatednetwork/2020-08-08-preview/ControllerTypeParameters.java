/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.delegatednetwork.2020-08-08-preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Details of controller type.
 */
@JsonFlatten
public class ControllerTypeParameters {
    /**
     * Type of controller. Possible values include: 'Kubernetes'.
     */
    @JsonProperty(value = "controllerType")
    private ControllerType controllerType;

    /**
     * AAD ID used with apiserver.
     */
    @JsonProperty(value = "properties.serverAppID")
    private String serverAppID;

    /**
     * TenantID of server App ID.
     */
    @JsonProperty(value = "properties.serverTenantID")
    private String serverTenantID;

    /**
     * RootCA certificate of kubernetes cluster.
     */
    @JsonProperty(value = "properties.clusterRootCA")
    private String clusterRootCA;

    /**
     * APIServer url.
     */
    @JsonProperty(value = "properties.apiServerEndpoint")
    private String apiServerEndpoint;

    /**
     * Get type of controller. Possible values include: 'Kubernetes'.
     *
     * @return the controllerType value
     */
    public ControllerType controllerType() {
        return this.controllerType;
    }

    /**
     * Set type of controller. Possible values include: 'Kubernetes'.
     *
     * @param controllerType the controllerType value to set
     * @return the ControllerTypeParameters object itself.
     */
    public ControllerTypeParameters withControllerType(ControllerType controllerType) {
        this.controllerType = controllerType;
        return this;
    }

    /**
     * Get aAD ID used with apiserver.
     *
     * @return the serverAppID value
     */
    public String serverAppID() {
        return this.serverAppID;
    }

    /**
     * Set aAD ID used with apiserver.
     *
     * @param serverAppID the serverAppID value to set
     * @return the ControllerTypeParameters object itself.
     */
    public ControllerTypeParameters withServerAppID(String serverAppID) {
        this.serverAppID = serverAppID;
        return this;
    }

    /**
     * Get tenantID of server App ID.
     *
     * @return the serverTenantID value
     */
    public String serverTenantID() {
        return this.serverTenantID;
    }

    /**
     * Set tenantID of server App ID.
     *
     * @param serverTenantID the serverTenantID value to set
     * @return the ControllerTypeParameters object itself.
     */
    public ControllerTypeParameters withServerTenantID(String serverTenantID) {
        this.serverTenantID = serverTenantID;
        return this;
    }

    /**
     * Get rootCA certificate of kubernetes cluster.
     *
     * @return the clusterRootCA value
     */
    public String clusterRootCA() {
        return this.clusterRootCA;
    }

    /**
     * Set rootCA certificate of kubernetes cluster.
     *
     * @param clusterRootCA the clusterRootCA value to set
     * @return the ControllerTypeParameters object itself.
     */
    public ControllerTypeParameters withClusterRootCA(String clusterRootCA) {
        this.clusterRootCA = clusterRootCA;
        return this;
    }

    /**
     * Get aPIServer url.
     *
     * @return the apiServerEndpoint value
     */
    public String apiServerEndpoint() {
        return this.apiServerEndpoint;
    }

    /**
     * Set aPIServer url.
     *
     * @param apiServerEndpoint the apiServerEndpoint value to set
     * @return the ControllerTypeParameters object itself.
     */
    public ControllerTypeParameters withApiServerEndpoint(String apiServerEndpoint) {
        this.apiServerEndpoint = apiServerEndpoint;
        return this;
    }

}
