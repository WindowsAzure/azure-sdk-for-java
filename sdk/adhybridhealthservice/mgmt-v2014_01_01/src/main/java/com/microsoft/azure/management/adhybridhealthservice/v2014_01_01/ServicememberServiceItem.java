/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ItemInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation.ADHybridHealthServiceManager;

/**
 * Type representing ServicememberServiceItem.
 */
public interface ServicememberServiceItem extends HasInner<ItemInner>, HasManager<ADHybridHealthServiceManager> {
    /**
     * @return the key value.
     */
    String keyVal();

    /**
     * @return the value value.
     */
    String value();

}
