/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2019_03_22_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation.IoTHubManager;
import com.microsoft.azure.management.iothub.v2019_03_22_preview.implementation.UserSubscriptionQuotaInner;

/**
 * Type representing UserSubscriptionQuota.
 */
public interface UserSubscriptionQuota extends HasInner<UserSubscriptionQuotaInner>, HasManager<IoTHubManager> {
    /**
     * @return the currentValue value.
     */
    Integer currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    Integer limit();

    /**
     * @return the name value.
     */
    Name name();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the unit value.
     */
    String unit();

}
