// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.generated.fluent.VirtualMachineExtensionsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionInner;
import com.azure.resourcemanager.compute.generated.fluent.models.VirtualMachineExtensionsListResultInner;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtension;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensions;
import com.azure.resourcemanager.compute.generated.models.VirtualMachineExtensionsListResult;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VirtualMachineExtensionsImpl implements VirtualMachineExtensions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VirtualMachineExtensionsImpl.class);

    private final VirtualMachineExtensionsClient innerClient;

    private final com.azure.resourcemanager.compute.generated.ComputeManager serviceManager;

    public VirtualMachineExtensionsImpl(
        VirtualMachineExtensionsClient innerClient,
        com.azure.resourcemanager.compute.generated.ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String vmName, String vmExtensionName) {
        this.serviceClient().delete(resourceGroupName, vmName, vmExtensionName);
    }

    public void delete(String resourceGroupName, String vmName, String vmExtensionName, Context context) {
        this.serviceClient().delete(resourceGroupName, vmName, vmExtensionName, context);
    }

    public VirtualMachineExtension get(String resourceGroupName, String vmName, String vmExtensionName) {
        VirtualMachineExtensionInner inner = this.serviceClient().get(resourceGroupName, vmName, vmExtensionName);
        if (inner != null) {
            return new VirtualMachineExtensionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineExtension> getWithResponse(
        String resourceGroupName, String vmName, String vmExtensionName, String expand, Context context) {
        Response<VirtualMachineExtensionInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, vmName, vmExtensionName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineExtensionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineExtensionsListResult list(String resourceGroupName, String vmName) {
        VirtualMachineExtensionsListResultInner inner = this.serviceClient().list(resourceGroupName, vmName);
        if (inner != null) {
            return new VirtualMachineExtensionsListResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineExtensionsListResult> listWithResponse(
        String resourceGroupName, String vmName, String expand, Context context) {
        Response<VirtualMachineExtensionsListResultInner> inner =
            this.serviceClient().listWithResponse(resourceGroupName, vmName, expand, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineExtensionsListResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VirtualMachineExtension getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        String localExpand = null;
        return this.getWithResponse(resourceGroupName, vmName, vmExtensionName, localExpand, Context.NONE).getValue();
    }

    public Response<VirtualMachineExtension> getByIdWithResponse(String id, String expand, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        return this.getWithResponse(resourceGroupName, vmName, vmExtensionName, expand, context);
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
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmName, vmExtensionName, Context.NONE);
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
        String vmName = Utils.getValueFromIdByName(id, "virtualMachines");
        if (vmName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'virtualMachines'.", id)));
        }
        String vmExtensionName = Utils.getValueFromIdByName(id, "extensions");
        if (vmExtensionName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'extensions'.", id)));
        }
        this.delete(resourceGroupName, vmName, vmExtensionName, context);
    }

    private VirtualMachineExtensionsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.compute.generated.ComputeManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineExtensionImpl define(String name) {
        return new VirtualMachineExtensionImpl(name, this.manager());
    }
}
