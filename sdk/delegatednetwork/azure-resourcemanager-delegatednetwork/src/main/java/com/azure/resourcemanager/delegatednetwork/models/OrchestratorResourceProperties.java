// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of orchestrator. */
@Fluent
public final class OrchestratorResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorResourceProperties.class);

    /*
     * Resource guid.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The current state of orchestratorInstance resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private OrchestratorInstanceState provisioningState;

    /*
     * AAD ID used with apiserver
     */
    @JsonProperty(value = "orchestratorAppId")
    private String orchestratorAppId;

    /*
     * TenantID of server App ID
     */
    @JsonProperty(value = "orchestratorTenantId")
    private String orchestratorTenantId;

    /*
     * RootCA certificate of kubernetes cluster base64 encoded
     */
    @JsonProperty(value = "clusterRootCA")
    private String clusterRootCA;

    /*
     * K8s APIServer url. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified
     */
    @JsonProperty(value = "apiServerEndpoint")
    private String apiServerEndpoint;

    /*
     * private link arm resource id. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified
     */
    @JsonProperty(value = "privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * Properties of the controller.
     */
    @JsonProperty(value = "controllerDetails", required = true)
    private ControllerDetails controllerDetails;

    /**
     * Get the resourceGuid property: Resource guid.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Get the provisioningState property: The current state of orchestratorInstance resource.
     *
     * @return the provisioningState value.
     */
    public OrchestratorInstanceState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the orchestratorAppId property: AAD ID used with apiserver.
     *
     * @return the orchestratorAppId value.
     */
    public String orchestratorAppId() {
        return this.orchestratorAppId;
    }

    /**
     * Set the orchestratorAppId property: AAD ID used with apiserver.
     *
     * @param orchestratorAppId the orchestratorAppId value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withOrchestratorAppId(String orchestratorAppId) {
        this.orchestratorAppId = orchestratorAppId;
        return this;
    }

    /**
     * Get the orchestratorTenantId property: TenantID of server App ID.
     *
     * @return the orchestratorTenantId value.
     */
    public String orchestratorTenantId() {
        return this.orchestratorTenantId;
    }

    /**
     * Set the orchestratorTenantId property: TenantID of server App ID.
     *
     * @param orchestratorTenantId the orchestratorTenantId value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withOrchestratorTenantId(String orchestratorTenantId) {
        this.orchestratorTenantId = orchestratorTenantId;
        return this;
    }

    /**
     * Get the clusterRootCA property: RootCA certificate of kubernetes cluster base64 encoded.
     *
     * @return the clusterRootCA value.
     */
    public String clusterRootCA() {
        return this.clusterRootCA;
    }

    /**
     * Set the clusterRootCA property: RootCA certificate of kubernetes cluster base64 encoded.
     *
     * @param clusterRootCA the clusterRootCA value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withClusterRootCA(String clusterRootCA) {
        this.clusterRootCA = clusterRootCA;
        return this;
    }

    /**
     * Get the apiServerEndpoint property: K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId
     * can be specified.
     *
     * @return the apiServerEndpoint value.
     */
    public String apiServerEndpoint() {
        return this.apiServerEndpoint;
    }

    /**
     * Set the apiServerEndpoint property: K8s APIServer url. Either one of apiServerEndpoint or privateLinkResourceId
     * can be specified.
     *
     * @param apiServerEndpoint the apiServerEndpoint value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withApiServerEndpoint(String apiServerEndpoint) {
        this.apiServerEndpoint = apiServerEndpoint;
        return this;
    }

    /**
     * Get the privateLinkResourceId property: private link arm resource id. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified.
     *
     * @return the privateLinkResourceId value.
     */
    public String privateLinkResourceId() {
        return this.privateLinkResourceId;
    }

    /**
     * Set the privateLinkResourceId property: private link arm resource id. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified.
     *
     * @param privateLinkResourceId the privateLinkResourceId value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withPrivateLinkResourceId(String privateLinkResourceId) {
        this.privateLinkResourceId = privateLinkResourceId;
        return this;
    }

    /**
     * Get the controllerDetails property: Properties of the controller.
     *
     * @return the controllerDetails value.
     */
    public ControllerDetails controllerDetails() {
        return this.controllerDetails;
    }

    /**
     * Set the controllerDetails property: Properties of the controller.
     *
     * @param controllerDetails the controllerDetails value to set.
     * @return the OrchestratorResourceProperties object itself.
     */
    public OrchestratorResourceProperties withControllerDetails(ControllerDetails controllerDetails) {
        this.controllerDetails = controllerDetails;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (controllerDetails() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property controllerDetails in model OrchestratorResourceProperties"));
        } else {
            controllerDetails().validate();
        }
    }
}
