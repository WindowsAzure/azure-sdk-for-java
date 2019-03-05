/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.edgegateway;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.edgegateway.implementation.BandwidthScheduleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.edgegateway.implementation.DataBoxEdgeManager;
import java.util.List;

/**
 * Type representing BandwidthSchedule.
 */
public interface BandwidthSchedule extends HasInner<BandwidthScheduleInner>, Indexable, Refreshable<BandwidthSchedule>, Updatable<BandwidthSchedule.Update>, HasManager<DataBoxEdgeManager> {
    /**
     * @return the days value.
     */
    List<DayOfWeek> days();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the rateInMbps value.
     */
    int rateInMbps();

    /**
     * @return the start value.
     */
    String start();

    /**
     * @return the stop value.
     */
    String stop();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the BandwidthSchedule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithDataBoxEdgeDevice, DefinitionStages.WithDays, DefinitionStages.WithRateInMbps, DefinitionStages.WithStart, DefinitionStages.WithStop, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of BandwidthSchedule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a BandwidthSchedule definition.
         */
        interface Blank extends WithDataBoxEdgeDevice {
        }

        /**
         * The stage of the bandwidthschedule definition allowing to specify DataBoxEdgeDevice.
         */
        interface WithDataBoxEdgeDevice {
           /**
            * Specifies deviceName, resourceGroupName.
            * @param deviceName The device name
            * @param resourceGroupName The resource group name
            * @return the next definition stage
            */
            WithDays withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName);
        }

        /**
         * The stage of the bandwidthschedule definition allowing to specify Days.
         */
        interface WithDays {
           /**
            * Specifies days.
            * @param days The days of the week when this schedule is applicable
            * @return the next definition stage
            */
            WithRateInMbps withDays(List<DayOfWeek> days);
        }

        /**
         * The stage of the bandwidthschedule definition allowing to specify RateInMbps.
         */
        interface WithRateInMbps {
           /**
            * Specifies rateInMbps.
            * @param rateInMbps The bandwidth rate in Mbps
            * @return the next definition stage
            */
            WithStart withRateInMbps(int rateInMbps);
        }

        /**
         * The stage of the bandwidthschedule definition allowing to specify Start.
         */
        interface WithStart {
           /**
            * Specifies start.
            * @param start The start time of the schedule in UTC
            * @return the next definition stage
            */
            WithStop withStart(String start);
        }

        /**
         * The stage of the bandwidthschedule definition allowing to specify Stop.
         */
        interface WithStop {
           /**
            * Specifies stop.
            * @param stop The stop time of the schedule in UTC
            * @return the next definition stage
            */
            WithCreate withStop(String stop);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<BandwidthSchedule> {
        }
    }
    /**
     * The template for a BandwidthSchedule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<BandwidthSchedule> {
    }

    /**
     * Grouping of BandwidthSchedule update stages.
     */
    interface UpdateStages {
    }
}
