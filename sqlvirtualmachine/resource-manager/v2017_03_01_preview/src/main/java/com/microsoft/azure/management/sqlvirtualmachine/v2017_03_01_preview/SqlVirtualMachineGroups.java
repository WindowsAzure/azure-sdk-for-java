/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.sqlvirtualmachine.v2017_03_01_preview.implementation.SqlVirtualMachineGroupsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing SqlVirtualMachineGroups.
 */
public interface SqlVirtualMachineGroups extends SupportsCreating<SqlVirtualMachineGroup.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<SqlVirtualMachineGroup>, SupportsListingByResourceGroup<SqlVirtualMachineGroup>, SupportsListing<SqlVirtualMachineGroup>, HasInner<SqlVirtualMachineGroupsInner> {
}
