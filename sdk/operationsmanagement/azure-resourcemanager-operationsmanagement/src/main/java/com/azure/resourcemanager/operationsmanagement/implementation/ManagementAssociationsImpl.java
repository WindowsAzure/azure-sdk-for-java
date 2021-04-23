// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.operationsmanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.operationsmanagement.fluent.ManagementAssociationsClient;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationInner;
import com.azure.resourcemanager.operationsmanagement.fluent.models.ManagementAssociationPropertiesListInner;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociation;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociationPropertiesList;
import com.azure.resourcemanager.operationsmanagement.models.ManagementAssociations;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ManagementAssociationsImpl implements ManagementAssociations {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagementAssociationsImpl.class);

    private final ManagementAssociationsClient innerClient;

    private final com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager;

    public ManagementAssociationsImpl(
        ManagementAssociationsClient innerClient,
        com.azure.resourcemanager.operationsmanagement.OperationsManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public ManagementAssociationPropertiesList listBySubscription() {
        ManagementAssociationPropertiesListInner inner = this.serviceClient().listBySubscription();
        if (inner != null) {
            return new ManagementAssociationPropertiesListImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementAssociationPropertiesList> listBySubscriptionWithResponse(Context context) {
        Response<ManagementAssociationPropertiesListInner> inner =
            this.serviceClient().listBySubscriptionWithResponse(context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementAssociationPropertiesListImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public ManagementAssociation createOrUpdate(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName,
        ManagementAssociationInner parameters) {
        ManagementAssociationInner inner =
            this
                .serviceClient()
                .createOrUpdate(
                    resourceGroupName, providerName, resourceType, resourceName, managementAssociationName, parameters);
        if (inner != null) {
            return new ManagementAssociationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementAssociation> createOrUpdateWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName,
        ManagementAssociationInner parameters,
        Context context) {
        Response<ManagementAssociationInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName,
                    providerName,
                    resourceType,
                    resourceName,
                    managementAssociationName,
                    parameters,
                    context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementAssociationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName) {
        this
            .serviceClient()
            .delete(resourceGroupName, providerName, resourceType, resourceName, managementAssociationName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(
                resourceGroupName, providerName, resourceType, resourceName, managementAssociationName, context);
    }

    public ManagementAssociation get(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName) {
        ManagementAssociationInner inner =
            this
                .serviceClient()
                .get(resourceGroupName, providerName, resourceType, resourceName, managementAssociationName);
        if (inner != null) {
            return new ManagementAssociationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ManagementAssociation> getWithResponse(
        String resourceGroupName,
        String providerName,
        String resourceType,
        String resourceName,
        String managementAssociationName,
        Context context) {
        Response<ManagementAssociationInner> inner =
            this
                .serviceClient()
                .getWithResponse(
                    resourceGroupName, providerName, resourceType, resourceName, managementAssociationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ManagementAssociationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private ManagementAssociationsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.operationsmanagement.OperationsManagementManager manager() {
        return this.serviceManager;
    }
}
