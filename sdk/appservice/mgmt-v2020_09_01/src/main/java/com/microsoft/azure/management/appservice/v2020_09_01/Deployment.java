/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2020_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.DeploymentInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2020_09_01.implementation.AppServiceManager;
import org.joda.time.DateTime;

/**
 * Type representing Deployment.
 */
public interface Deployment extends HasInner<DeploymentInner>, Indexable, Refreshable<Deployment>, Updatable<Deployment.Update>, HasManager<AppServiceManager> {
    /**
     * @return the active value.
     */
    Boolean active();

    /**
     * @return the author value.
     */
    String author();

    /**
     * @return the authorEmail value.
     */
    String authorEmail();

    /**
     * @return the deployer value.
     */
    String deployer();

    /**
     * @return the details value.
     */
    String details();

    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    Integer status();

    /**
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Deployment definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithSite, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Deployment definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Deployment definition.
         */
        interface Blank extends WithSite {
        }

        /**
         * The stage of the deployment definition allowing to specify Site.
         */
        interface WithSite {
           /**
            * Specifies resourceGroupName, name.
            * @param resourceGroupName Name of the resource group to which the resource belongs
            * @param name Name of the app
            * @return the next definition stage
            */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }

        /**
         * The stage of the deployment definition allowing to specify Active.
         */
        interface WithActive {
            /**
             * Specifies active.
             * @param active True if deployment is currently active, false if completed and null if not started
             * @return the next definition stage
             */
            WithCreate withActive(Boolean active);
        }

        /**
         * The stage of the deployment definition allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author Who authored the deployment
             * @return the next definition stage
             */
            WithCreate withAuthor(String author);
        }

        /**
         * The stage of the deployment definition allowing to specify AuthorEmail.
         */
        interface WithAuthorEmail {
            /**
             * Specifies authorEmail.
             * @param authorEmail Author email
             * @return the next definition stage
             */
            WithCreate withAuthorEmail(String authorEmail);
        }

        /**
         * The stage of the deployment definition allowing to specify Deployer.
         */
        interface WithDeployer {
            /**
             * Specifies deployer.
             * @param deployer Who performed the deployment
             * @return the next definition stage
             */
            WithCreate withDeployer(String deployer);
        }

        /**
         * The stage of the deployment definition allowing to specify Details.
         */
        interface WithDetails {
            /**
             * Specifies details.
             * @param details Details on deployment
             * @return the next definition stage
             */
            WithCreate withDetails(String details);
        }

        /**
         * The stage of the deployment definition allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             * @param endTime End time
             * @return the next definition stage
             */
            WithCreate withEndTime(DateTime endTime);
        }

        /**
         * The stage of the deployment definition allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next definition stage
             */
            WithCreate withKind(String kind);
        }

        /**
         * The stage of the deployment definition allowing to specify Message.
         */
        interface WithMessage {
            /**
             * Specifies message.
             * @param message Details about deployment status
             * @return the next definition stage
             */
            WithCreate withMessage(String message);
        }

        /**
         * The stage of the deployment definition allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             * @param startTime Start time
             * @return the next definition stage
             */
            WithCreate withStartTime(DateTime startTime);
        }

        /**
         * The stage of the deployment definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Deployment status
             * @return the next definition stage
             */
            WithCreate withStatus(Integer status);
        }

        /**
         * The stage of the deployment definition allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData The system metadata relating to this resource
             * @return the next definition stage
             */
            WithCreate withSystemData(SystemData systemData);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Deployment>, DefinitionStages.WithActive, DefinitionStages.WithAuthor, DefinitionStages.WithAuthorEmail, DefinitionStages.WithDeployer, DefinitionStages.WithDetails, DefinitionStages.WithEndTime, DefinitionStages.WithKind, DefinitionStages.WithMessage, DefinitionStages.WithStartTime, DefinitionStages.WithStatus, DefinitionStages.WithSystemData {
        }
    }
    /**
     * The template for a Deployment update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Deployment>, UpdateStages.WithActive, UpdateStages.WithAuthor, UpdateStages.WithAuthorEmail, UpdateStages.WithDeployer, UpdateStages.WithDetails, UpdateStages.WithEndTime, UpdateStages.WithKind, UpdateStages.WithMessage, UpdateStages.WithStartTime, UpdateStages.WithStatus, UpdateStages.WithSystemData {
    }

    /**
     * Grouping of Deployment update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the deployment update allowing to specify Active.
         */
        interface WithActive {
            /**
             * Specifies active.
             * @param active True if deployment is currently active, false if completed and null if not started
             * @return the next update stage
             */
            Update withActive(Boolean active);
        }

        /**
         * The stage of the deployment update allowing to specify Author.
         */
        interface WithAuthor {
            /**
             * Specifies author.
             * @param author Who authored the deployment
             * @return the next update stage
             */
            Update withAuthor(String author);
        }

        /**
         * The stage of the deployment update allowing to specify AuthorEmail.
         */
        interface WithAuthorEmail {
            /**
             * Specifies authorEmail.
             * @param authorEmail Author email
             * @return the next update stage
             */
            Update withAuthorEmail(String authorEmail);
        }

        /**
         * The stage of the deployment update allowing to specify Deployer.
         */
        interface WithDeployer {
            /**
             * Specifies deployer.
             * @param deployer Who performed the deployment
             * @return the next update stage
             */
            Update withDeployer(String deployer);
        }

        /**
         * The stage of the deployment update allowing to specify Details.
         */
        interface WithDetails {
            /**
             * Specifies details.
             * @param details Details on deployment
             * @return the next update stage
             */
            Update withDetails(String details);
        }

        /**
         * The stage of the deployment update allowing to specify EndTime.
         */
        interface WithEndTime {
            /**
             * Specifies endTime.
             * @param endTime End time
             * @return the next update stage
             */
            Update withEndTime(DateTime endTime);
        }

        /**
         * The stage of the deployment update allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             * @param kind Kind of resource
             * @return the next update stage
             */
            Update withKind(String kind);
        }

        /**
         * The stage of the deployment update allowing to specify Message.
         */
        interface WithMessage {
            /**
             * Specifies message.
             * @param message Details about deployment status
             * @return the next update stage
             */
            Update withMessage(String message);
        }

        /**
         * The stage of the deployment update allowing to specify StartTime.
         */
        interface WithStartTime {
            /**
             * Specifies startTime.
             * @param startTime Start time
             * @return the next update stage
             */
            Update withStartTime(DateTime startTime);
        }

        /**
         * The stage of the deployment update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status Deployment status
             * @return the next update stage
             */
            Update withStatus(Integer status);
        }

        /**
         * The stage of the deployment update allowing to specify SystemData.
         */
        interface WithSystemData {
            /**
             * Specifies systemData.
             * @param systemData The system metadata relating to this resource
             * @return the next update stage
             */
            Update withSystemData(SystemData systemData);
        }

    }
}
