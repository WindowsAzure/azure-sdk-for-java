/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.JobInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.sql.v2017_03_01_preview.implementation.SqlManager;

/**
 * Type representing Job.
 */
public interface Job extends HasInner<JobInner>, Indexable, Refreshable<Job>, Updatable<Job.Update>, HasManager<SqlManager> {
    /**
     * @return the description value.
     */
    String description();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the schedule value.
     */
    JobSchedule schedule();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the version value.
     */
    Integer version();

    /**
     * The entirety of the Job definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithJobAgent, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Job definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Job definition.
         */
        interface Blank extends WithJobAgent {
        }

        /**
         * The stage of the job definition allowing to specify JobAgent.
         */
        interface WithJobAgent {
           /**
            * Specifies resourceGroupName, serverName, jobAgentName.
            * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal
            * @param serverName The name of the server
            * @param jobAgentName The name of the job agent
            * @return the next definition stage
            */
            WithCreate withExistingJobAgent(String resourceGroupName, String serverName, String jobAgentName);
        }

        /**
         * The stage of the job definition allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description User-defined description of the job
             * @return the next definition stage
             */
            WithCreate withDescription(String description);
        }

        /**
         * The stage of the job definition allowing to specify Schedule.
         */
        interface WithSchedule {
            /**
             * Specifies schedule.
             * @param schedule Schedule properties of the job
             * @return the next definition stage
             */
            WithCreate withSchedule(JobSchedule schedule);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Job>, DefinitionStages.WithDescription, DefinitionStages.WithSchedule {
        }
    }
    /**
     * The template for a Job update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Job>, UpdateStages.WithDescription, UpdateStages.WithSchedule {
    }

    /**
     * Grouping of Job update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the job update allowing to specify Description.
         */
        interface WithDescription {
            /**
             * Specifies description.
             * @param description User-defined description of the job
             * @return the next update stage
             */
            Update withDescription(String description);
        }

        /**
         * The stage of the job update allowing to specify Schedule.
         */
        interface WithSchedule {
            /**
             * Specifies schedule.
             * @param schedule Schedule properties of the job
             * @return the next update stage
             */
            Update withSchedule(JobSchedule schedule);
        }

    }
}
