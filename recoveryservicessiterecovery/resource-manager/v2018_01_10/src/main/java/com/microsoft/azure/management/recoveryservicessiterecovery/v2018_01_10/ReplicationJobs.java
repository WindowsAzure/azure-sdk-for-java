/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10;

import rx.Observable;
import com.microsoft.azure.management.recoveryservicessiterecovery.v2018_01_10.implementation.ReplicationJobsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationJobs.
 */
public interface ReplicationJobs extends HasInner<ReplicationJobsInner> {
    /**
     * Resumes the specified job.
     * The operation to resume an Azure Site Recovery job.
     *
     * @param jobName Job identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> resumeAsync(String jobName);

    /**
     * Restarts the specified job.
     * The operation to restart an Azure Site Recovery job.
     *
     * @param jobName Job identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> restartAsync(String jobName);

    /**
     * Cancels the specified job.
     * The operation to cancel an Azure Site Recovery job.
     *
     * @param jobName Job identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> cancelAsync(String jobName);

    /**
     * Exports the details of the Azure Site Recovery jobs of the vault.
     * The operation to export the details of the Azure Site Recovery jobs of the vault.
     *
     * @param jobQueryParameter job query filter.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> exportAsync(JobQueryParameter jobQueryParameter);

    /**
     * Gets the job details.
     * Get the details of an Azure Site Recovery job.
     *
     * @param jobName Job identifier
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> getAsync(String jobName);

    /**
     * Gets the list of jobs.
     * Gets the list of Azure Site Recovery Jobs for the vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Job> listAsync();

}
