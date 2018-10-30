/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.SchedulesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Schedules.
 */
public interface Schedules extends SupportsCreating<LabSchedule.DefinitionStages.Blank>, HasInner<SchedulesInner> {
    /**
     * Execute a schedule. This operation can take a while to complete.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable executeAsync(String resourceGroupName, String labName, String name);

    /**
     * Lists all applicable schedules.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Schedule> listApplicableAsync(final String resourceGroupName, final String labName, final String name);

    /**
     * Get schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LabSchedule> getAsync(String resourceGroupName, String labName, String name);

    /**
     * List schedules in a given lab.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LabSchedule> listAsync(final String resourceGroupName, final String labName);

    /**
     * Delete schedule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param name The name of the schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String name);

}
