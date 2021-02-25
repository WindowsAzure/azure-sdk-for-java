/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import rx.Observable;
import com.microsoft.azure.management.appservice.v2020_09_01.AppServicePlan;
import rx.Completable;
import com.microsoft.azure.management.appservice.v2020_09_01.Capability;
import com.microsoft.azure.management.appservice.v2020_09_01.HybridConnection;
import com.microsoft.azure.management.appservice.v2020_09_01.ServerfarmSite;
import com.microsoft.azure.management.appservice.v2020_09_01.ServerfarmCsmUsageQuota;
import com.microsoft.azure.management.appservice.v2020_09_01.ServerfarmVnetInfo;
import com.microsoft.azure.management.appservice.v2020_09_01.VnetRoute;

/**
 * Type representing AppServicePlans.
 */
public interface AppServicePlans {
    /**
     * Begins definition for a new Serverfarm resource.
     * @param name resource name.
     * @return the first stage of the new Serverfarm definition.
     */
    AppServicePlan.DefinitionStages.Blank defineServerfarm(String name);

    /**
     * Begins definition for a new Route resource.
     * @param name resource name.
     * @return the first stage of the new Route definition.
     */
    VnetRoute.DefinitionStages.Blank defineRoute(String name);

    /**
     * Get an App Service plan.
     * Description for Get an App Service plan.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServicePlan> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Get all App Service plans in a resource group.
     * Description for Get all App Service plans in a resource group.
     *
     * @param resourceGroupName resource group name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServicePlan> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Get all App Service plans for a subscription.
     * Description for Get all App Service plans for a subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppServicePlan> listAsync();

    /**
     * Delete an App Service plan.
     * Description for Delete an App Service plan.
     *
     * @param resourceGroupName resource group name
     * @param name resource name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

    /**
     * Restart all apps in an App Service plan.
     * Description for Restart all apps in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable restartWebAppsAsync(String resourceGroupName, String name);

    /**
     * Gets all selectable SKUs for a given App Service Plan.
     * Description for Gets all selectable SKUs for a given App Service Plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of App Service Plan
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Object> getServerFarmSkusAsync(String resourceGroupName, String name);

    /**
     * List all capabilities of an App Service plan.
     * Description for List all capabilities of an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Capability> listCapabilitiesAsync(String resourceGroupName, String name);

    /**
     * Retrieve a Hybrid Connection in use in an App Service plan.
     * Description for Retrieve a Hybrid Connection in use in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param namespaceName Name of the Service Bus namespace.
     * @param relayName Name of the Service Bus relay.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmHybridConnection> getHybridConnectionAsync(String resourceGroupName, String name, String namespaceName, String relayName);

    /**
     * Delete a Hybrid Connection in use in an App Service plan.
     * Description for Delete a Hybrid Connection in use in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param namespaceName Name of the Service Bus namespace.
     * @param relayName Name of the Service Bus relay.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteHybridConnectionAsync(String resourceGroupName, String name, String namespaceName, String relayName);

    /**
     * Get the send key name and value of a Hybrid Connection.
     * Description for Get the send key name and value of a Hybrid Connection.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param namespaceName The name of the Service Bus namespace.
     * @param relayName The name of the Service Bus relay.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HybridConnectionKey> listHybridConnectionKeysAsync(String resourceGroupName, String name, String namespaceName, String relayName);

    /**
     * Get all apps that use a Hybrid Connection in an App Service Plan.
     * Description for Get all apps that use a Hybrid Connection in an App Service Plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param namespaceName Name of the Hybrid Connection namespace.
     * @param relayName Name of the Hybrid Connection relay.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<String> listWebAppsByHybridConnectionAsync(final String resourceGroupName, final String name, final String namespaceName, final String relayName);

    /**
     * Get the maximum number of Hybrid Connections allowed in an App Service plan.
     * Description for Get the maximum number of Hybrid Connections allowed in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HybridConnectionLimits> getHybridConnectionPlanLimitAsync(String resourceGroupName, String name);

    /**
     * Retrieve all Hybrid Connections in use in an App Service plan.
     * Description for Retrieve all Hybrid Connections in use in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<HybridConnection> listHybridConnectionsAsync(final String resourceGroupName, final String name);

    /**
     * Get all apps associated with an App Service plan.
     * Description for Get all apps associated with an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmSite> listWebAppsAsync(final String resourceGroupName, final String name);

    /**
     * Gets server farm usage information.
     * Description for Gets server farm usage information.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of App Service Plan
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmCsmUsageQuota> listUsagesAsync(final String resourceGroupName, final String name);

    /**
     * Get a Virtual Network associated with an App Service plan.
     * Description for Get a Virtual Network associated with an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param vnetName Name of the Virtual Network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmVnetInfo> getVnetFromServerFarmAsync(String resourceGroupName, String name, String vnetName);

    /**
     * Get all Virtual Networks associated with an App Service plan.
     * Description for Get all Virtual Networks associated with an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmVnetInfo> listVnetsAsync(String resourceGroupName, String name);

    /**
     * Get a Virtual Network gateway.
     * Description for Get a Virtual Network gateway.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param vnetName Name of the Virtual Network.
     * @param gatewayName Name of the gateway. Only the 'primary' gateway is supported.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServerfarmVnetGateway> getVnetGatewayAsync(String resourceGroupName, String name, String vnetName, String gatewayName);

    /**
     * Get all routes that are associated with a Virtual Network in an App Service plan.
     * Description for Get all routes that are associated with a Virtual Network in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param vnetName Name of the Virtual Network.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VnetRoute> listRoutesForVnetAsync(String resourceGroupName, String name, String vnetName);

    /**
     * Delete a Virtual Network route in an App Service plan.
     * Description for Delete a Virtual Network route in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param vnetName Name of the Virtual Network.
     * @param routeName Name of the Virtual Network route.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteVnetRouteAsync(String resourceGroupName, String name, String vnetName, String routeName);

    /**
     * Get a Virtual Network route in an App Service plan.
     * Description for Get a Virtual Network route in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param vnetName Name of the Virtual Network.
     * @param routeName Name of the Virtual Network route.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VnetRoute> getRouteForVnetAsync(String resourceGroupName, String name, String vnetName, String routeName);

    /**
     * Reboot a worker machine in an App Service plan.
     * Description for Reboot a worker machine in an App Service plan.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the App Service plan.
     * @param workerName Name of worker machine, which typically starts with RD.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable rebootWorkerAsync(String resourceGroupName, String name, String workerName);

}
