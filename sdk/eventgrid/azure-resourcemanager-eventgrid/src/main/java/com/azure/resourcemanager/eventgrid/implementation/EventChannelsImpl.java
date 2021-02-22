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
import com.azure.resourcemanager.eventgrid.fluent.EventChannelsClient;
import com.azure.resourcemanager.eventgrid.fluent.models.EventChannelInner;
import com.azure.resourcemanager.eventgrid.models.EventChannel;
import com.azure.resourcemanager.eventgrid.models.EventChannels;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class EventChannelsImpl implements EventChannels {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(EventChannelsImpl.class);

    private final EventChannelsClient innerClient;

    private final EventGridManager serviceManager;

    public EventChannelsImpl(EventChannelsClient innerClient, EventGridManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public EventChannel get(String resourceGroupName, String partnerNamespaceName, String eventChannelName) {
        EventChannelInner inner = this.serviceClient().get(resourceGroupName, partnerNamespaceName, eventChannelName);
        if (inner != null) {
            return new EventChannelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<EventChannel> getWithResponse(
        String resourceGroupName, String partnerNamespaceName, String eventChannelName, Context context) {
        Response<EventChannelInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, partnerNamespaceName, eventChannelName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new EventChannelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String partnerNamespaceName, String eventChannelName) {
        this.serviceClient().delete(resourceGroupName, partnerNamespaceName, eventChannelName);
    }

    public void delete(
        String resourceGroupName, String partnerNamespaceName, String eventChannelName, Context context) {
        this.serviceClient().delete(resourceGroupName, partnerNamespaceName, eventChannelName, context);
    }

    public PagedIterable<EventChannel> listByPartnerNamespace(String resourceGroupName, String partnerNamespaceName) {
        PagedIterable<EventChannelInner> inner =
            this.serviceClient().listByPartnerNamespace(resourceGroupName, partnerNamespaceName);
        return Utils.mapPage(inner, inner1 -> new EventChannelImpl(inner1, this.manager()));
    }

    public PagedIterable<EventChannel> listByPartnerNamespace(
        String resourceGroupName, String partnerNamespaceName, String filter, Integer top, Context context) {
        PagedIterable<EventChannelInner> inner =
            this.serviceClient().listByPartnerNamespace(resourceGroupName, partnerNamespaceName, filter, top, context);
        return Utils.mapPage(inner, inner1 -> new EventChannelImpl(inner1, this.manager()));
    }

    public EventChannel getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String eventChannelName = Utils.getValueFromIdByName(id, "eventChannels");
        if (eventChannelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventChannels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, partnerNamespaceName, eventChannelName, Context.NONE).getValue();
    }

    public Response<EventChannel> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String eventChannelName = Utils.getValueFromIdByName(id, "eventChannels");
        if (eventChannelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventChannels'.", id)));
        }
        return this.getWithResponse(resourceGroupName, partnerNamespaceName, eventChannelName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String eventChannelName = Utils.getValueFromIdByName(id, "eventChannels");
        if (eventChannelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventChannels'.", id)));
        }
        this.delete(resourceGroupName, partnerNamespaceName, eventChannelName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String partnerNamespaceName = Utils.getValueFromIdByName(id, "partnerNamespaces");
        if (partnerNamespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'partnerNamespaces'.", id)));
        }
        String eventChannelName = Utils.getValueFromIdByName(id, "eventChannels");
        if (eventChannelName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventChannels'.", id)));
        }
        this.delete(resourceGroupName, partnerNamespaceName, eventChannelName, context);
    }

    private EventChannelsClient serviceClient() {
        return this.innerClient;
    }

    private EventGridManager manager() {
        return this.serviceManager;
    }

    public EventChannelImpl define(String name) {
        return new EventChannelImpl(name, this.manager());
    }
}
