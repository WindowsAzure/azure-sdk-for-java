/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.Clusters;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.Configurations;
import com.microsoft.azure.management.eventhub.v2018_01_01_preview.Namespaces;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure EventHub resource management.
 */
public final class EventHubManager extends ManagerCore<EventHubManager, EventHub2018PreviewManagementClientImpl> {
    private Clusters clusters;
    private Configurations configurations;
    private Namespaces namespaces;
    /**
    * Get a Configurable instance that can be used to create EventHubManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new EventHubManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of EventHubManager that exposes EventHub resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the EventHubManager
    */
    public static EventHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new EventHubManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of EventHubManager that exposes EventHub resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the EventHubManager
    */
    public static EventHubManager authenticate(RestClient restClient, String subscriptionId) {
        return new EventHubManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of EventHubManager that exposes EventHub management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing EventHub management API entry points that work across subscriptions
        */
        EventHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
    }

    /**
     * @return Entry point to manage Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(this);
        }
        return this.configurations;
    }

    /**
     * @return Entry point to manage Namespaces.
     */
    public Namespaces namespaces() {
        if (this.namespaces == null) {
            this.namespaces = new NamespacesImpl(this);
        }
        return this.namespaces;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public EventHubManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return EventHubManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private EventHubManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new EventHub2018PreviewManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
