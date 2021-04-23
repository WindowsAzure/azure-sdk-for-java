// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deploymentmanager.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.deploymentmanager.fluent.ServiceUnitsClient;
import com.azure.resourcemanager.deploymentmanager.fluent.models.ServiceUnitResourceInner;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnitResource;
import com.azure.resourcemanager.deploymentmanager.models.ServiceUnits;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public final class ServiceUnitsImpl implements ServiceUnits {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServiceUnitsImpl.class);

    private final ServiceUnitsClient innerClient;

    private final com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager;

    public ServiceUnitsImpl(
        ServiceUnitsClient innerClient, com.azure.resourcemanager.deploymentmanager.DeploymentManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ServiceUnitResource get(
        String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName) {
        ServiceUnitResourceInner inner =
            this.serviceClient().get(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName);
        if (inner != null) {
            return new ServiceUnitResourceImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ServiceUnitResource> getWithResponse(
        String resourceGroupName,
        String serviceTopologyName,
        String serviceName,
        String serviceUnitName,
        Context context) {
        Response<ServiceUnitResourceInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ServiceUnitResourceImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName, String serviceTopologyName, String serviceName, String serviceUnitName) {
        this.serviceClient().delete(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceTopologyName,
        String serviceName,
        String serviceUnitName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, context);
    }

    public List<ServiceUnitResource> list(String resourceGroupName, String serviceTopologyName, String serviceName) {
        List<ServiceUnitResourceInner> inner =
            this.serviceClient().list(resourceGroupName, serviceTopologyName, serviceName);
        if (inner != null) {
            return Collections
                .unmodifiableList(
                    inner
                        .stream()
                        .map(inner1 -> new ServiceUnitResourceImpl(inner1, this.manager()))
                        .collect(Collectors.toList()));
        } else {
            return Collections.emptyList();
        }
    }

    public Response<List<ServiceUnitResource>> listWithResponse(
        String resourceGroupName, String serviceTopologyName, String serviceName, Context context) {
        Response<List<ServiceUnitResourceInner>> inner =
            this.serviceClient().listWithResponse(resourceGroupName, serviceTopologyName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                inner
                    .getValue()
                    .stream()
                    .map(inner1 -> new ServiceUnitResourceImpl(inner1, this.manager()))
                    .collect(Collectors.toList()));
        } else {
            return null;
        }
    }

    public ServiceUnitResource getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceTopologyName = Utils.getValueFromIdByName(id, "serviceTopologies");
        if (serviceTopologyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'serviceTopologies'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String serviceUnitName = Utils.getValueFromIdByName(id, "serviceUnits");
        if (serviceUnitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serviceUnits'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, Context.NONE)
            .getValue();
    }

    public Response<ServiceUnitResource> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceTopologyName = Utils.getValueFromIdByName(id, "serviceTopologies");
        if (serviceTopologyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'serviceTopologies'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String serviceUnitName = Utils.getValueFromIdByName(id, "serviceUnits");
        if (serviceUnitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serviceUnits'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, context);
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
        String serviceTopologyName = Utils.getValueFromIdByName(id, "serviceTopologies");
        if (serviceTopologyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'serviceTopologies'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String serviceUnitName = Utils.getValueFromIdByName(id, "serviceUnits");
        if (serviceUnitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serviceUnits'.", id)));
        }
        this
            .deleteWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, Context.NONE)
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
        String serviceTopologyName = Utils.getValueFromIdByName(id, "serviceTopologies");
        if (serviceTopologyName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'serviceTopologies'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "services");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'services'.", id)));
        }
        String serviceUnitName = Utils.getValueFromIdByName(id, "serviceUnits");
        if (serviceUnitName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'serviceUnits'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, serviceTopologyName, serviceName, serviceUnitName, context);
    }

    private ServiceUnitsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.deploymentmanager.DeploymentManager manager() {
        return this.serviceManager;
    }

    public ServiceUnitResourceImpl define(String name) {
        return new ServiceUnitResourceImpl(name, this.manager());
    }
}
