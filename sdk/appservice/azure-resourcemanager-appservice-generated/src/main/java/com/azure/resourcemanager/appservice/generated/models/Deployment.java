// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of Deployment. */
public interface Deployment {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the kind property: Kind of resource.
     *
     * @return the kind value.
     */
    String kind();

    /**
     * Gets the status property: Deployment status.
     *
     * @return the status value.
     */
    Integer status();

    /**
     * Gets the message property: Details about deployment status.
     *
     * @return the message value.
     */
    String message();

    /**
     * Gets the author property: Who authored the deployment.
     *
     * @return the author value.
     */
    String author();

    /**
     * Gets the deployer property: Who performed the deployment.
     *
     * @return the deployer value.
     */
    String deployer();

    /**
     * Gets the authorEmail property: Author email.
     *
     * @return the authorEmail value.
     */
    String authorEmail();

    /**
     * Gets the startTime property: Start time.
     *
     * @return the startTime value.
     */
    OffsetDateTime startTime();

    /**
     * Gets the endTime property: End time.
     *
     * @return the endTime value.
     */
    OffsetDateTime endTime();

    /**
     * Gets the active property: True if deployment is currently active, false if completed and null if not started.
     *
     * @return the active value.
     */
    Boolean active();

    /**
     * Gets the details property: Details on deployment.
     *
     * @return the details value.
     */
    String details();

    /**
     * Gets the inner com.azure.resourcemanager.appservice.generated.fluent.models.DeploymentInner object.
     *
     * @return the inner object.
     */
    DeploymentInner innerModel();

    /** The entirety of the Deployment definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Deployment definition stages. */
    interface DefinitionStages {
        /** The first stage of the Deployment definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Deployment definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, name.
             *
             * @param resourceGroupName Name of the resource group to which the resource belongs.
             * @param name Name of the app.
             * @return the next definition stage.
             */
            WithCreate withExistingSite(String resourceGroupName, String name);
        }
        /**
         * The stage of the Deployment definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithKind,
                DefinitionStages.WithStatus,
                DefinitionStages.WithMessage,
                DefinitionStages.WithAuthor,
                DefinitionStages.WithDeployer,
                DefinitionStages.WithAuthorEmail,
                DefinitionStages.WithStartTime,
                DefinitionStages.WithEndTime,
                DefinitionStages.WithActive,
                DefinitionStages.WithDetails {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Deployment create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Deployment create(Context context);
        }
        /** The stage of the Deployment definition allowing to specify kind. */
        interface WithKind {
            /**
             * Specifies the kind property: Kind of resource..
             *
             * @param kind Kind of resource.
             * @return the next definition stage.
             */
            WithCreate withKind(String kind);
        }
        /** The stage of the Deployment definition allowing to specify status. */
        interface WithStatus {
            /**
             * Specifies the status property: Deployment status..
             *
             * @param status Deployment status.
             * @return the next definition stage.
             */
            WithCreate withStatus(Integer status);
        }
        /** The stage of the Deployment definition allowing to specify message. */
        interface WithMessage {
            /**
             * Specifies the message property: Details about deployment status..
             *
             * @param message Details about deployment status.
             * @return the next definition stage.
             */
            WithCreate withMessage(String message);
        }
        /** The stage of the Deployment definition allowing to specify author. */
        interface WithAuthor {
            /**
             * Specifies the author property: Who authored the deployment..
             *
             * @param author Who authored the deployment.
             * @return the next definition stage.
             */
            WithCreate withAuthor(String author);
        }
        /** The stage of the Deployment definition allowing to specify deployer. */
        interface WithDeployer {
            /**
             * Specifies the deployer property: Who performed the deployment..
             *
             * @param deployer Who performed the deployment.
             * @return the next definition stage.
             */
            WithCreate withDeployer(String deployer);
        }
        /** The stage of the Deployment definition allowing to specify authorEmail. */
        interface WithAuthorEmail {
            /**
             * Specifies the authorEmail property: Author email..
             *
             * @param authorEmail Author email.
             * @return the next definition stage.
             */
            WithCreate withAuthorEmail(String authorEmail);
        }
        /** The stage of the Deployment definition allowing to specify startTime. */
        interface WithStartTime {
            /**
             * Specifies the startTime property: Start time..
             *
             * @param startTime Start time.
             * @return the next definition stage.
             */
            WithCreate withStartTime(OffsetDateTime startTime);
        }
        /** The stage of the Deployment definition allowing to specify endTime. */
        interface WithEndTime {
            /**
             * Specifies the endTime property: End time..
             *
             * @param endTime End time.
             * @return the next definition stage.
             */
            WithCreate withEndTime(OffsetDateTime endTime);
        }
        /** The stage of the Deployment definition allowing to specify active. */
        interface WithActive {
            /**
             * Specifies the active property: True if deployment is currently active, false if completed and null if not
             * started..
             *
             * @param active True if deployment is currently active, false if completed and null if not started.
             * @return the next definition stage.
             */
            WithCreate withActive(Boolean active);
        }
        /** The stage of the Deployment definition allowing to specify details. */
        interface WithDetails {
            /**
             * Specifies the details property: Details on deployment..
             *
             * @param details Details on deployment.
             * @return the next definition stage.
             */
            WithCreate withDetails(String details);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Deployment refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Deployment refresh(Context context);
}
