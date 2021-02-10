// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appservice.generated.WebSiteManager;
import com.azure.resourcemanager.appservice.generated.fluent.CertificatesClient;
import com.azure.resourcemanager.appservice.generated.fluent.models.CertificateInner;
import com.azure.resourcemanager.appservice.generated.models.Certificate;
import com.azure.resourcemanager.appservice.generated.models.Certificates;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CertificatesImpl implements Certificates {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CertificatesImpl.class);

    private final CertificatesClient innerClient;

    private final WebSiteManager serviceManager;

    public CertificatesImpl(CertificatesClient innerClient, WebSiteManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Certificate> list() {
        PagedIterable<CertificateInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> list(Context context) {
        PagedIterable<CertificateInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> listByResourceGroup(String resourceGroupName) {
        PagedIterable<CertificateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public PagedIterable<Certificate> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<CertificateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new CertificateImpl(inner1, this.manager()));
    }

    public Certificate getByResourceGroup(String resourceGroupName, String name) {
        CertificateInner inner = this.serviceClient().getByResourceGroup(resourceGroupName, name);
        if (inner != null) {
            return new CertificateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<Certificate> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context) {
        Response<CertificateInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CertificateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void deleteByResourceGroup(String resourceGroupName, String name) {
        this.serviceClient().delete(resourceGroupName, name);
    }

    public Response<Void> deleteWithResponse(String resourceGroupName, String name, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, name, context);
    }

    public Certificate getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, Context.NONE).getValue();
    }

    public Response<Certificate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, name, context);
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
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, name, Context.NONE).getValue();
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
        String name = Utils.getValueFromIdByName(id, "certificates");
        if (name == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'certificates'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, name, context);
    }

    private CertificatesClient serviceClient() {
        return this.innerClient;
    }

    private WebSiteManager manager() {
        return this.serviceManager;
    }

    public CertificateImpl define(String name) {
        return new CertificateImpl(name, this.manager());
    }
}
