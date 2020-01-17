/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2019_02_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.Domains;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.DomainTopics;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.EventSubscriptions;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.Operations;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.Topics;
import com.microsoft.azure.management.eventgrid.v2019_02_01_preview.TopicTypes;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure EventGrid resource management.
 */
public final class EventGridManager extends ManagerCore<EventGridManager, EventGridManagementClientImpl> {
    private Domains domains;
    private DomainTopics domainTopics;
    private EventSubscriptions eventSubscriptions;
    private Operations operations;
    private Topics topics;
    private TopicTypes topicTypes;
    /**
    * Get a Configurable instance that can be used to create EventGridManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new EventGridManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of EventGridManager that exposes EventGrid resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the EventGridManager
    */
    public static EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new EventGridManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of EventGridManager that exposes EventGrid resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the EventGridManager
    */
    public static EventGridManager authenticate(RestClient restClient, String subscriptionId) {
        return new EventGridManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of EventGridManager that exposes EventGrid management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing EventGrid management API entry points that work across subscriptions
        */
        EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Domains.
     */
    public Domains domains() {
        if (this.domains == null) {
            this.domains = new DomainsImpl(this);
        }
        return this.domains;
    }

    /**
     * @return Entry point to manage DomainTopics.
     */
    public DomainTopics domainTopics() {
        if (this.domainTopics == null) {
            this.domainTopics = new DomainTopicsImpl(this);
        }
        return this.domainTopics;
    }

    /**
     * @return Entry point to manage EventSubscriptions.
     */
    public EventSubscriptions eventSubscriptions() {
        if (this.eventSubscriptions == null) {
            this.eventSubscriptions = new EventSubscriptionsImpl(this);
        }
        return this.eventSubscriptions;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Topics.
     */
    public Topics topics() {
        if (this.topics == null) {
            this.topics = new TopicsImpl(this);
        }
        return this.topics;
    }

    /**
     * @return Entry point to manage TopicTypes.
     */
    public TopicTypes topicTypes() {
        if (this.topicTypes == null) {
            this.topicTypes = new TopicTypesImpl(this);
        }
        return this.topicTypes;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public EventGridManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return EventGridManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private EventGridManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new EventGridManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
