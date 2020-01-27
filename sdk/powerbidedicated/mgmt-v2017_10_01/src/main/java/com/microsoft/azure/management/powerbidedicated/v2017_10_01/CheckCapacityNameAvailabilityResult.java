/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.powerbidedicated.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.powerbidedicated.v2017_10_01.implementation.PowerBIDedicatedManager;
import com.microsoft.azure.management.powerbidedicated.v2017_10_01.implementation.CheckCapacityNameAvailabilityResultInner;

/**
 * Type representing CheckCapacityNameAvailabilityResult.
 */
public interface CheckCapacityNameAvailabilityResult extends HasInner<CheckCapacityNameAvailabilityResultInner>, HasManager<PowerBIDedicatedManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    String reason();

}
