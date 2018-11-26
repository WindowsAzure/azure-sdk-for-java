/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.implementation.ProjectInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_03_31_preview.implementation.DataMigrationManager;
import java.util.Map;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing Project.
 */
public interface Project extends HasInner<ProjectInner>, Indexable, Refreshable<Project>, Updatable<Project.Update>, HasManager<DataMigrationManager> {
    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the databasesInfo value.
     */
    List<DatabaseInfo> databasesInfo();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the provisioningState value.
     */
    ProjectProvisioningState provisioningState();

    /**
     * @return the sourceConnectionInfo value.
     */
    ConnectionInfo sourceConnectionInfo();

    /**
     * @return the sourcePlatform value.
     */
    ProjectSourcePlatform sourcePlatform();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the targetConnectionInfo value.
     */
    ConnectionInfo targetConnectionInfo();

    /**
     * @return the targetPlatform value.
     */
    ProjectTargetPlatform targetPlatform();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Project definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithService, DefinitionStages.WithLocation, DefinitionStages.WithSourcePlatform, DefinitionStages.WithTargetPlatform, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Project definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Project definition.
         */
        interface Blank extends WithService {
        }

        /**
         * The stage of the project definition allowing to specify Service.
         */
        interface WithService {
           /**
            * Specifies groupName, serviceName.
            * @param groupName Name of the resource group
            * @param serviceName Name of the service
            * @return the next definition stage
            */
            WithLocation withExistingService(String groupName, String serviceName);
        }

        /**
         * The stage of the project definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location Resource location
            * @return the next definition stage
            */
            WithSourcePlatform withLocation(String location);
        }

        /**
         * The stage of the project definition allowing to specify SourcePlatform.
         */
        interface WithSourcePlatform {
           /**
            * Specifies sourcePlatform.
            * @param sourcePlatform Source platform for the project. Possible values include: 'SQL', 'Unknown'
            * @return the next definition stage
            */
            WithTargetPlatform withSourcePlatform(ProjectSourcePlatform sourcePlatform);
        }

        /**
         * The stage of the project definition allowing to specify TargetPlatform.
         */
        interface WithTargetPlatform {
           /**
            * Specifies targetPlatform.
            * @param targetPlatform Target platform for the project. Possible values include: 'SQLDB', 'SQLMI', 'Unknown'
            * @return the next definition stage
            */
            WithCreate withTargetPlatform(ProjectTargetPlatform targetPlatform);
        }

        /**
         * The stage of the project definition allowing to specify DatabasesInfo.
         */
        interface WithDatabasesInfo {
            /**
             * Specifies databasesInfo.
             * @param databasesInfo List of DatabaseInfo
             * @return the next definition stage
             */
            WithCreate withDatabasesInfo(List<DatabaseInfo> databasesInfo);
        }

        /**
         * The stage of the project definition allowing to specify SourceConnectionInfo.
         */
        interface WithSourceConnectionInfo {
            /**
             * Specifies sourceConnectionInfo.
             * @param sourceConnectionInfo Information for connecting to source
             * @return the next definition stage
             */
            WithCreate withSourceConnectionInfo(ConnectionInfo sourceConnectionInfo);
        }

        /**
         * The stage of the project definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags Resource tags
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the project definition allowing to specify TargetConnectionInfo.
         */
        interface WithTargetConnectionInfo {
            /**
             * Specifies targetConnectionInfo.
             * @param targetConnectionInfo Information for connecting to target
             * @return the next definition stage
             */
            WithCreate withTargetConnectionInfo(ConnectionInfo targetConnectionInfo);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Project>, DefinitionStages.WithDatabasesInfo, DefinitionStages.WithSourceConnectionInfo, DefinitionStages.WithTags, DefinitionStages.WithTargetConnectionInfo {
        }
    }
    /**
     * The template for a Project update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Project>, UpdateStages.WithDatabasesInfo, UpdateStages.WithSourceConnectionInfo, UpdateStages.WithTags, UpdateStages.WithTargetConnectionInfo {
    }

    /**
     * Grouping of Project update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the project update allowing to specify DatabasesInfo.
         */
        interface WithDatabasesInfo {
            /**
             * Specifies databasesInfo.
             * @param databasesInfo List of DatabaseInfo
             * @return the next update stage
             */
            Update withDatabasesInfo(List<DatabaseInfo> databasesInfo);
        }

        /**
         * The stage of the project update allowing to specify SourceConnectionInfo.
         */
        interface WithSourceConnectionInfo {
            /**
             * Specifies sourceConnectionInfo.
             * @param sourceConnectionInfo Information for connecting to source
             * @return the next update stage
             */
            Update withSourceConnectionInfo(ConnectionInfo sourceConnectionInfo);
        }

        /**
         * The stage of the project update allowing to specify Tags.
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
         * The stage of the project update allowing to specify TargetConnectionInfo.
         */
        interface WithTargetConnectionInfo {
            /**
             * Specifies targetConnectionInfo.
             * @param targetConnectionInfo Information for connecting to target
             * @return the next update stage
             */
            Update withTargetConnectionInfo(ConnectionInfo targetConnectionInfo);
        }

    }
}
