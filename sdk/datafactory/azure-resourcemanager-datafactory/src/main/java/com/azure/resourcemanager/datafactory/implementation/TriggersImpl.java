// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.TriggersClient;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerQueryResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerResourceInner;
import com.azure.resourcemanager.datafactory.fluent.models.TriggerSubscriptionOperationStatusInner;
import com.azure.resourcemanager.datafactory.models.TriggerFilterParameters;
import com.azure.resourcemanager.datafactory.models.TriggerQueryResponse;
import com.azure.resourcemanager.datafactory.models.TriggerResource;
import com.azure.resourcemanager.datafactory.models.TriggerSubscriptionOperationStatus;
import com.azure.resourcemanager.datafactory.models.Triggers;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class TriggersImpl implements Triggers {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(TriggersImpl.class);

    private final TriggersClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public TriggersImpl(
        TriggersClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<TriggerResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<TriggerResourceInner> inner = this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return Utils.mapPage(inner, inner1 -> new TriggerResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<TriggerResource> listByFactory(String resourceGroupName, String factoryName, Context context) {
        PagedIterable<TriggerResourceInner> inner =
            this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return Utils.mapPage(inner, inner1 -> new TriggerResourceImpl(inner1, this.manager()));
    }

    public TriggerQueryResponse queryByFactory(
        String resourceGroupName, String factoryName, TriggerFilterParameters filterParameters) {
        TriggerQueryResponseInner inner =
            this.serviceClient().queryByFactory(resourceGroupName, factoryName, filterParameters);
        if (inner != null) {
            return new TriggerQueryResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TriggerQueryResponse> queryByFactoryWithResponse(
        String resourceGroupName, String factoryName, TriggerFilterParameters filterParameters, Context context) {
        Response<TriggerQueryResponseInner> inner =
            this.serviceClient().queryByFactoryWithResponse(resourceGroupName, factoryName, filterParameters, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TriggerQueryResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TriggerResource get(String resourceGroupName, String factoryName, String triggerName) {
        TriggerResourceInner inner = this.serviceClient().get(resourceGroupName, factoryName, triggerName);
        if (inner != null) {
            return new TriggerResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TriggerResource> getWithResponse(
        String resourceGroupName, String factoryName, String triggerName, String ifNoneMatch, Context context) {
        Response<TriggerResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, factoryName, triggerName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TriggerResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String factoryName, String triggerName) {
        this.serviceClient().delete(resourceGroupName, factoryName, triggerName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String triggerName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, triggerName, context);
    }

    public TriggerSubscriptionOperationStatus subscribeToEvents(
        String resourceGroupName, String factoryName, String triggerName) {
        TriggerSubscriptionOperationStatusInner inner =
            this.serviceClient().subscribeToEvents(resourceGroupName, factoryName, triggerName);
        if (inner != null) {
            return new TriggerSubscriptionOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TriggerSubscriptionOperationStatus subscribeToEvents(
        String resourceGroupName, String factoryName, String triggerName, Context context) {
        TriggerSubscriptionOperationStatusInner inner =
            this.serviceClient().subscribeToEvents(resourceGroupName, factoryName, triggerName, context);
        if (inner != null) {
            return new TriggerSubscriptionOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TriggerSubscriptionOperationStatus getEventSubscriptionStatus(
        String resourceGroupName, String factoryName, String triggerName) {
        TriggerSubscriptionOperationStatusInner inner =
            this.serviceClient().getEventSubscriptionStatus(resourceGroupName, factoryName, triggerName);
        if (inner != null) {
            return new TriggerSubscriptionOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<TriggerSubscriptionOperationStatus> getEventSubscriptionStatusWithResponse(
        String resourceGroupName, String factoryName, String triggerName, Context context) {
        Response<TriggerSubscriptionOperationStatusInner> inner =
            this
                .serviceClient()
                .getEventSubscriptionStatusWithResponse(resourceGroupName, factoryName, triggerName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new TriggerSubscriptionOperationStatusImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public TriggerSubscriptionOperationStatus unsubscribeFromEvents(
        String resourceGroupName, String factoryName, String triggerName) {
        TriggerSubscriptionOperationStatusInner inner =
            this.serviceClient().unsubscribeFromEvents(resourceGroupName, factoryName, triggerName);
        if (inner != null) {
            return new TriggerSubscriptionOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public TriggerSubscriptionOperationStatus unsubscribeFromEvents(
        String resourceGroupName, String factoryName, String triggerName, Context context) {
        TriggerSubscriptionOperationStatusInner inner =
            this.serviceClient().unsubscribeFromEvents(resourceGroupName, factoryName, triggerName, context);
        if (inner != null) {
            return new TriggerSubscriptionOperationStatusImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public void start(String resourceGroupName, String factoryName, String triggerName) {
        this.serviceClient().start(resourceGroupName, factoryName, triggerName);
    }

    public void start(String resourceGroupName, String factoryName, String triggerName, Context context) {
        this.serviceClient().start(resourceGroupName, factoryName, triggerName, context);
    }

    public void stop(String resourceGroupName, String factoryName, String triggerName) {
        this.serviceClient().stop(resourceGroupName, factoryName, triggerName);
    }

    public void stop(String resourceGroupName, String factoryName, String triggerName, Context context) {
        this.serviceClient().stop(resourceGroupName, factoryName, triggerName, context);
    }

    public TriggerResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String triggerName = Utils.getValueFromIdByName(id, "triggers");
        if (triggerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'triggers'.", id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, factoryName, triggerName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<TriggerResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String triggerName = Utils.getValueFromIdByName(id, "triggers");
        if (triggerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'triggers'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, triggerName, ifNoneMatch, context);
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
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String triggerName = Utils.getValueFromIdByName(id, "triggers");
        if (triggerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'triggers'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, triggerName, Context.NONE).getValue();
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
        String factoryName = Utils.getValueFromIdByName(id, "factories");
        if (factoryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'factories'.", id)));
        }
        String triggerName = Utils.getValueFromIdByName(id, "triggers");
        if (triggerName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'triggers'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, triggerName, context);
    }

    private TriggersClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public TriggerResourceImpl define(String name) {
        return new TriggerResourceImpl(name, this.manager());
    }
}
