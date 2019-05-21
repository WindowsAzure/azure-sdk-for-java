/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.ProjectTaskInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;

/**
 * Type representing ProjectTask.
 */
public interface ProjectTask extends HasInner<ProjectTaskInner>, Indexable, Refreshable<ProjectTask>, Updatable<ProjectTask.Update>, HasManager<DataMigrationManager> {
    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    ProjectTaskProperties properties();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the ProjectTask definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithProject, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of ProjectTask definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a ProjectTask definition.
         */
        interface Blank extends WithProject {
        }

        /**
         * The stage of the projecttask definition allowing to specify Project.
         */
        interface WithProject {
           /**
            * Specifies groupName, serviceName, projectName.
            * @param groupName Name of the resource group
            * @param serviceName Name of the service
            * @param projectName Name of the project
            * @return the next definition stage
            */
            WithCreate withExistingProject(String groupName, String serviceName, String projectName);
        }

        /**
         * The stage of the projecttask definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag HTTP strong entity tag value. This is ignored if submitted
             * @return the next definition stage
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the projecttask definition allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Custom task properties
             * @return the next definition stage
             */
            WithCreate withProperties(ProjectTaskProperties properties);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<ProjectTask>, DefinitionStages.WithEtag, DefinitionStages.WithProperties {
        }
    }
    /**
     * The template for a ProjectTask update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<ProjectTask>, UpdateStages.WithEtag, UpdateStages.WithProperties {
    }

    /**
     * Grouping of ProjectTask update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the projecttask update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             * @param etag HTTP strong entity tag value. This is ignored if submitted
             * @return the next update stage
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the projecttask update allowing to specify Properties.
         */
        interface WithProperties {
            /**
             * Specifies properties.
             * @param properties Custom task properties
             * @return the next update stage
             */
            Update withProperties(ProjectTaskProperties properties);
        }

    }
}
