// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.generated.fluent.ImportPipelinesClient;
import com.azure.resourcemanager.containerregistry.generated.fluent.models.ImportPipelineInner;
import com.azure.resourcemanager.containerregistry.generated.models.ImportPipeline;
import com.azure.resourcemanager.containerregistry.generated.models.ImportPipelines;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ImportPipelinesImpl implements ImportPipelines {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ImportPipelinesImpl.class);

    private final ImportPipelinesClient innerClient;

    private final com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager;

    public ImportPipelinesImpl(
        ImportPipelinesClient innerClient,
        com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ImportPipeline get(String resourceGroupName, String registryName, String importPipelineName) {
        ImportPipelineInner inner = this.serviceClient().get(resourceGroupName, registryName, importPipelineName);
        if (inner != null) {
            return new ImportPipelineImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ImportPipeline> getWithResponse(
        String resourceGroupName, String registryName, String importPipelineName, Context context) {
        Response<ImportPipelineInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, registryName, importPipelineName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ImportPipelineImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String registryName, String importPipelineName) {
        this.serviceClient().delete(resourceGroupName, registryName, importPipelineName);
    }

    public void delete(String resourceGroupName, String registryName, String importPipelineName, Context context) {
        this.serviceClient().delete(resourceGroupName, registryName, importPipelineName, context);
    }

    public PagedIterable<ImportPipeline> list(String resourceGroupName, String registryName) {
        PagedIterable<ImportPipelineInner> inner = this.serviceClient().list(resourceGroupName, registryName);
        return Utils.mapPage(inner, inner1 -> new ImportPipelineImpl(inner1, this.manager()));
    }

    public PagedIterable<ImportPipeline> list(String resourceGroupName, String registryName, Context context) {
        PagedIterable<ImportPipelineInner> inner = this.serviceClient().list(resourceGroupName, registryName, context);
        return Utils.mapPage(inner, inner1 -> new ImportPipelineImpl(inner1, this.manager()));
    }

    public ImportPipeline getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String importPipelineName = Utils.getValueFromIdByName(id, "importPipelines");
        if (importPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'importPipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, importPipelineName, Context.NONE).getValue();
    }

    public Response<ImportPipeline> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String importPipelineName = Utils.getValueFromIdByName(id, "importPipelines");
        if (importPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'importPipelines'.", id)));
        }
        return this.getWithResponse(resourceGroupName, registryName, importPipelineName, context);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String importPipelineName = Utils.getValueFromIdByName(id, "importPipelines");
        if (importPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'importPipelines'.", id)));
        }
        this.delete(resourceGroupName, registryName, importPipelineName, Context.NONE);
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
        String registryName = Utils.getValueFromIdByName(id, "registries");
        if (registryName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'registries'.", id)));
        }
        String importPipelineName = Utils.getValueFromIdByName(id, "importPipelines");
        if (importPipelineName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'importPipelines'.", id)));
        }
        this.delete(resourceGroupName, registryName, importPipelineName, context);
    }

    private ImportPipelinesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.containerregistry.generated.ContainerRegistryManager manager() {
        return this.serviceManager;
    }

    public ImportPipelineImpl define(String name) {
        return new ImportPipelineImpl(name, this.manager());
    }
}
