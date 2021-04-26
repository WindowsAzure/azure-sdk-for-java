// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import java.time.OffsetDateTime;

/** Resource collection API of PolicyEvents. */
public interface PolicyEvents {
    /**
     * Queries policy events for the resources under the management group.
     *
     * @param managementGroupName Management group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForManagementGroup(String managementGroupName);

    /**
     * Queries policy events for the resources under the management group.
     *
     * @param managementGroupName Management group name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForManagementGroup(
        String managementGroupName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the resources under the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForSubscription(String subscriptionId);

    /**
     * Queries policy events for the resources under the subscription.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForSubscription(
        String subscriptionId,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the resources under the resource group.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResourceGroup(String subscriptionId, String resourceGroupName);

    /**
     * Queries policy events for the resources under the resource group.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResourceGroup(
        String subscriptionId,
        String resourceGroupName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the resource.
     *
     * @param resourceId Resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResource(String resourceId);

    /**
     * Queries policy events for the resource.
     *
     * @param resourceId Resource ID.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param expand The $expand query parameter. For example, to expand components use $expand=components.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResource(
        String resourceId,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String expand,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the subscription level policy set definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policySetDefinitionName Policy set definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForPolicySetDefinition(
        String subscriptionId, String policySetDefinitionName);

    /**
     * Queries policy events for the subscription level policy set definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policySetDefinitionName Policy set definition name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForPolicySetDefinition(
        String subscriptionId,
        String policySetDefinitionName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the subscription level policy definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyDefinitionName Policy definition name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForPolicyDefinition(String subscriptionId, String policyDefinitionName);

    /**
     * Queries policy events for the subscription level policy definition.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyDefinitionName Policy definition name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForPolicyDefinition(
        String subscriptionId,
        String policyDefinitionName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the subscription level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForSubscriptionLevelPolicyAssignment(
        String subscriptionId, String policyAssignmentName);

    /**
     * Queries policy events for the subscription level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param policyAssignmentName Policy assignment name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForSubscriptionLevelPolicyAssignment(
        String subscriptionId,
        String policyAssignmentName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);

    /**
     * Queries policy events for the resource group level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param policyAssignmentName Policy assignment name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResourceGroupLevelPolicyAssignment(
        String subscriptionId, String resourceGroupName, String policyAssignmentName);

    /**
     * Queries policy events for the resource group level policy assignment.
     *
     * @param subscriptionId Microsoft Azure subscription ID.
     * @param resourceGroupName Resource group name.
     * @param policyAssignmentName Policy assignment name.
     * @param top Maximum number of records to return.
     * @param orderBy Ordering expression using OData notation. One or more comma-separated column names with an
     *     optional "desc" (the default) or "asc", e.g. "$orderby=PolicyAssignmentId, ResourceId asc".
     * @param select Select expression using OData notation. Limits the columns on each record to just those requested,
     *     e.g. "$select=PolicyAssignmentId, ResourceId".
     * @param from ISO 8601 formatted timestamp specifying the start time of the interval to query. When not specified,
     *     the service uses ($to - 1-day).
     * @param to ISO 8601 formatted timestamp specifying the end time of the interval to query. When not specified, the
     *     service uses request time.
     * @param filter OData filter expression.
     * @param apply OData apply expression for aggregations.
     * @param skipToken Skiptoken is only provided if a previous response returned a partial result as a part of
     *     nextLink element.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return query results.
     */
    PagedIterable<PolicyEvent> listQueryResultsForResourceGroupLevelPolicyAssignment(
        String subscriptionId,
        String resourceGroupName,
        String policyAssignmentName,
        Integer top,
        String orderBy,
        String select,
        OffsetDateTime from,
        OffsetDateTime to,
        String filter,
        String apply,
        String skipToken,
        Context context);
}
