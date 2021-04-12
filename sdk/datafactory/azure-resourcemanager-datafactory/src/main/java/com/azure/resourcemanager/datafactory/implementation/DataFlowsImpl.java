// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.DataFlowsClient;
import com.azure.resourcemanager.datafactory.fluent.models.DataFlowResourceInner;
import com.azure.resourcemanager.datafactory.models.DataFlowResource;
import com.azure.resourcemanager.datafactory.models.DataFlows;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DataFlowsImpl implements DataFlows {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DataFlowsImpl.class);

    private final DataFlowsClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public DataFlowsImpl(
        DataFlowsClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public DataFlowResource get(String resourceGroupName, String factoryName, String dataFlowName) {
        DataFlowResourceInner inner = this.serviceClient().get(resourceGroupName, factoryName, dataFlowName);
        if (inner != null) {
            return new DataFlowResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DataFlowResource> getWithResponse(
        String resourceGroupName, String factoryName, String dataFlowName, String ifNoneMatch, Context context) {
        Response<DataFlowResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, factoryName, dataFlowName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DataFlowResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String factoryName, String dataFlowName) {
        this.serviceClient().delete(resourceGroupName, factoryName, dataFlowName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String dataFlowName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, dataFlowName, context);
    }

    public PagedIterable<DataFlowResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<DataFlowResourceInner> inner = this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return Utils.mapPage(inner, inner1 -> new DataFlowResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<DataFlowResource> listByFactory(
        String resourceGroupName, String factoryName, Context context) {
        PagedIterable<DataFlowResourceInner> inner =
            this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return Utils.mapPage(inner, inner1 -> new DataFlowResourceImpl(inner1, this.manager()));
    }

    public DataFlowResource getById(String id) {
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
        String dataFlowName = Utils.getValueFromIdByName(id, "dataflows");
        if (dataFlowName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataflows'.", id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, factoryName, dataFlowName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<DataFlowResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
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
        String dataFlowName = Utils.getValueFromIdByName(id, "dataflows");
        if (dataFlowName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataflows'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, dataFlowName, ifNoneMatch, context);
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
        String dataFlowName = Utils.getValueFromIdByName(id, "dataflows");
        if (dataFlowName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataflows'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, dataFlowName, Context.NONE).getValue();
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
        String dataFlowName = Utils.getValueFromIdByName(id, "dataflows");
        if (dataFlowName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'dataflows'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, dataFlowName, context);
    }

    private DataFlowsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public DataFlowResourceImpl define(String name) {
        return new DataFlowResourceImpl(name, this.manager());
    }
}
