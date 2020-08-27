/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.redis.v2018_03_01.implementation.PatchSchedulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing PatchSchedules.
 */
public interface PatchSchedules extends SupportsCreating<RedisPatchSchedule.DefinitionStages.Blank>, HasInner<PatchSchedulesInner> {
    /**
     * Gets the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RedisPatchSchedule> getAsync(String resourceGroupName, String name);

    /**
     * Gets all patch schedules in the specified redis cache (there is only one).
     *
     * @param resourceGroupName The name of the resource group.
     * @param cacheName The name of the Redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RedisPatchSchedule> listByRedisResourceAsync(final String resourceGroupName, final String cacheName);

    /**
     * Deletes the patching schedule of a redis cache.
     *
     * @param resourceGroupName The name of the resource group.
     * @param name The name of the redis cache.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String name);

}
