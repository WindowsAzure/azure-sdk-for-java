/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.redis.v2017_10_01.implementation.CacheManager;
import com.microsoft.azure.management.redis.v2017_10_01.implementation.NotificationListResponseInner;
import java.util.List;

/**
 * Type representing NotificationListResponse.
 */
public interface NotificationListResponse extends HasInner<NotificationListResponseInner>, HasManager<CacheManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<UpgradeNotification> value();

}
