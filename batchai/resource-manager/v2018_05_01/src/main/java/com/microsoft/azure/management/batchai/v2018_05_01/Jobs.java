/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_05_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.batchai.v2018_05_01.implementation.JobsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Jobs.
 */
public interface Jobs extends SupportsCreating<Job.DefinitionStages.Blank>, HasInner<JobsInner> {
    /**
     * List all directories and files inside the given directory of the Job's output directory (if the output directory is on Azure File Share or Azure Storage Container).
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobsListOutputFilesOptions Additional parameters for the operation
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<File> listOutputFilesAsync(final String resourceGroupName, final String workspaceName, final String experimentName, final String jobName, final JobsListOutputFilesOptions jobsListOutputFilesOptions);

    /**
     * Gets a list of currently existing nodes which were used for the Job execution. The returned information contains the node ID, its public IP and SSH port.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String workspaceName, final String experimentName, final String jobName);

    /**
     * Terminates a job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable terminateAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Gets information about a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> getAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName);

    /**
     * Gets a list of Jobs within the specified Experiment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> listByExperimentAsync(final String resourceGroupName, final String workspaceName, final String experimentName);

    /**
     * Deletes a Job.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param workspaceName The name of the workspace. Workspace names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param experimentName The name of the experiment. Experiment names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @param jobName The name of the job within the specified resource group. Job names can only contain a combination of alphanumeric characters along with dash (-) and underscore (_). The name must be from 1 through 64 characters long.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName, String experimentName, String jobName);

}
