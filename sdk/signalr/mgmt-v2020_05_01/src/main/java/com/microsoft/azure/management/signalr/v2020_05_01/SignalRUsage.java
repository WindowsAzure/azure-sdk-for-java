/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.signalr.v2020_05_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.signalr.v2020_05_01.implementation.SignalRUsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.signalr.v2020_05_01.implementation.SignalRServiceManager;

/**
 * Type representing SignalRUsage.
 */
public interface SignalRUsage extends HasInner<SignalRUsageInner>, HasManager<SignalRServiceManager> {
    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    SignalRUsageName name();

    /**
     * @return the unit value.
     */
    String unit();

}
