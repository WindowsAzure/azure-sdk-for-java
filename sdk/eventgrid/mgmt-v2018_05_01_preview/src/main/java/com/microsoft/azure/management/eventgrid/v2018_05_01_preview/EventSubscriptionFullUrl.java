/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation.EventGridManager;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation.EventSubscriptionFullUrlInner;

/**
 * Type representing EventSubscriptionFullUrl.
 */
public interface EventSubscriptionFullUrl extends HasInner<EventSubscriptionFullUrlInner>, HasManager<EventGridManager> {
    /**
     * @return the endpointUrl value.
     */
    String endpointUrl();

}
