/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview;

import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation.HanaInstancesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing HanaInstances.
 */
public interface HanaInstances extends SupportsGettingByResourceGroup<HanaInstance>, SupportsListingByResourceGroup<HanaInstance>, SupportsListing<HanaInstance>, HasInner<HanaInstancesInner> {
}
