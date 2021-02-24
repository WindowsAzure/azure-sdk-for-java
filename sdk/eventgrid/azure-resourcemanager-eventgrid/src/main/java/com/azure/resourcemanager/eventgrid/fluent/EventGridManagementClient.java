// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for EventGridManagementClient class. */
public interface EventGridManagementClient {
    /**
     * Gets Subscription credentials that uniquely identify a Microsoft Azure subscription. The subscription ID forms
     * part of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the DomainsClient object to access its operations.
     *
     * @return the DomainsClient object.
     */
    DomainsClient getDomains();

    /**
     * Gets the DomainTopicsClient object to access its operations.
     *
     * @return the DomainTopicsClient object.
     */
    DomainTopicsClient getDomainTopics();

    /**
     * Gets the EventChannelsClient object to access its operations.
     *
     * @return the EventChannelsClient object.
     */
    EventChannelsClient getEventChannels();

    /**
     * Gets the EventSubscriptionsClient object to access its operations.
     *
     * @return the EventSubscriptionsClient object.
     */
    EventSubscriptionsClient getEventSubscriptions();

    /**
     * Gets the SystemTopicEventSubscriptionsClient object to access its operations.
     *
     * @return the SystemTopicEventSubscriptionsClient object.
     */
    SystemTopicEventSubscriptionsClient getSystemTopicEventSubscriptions();

    /**
     * Gets the PartnerTopicEventSubscriptionsClient object to access its operations.
     *
     * @return the PartnerTopicEventSubscriptionsClient object.
     */
    PartnerTopicEventSubscriptionsClient getPartnerTopicEventSubscriptions();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PartnerNamespacesClient object to access its operations.
     *
     * @return the PartnerNamespacesClient object.
     */
    PartnerNamespacesClient getPartnerNamespaces();

    /**
     * Gets the PartnerRegistrationsClient object to access its operations.
     *
     * @return the PartnerRegistrationsClient object.
     */
    PartnerRegistrationsClient getPartnerRegistrations();

    /**
     * Gets the PartnerTopicsClient object to access its operations.
     *
     * @return the PartnerTopicsClient object.
     */
    PartnerTopicsClient getPartnerTopics();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();

    /**
     * Gets the SystemTopicsClient object to access its operations.
     *
     * @return the SystemTopicsClient object.
     */
    SystemTopicsClient getSystemTopics();

    /**
     * Gets the TopicsClient object to access its operations.
     *
     * @return the TopicsClient object.
     */
    TopicsClient getTopics();

    /**
     * Gets the ExtensionTopicsClient object to access its operations.
     *
     * @return the ExtensionTopicsClient object.
     */
    ExtensionTopicsClient getExtensionTopics();

    /**
     * Gets the TopicTypesClient object to access its operations.
     *
     * @return the TopicTypesClient object.
     */
    TopicTypesClient getTopicTypes();
}
