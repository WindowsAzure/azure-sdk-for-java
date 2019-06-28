/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_04_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.network.v2019_04_01.implementation.ExpressRouteCircuitsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExpressRouteCircuits.
 */
public interface ExpressRouteCircuits extends SupportsCreating<ExpressRouteCircuit.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ExpressRouteCircuit>, SupportsListingByResourceGroup<ExpressRouteCircuit>, SupportsListing<ExpressRouteCircuit>, HasInner<ExpressRouteCircuitsInner> {
    /**
     * Gets the currently advertised ARP table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitsArpTableListResult> listArpTableAsync(String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitsRoutesTableListResult> listRoutesTableAsync(String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets the currently advertised routes table summary associated with the express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @param devicePath The path of the device.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitsRoutesTableSummaryListResult> listRoutesTableSummaryAsync(String resourceGroupName, String circuitName, String peeringName, String devicePath);

    /**
     * Gets all the stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitStats> getStatsAsync(String resourceGroupName, String circuitName);

    /**
     * Gets all stats from an express route circuit in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param circuitName The name of the express route circuit.
     * @param peeringName The name of the peering.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExpressRouteCircuitStats> getPeeringStatsAsync(String resourceGroupName, String circuitName, String peeringName);

}
