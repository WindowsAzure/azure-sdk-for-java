// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties of a service instance. */
@Fluent
public final class ServicesProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServicesProperties.class);

    /*
     * The provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The access policies of the service instance.
     */
    @JsonProperty(value = "accessPolicies")
    private List<ServiceAccessPolicyEntry> accessPolicies;

    /*
     * The settings for the Cosmos DB database backing the service.
     */
    @JsonProperty(value = "cosmosDbConfiguration")
    private ServiceCosmosDbConfigurationInfo cosmosDbConfiguration;

    /*
     * The authentication configuration for the service instance.
     */
    @JsonProperty(value = "authenticationConfiguration")
    private ServiceAuthenticationConfigurationInfo authenticationConfiguration;

    /*
     * The settings for the CORS configuration of the service instance.
     */
    @JsonProperty(value = "corsConfiguration")
    private ServiceCorsConfigurationInfo corsConfiguration;

    /*
     * The settings for the export operation of the service instance.
     */
    @JsonProperty(value = "exportConfiguration")
    private ServiceExportConfigurationInfo exportConfiguration;

    /*
     * The list of private endpoint connections that are set up for this
     * resource.
     */
    @JsonProperty(value = "privateEndpointConnections")
    private List<PrivateEndpointConnection> privateEndpointConnections;

    /*
     * Control permission for data plane traffic coming from public networks
     * while private endpoint is enabled.
     */
    @JsonProperty(value = "publicNetworkAccess")
    private PublicNetworkAccess publicNetworkAccess;

    /*
     * The azure container registry settings used for convert data operation of
     * the service instance.
     */
    @JsonProperty(value = "acrConfiguration")
    private ServiceAcrConfigurationInfo acrConfiguration;

    /**
     * Get the provisioningState property: The provisioning state.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the accessPolicies property: The access policies of the service instance.
     *
     * @return the accessPolicies value.
     */
    public List<ServiceAccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the accessPolicies property: The access policies of the service instance.
     *
     * @param accessPolicies the accessPolicies value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withAccessPolicies(List<ServiceAccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the cosmosDbConfiguration property: The settings for the Cosmos DB database backing the service.
     *
     * @return the cosmosDbConfiguration value.
     */
    public ServiceCosmosDbConfigurationInfo cosmosDbConfiguration() {
        return this.cosmosDbConfiguration;
    }

    /**
     * Set the cosmosDbConfiguration property: The settings for the Cosmos DB database backing the service.
     *
     * @param cosmosDbConfiguration the cosmosDbConfiguration value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withCosmosDbConfiguration(ServiceCosmosDbConfigurationInfo cosmosDbConfiguration) {
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        return this;
    }

    /**
     * Get the authenticationConfiguration property: The authentication configuration for the service instance.
     *
     * @return the authenticationConfiguration value.
     */
    public ServiceAuthenticationConfigurationInfo authenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * Set the authenticationConfiguration property: The authentication configuration for the service instance.
     *
     * @param authenticationConfiguration the authenticationConfiguration value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withAuthenticationConfiguration(
        ServiceAuthenticationConfigurationInfo authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
        return this;
    }

    /**
     * Get the corsConfiguration property: The settings for the CORS configuration of the service instance.
     *
     * @return the corsConfiguration value.
     */
    public ServiceCorsConfigurationInfo corsConfiguration() {
        return this.corsConfiguration;
    }

    /**
     * Set the corsConfiguration property: The settings for the CORS configuration of the service instance.
     *
     * @param corsConfiguration the corsConfiguration value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withCorsConfiguration(ServiceCorsConfigurationInfo corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * Get the exportConfiguration property: The settings for the export operation of the service instance.
     *
     * @return the exportConfiguration value.
     */
    public ServiceExportConfigurationInfo exportConfiguration() {
        return this.exportConfiguration;
    }

    /**
     * Set the exportConfiguration property: The settings for the export operation of the service instance.
     *
     * @param exportConfiguration the exportConfiguration value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withExportConfiguration(ServiceExportConfigurationInfo exportConfiguration) {
        this.exportConfiguration = exportConfiguration;
        return this;
    }

    /**
     * Get the privateEndpointConnections property: The list of private endpoint connections that are set up for this
     * resource.
     *
     * @return the privateEndpointConnections value.
     */
    public List<PrivateEndpointConnection> privateEndpointConnections() {
        return this.privateEndpointConnections;
    }

    /**
     * Set the privateEndpointConnections property: The list of private endpoint connections that are set up for this
     * resource.
     *
     * @param privateEndpointConnections the privateEndpointConnections value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withPrivateEndpointConnections(
        List<PrivateEndpointConnection> privateEndpointConnections) {
        this.privateEndpointConnections = privateEndpointConnections;
        return this;
    }

    /**
     * Get the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @return the publicNetworkAccess value.
     */
    public PublicNetworkAccess publicNetworkAccess() {
        return this.publicNetworkAccess;
    }

    /**
     * Set the publicNetworkAccess property: Control permission for data plane traffic coming from public networks while
     * private endpoint is enabled.
     *
     * @param publicNetworkAccess the publicNetworkAccess value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess) {
        this.publicNetworkAccess = publicNetworkAccess;
        return this;
    }

    /**
     * Get the acrConfiguration property: The azure container registry settings used for convert data operation of the
     * service instance.
     *
     * @return the acrConfiguration value.
     */
    public ServiceAcrConfigurationInfo acrConfiguration() {
        return this.acrConfiguration;
    }

    /**
     * Set the acrConfiguration property: The azure container registry settings used for convert data operation of the
     * service instance.
     *
     * @param acrConfiguration the acrConfiguration value to set.
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withAcrConfiguration(ServiceAcrConfigurationInfo acrConfiguration) {
        this.acrConfiguration = acrConfiguration;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (accessPolicies() != null) {
            accessPolicies().forEach(e -> e.validate());
        }
        if (cosmosDbConfiguration() != null) {
            cosmosDbConfiguration().validate();
        }
        if (authenticationConfiguration() != null) {
            authenticationConfiguration().validate();
        }
        if (corsConfiguration() != null) {
            corsConfiguration().validate();
        }
        if (exportConfiguration() != null) {
            exportConfiguration().validate();
        }
        if (privateEndpointConnections() != null) {
            privateEndpointConnections().forEach(e -> e.validate());
        }
        if (acrConfiguration() != null) {
            acrConfiguration().validate();
        }
    }
}
