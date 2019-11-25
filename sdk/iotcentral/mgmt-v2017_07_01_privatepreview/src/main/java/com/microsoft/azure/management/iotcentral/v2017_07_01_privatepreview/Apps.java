/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import com.microsoft.azure.arm.resources.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.arm.resources.collection.SupportsBatchDeletion;
import com.microsoft.azure.arm.resources.collection.SupportsGettingByResourceGroup;
import rx.Observable;
import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import com.microsoft.azure.management.iotcentral.v2017_07_01_privatepreview.implementation.AppsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Apps.
 */
public interface Apps extends SupportsCreating<App.DefinitionStages.Blank>, SupportsDeletingByResourceGroup, SupportsBatchDeletion, SupportsGettingByResourceGroup<App>, SupportsListingByResourceGroup<App>, SupportsListing<App>, HasInner<AppsInner> {
    /**
     * Check if an IoT Central application name is available.
     *
     * @param name The name of the IoT Central application instance to check.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AppNameAvailabilityInfo> checkNameAvailabilityAsync(String name);

}
