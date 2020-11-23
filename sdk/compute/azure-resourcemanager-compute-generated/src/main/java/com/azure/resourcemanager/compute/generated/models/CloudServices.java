// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of CloudServices. */
public interface CloudServices {
    /**
     * Deletes a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Display information about a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    CloudService getByResourceGroup(String resourceGroupName, String cloudServiceName);

    /**
     * Display information about a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return describes the cloud service.
     */
    Response<CloudService> getByResourceGroupWithResponse(
        String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Gets the status of a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cloud service.
     */
    CloudServiceInstanceView getInstanceView(String resourceGroupName, String cloudServiceName);

    /**
     * Gets the status of a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the status of a cloud service.
     */
    Response<CloudServiceInstanceView> getInstanceViewWithResponse(
        String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Gets a list of all cloud services in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of Cloud Services. Do this till nextLink is null to fetch all the
     * Cloud Services.
     *
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services in the subscription, regardless of the associated resource group.
     */
    PagedIterable<CloudService> list();

    /**
     * Gets a list of all cloud services in the subscription, regardless of the associated resource group. Use nextLink
     * property in the response to get the next page of Cloud Services. Do this till nextLink is null to fetch all the
     * Cloud Services.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services in the subscription, regardless of the associated resource group.
     */
    PagedIterable<CloudService> list(Context context);

    /**
     * Gets a list of all cloud services under a resource group. Use nextLink property in the response to get the next
     * page of Cloud Services. Do this till nextLink is null to fetch all the Cloud Services.
     *
     * @param resourceGroupName Name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services under a resource group.
     */
    PagedIterable<CloudService> listByResourceGroup(String resourceGroupName);

    /**
     * Gets a list of all cloud services under a resource group. Use nextLink property in the response to get the next
     * page of Cloud Services. Do this till nextLink is null to fetch all the Cloud Services.
     *
     * @param resourceGroupName Name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of all cloud services under a resource group.
     */
    PagedIterable<CloudService> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Starts the cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String cloudServiceName);

    /**
     * Starts the cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String cloudServiceName);

    /**
     * Power off the cloud service. Note that resources are still attached and you are getting charged for the
     * resources.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void powerOff(String resourceGroupName, String cloudServiceName, Context context);

    /**
     * Restarts one or more role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String cloudServiceName, RoleInstances parameters);

    /**
     * Restarts one or more role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String cloudServiceName);

    /**
     * Restarts one or more role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String cloudServiceName, RoleInstances parameters);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String cloudServiceName);

    /**
     * Reimage asynchronous operation reinstalls the operating system on instances of web roles or worker roles.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void reimage(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rebuild(String resourceGroupName, String cloudServiceName, RoleInstances parameters);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rebuild(String resourceGroupName, String cloudServiceName);

    /**
     * Rebuild Role Instances reinstalls the operating system on instances of web roles or worker roles and initializes
     * the storage resources that are used by them. If you do not want to initialize storage resources, you can use
     * Reimage Role Instances.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rebuild(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Deletes role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInstances(String resourceGroupName, String cloudServiceName, RoleInstances parameters);

    /**
     * Deletes role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInstances(String resourceGroupName, String cloudServiceName);

    /**
     * Deletes role instances in a cloud service.
     *
     * @param resourceGroupName Name of the resource group.
     * @param cloudServiceName Name of the cloud service.
     * @param parameters Specifies a list of role instances from the cloud service.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.compute.generated.models.ApiErrorException thrown if the request is rejected by
     *     server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteInstances(String resourceGroupName, String cloudServiceName, RoleInstances parameters, Context context);

    /**
     * Begins definition for a new CloudService resource.
     *
     * @param name resource name.
     * @return the first stage of the new CloudService definition.
     */
    CloudService.DefinitionStages.Blank define(String name);
}
