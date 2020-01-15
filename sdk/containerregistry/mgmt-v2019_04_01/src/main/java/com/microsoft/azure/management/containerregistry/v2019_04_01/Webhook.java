/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2019_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.containerregistry.v2019_04_01.implementation.WebhookInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerregistry.v2019_04_01.implementation.ContainerRegistryManager;
import java.util.Map;
import java.util.List;

/**
 * Type representing Webhook.
 */
public interface Webhook extends HasInner<WebhookInner>, Indexable, Refreshable<Webhook>, Updatable<Webhook.Update>, HasManager<ContainerRegistryManager> {
    /**
     * @return the actions value.
     */
    List<WebhookAction> actions();

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
    ProvisioningState provisioningState();

    /**
     * @return the scope value.
     */
    String scope();

    /**
     * @return the status value.
     */
    WebhookStatus status();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * The entirety of the Webhook definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithRegistry, DefinitionStages.WithActions, DefinitionStages.WithLocation, DefinitionStages.WithServiceUri, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Webhook definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Webhook definition.
         */
        interface Blank extends WithRegistry {
        }

        /**
         * The stage of the webhook definition allowing to specify Registry.
         */
        interface WithRegistry {
           /**
            * Specifies resourceGroupName, registryName.
            * @param resourceGroupName The name of the resource group to which the container registry belongs
            * @param registryName The name of the container registry
            * @return the next definition stage
            */
            WithActions withExistingRegistry(String resourceGroupName, String registryName);
        }

        /**
         * The stage of the webhook definition allowing to specify Actions.
         */
        interface WithActions {
           /**
            * Specifies actions.
            * @param actions The list of actions that trigger the webhook to post notifications
            * @return the next definition stage
            */
            WithLocation withActions(List<WebhookAction> actions);
        }

        /**
         * The stage of the webhook definition allowing to specify Location.
         */
        interface WithLocation {
           /**
            * Specifies location.
            * @param location The location of the webhook. This cannot be changed after the resource is created
            * @return the next definition stage
            */
            WithServiceUri withLocation(String location);
        }

        /**
         * The stage of the webhook definition allowing to specify ServiceUri.
         */
        interface WithServiceUri {
           /**
            * Specifies serviceUri.
            * @param serviceUri The service URI for the webhook to post notifications
            * @return the next definition stage
            */
            WithCreate withServiceUri(String serviceUri);
        }

        /**
         * The stage of the webhook definition allowing to specify CustomHeaders.
         */
        interface WithCustomHeaders {
            /**
             * Specifies customHeaders.
             * @param customHeaders Custom headers that will be added to the webhook notifications
             * @return the next definition stage
             */
            WithCreate withCustomHeaders(Map<String, String> customHeaders);
        }

        /**
         * The stage of the webhook definition allowing to specify Scope.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * @param scope The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events
             * @return the next definition stage
             */
            WithCreate withScope(String scope);
        }

        /**
         * The stage of the webhook definition allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'
             * @return the next definition stage
             */
            WithCreate withStatus(WebhookStatus status);
        }

        /**
         * The stage of the webhook definition allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags for the webhook
             * @return the next definition stage
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Webhook>, DefinitionStages.WithCustomHeaders, DefinitionStages.WithScope, DefinitionStages.WithStatus, DefinitionStages.WithTags {
        }
    }
    /**
     * The template for a Webhook update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Webhook>, UpdateStages.WithActions, UpdateStages.WithCustomHeaders, UpdateStages.WithScope, UpdateStages.WithServiceUri, UpdateStages.WithStatus, UpdateStages.WithTags {
    }

    /**
     * Grouping of Webhook update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the webhook update allowing to specify Actions.
         */
        interface WithActions {
            /**
             * Specifies actions.
             * @param actions The list of actions that trigger the webhook to post notifications
             * @return the next update stage
             */
            Update withActions(List<WebhookAction> actions);
        }

        /**
         * The stage of the webhook update allowing to specify CustomHeaders.
         */
        interface WithCustomHeaders {
            /**
             * Specifies customHeaders.
             * @param customHeaders Custom headers that will be added to the webhook notifications
             * @return the next update stage
             */
            Update withCustomHeaders(Map<String, String> customHeaders);
        }

        /**
         * The stage of the webhook update allowing to specify Scope.
         */
        interface WithScope {
            /**
             * Specifies scope.
             * @param scope The scope of repositories where the event can be triggered. For example, 'foo:*' means events for all tags under repository 'foo'. 'foo:bar' means events for 'foo:bar' only. 'foo' is equivalent to 'foo:latest'. Empty means all events
             * @return the next update stage
             */
            Update withScope(String scope);
        }

        /**
         * The stage of the webhook update allowing to specify ServiceUri.
         */
        interface WithServiceUri {
            /**
             * Specifies serviceUri.
             * @param serviceUri The service URI for the webhook to post notifications
             * @return the next update stage
             */
            Update withServiceUri(String serviceUri);
        }

        /**
         * The stage of the webhook update allowing to specify Status.
         */
        interface WithStatus {
            /**
             * Specifies status.
             * @param status The status of the webhook at the time the operation was called. Possible values include: 'enabled', 'disabled'
             * @return the next update stage
             */
            Update withStatus(WebhookStatus status);
        }

        /**
         * The stage of the webhook update allowing to specify Tags.
         */
        interface WithTags {
            /**
             * Specifies tags.
             * @param tags The tags for the webhook
             * @return the next update stage
             */
            Update withTags(Map<String, String> tags);
        }

    }
}
