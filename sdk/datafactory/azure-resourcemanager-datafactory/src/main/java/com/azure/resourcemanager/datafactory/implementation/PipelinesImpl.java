// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.PipelinesClient;
import com.azure.resourcemanager.datafactory.fluent.models.CreateRunResponseInner;
import com.azure.resourcemanager.datafactory.fluent.models.PipelineResourceInner;
import com.azure.resourcemanager.datafactory.models.CreateRunResponse;
import com.azure.resourcemanager.datafactory.models.PipelineResource;
import com.azure.resourcemanager.datafactory.models.Pipelines;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;

public final class PipelinesImpl implements Pipelines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PipelinesImpl.class);

    private final PipelinesClient innerClient;

    private final com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager;

    public PipelinesImpl(
        PipelinesClient innerClient, com.azure.resourcemanager.datafactory.DataFactoryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PipelineResource> listByFactory(String resourceGroupName, String factoryName) {
        PagedIterable<PipelineResourceInner> inner = this.serviceClient().listByFactory(resourceGroupName, factoryName);
        return Utils.mapPage(inner, inner1 -> new PipelineResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<PipelineResource> listByFactory(
        String resourceGroupName, String factoryName, Context context) {
        PagedIterable<PipelineResourceInner> inner =
            this.serviceClient().listByFactory(resourceGroupName, factoryName, context);
        return Utils.mapPage(inner, inner1 -> new PipelineResourceImpl(inner1, this.manager()));
    }

    public PipelineResource get(String resourceGroupName, String factoryName, String pipelineName) {
        PipelineResourceInner inner = this.serviceClient().get(resourceGroupName, factoryName, pipelineName);
        if (inner != null) {
            return new PipelineResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PipelineResource> getWithResponse(
        String resourceGroupName, String factoryName, String pipelineName, String ifNoneMatch, Context context) {
        Response<PipelineResourceInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, factoryName, pipelineName, ifNoneMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PipelineResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String factoryName, String pipelineName) {
        this.serviceClient().delete(resourceGroupName, factoryName, pipelineName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String factoryName, String pipelineName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, factoryName, pipelineName, context);
    }

    public CreateRunResponse createRun(String resourceGroupName, String factoryName, String pipelineName) {
        CreateRunResponseInner inner = this.serviceClient().createRun(resourceGroupName, factoryName, pipelineName);
        if (inner != null) {
            return new CreateRunResponseImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CreateRunResponse> createRunWithResponse(
        String resourceGroupName,
        String factoryName,
        String pipelineName,
        String referencePipelineRunId,
        Boolean isRecovery,
        String startActivityName,
        Boolean startFromFailure,
        Map<String, Object> parameters,
        Context context) {
        Response<CreateRunResponseInner> inner =
            this
                .serviceClient()
                .createRunWithResponse(
                    resourceGroupName,
                    factoryName,
                    pipelineName,
                    referencePipelineRunId,
                    isRecovery,
                    startActivityName,
                    startFromFailure,
                    parameters,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CreateRunResponseImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PipelineResource getById(String id) {
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
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        String localIfNoneMatch = null;
        return this
            .getWithResponse(resourceGroupName, factoryName, pipelineName, localIfNoneMatch, Context.NONE)
            .getValue();
    }

    public Response<PipelineResource> getByIdWithResponse(String id, String ifNoneMatch, Context context) {
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
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, factoryName, pipelineName, ifNoneMatch, context);
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
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, factoryName, pipelineName, Context.NONE).getValue();
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
        String pipelineName = Utils.getValueFromIdByName(id, "pipelines");
        if (pipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'pipelines'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, factoryName, pipelineName, context);
    }

    private PipelinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.datafactory.DataFactoryManager manager() {
        return this.serviceManager;
    }

    public PipelineResourceImpl define(String name) {
        return new PipelineResourceImpl(name, this.manager());
    }
}
