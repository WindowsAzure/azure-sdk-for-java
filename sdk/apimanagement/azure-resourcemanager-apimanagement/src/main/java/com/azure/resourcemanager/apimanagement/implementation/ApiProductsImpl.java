// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ApiProductsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ProductContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiProducts;
import com.azure.resourcemanager.apimanagement.models.ProductContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ApiProductsImpl implements ApiProducts {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ApiProductsImpl.class);

    private final ApiProductsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ApiProductsImpl(
        ApiProductsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProductContract> listByApis(String resourceGroupName, String serviceName, String apiId) {
        PagedIterable<ProductContractInner> inner =
            this.serviceClient().listByApis(resourceGroupName, serviceName, apiId);
        return Utils.mapPage(inner, inner1 -> new ProductContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ProductContract> listByApis(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context) {
        PagedIterable<ProductContractInner> inner =
            this.serviceClient().listByApis(resourceGroupName, serviceName, apiId, filter, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new ProductContractImpl(inner1, this.manager()));
    }

    private ApiProductsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }
}
