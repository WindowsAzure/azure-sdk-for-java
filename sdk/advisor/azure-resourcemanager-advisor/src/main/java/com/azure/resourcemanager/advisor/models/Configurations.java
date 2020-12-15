// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.advisor.fluent.models.ConfigDataInner;

/** Resource collection API of Configurations. */
public interface Configurations {
    /**
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor configurations.
     */
    PagedIterable<ConfigData> list();

    /**
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor configurations.
     */
    PagedIterable<ConfigData> list(Context context);

    /**
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configurationName Advisor configuration name. Value must be 'default'.
     * @param configContract The Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advisor configuration data structure.
     */
    ConfigData createInSubscription(ConfigurationName configurationName, ConfigDataInner configContract);

    /**
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configurationName Advisor configuration name. Value must be 'default'.
     * @param configContract The Advisor configuration data structure.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the Advisor configuration data structure.
     */
    Response<ConfigData> createInSubscriptionWithResponse(
        ConfigurationName configurationName, ConfigDataInner configContract, Context context);

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor configurations.
     */
    PagedIterable<ConfigData> listByResourceGroup(String resourceGroup);

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the list of Advisor configurations.
     */
    PagedIterable<ConfigData> listByResourceGroup(String resourceGroup, Context context);

    /**
     * Begins definition for a new ConfigData resource.
     *
     * @param name resource name.
     * @return the first stage of the new ConfigData definition.
     */
    ConfigData.DefinitionStages.Blank define(ConfigurationName name);
}
