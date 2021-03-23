// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ProductPoliciesClient;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyCollectionInner;
import com.azure.resourcemanager.apimanagement.fluent.models.PolicyContractInner;
import com.azure.resourcemanager.apimanagement.models.PolicyCollection;
import com.azure.resourcemanager.apimanagement.models.PolicyContract;
import com.azure.resourcemanager.apimanagement.models.PolicyExportFormat;
import com.azure.resourcemanager.apimanagement.models.PolicyIdName;
import com.azure.resourcemanager.apimanagement.models.ProductPolicies;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProductPoliciesImpl implements ProductPolicies {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductPoliciesImpl.class);

    private final ProductPoliciesClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ProductPoliciesImpl(
        ProductPoliciesClient innerClient,
        com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PolicyCollection listByProduct(String resourceGroupName, String serviceName, String productId) {
        PolicyCollectionInner inner = this.serviceClient().listByProduct(resourceGroupName, serviceName, productId);
        if (inner != null) {
            return new PolicyCollectionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyCollection> listByProductWithResponse(
        String resourceGroupName, String serviceName, String productId, Context context) {
        Response<PolicyCollectionInner> inner =
            this.serviceClient().listByProductWithResponse(resourceGroupName, serviceName, productId, context);
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

    public void getEntityTag(String resourceGroupName, String serviceName, String productId, PolicyIdName policyId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, productId, policyId);
    }

    public Response<Void> getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String productId, PolicyIdName policyId, Context context) {
        return this
            .serviceClient()
            .getEntityTagWithResponse(resourceGroupName, serviceName, productId, policyId, context);
    }

    public PolicyContract get(String resourceGroupName, String serviceName, String productId, PolicyIdName policyId) {
        PolicyContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, productId, policyId);
        if (inner != null) {
            return new PolicyContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyContract> getWithResponse(
        String resourceGroupName,
        String serviceName,
        String productId,
        PolicyIdName policyId,
        PolicyExportFormat format,
        Context context) {
        Response<PolicyContractInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, productId, policyId, format, context);
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
        String resourceGroupName,
        String serviceName,
        String productId,
        PolicyIdName policyId,
        PolicyContractInner parameters) {
        PolicyContractInner inner =
            this.serviceClient().createOrUpdate(resourceGroupName, serviceName, productId, policyId, parameters);
        if (inner != null) {
            return new PolicyContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PolicyContract> createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String productId,
        PolicyIdName policyId,
        PolicyContractInner parameters,
        String ifMatch,
        Context context) {
        Response<PolicyContractInner> inner =
            this
                .serviceClient()
                .createOrUpdateWithResponse(
                    resourceGroupName, serviceName, productId, policyId, parameters, ifMatch, context);
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

    public void delete(
        String resourceGroupName, String serviceName, String productId, PolicyIdName policyId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, productId, policyId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String productId,
        PolicyIdName policyId,
        String ifMatch,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, productId, policyId, ifMatch, context);
    }

    private ProductPoliciesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
