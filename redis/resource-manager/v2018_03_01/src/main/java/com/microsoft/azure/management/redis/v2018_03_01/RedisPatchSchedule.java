/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2018_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.redis.v2018_03_01.implementation.RedisPatchScheduleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.redis.v2018_03_01.implementation.RedisManager;
import java.util.List;

/**
 * Type representing RedisPatchSchedule.
 */
public interface RedisPatchSchedule extends HasInner<RedisPatchScheduleInner>, Indexable, Refreshable<RedisPatchSchedule>, Updatable<RedisPatchSchedule.Update>, HasManager<RedisManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the scheduleEntries value.
     */
    List<ScheduleEntry> scheduleEntries();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the RedisPatchSchedule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRedis, DefinitionStages.WithScheduleEntries, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of RedisPatchSchedule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a RedisPatchSchedule definition.
         */
        interface Blank extends WithRedis {
        }

        /**
         * The stage of the redispatchschedule definition allowing to specify Redis.
         */
        interface WithRedis {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName The name of the resource group
            * @param name The name of the Redis cache
            * @return the next definition stage
            */
            WithScheduleEntries withExistingRedis(String resourceGroupName, String name);
        }

        /**
         * The stage of the redispatchschedule definition allowing to specify ScheduleEntries.
         */
        interface WithScheduleEntries {
           /**
            * Specifies scheduleEntries.
            * @param scheduleEntries List of patch schedules for a Redis cache
            * @return the next definition stage
            */
            WithCreate withScheduleEntries(List<ScheduleEntry> scheduleEntries);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<RedisPatchSchedule> {
        }
    }
    /**
     * The template for a RedisPatchSchedule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<RedisPatchSchedule>, UpdateStages.WithScheduleEntries {
    }

    /**
     * Grouping of RedisPatchSchedule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the redispatchschedule update allowing to specify ScheduleEntries.
         */
        interface WithScheduleEntries {
            /**
             * Specifies scheduleEntries.
             * @param scheduleEntries List of patch schedules for a Redis cache
             * @return the next update stage
             */
            Update withScheduleEntries(List<ScheduleEntry> scheduleEntries);
        }

    }
}
