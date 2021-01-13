// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.recoveryservicessiterecovery.SiteRecoveryManager;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.ReplicationvCentersClient;
import com.azure.resourcemanager.recoveryservicessiterecovery.fluent.models.VCenterInner;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.ReplicationvCenters;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.VCenter;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ReplicationvCentersImpl implements ReplicationvCenters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ReplicationvCentersImpl.class);

    private final ReplicationvCentersClient innerClient;

    private final SiteRecoveryManager serviceManager;

    public ReplicationvCentersImpl(ReplicationvCentersClient innerClient, SiteRecoveryManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VCenter> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName) {
        PagedIterable<VCenterInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName);
        return inner.mapPage(inner1 -> new VCenterImpl(inner1, this.manager()));
    }

    public PagedIterable<VCenter> listByReplicationFabrics(
        String resourceName, String resourceGroupName, String fabricName, Context context) {
        PagedIterable<VCenterInner> inner =
            this.serviceClient().listByReplicationFabrics(resourceName, resourceGroupName, fabricName, context);
        return inner.mapPage(inner1 -> new VCenterImpl(inner1, this.manager()));
    }

    public VCenter get(String resourceName, String resourceGroupName, String fabricName, String vCenterName) {
        VCenterInner inner = this.serviceClient().get(resourceName, resourceGroupName, fabricName, vCenterName);
        if (inner != null) {
            return new VCenterImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VCenter> getWithResponse(
        String resourceName, String resourceGroupName, String fabricName, String vCenterName, Context context) {
        Response<VCenterInner> inner =
            this.serviceClient().getWithResponse(resourceName, resourceGroupName, fabricName, vCenterName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VCenterImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceName, String resourceGroupName, String fabricName, String vCenterName) {
        this.serviceClient().delete(resourceName, resourceGroupName, fabricName, vCenterName);
    }

    public void delete(
        String resourceName, String resourceGroupName, String fabricName, String vCenterName, Context context) {
        this.serviceClient().delete(resourceName, resourceGroupName, fabricName, vCenterName, context);
    }

    public PagedIterable<VCenter> list(String resourceName, String resourceGroupName) {
        PagedIterable<VCenterInner> inner = this.serviceClient().list(resourceName, resourceGroupName);
        return inner.mapPage(inner1 -> new VCenterImpl(inner1, this.manager()));
    }

    public PagedIterable<VCenter> list(String resourceName, String resourceGroupName, Context context) {
        PagedIterable<VCenterInner> inner = this.serviceClient().list(resourceName, resourceGroupName, context);
        return inner.mapPage(inner1 -> new VCenterImpl(inner1, this.manager()));
    }

    public VCenter getById(String id) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String vCenterName = Utils.getValueFromIdByName(id, "replicationvCenters");
        if (vCenterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationvCenters'.", id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, fabricName, vCenterName, Context.NONE).getValue();
    }

    public Response<VCenter> getByIdWithResponse(String id, Context context) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String vCenterName = Utils.getValueFromIdByName(id, "replicationvCenters");
        if (vCenterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationvCenters'.", id)));
        }
        return this.getWithResponse(resourceName, resourceGroupName, fabricName, vCenterName, context);
    }

    public void deleteById(String id) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String vCenterName = Utils.getValueFromIdByName(id, "replicationvCenters");
        if (vCenterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationvCenters'.", id)));
        }
        this.delete(resourceName, resourceGroupName, fabricName, vCenterName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceName = Utils.getValueFromIdByName(id, "vaults");
        if (resourceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vaults'.", id)));
        }
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String fabricName = Utils.getValueFromIdByName(id, "replicationFabrics");
        if (fabricName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationFabrics'.", id)));
        }
        String vCenterName = Utils.getValueFromIdByName(id, "replicationvCenters");
        if (vCenterName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'replicationvCenters'.", id)));
        }
        this.delete(resourceName, resourceGroupName, fabricName, vCenterName, context);
    }

    private ReplicationvCentersClient serviceClient() {
        return this.innerClient;
    }

    private SiteRecoveryManager manager() {
        return this.serviceManager;
    }

    public VCenterImpl define(String name) {
        return new VCenterImpl(name, this.manager());
    }
}
