// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventhubs.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.eventhubs.generated.EventHubsManager;
import com.azure.resourcemanager.eventhubs.generated.fluent.ConsumerGroupsClient;
import com.azure.resourcemanager.eventhubs.generated.fluent.models.ConsumerGroupInner;
import com.azure.resourcemanager.eventhubs.generated.models.ConsumerGroup;
import com.azure.resourcemanager.eventhubs.generated.models.ConsumerGroups;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ConsumerGroupsImpl implements ConsumerGroups {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConsumerGroupsImpl.class);

    private final ConsumerGroupsClient innerClient;

    private final EventHubsManager serviceManager;

    public ConsumerGroupsImpl(ConsumerGroupsClient innerClient, EventHubsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        this.serviceClient().delete(resourceGroupName, namespaceName, eventHubName, consumerGroupName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String consumerGroupName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, context);
    }

    public ConsumerGroup get(
        String resourceGroupName, String namespaceName, String eventHubName, String consumerGroupName) {
        ConsumerGroupInner inner =
            this.serviceClient().get(resourceGroupName, namespaceName, eventHubName, consumerGroupName);
        if (inner != null) {
            return new ConsumerGroupImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ConsumerGroup> getWithResponse(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        String consumerGroupName,
        Context context) {
        Response<ConsumerGroupInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ConsumerGroupImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<ConsumerGroup> listByEventHub(
        String resourceGroupName, String namespaceName, String eventHubName) {
        PagedIterable<ConsumerGroupInner> inner =
            this.serviceClient().listByEventHub(resourceGroupName, namespaceName, eventHubName);
        return inner.mapPage(inner1 -> new ConsumerGroupImpl(inner1, this.manager()));
    }

    public PagedIterable<ConsumerGroup> listByEventHub(
        String resourceGroupName,
        String namespaceName,
        String eventHubName,
        Integer skip,
        Integer top,
        Context context) {
        PagedIterable<ConsumerGroupInner> inner =
            this.serviceClient().listByEventHub(resourceGroupName, namespaceName, eventHubName, skip, top, context);
        return inner.mapPage(inner1 -> new ConsumerGroupImpl(inner1, this.manager()));
    }

    public ConsumerGroup getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String eventHubName = Utils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        String consumerGroupName = Utils.getValueFromIdByName(id, "consumergroups");
        if (consumerGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'consumergroups'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, Context.NONE)
            .getValue();
    }

    public Response<ConsumerGroup> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String eventHubName = Utils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        String consumerGroupName = Utils.getValueFromIdByName(id, "consumergroups");
        if (consumerGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'consumergroups'.", id)));
        }
        return this.getWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, context);
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
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String eventHubName = Utils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        String consumerGroupName = Utils.getValueFromIdByName(id, "consumergroups");
        if (consumerGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'consumergroups'.", id)));
        }
        this
            .deleteWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String namespaceName = Utils.getValueFromIdByName(id, "namespaces");
        if (namespaceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'namespaces'.", id)));
        }
        String eventHubName = Utils.getValueFromIdByName(id, "eventhubs");
        if (eventHubName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'eventhubs'.", id)));
        }
        String consumerGroupName = Utils.getValueFromIdByName(id, "consumergroups");
        if (consumerGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'consumergroups'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, namespaceName, eventHubName, consumerGroupName, context);
    }

    private ConsumerGroupsClient serviceClient() {
        return this.innerClient;
    }

    private EventHubsManager manager() {
        return this.serviceManager;
    }

    public ConsumerGroupImpl define(String name) {
        return new ConsumerGroupImpl(name, this.manager());
    }
}
