// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.delegatednetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.delegatednetwork.models.ControllerDetails;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorIdentity;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorInstanceState;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorKind;
import com.azure.resourcemanager.delegatednetwork.models.OrchestratorResource;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Represents an instance of a orchestrator. */
@JsonFlatten
@Fluent
public class OrchestratorInner extends OrchestratorResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorInner.class);

    /*
     * Resource guid.
     */
    @JsonProperty(value = "properties.resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /*
     * The current state of orchestratorInstance resource.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private OrchestratorInstanceState provisioningState;

    /*
     * AAD ID used with apiserver
     */
    @JsonProperty(value = "properties.orchestratorAppId")
    private String orchestratorAppId;

    /*
     * TenantID of server App ID
     */
    @JsonProperty(value = "properties.orchestratorTenantId")
    private String orchestratorTenantId;

    /*
     * RootCA certificate of kubernetes cluster base64 encoded
     */
    @JsonProperty(value = "properties.clusterRootCA")
    private String clusterRootCA;

    /*
     * K8s APIServer url. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified
     */
    @JsonProperty(value = "properties.apiServerEndpoint")
    private String apiServerEndpoint;

    /*
     * private link arm resource id. Either one of apiServerEndpoint or
     * privateLinkResourceId can be specified
     */
    @JsonProperty(value = "properties.privateLinkResourceId")
    private String privateLinkResourceId;

    /*
     * Properties of the controller.
     */
    @JsonProperty(value = "properties.controllerDetails")
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withOrchestratorAppId(String orchestratorAppId) {
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withOrchestratorTenantId(String orchestratorTenantId) {
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withClusterRootCA(String clusterRootCA) {
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withApiServerEndpoint(String apiServerEndpoint) {
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withPrivateLinkResourceId(String privateLinkResourceId) {
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
     * @return the OrchestratorInner object itself.
     */
    public OrchestratorInner withControllerDetails(ControllerDetails controllerDetails) {
        this.controllerDetails = controllerDetails;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorInner withKind(OrchestratorKind kind) {
        super.withKind(kind);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorInner withIdentity(OrchestratorIdentity identity) {
        super.withIdentity(identity);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public OrchestratorInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (controllerDetails() != null) {
            controllerDetails().validate();
        }
    }
}
