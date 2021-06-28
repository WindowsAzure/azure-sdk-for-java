// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.workloadmonitor.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorInner;
import com.azure.resourcemanager.workloadmonitor.fluent.models.HealthMonitorStateChangeInner;
import java.time.OffsetDateTime;

/** An instance of this class provides access to all the operations defined in HealthMonitorsClient. */
public interface HealthMonitorsClient {
    /**
     * Get the current health status of all monitors of a virtual machine. Optional parameters: $expand (retrieve the
     * monitor's evidence and configuration) and $filter (filter by monitor name).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current health status of all monitors of a virtual machine.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HealthMonitorInner> list(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName);

    /**
     * Get the current health status of all monitors of a virtual machine. Optional parameters: $expand (retrieve the
     * monitor's evidence and configuration) and $filter (filter by monitor name).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param filter Optionally filter by monitor name. Example: $filter=monitorName eq
     *     'logical-disks|C:|disk-free-space-mb.'.
     * @param expand Optionally expand the monitor’s evidence and/or configuration. Example:
     *     $expand=evidence,configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current health status of all monitors of a virtual machine.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HealthMonitorInner> list(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String filter,
        String expand,
        Context context);

    /**
     * Get the current health status of a monitor of a virtual machine. Optional parameter: $expand (retrieve the
     * monitor's evidence and configuration).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current health status of a monitor of a virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HealthMonitorInner get(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId);

    /**
     * Get the current health status of a monitor of a virtual machine. Optional parameter: $expand (retrieve the
     * monitor's evidence and configuration).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @param expand Optionally expand the monitor’s evidence and/or configuration. Example:
     *     $expand=evidence,configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the current health status of a monitor of a virtual machine.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HealthMonitorInner> getWithResponse(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String expand,
        Context context);

    /**
     * Get the health state changes of a monitor of a virtual machine within the provided time window (default is the
     * last 24 hours). Optional parameters: $expand (retrieve the monitor's evidence and configuration) and $filter
     * (filter by heartbeat condition).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health state changes of a monitor of a virtual machine within the provided time window (default is
     *     the last 24 hours).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HealthMonitorStateChangeInner> listStateChanges(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId);

    /**
     * Get the health state changes of a monitor of a virtual machine within the provided time window (default is the
     * last 24 hours). Optional parameters: $expand (retrieve the monitor's evidence and configuration) and $filter
     * (filter by heartbeat condition).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @param filter Optionally filter by heartbeat condition. Example: $filter=isHeartbeat eq false.
     * @param expand Optionally expand the monitor’s evidence and/or configuration. Example:
     *     $expand=evidence,configuration.
     * @param startTimestampUtc The start of the time window.
     * @param endTimestampUtc The end of the time window.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health state changes of a monitor of a virtual machine within the provided time window (default is
     *     the last 24 hours).
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<HealthMonitorStateChangeInner> listStateChanges(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String filter,
        String expand,
        OffsetDateTime startTimestampUtc,
        OffsetDateTime endTimestampUtc,
        Context context);

    /**
     * Get the health state change of a monitor of a virtual machine at the provided timestamp. Optional parameter:
     * $expand (retrieve the monitor's evidence and configuration).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @param timestampUnix The timestamp of the state change (unix format).
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health state change of a monitor of a virtual machine at the provided timestamp.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    HealthMonitorStateChangeInner getStateChange(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String timestampUnix);

    /**
     * Get the health state change of a monitor of a virtual machine at the provided timestamp. Optional parameter:
     * $expand (retrieve the monitor's evidence and configuration).
     *
     * @param subscriptionId The subscription Id of the virtual machine.
     * @param resourceGroupName The resource group of the virtual machine.
     * @param providerName The provider name (ex: Microsoft.Compute for virtual machines).
     * @param resourceCollectionName The resource collection name (ex: virtualMachines for virtual machines).
     * @param resourceName The name of the virtual machine.
     * @param monitorId The monitor Id of the virtual machine.
     * @param timestampUnix The timestamp of the state change (unix format).
     * @param expand Optionally expand the monitor’s evidence and/or configuration. Example:
     *     $expand=evidence,configuration.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the health state change of a monitor of a virtual machine at the provided timestamp.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<HealthMonitorStateChangeInner> getStateChangeWithResponse(
        String subscriptionId,
        String resourceGroupName,
        String providerName,
        String resourceCollectionName,
        String resourceName,
        String monitorId,
        String timestampUnix,
        String expand,
        Context context);
}
