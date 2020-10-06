/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicebus.v2018_01_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.ServiceBusManager;
import com.microsoft.azure.management.servicebus.v2018_01_01_preview.implementation.PremiumMessagingRegionInner;

/**
 * Type representing PremiumMessagingRegion.
 */
public interface PremiumMessagingRegion extends HasInner<PremiumMessagingRegionInner>, Resource, GroupableResourceCore<ServiceBusManager, PremiumMessagingRegionInner>, HasResourceGroup, HasManager<ServiceBusManager> {
    /**
     * @return the properties value.
     */
    PremiumMessagingRegionProperties properties();

}
