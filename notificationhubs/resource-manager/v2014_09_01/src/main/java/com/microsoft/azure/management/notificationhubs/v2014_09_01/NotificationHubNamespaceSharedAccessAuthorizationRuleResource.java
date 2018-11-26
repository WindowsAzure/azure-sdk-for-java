/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation.SharedAccessAuthorizationRuleResourceInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.notificationhubs.v2014_09_01.implementation.NotificationHubsManager;
import java.util.Map;

/**
 * Type representing NotificationHubNamespaceSharedAccessAuthorizationRuleResource.
 */
public interface NotificationHubNamespaceSharedAccessAuthorizationRuleResource extends HasInner<SharedAccessAuthorizationRuleResourceInner>, Indexable, Updatable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource.Update>, HasManager<NotificationHubsManager> {
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
     * @return the properties value.
     */
    SharedAccessAuthorizationRuleProperties properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithNotificationHub, DefinitionStages.WithProperties, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a NotificationHubNamespaceSharedAccessAuthorizationRuleResource definition.
         */
        interface Blank extends WithNotificationHub {
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify NotificationHub.
         */
        interface WithNotificationHub {
           /**
            * Specifies resourceGroupName, namespaceName, notificationHubName.
            * @param resourceGroupName The name of the resource group
            * @param namespaceName The namespace name
            * @param notificationHubName The notification hub name
            * @return the next definition stage
            */
            WithProperties withExistingNotificationHub(String resourceGroupName, String namespaceName, String notificationHubName);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Properties.
         */
        interface WithProperties {
           /**
            * Specifies properties.
            * @param properties Gets or sets properties of the Namespace AuthorizationRules
            * @return the next definition stage
            */
            WithCreate withProperties(SharedAccessAuthorizationRuleProperties properties);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Gets or sets Namespace data center location
             * @return the next definition stage
             */
            WithCreate withLocation(String location);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Gets or sets Name of the Namespace AuthorizationRule
             * @return the next definition stage
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource>, DefinitionStages.WithLocation, DefinitionStages.WithName {
        }
    }
    /**
     * The template for a NotificationHubNamespaceSharedAccessAuthorizationRuleResource update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<NotificationHubNamespaceSharedAccessAuthorizationRuleResource>, UpdateStages.WithLocation, UpdateStages.WithName {
    }

    /**
     * Grouping of NotificationHubNamespaceSharedAccessAuthorizationRuleResource update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource update allowing to specify Location.
         */
        interface WithLocation {
            /**
             * Specifies location.
             * @param location Gets or sets Namespace data center location
             * @return the next update stage
             */
            Update withLocation(String location);
        }

        /**
         * The stage of the notificationhubnamespacesharedaccessauthorizationruleresource update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             * @param name Gets or sets Name of the Namespace AuthorizationRule
             * @return the next update stage
             */
            Update withName(String name);
        }

    }
}
