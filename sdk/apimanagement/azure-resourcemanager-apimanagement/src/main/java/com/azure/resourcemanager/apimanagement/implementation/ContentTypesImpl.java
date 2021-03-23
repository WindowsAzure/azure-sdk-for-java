// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ContentTypesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ContentTypeContractInner;
import com.azure.resourcemanager.apimanagement.models.ContentTypeContract;
import com.azure.resourcemanager.apimanagement.models.ContentTypes;
import com.azure.resourcemanager.apimanagement.models.ContentTypesCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ContentTypesGetResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ContentTypesImpl implements ContentTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentTypesImpl.class);

    private final ContentTypesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ContentTypesImpl(
        ContentTypesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ContentTypeContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<ContentTypeContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new ContentTypeContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ContentTypeContract> listByService(
        String resourceGroupName, String serviceName, Context context) {
        PagedIterable<ContentTypeContractInner> inner =
            this.serviceClient().listByService(resourceGroupName, serviceName, context);
        return Utils.mapPage(inner, inner1 -> new ContentTypeContractImpl(inner1, this.manager()));
    }

    public ContentTypeContract get(String resourceGroupName, String serviceName, String contentTypeId) {
        ContentTypeContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, contentTypeId);
        if (inner != null) {
            return new ContentTypeContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContentTypeContract> getWithResponse(
        String resourceGroupName, String serviceName, String contentTypeId, Context context) {
        ContentTypesGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, contentTypeId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContentTypeContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ContentTypeContract createOrUpdate(String resourceGroupName, String serviceName, String contentTypeId) {
        ContentTypeContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, contentTypeId);
        if (inner != null) {
            return new ContentTypeContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ContentTypeContract> createOrUpdateWithResponse(
        String resourceGroupName, String serviceName, String contentTypeId, String ifMatch, Context context) {
        ContentTypesCreateOrUpdateResponse inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, contentTypeId, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ContentTypeContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String contentTypeId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, contentTypeId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String contentTypeId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, contentTypeId, ifMatch, context);
    }

    private ContentTypesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
