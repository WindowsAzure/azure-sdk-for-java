// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.security.fluent.IotSitesClient;
import com.azure.resourcemanager.security.fluent.models.IotSitesListInner;
import com.azure.resourcemanager.security.fluent.models.IotSitesModelInner;
import com.azure.resourcemanager.security.models.IotSites;
import com.azure.resourcemanager.security.models.IotSitesList;
import com.azure.resourcemanager.security.models.IotSitesModel;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class IotSitesImpl implements IotSites {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(IotSitesImpl.class);

    private final IotSitesClient innerClient;

    private final com.azure.resourcemanager.security.SecurityManager serviceManager;

    public IotSitesImpl(IotSitesClient innerClient, com.azure.resourcemanager.security.SecurityManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public IotSitesList list(String scope) {
        IotSitesListInner inner = this.serviceClient().list(scope);
        if (inner != null) {
            return new IotSitesListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotSitesList> listWithResponse(String scope, Context context) {
        Response<IotSitesListInner> inner = this.serviceClient().listWithResponse(scope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotSitesListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotSitesModel get(String scope) {
        IotSitesModelInner inner = this.serviceClient().get(scope);
        if (inner != null) {
            return new IotSitesModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotSitesModel> getWithResponse(String scope, Context context) {
        Response<IotSitesModelInner> inner = this.serviceClient().getWithResponse(scope, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotSitesModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public IotSitesModel createOrUpdate(String scope, IotSitesModelInner iotSitesModel) {
        IotSitesModelInner inner = this.serviceClient().createOrUpdate(scope, iotSitesModel);
        if (inner != null) {
            return new IotSitesModelImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<IotSitesModel> createOrUpdateWithResponse(
        String scope, IotSitesModelInner iotSitesModel, Context context) {
        Response<IotSitesModelInner> inner =
            this.serviceClient().createOrUpdateWithResponse(scope, iotSitesModel, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new IotSitesModelImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String scope) {
        this.serviceClient().delete(scope);
    }

    public Response<Void> deleteWithResponse(String scope, Context context) {
        return this.serviceClient().deleteWithResponse(scope, context);
    }

    private IotSitesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.security.SecurityManager manager() {
        return this.serviceManager;
    }
}
