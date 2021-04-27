// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The API resource properties. */
@Fluent
public final class ApiResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiResourceProperties.class);

    /*
     * The name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The connection parameters.
     */
    @JsonProperty(value = "connectionParameters")
    private Map<String, Object> connectionParameters;

    /*
     * The metadata.
     */
    @JsonProperty(value = "metadata")
    private ApiResourceMetadata metadata;

    /*
     * The runtime urls.
     */
    @JsonProperty(value = "runtimeUrls")
    private List<String> runtimeUrls;

    /*
     * The api general information.
     */
    @JsonProperty(value = "generalInformation")
    private ApiResourceGeneralInformation generalInformation;

    /*
     * The capabilities.
     */
    @JsonProperty(value = "capabilities")
    private List<String> capabilities;

    /*
     * The backend service.
     */
    @JsonProperty(value = "backendService")
    private ApiResourceBackendService backendService;

    /*
     * The policies for the API.
     */
    @JsonProperty(value = "policies")
    private ApiResourcePolicies policies;

    /*
     * The API definition.
     */
    @JsonProperty(value = "apiDefinitionUrl")
    private String apiDefinitionUrl;

    /*
     * The api definitions.
     */
    @JsonProperty(value = "apiDefinitions")
    private ApiResourceDefinitions apiDefinitions;

    /*
     * The integration service environment reference.
     */
    @JsonProperty(value = "integrationServiceEnvironment")
    private ResourceReference integrationServiceEnvironment;

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState")
    private WorkflowProvisioningState provisioningState;

    /*
     * The category.
     */
    @JsonProperty(value = "category")
    private ApiTier category;

    /**
     * Get the name property: The name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name.
     *
     * @param name the name value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the connectionParameters property: The connection parameters.
     *
     * @return the connectionParameters value.
     */
    public Map<String, Object> connectionParameters() {
        return this.connectionParameters;
    }

    /**
     * Set the connectionParameters property: The connection parameters.
     *
     * @param connectionParameters the connectionParameters value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withConnectionParameters(Map<String, Object> connectionParameters) {
        this.connectionParameters = connectionParameters;
        return this;
    }

    /**
     * Get the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    public ApiResourceMetadata metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata.
     *
     * @param metadata the metadata value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withMetadata(ApiResourceMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the runtimeUrls property: The runtime urls.
     *
     * @return the runtimeUrls value.
     */
    public List<String> runtimeUrls() {
        return this.runtimeUrls;
    }

    /**
     * Set the runtimeUrls property: The runtime urls.
     *
     * @param runtimeUrls the runtimeUrls value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withRuntimeUrls(List<String> runtimeUrls) {
        this.runtimeUrls = runtimeUrls;
        return this;
    }

    /**
     * Get the generalInformation property: The api general information.
     *
     * @return the generalInformation value.
     */
    public ApiResourceGeneralInformation generalInformation() {
        return this.generalInformation;
    }

    /**
     * Set the generalInformation property: The api general information.
     *
     * @param generalInformation the generalInformation value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withGeneralInformation(ApiResourceGeneralInformation generalInformation) {
        this.generalInformation = generalInformation;
        return this;
    }

    /**
     * Get the capabilities property: The capabilities.
     *
     * @return the capabilities value.
     */
    public List<String> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: The capabilities.
     *
     * @param capabilities the capabilities value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the backendService property: The backend service.
     *
     * @return the backendService value.
     */
    public ApiResourceBackendService backendService() {
        return this.backendService;
    }

    /**
     * Set the backendService property: The backend service.
     *
     * @param backendService the backendService value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withBackendService(ApiResourceBackendService backendService) {
        this.backendService = backendService;
        return this;
    }

    /**
     * Get the policies property: The policies for the API.
     *
     * @return the policies value.
     */
    public ApiResourcePolicies policies() {
        return this.policies;
    }

    /**
     * Set the policies property: The policies for the API.
     *
     * @param policies the policies value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withPolicies(ApiResourcePolicies policies) {
        this.policies = policies;
        return this;
    }

    /**
     * Get the apiDefinitionUrl property: The API definition.
     *
     * @return the apiDefinitionUrl value.
     */
    public String apiDefinitionUrl() {
        return this.apiDefinitionUrl;
    }

    /**
     * Set the apiDefinitionUrl property: The API definition.
     *
     * @param apiDefinitionUrl the apiDefinitionUrl value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withApiDefinitionUrl(String apiDefinitionUrl) {
        this.apiDefinitionUrl = apiDefinitionUrl;
        return this;
    }

    /**
     * Get the apiDefinitions property: The api definitions.
     *
     * @return the apiDefinitions value.
     */
    public ApiResourceDefinitions apiDefinitions() {
        return this.apiDefinitions;
    }

    /**
     * Set the apiDefinitions property: The api definitions.
     *
     * @param apiDefinitions the apiDefinitions value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withApiDefinitions(ApiResourceDefinitions apiDefinitions) {
        this.apiDefinitions = apiDefinitions;
        return this;
    }

    /**
     * Get the integrationServiceEnvironment property: The integration service environment reference.
     *
     * @return the integrationServiceEnvironment value.
     */
    public ResourceReference integrationServiceEnvironment() {
        return this.integrationServiceEnvironment;
    }

    /**
     * Set the integrationServiceEnvironment property: The integration service environment reference.
     *
     * @param integrationServiceEnvironment the integrationServiceEnvironment value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withIntegrationServiceEnvironment(ResourceReference integrationServiceEnvironment) {
        this.integrationServiceEnvironment = integrationServiceEnvironment;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public WorkflowProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withProvisioningState(WorkflowProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the category property: The category.
     *
     * @return the category value.
     */
    public ApiTier category() {
        return this.category;
    }

    /**
     * Set the category property: The category.
     *
     * @param category the category value to set.
     * @return the ApiResourceProperties object itself.
     */
    public ApiResourceProperties withCategory(ApiTier category) {
        this.category = category;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (metadata() != null) {
            metadata().validate();
        }
        if (generalInformation() != null) {
            generalInformation().validate();
        }
        if (backendService() != null) {
            backendService().validate();
        }
        if (policies() != null) {
            policies().validate();
        }
        if (apiDefinitions() != null) {
            apiDefinitions().validate();
        }
        if (integrationServiceEnvironment() != null) {
            integrationServiceEnvironment().validate();
        }
    }
}
