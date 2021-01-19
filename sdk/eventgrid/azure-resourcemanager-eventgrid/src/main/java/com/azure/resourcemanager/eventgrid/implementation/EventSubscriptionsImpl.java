// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventgrid.EventGridManager;
import com.azure.resourcemanager.eventgrid.fluent.EventSubscriptionsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.EventSubscription;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionFullUrl;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptions;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EventSubscriptionsImpl implements EventSubscriptions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventSubscriptionsImpl.class);

    private final EventSubscriptionsClient innerClient;

    private final EventGridManager serviceManager;

    public EventSubscriptionsImpl(EventSubscriptionsClient innerClient, EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EventSubscription get(String scope, String eventSubscriptionName) {
        EventSubscriptionInner inner = this.serviceClient().get(scope, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscription> getWithResponse(String scope, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionInner> inner =
            this.serviceClient().getWithResponse(scope, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String scope, String eventSubscriptionName) {
        this.serviceClient().delete(scope, eventSubscriptionName);
    }

    public void delete(String scope, String eventSubscriptionName, Context context) {
        this.serviceClient().delete(scope, eventSubscriptionName, context);
    }

    public EventSubscriptionFullUrl getFullUrl(String scope, String eventSubscriptionName) {
        EventSubscriptionFullUrlInner inner = this.serviceClient().getFullUrl(scope, eventSubscriptionName);
        if (inner != null) {
            return new EventSubscriptionFullUrlImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventSubscriptionFullUrl> getFullUrlWithResponse(
        String scope, String eventSubscriptionName, Context context) {
        Response<EventSubscriptionFullUrlInner> inner =
            this.serviceClient().getFullUrlWithResponse(scope, eventSubscriptionName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventSubscriptionFullUrlImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<EventSubscription> list() {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> list(String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().list(filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalBySubscriptionForTopicType(topicTypeName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalBySubscriptionForTopicType(
        String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalBySubscriptionForTopicType(topicTypeName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResourceGroup(String resourceGroupName) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResourceGroup(
        String resourceGroupName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listGlobalByResourceGroupForTopicType(resourceGroupName, topicTypeName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listGlobalByResourceGroupForTopicType(
        String resourceGroupName, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listGlobalByResourceGroupForTopicType(resourceGroupName, topicTypeName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscription(String location) {
        PagedIterable<EventSubscriptionInner> inner = this.serviceClient().listRegionalBySubscription(location);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscription(
        String location, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscription(location, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroup(String resourceGroupName, String location) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroup(resourceGroupName, location);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroup(
        String resourceGroupName, String location, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroup(resourceGroupName, location, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(
        String location, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscriptionForTopicType(location, topicTypeName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalBySubscriptionForTopicType(
        String location, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalBySubscriptionForTopicType(location, topicTypeName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listRegionalByResourceGroupForTopicType(resourceGroupName, location, topicTypeName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listRegionalByResourceGroupForTopicType(
        String resourceGroupName, String location, String topicTypeName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listRegionalByResourceGroupForTopicType(
                    resourceGroupName, location, topicTypeName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResource(
        String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByResource(resourceGroupName, providerNamespace, resourceTypeName, resourceName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByResource(
        String resourceGroupName,
        String providerNamespace,
        String resourceTypeName,
        String resourceName,
        String filter,
        Integer top,
        Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this
                .serviceClient()
                .listByResource(
                    resourceGroupName, providerNamespace, resourceTypeName, resourceName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByDomainTopic(
        String resourceGroupName, String domainName, String topicName) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByDomainTopic(resourceGroupName, domainName, topicName);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<EventSubscription> listByDomainTopic(
        String resourceGroupName, String domainName, String topicName, String filter, Integer top, Context context) {
        PagedIterable<EventSubscriptionInner> inner =
            this.serviceClient().listByDomainTopic(resourceGroupName, domainName, topicName, filter, top, context);
        return inner.mapPage(inner1 -> new EventSubscriptionImpl(inner1, this.manager()));
    }

    public EventSubscription getById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String eventSubscriptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "eventSubscriptionName");
        if (eventSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        return this.getWithResponse(scope, eventSubscriptionName, Context.NONE).getValue();
    }

    public Response<EventSubscription> getByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String eventSubscriptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "eventSubscriptionName");
        if (eventSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        return this.getWithResponse(scope, eventSubscriptionName, context);
    }

    public void deleteById(String id) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String eventSubscriptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "eventSubscriptionName");
        if (eventSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        this.delete(scope, eventSubscriptionName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String scope =
            Utils
                .getValueFromIdByParameterName(
                    id, "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}", "scope");
        if (scope == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'scope'.", id)));
        }
        String eventSubscriptionName =
            Utils
                .getValueFromIdByParameterName(
                    id,
                    "/{scope}/providers/Microsoft.EventGrid/eventSubscriptions/{eventSubscriptionName}",
                    "eventSubscriptionName");
        if (eventSubscriptionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'eventSubscriptions'.", id)));
        }
        this.delete(scope, eventSubscriptionName, context);
    }

    private EventSubscriptionsClient serviceClient() {
        return this.innerClient;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }

    public EventSubscriptionImpl define(String name) {
        return new EventSubscriptionImpl(name, this.manager());
    }
}
