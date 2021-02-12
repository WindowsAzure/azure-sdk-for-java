/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.compute.v2020_10_01_preview.implementation.ProximityPlacementGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ProximityPlacementGroups.
 */
public interface ProximityPlacementGroups extends SupportsCreating<ProximityPlacementGroup.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<ProximityPlacementGroup>, SupportsListingByResourceGroup<ProximityPlacementGroup>, SupportsListing<ProximityPlacementGroup>, HasInner<ProximityPlacementGroupsInner> {
}
