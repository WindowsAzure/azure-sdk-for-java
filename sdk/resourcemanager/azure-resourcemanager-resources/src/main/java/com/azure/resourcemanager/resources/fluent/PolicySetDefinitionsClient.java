// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.resources.fluent.models.PolicySetDefinitionInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in PolicySetDefinitionsClient. */
public interface PolicySetDefinitionsClient {
    /**
     * This operation creates or updates a policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicySetDefinitionInner>> createOrUpdateWithResponseAsync(
        String policySetDefinitionName, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicySetDefinitionInner> createOrUpdateAsync(
        String policySetDefinitionName, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicySetDefinitionInner createOrUpdate(String policySetDefinitionName, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param parameters The policy set definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicySetDefinitionInner> createOrUpdateWithResponse(
        String policySetDefinitionName, PolicySetDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteWithResponseAsync(String policySetDefinitionName);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String policySetDefinitionName);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String policySetDefinitionName);

    /**
     * This operation deletes the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicySetDefinitionInner>> getWithResponseAsync(String policySetDefinitionName);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicySetDefinitionInner> getAsync(String policySetDefinitionName);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicySetDefinitionInner get(String policySetDefinitionName);

    /**
     * This operation retrieves the policy set definition in the given subscription with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicySetDefinitionInner> getWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicySetDefinitionInner>> getBuiltInWithResponseAsync(String policySetDefinitionName);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicySetDefinitionInner> getBuiltInAsync(String policySetDefinitionName);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicySetDefinitionInner getBuiltIn(String policySetDefinitionName);

    /**
     * This operation retrieves the built-in policy set definition with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicySetDefinitionInner> getBuiltInWithResponse(String policySetDefinitionName, Context context);

    /**
     * This operation retrieves a list of all the policy set definitions in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicySetDefinitionInner> listAsync();

    /**
     * This operation retrieves a list of all the policy set definitions in the given subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> list();

    /**
     * This operation retrieves a list of all the policy set definitions in the given subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> list(Context context);

    /**
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicySetDefinitionInner> listBuiltInAsync();

    /**
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> listBuiltIn();

    /**
     * This operation retrieves a list of all the built-in policy set definitions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> listBuiltIn(Context context);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicySetDefinitionInner>> createOrUpdateAtManagementGroupWithResponseAsync(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicySetDefinitionInner> createOrUpdateAtManagementGroupAsync(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicySetDefinitionInner createOrUpdateAtManagementGroup(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters);

    /**
     * This operation creates or updates a policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to create.
     * @param managementGroupId The ID of the management group.
     * @param parameters The policy set definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicySetDefinitionInner> createOrUpdateAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, PolicySetDefinitionInner parameters, Context context);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> deleteAtManagementGroupWithResponseAsync(
        String policySetDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAtManagementGroupAsync(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void deleteAtManagementGroup(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation deletes the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to delete.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<PolicySetDefinitionInner>> getAtManagementGroupWithResponseAsync(
        String policySetDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PolicySetDefinitionInner> getAtManagementGroupAsync(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PolicySetDefinitionInner getAtManagementGroup(String policySetDefinitionName, String managementGroupId);

    /**
     * This operation retrieves the policy set definition in the given management group with the given name.
     *
     * @param policySetDefinitionName The name of the policy set definition to get.
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the policy set definition.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<PolicySetDefinitionInner> getAtManagementGroupWithResponse(
        String policySetDefinitionName, String managementGroupId, Context context);

    /**
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<PolicySetDefinitionInner> listByManagementGroupAsync(String managementGroupId);

    /**
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> listByManagementGroup(String managementGroupId);

    /**
     * This operation retrieves a list of all the a policy set definition in the given management group.
     *
     * @param managementGroupId The ID of the management group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of policy set definitions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<PolicySetDefinitionInner> listByManagementGroup(String managementGroupId, Context context);
}
