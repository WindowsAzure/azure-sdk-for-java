// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.PoliciesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;
import com.azure.resourcemanager.apimanagement.models.Policies;
import com.azure.resourcemanager.apimanagement.models.PolicyCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyContract;
import com.azure.resourcemanager.apimanagement.models.PolicyExportFormat;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class PoliciesImpl implements Policies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PoliciesImpl.class);

    private final PoliciesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public PoliciesImpl(
        PoliciesClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PolicyCollection listByService(String resourceGroupName, String serviceName) {
        PolicyCollectionInner inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        if (inner != null) {
            return new PolicyCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyCollection> listByServiceWithResponse(
        String resourceGroupName, String serviceName, Context context) {
        Response<PolicyCollectionInner> inner =
            this.serviceClient().listByServiceWithResponse(resourceGroupName, serviceName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyCollectionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void getEntityTag(String resourceGroupName, String serviceName, PolicyIdName policyId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, policyId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, PolicyIdName policyId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, policyId, context);
    }

    public PolicyContract get(String resourceGroupName, String serviceName, PolicyIdName policyId) {
        PolicyContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, policyId);
        if (inner != null) {
            return new PolicyContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        PolicyIdName policyId,
        PolicyExportFormat format,
        Context context) {
        Response<PolicyContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, policyId, format, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PolicyContract createOrUpdate(
        String resourceGroupName, String serviceName, PolicyIdName policyId, PolicyContractInner parameters) {
        PolicyContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, policyId, parameters);
        if (inner != null) {
            return new PolicyContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        PolicyIdName policyId,
        PolicyContractInner parameters,
        String ifMatch,
        Context context) {
        Response<PolicyContractInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(resourceGroupName, serviceName, policyId, parameters, ifMatch, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PolicyContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, PolicyIdName policyId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, policyId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, PolicyIdName policyId, String ifMatch, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, serviceName, policyId, ifMatch, context);
    }

    private PoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
