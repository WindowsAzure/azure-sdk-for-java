// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicInner;

/** An instance of this class provides access to all the operations defined in DomainTopicsClient. */
public interface DomainTopicsClient {
    /**
     * Get properties of a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a domain topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainTopicInner get(String resourceGroupName, String domainName, String domainTopicName);

    /**
     * Get properties of a domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of a domain topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DomainTopicInner> getWithResponse(
        String resourceGroupName, String domainName, String domainTopicName, Context context);

    /**
     * Asynchronously creates or updates a new domain topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DomainTopicInner>, DomainTopicInner> beginCreateOrUpdate(
        String resourceGroupName, String domainName, String domainTopicName);

    /**
     * Asynchronously creates or updates a new domain topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<DomainTopicInner>, DomainTopicInner> beginCreateOrUpdate(
        String resourceGroupName, String domainName, String domainTopicName, Context context);

    /**
     * Asynchronously creates or updates a new domain topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainTopicInner createOrUpdate(String resourceGroupName, String domainName, String domainTopicName);

    /**
     * Asynchronously creates or updates a new domain topic with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return domain Topic.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DomainTopicInner createOrUpdate(
        String resourceGroupName, String domainName, String domainTopicName, Context context);

    /**
     * Delete existing domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String domainName, String domainTopicName);

    /**
     * Delete existing domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String domainName, String domainTopicName, Context context);

    /**
     * Delete existing domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName, String domainTopicName);

    /**
     * Delete existing domain topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param domainTopicName Name of the domain topic.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName, String domainTopicName, Context context);

    /**
     * List all the topics in a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Domain name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domain Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainTopicInner> listByDomain(String resourceGroupName, String domainName);

    /**
     * List all the topics in a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Domain name.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List Domain Topics operation.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<DomainTopicInner> listByDomain(
        String resourceGroupName, String domainName, String filter, Integer top, Context context);
}
