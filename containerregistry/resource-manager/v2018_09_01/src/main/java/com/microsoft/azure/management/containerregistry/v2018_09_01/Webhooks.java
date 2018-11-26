/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.containerregistry.v2018_09_01.implementation.WebhooksInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Webhooks.
 */
public interface Webhooks extends SupportsCreating<Webhook.DefinitionStages.Blank>, HasInner<WebhooksInner> {
    /**
     * Triggers a ping event to be sent to the webhook.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventInfo> pingAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Gets the configuration of service URI and custom headers for the webhook.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CallbackConfig> getCallbackConfigAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Lists recent events for the specified webhook.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Event> listEventsAsync(final String resourceGroupName, final String registryName, final String webhookName);

    /**
     * Gets the properties of the specified webhook.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Webhook> getAsync(String resourceGroupName, String registryName, String webhookName);

    /**
     * Lists all the webhooks for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Webhook> listAsync(final String resourceGroupName, final String registryName);

    /**
     * Deletes a webhook from a container registry.
     *
     * @param resourceGroupName The name of the resource group to which the container registry belongs.
     * @param registryName The name of the container registry.
     * @param webhookName The name of the webhook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String registryName, String webhookName);

}
