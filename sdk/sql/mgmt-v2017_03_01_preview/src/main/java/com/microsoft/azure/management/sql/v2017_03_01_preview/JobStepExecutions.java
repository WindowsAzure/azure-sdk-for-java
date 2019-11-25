/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import rx.Observable;
import com.microsoft.azure.management.sql.v2017_03_01_preview.ExecutionJobJobAgentServerJobExecution;

import java.util.UUID;

/**
 * Type representing JobStepExecutions.
 */
public interface JobStepExecutions {
    /**
     * Gets a step execution of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The unique id of the job execution
     * @param stepName The name of the step.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExecutionJobJobAgentServerJobExecution> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, UUID jobExecutionId, String stepName);

    /**
     * Lists the step executions of a job execution.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param jobExecutionId The id of the job execution
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ExecutionJobJobAgentServerJobExecution> listByJobExecutionAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName, final UUID jobExecutionId);

}
