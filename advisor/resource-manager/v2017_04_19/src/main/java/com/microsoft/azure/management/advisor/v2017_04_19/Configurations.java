/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_04_19;

import com.microsoft.azure.arm.resources.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.arm.collection.SupportsListing;
import rx.Observable;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.ConfigDataInner;
import com.microsoft.azure.management.advisor.v2017_04_19.implementation.ConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Configurations.
 */
public interface Configurations extends SupportsListingByResourceGroup<ConfigData>, SupportsListing<ConfigData>, HasInner<ConfigurationsInner> {
    /**
     * Create/Overwrite Azure Advisor configuration.
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ARMErrorResponseBody> createInSubscriptionAsync(ConfigDataInner configContract);

    /**
     * Create/Overwrite Azure Advisor configuration.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ARMErrorResponseBody> createInResourceGroupAsync(String resourceGroup, ConfigDataInner configContract);

}
