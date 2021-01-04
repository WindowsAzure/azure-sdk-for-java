/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.netapp.v2020_09_01.implementation.SnapshotPolicyInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.netapp.v2020_09_01.implementation.NetAppManager;
import java.util.Map;

/**
 * Type representing SnapshotPolicy.
 */
public interface SnapshotPolicy extends HasInner<SnapshotPolicyInner>, Indexable, Refreshable<SnapshotPolicy>, Updatable<SnapshotPolicy.Update>, HasManager<NetAppManager> {
    /**
     * @return the dailySchedule value.
     */
    DailySchedule dailySchedule();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the hourlySchedule value.
     */
    HourlySchedule hourlySchedule();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the monthlySchedule value.
     */
    MonthlySchedule monthlySchedule();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the name1 value.
     */
    String name1();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the weeklySchedule value.
     */
    WeeklySchedule weeklySchedule();

    /**
     * The entirety of the SnapshotPolicy definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNetAppAccount, DefinitionStages.WithLocation, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of SnapshotPolicy definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a SnapshotPolicy definition.
         */
        interface Blank extends WithNetAppAccount {
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify NetAppAccount.
         */
        interface WithNetAppAccount {
           /**
            * Specifies resourceGroupName, accountName.
            * @param resourceGroupName The name of the resource group
            * @param accountName The name of the NetApp account
            * @return the next definition stage
            */
            WithLocation withExistingNetAppAccount(String resourceGroupName, String accountName);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location the location parameter value
            * @return the next definition stage
            */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify DailySchedule.
         */
        interface WithDailySchedule {
            /**
             * Specifies dailySchedule.
             * @param dailySchedule Schedule for daily snapshots
             * @return the next definition stage
             */
            WithCreate withDailySchedule(DailySchedule dailySchedule);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled The property to decide policy is enabled or not
             * @return the next definition stage
             */
            WithCreate withEnabled(Boolean enabled);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify HourlySchedule.
         */
        interface WithHourlySchedule {
            /**
             * Specifies hourlySchedule.
             * @param hourlySchedule Schedule for hourly snapshots
             * @return the next definition stage
             */
            WithCreate withHourlySchedule(HourlySchedule hourlySchedule);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify MonthlySchedule.
         */
        interface WithMonthlySchedule {
            /**
             * Specifies monthlySchedule.
             * @param monthlySchedule Schedule for monthly snapshots
             * @return the next definition stage
             */
            WithCreate withMonthlySchedule(MonthlySchedule monthlySchedule);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags the tags parameter value
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the snapshotpolicy definition allowing to specify WeeklySchedule.
         */
        interface WithWeeklySchedule {
            /**
             * Specifies weeklySchedule.
             * @param weeklySchedule Schedule for weekly snapshots
             * @return the next definition stage
             */
            WithCreate withWeeklySchedule(WeeklySchedule weeklySchedule);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<SnapshotPolicy>, DefinitionStages.WithDailySchedule, DefinitionStages.WithEnabled, DefinitionStages.WithHourlySchedule, DefinitionStages.WithMonthlySchedule, DefinitionStages.WithTags, DefinitionStages.WithWeeklySchedule {
        }
    }
    /**
     * The template for a SnapshotPolicy update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<SnapshotPolicy>, UpdateStages.WithDailySchedule, UpdateStages.WithEnabled, UpdateStages.WithHourlySchedule, UpdateStages.WithLocation, UpdateStages.WithMonthlySchedule, UpdateStages.WithTags, UpdateStages.WithWeeklySchedule {
    }

    /**
     * Grouping of SnapshotPolicy update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the snapshotpolicy update allowing to specify DailySchedule.
         */
        interface WithDailySchedule {
            /**
             * Specifies dailySchedule.
             * @param dailySchedule Schedule for daily snapshots
             * @return the next update stage
             */
            Update withDailySchedule(DailySchedule dailySchedule);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify Enabled.
         */
        interface WithEnabled {
            /**
             * Specifies enabled.
             * @param enabled The property to decide policy is enabled or not
             * @return the next update stage
             */
            Update withEnabled(Boolean enabled);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify HourlySchedule.
         */
        interface WithHourlySchedule {
            /**
             * Specifies hourlySchedule.
             * @param hourlySchedule Schedule for hourly snapshots
             * @return the next update stage
             */
            Update withHourlySchedule(HourlySchedule hourlySchedule);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Resource location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify MonthlySchedule.
         */
        interface WithMonthlySchedule {
            /**
             * Specifies monthlySchedule.
             * @param monthlySchedule Schedule for monthly snapshots
             * @return the next update stage
             */
            Update withMonthlySchedule(MonthlySchedule monthlySchedule);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the snapshotpolicy update allowing to specify WeeklySchedule.
         */
        interface WithWeeklySchedule {
            /**
             * Specifies weeklySchedule.
             * @param weeklySchedule Schedule for weekly snapshots
             * @return the next update stage
             */
            Update withWeeklySchedule(WeeklySchedule weeklySchedule);
        }

    }
}
