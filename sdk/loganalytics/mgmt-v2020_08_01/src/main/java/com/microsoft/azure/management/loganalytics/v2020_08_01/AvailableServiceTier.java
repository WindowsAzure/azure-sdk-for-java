/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.AvailableServiceTierInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.loganalytics.v2020_08_01.implementation.LogAnalyticsManager;

/**
 * Type representing AvailableServiceTier.
 */
public interface AvailableServiceTier extends HasInner<AvailableServiceTierInner>, HasManager<LogAnalyticsManager> {
    /**
     * @return the capacityReservationLevel value.
     */
    Long capacityReservationLevel();

    /**
     * @return the defaultRetention value.
     */
    Long defaultRetention();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the lastSkuUpdate value.
     */
    String lastSkuUpdate();

    /**
     * @return the maximumRetention value.
     */
    Long maximumRetention();

    /**
     * @return the minimumRetention value.
     */
    Long minimumRetention();

    /**
     * @return the serviceTier value.
     */
    SkuNameEnum serviceTier();

}
