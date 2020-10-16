/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The properties of a service instance.
 */
public class ServicesProperties {
    /**
     * The provisioning state. Possible values include: 'Deleting',
     * 'Succeeded', 'Creating', 'Accepted', 'Verifying', 'Updating', 'Failed',
     * 'Canceled', 'Deprovisioned'.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The access policies of the service instance.
     */
    @JsonProperty(value = "accessPolicies")
    private List<ServiceAccessPolicyEntry> accessPolicies;

    /**
     * The settings for the Cosmos DB database backing the service.
     */
    @JsonProperty(value = "cosmosDbConfiguration")
    private ServiceCosmosDbConfigurationInfo cosmosDbConfiguration;

    /**
     * The authentication configuration for the service instance.
     */
    @JsonProperty(value = "authenticationConfiguration")
    private ServiceAuthenticationConfigurationInfo authenticationConfiguration;

    /**
     * The settings for the CORS configuration of the service instance.
     */
    @JsonProperty(value = "corsConfiguration")
    private ServiceCorsConfigurationInfo corsConfiguration;

    /**
     * The settings for the export operation of the service instance.
     */
    @JsonProperty(value = "exportConfiguration")
    private ServiceExportConfigurationInfo exportConfiguration;

    /**
     * Get the provisioning state. Possible values include: 'Deleting', 'Succeeded', 'Creating', 'Accepted', 'Verifying', 'Updating', 'Failed', 'Canceled', 'Deprovisioned'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the access policies of the service instance.
     *
     * @return the accessPolicies value
     */
    public List<ServiceAccessPolicyEntry> accessPolicies() {
        return this.accessPolicies;
    }

    /**
     * Set the access policies of the service instance.
     *
     * @param accessPolicies the accessPolicies value to set
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withAccessPolicies(List<ServiceAccessPolicyEntry> accessPolicies) {
        this.accessPolicies = accessPolicies;
        return this;
    }

    /**
     * Get the settings for the Cosmos DB database backing the service.
     *
     * @return the cosmosDbConfiguration value
     */
    public ServiceCosmosDbConfigurationInfo cosmosDbConfiguration() {
        return this.cosmosDbConfiguration;
    }

    /**
     * Set the settings for the Cosmos DB database backing the service.
     *
     * @param cosmosDbConfiguration the cosmosDbConfiguration value to set
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withCosmosDbConfiguration(ServiceCosmosDbConfigurationInfo cosmosDbConfiguration) {
        this.cosmosDbConfiguration = cosmosDbConfiguration;
        return this;
    }

    /**
     * Get the authentication configuration for the service instance.
     *
     * @return the authenticationConfiguration value
     */
    public ServiceAuthenticationConfigurationInfo authenticationConfiguration() {
        return this.authenticationConfiguration;
    }

    /**
     * Set the authentication configuration for the service instance.
     *
     * @param authenticationConfiguration the authenticationConfiguration value to set
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withAuthenticationConfiguration(ServiceAuthenticationConfigurationInfo authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
        return this;
    }

    /**
     * Get the settings for the CORS configuration of the service instance.
     *
     * @return the corsConfiguration value
     */
    public ServiceCorsConfigurationInfo corsConfiguration() {
        return this.corsConfiguration;
    }

    /**
     * Set the settings for the CORS configuration of the service instance.
     *
     * @param corsConfiguration the corsConfiguration value to set
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withCorsConfiguration(ServiceCorsConfigurationInfo corsConfiguration) {
        this.corsConfiguration = corsConfiguration;
        return this;
    }

    /**
     * Get the settings for the export operation of the service instance.
     *
     * @return the exportConfiguration value
     */
    public ServiceExportConfigurationInfo exportConfiguration() {
        return this.exportConfiguration;
    }

    /**
     * Set the settings for the export operation of the service instance.
     *
     * @param exportConfiguration the exportConfiguration value to set
     * @return the ServicesProperties object itself.
     */
    public ServicesProperties withExportConfiguration(ServiceExportConfigurationInfo exportConfiguration) {
        this.exportConfiguration = exportConfiguration;
        return this;
    }

}
