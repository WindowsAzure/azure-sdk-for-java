// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.avs.fluent.HcxEnterpriseSitesClient;
import com.azure.resourcemanager.avs.fluent.models.HcxEnterpriseSiteInner;
import com.azure.resourcemanager.avs.models.HcxEnterpriseSite;
import com.azure.resourcemanager.avs.models.HcxEnterpriseSites;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class HcxEnterpriseSitesImpl implements HcxEnterpriseSites {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(HcxEnterpriseSitesImpl.class);

    private final HcxEnterpriseSitesClient innerClient;

    private final com.azure.resourcemanager.avs.AvsManager serviceManager;

    public HcxEnterpriseSitesImpl(
        HcxEnterpriseSitesClient innerClient, com.azure.resourcemanager.avs.AvsManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<HcxEnterpriseSite> list(String resourceGroupName, String privateCloudName) {
        PagedIterable<HcxEnterpriseSiteInner> inner = this.serviceClient().list(resourceGroupName, privateCloudName);
        return Utils.mapPage(inner, inner1 -> new HcxEnterpriseSiteImpl(inner1, this.manager()));
    }

    public PagedIterable<HcxEnterpriseSite> list(String resourceGroupName, String privateCloudName, Context context) {
        PagedIterable<HcxEnterpriseSiteInner> inner =
            this.serviceClient().list(resourceGroupName, privateCloudName, context);
        return Utils.mapPage(inner, inner1 -> new HcxEnterpriseSiteImpl(inner1, this.manager()));
    }

    public HcxEnterpriseSite get(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        HcxEnterpriseSiteInner inner =
            this.serviceClient().get(resourceGroupName, privateCloudName, hcxEnterpriseSiteName);
        if (inner != null) {
            return new HcxEnterpriseSiteImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<HcxEnterpriseSite> getWithResponse(
        String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Context context) {
        Response<HcxEnterpriseSiteInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new HcxEnterpriseSiteImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName) {
        this.serviceClient().delete(resourceGroupName, privateCloudName, hcxEnterpriseSiteName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String privateCloudName, String hcxEnterpriseSiteName, Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, context);
    }

    public HcxEnterpriseSite getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String hcxEnterpriseSiteName = Utils.getValueFromIdByName(id, "hcxEnterpriseSites");
        if (hcxEnterpriseSiteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hcxEnterpriseSites'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, Context.NONE)
            .getValue();
    }

    public Response<HcxEnterpriseSite> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String hcxEnterpriseSiteName = Utils.getValueFromIdByName(id, "hcxEnterpriseSites");
        if (hcxEnterpriseSiteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hcxEnterpriseSites'.", id)));
        }
        return this.getWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, context);
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
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String hcxEnterpriseSiteName = Utils.getValueFromIdByName(id, "hcxEnterpriseSites");
        if (hcxEnterpriseSiteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hcxEnterpriseSites'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, Context.NONE).getValue();
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
        String privateCloudName = Utils.getValueFromIdByName(id, "privateClouds");
        if (privateCloudName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'privateClouds'.", id)));
        }
        String hcxEnterpriseSiteName = Utils.getValueFromIdByName(id, "hcxEnterpriseSites");
        if (hcxEnterpriseSiteName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'hcxEnterpriseSites'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, privateCloudName, hcxEnterpriseSiteName, context);
    }

    private HcxEnterpriseSitesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.avs.AvsManager manager() {
        return this.serviceManager;
    }

    public HcxEnterpriseSiteImpl define(String name) {
        return new HcxEnterpriseSiteImpl(name, this.manager());
    }
}
