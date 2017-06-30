/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.implementation;

import com.microsoft.azure.PollingState;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.rest.RestClient;
import rx.Observable;
import rx.Single;

import java.lang.reflect.Type;

/**
 * Base class for Azure resource managers.
 */
public abstract class ManagerBase {

    private ResourceManager resourceManager;
    private final String subscriptionId;

    protected ManagerBase(RestClient restClient, String subscriptionId) {
        if (restClient != null) {
            this.resourceManager = ResourceManager.authenticate(restClient).withSubscription(subscriptionId);
        }
        this.subscriptionId = subscriptionId;
    }

    /**
     * @return the ID of the subscription the manager is working with
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    protected final void setResourceManager(ResourceManager resourceManager) {
        this.resourceManager = resourceManager;
    }

    /**
     * @return the {@link ResourceManager} associated with this manager
     */
    public ResourceManager resourceManager() {
        return this.resourceManager;
    }

    /**
     * Given a polling state representing state of a LRO operation, this method returns {@link Single} object,
     * when subscribed to it, a single poll will be performed and emits the latest polling state. A poll will be
     * performed only if the current polling state is not in terminal state.
     *
     * Note: this method does not implicitly introduce concurrency, by default the deferred action will be executed
     * in scheduler (if any) set for the provided observable.
     *
     * @param pollingState the current polling state
     * @param <T> the type of the resource
     * @param resourceType the java.lang.reflect.Type of the resource.
     * @return the observable of which a subscription will lead single polling action.
     */
    public <T> Single<PollingState<T>> pollSingleAsync(final PollingState<T> pollingState, final Type resourceType) {
        return this.resourceManager.inner().getAzureClient().pollSingleAsync(pollingState, resourceType);
    }

    /**
     * Given a polling state representing state of an LRO operation, this method returns {@link Observable} object,
     * when subscribed to it, a series of polling will be performed and emits each polling state to downstream.
     * Polling will completes when the operation finish with success, failure or exception.
     *
     * @param pollingState the current polling state
     * @param resourceType the java.lang.reflect.Type of the resource.
     * @param <T> the type of the resource
     * @return the observable of which a subscription will lead multiple polling action.
     */
    public <T> Observable<PollingState<T>> pollAsync(final PollingState<T> pollingState, final Type resourceType) {
        return this.resourceManager.inner().getAzureClient().pollAsync(pollingState, resourceType);
    }
}
