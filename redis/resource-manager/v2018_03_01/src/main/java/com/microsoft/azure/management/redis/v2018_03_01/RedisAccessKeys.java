/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.redis.v2018_03_01.implementation.CacheManager;
import com.microsoft.azure.management.redis.v2018_03_01.implementation.RedisAccessKeysInner;

/**
 * Type representing RedisAccessKeys.
 */
public interface RedisAccessKeys extends HasInner<RedisAccessKeysInner>, HasManager<CacheManager> {
    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}
