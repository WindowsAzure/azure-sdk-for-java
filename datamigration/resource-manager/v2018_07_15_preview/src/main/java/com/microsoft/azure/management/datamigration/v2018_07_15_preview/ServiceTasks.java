/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2018_07_15_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.datamigration.v2018_07_15_preview.implementation.ServiceTasksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceTasks.
 */
public interface ServiceTasks extends SupportsCreating<ServiceProjectTask.DefinitionStages.Blank>, HasInner<ServiceTasksInner> {
    /**
     * Cancel a service task.
     * The service tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. This method cancels a service task if it's currently queued or running.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProjectServiceProjectTask> cancelAsync(String groupName, String serviceName, String taskName);

    /**
     * Get service task information.
     * The service tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The GET method retrieves information about a service task.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProjectTask> getAsync(String groupName, String serviceName, String taskName);

    /**
     * Get service level tasks for a service.
     * The services resource is the top-level resource that represents the Database Migration Service. This method returns a list of service level tasks owned by a service resource. Some tasks may have a status of Unknown, which indicates that an error occurred while querying the status of that task.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceProjectTask> listAsync(final String groupName, final String serviceName);

    /**
     * Delete service task.
     * The service tasks resource is a nested, proxy-only resource representing work performed by a DMS instance. The DELETE method deletes a service task, canceling it first if it's running.
     *
     * @param groupName Name of the resource group
     * @param serviceName Name of the service
     * @param taskName Name of the Task
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String groupName, String serviceName, String taskName);

}
