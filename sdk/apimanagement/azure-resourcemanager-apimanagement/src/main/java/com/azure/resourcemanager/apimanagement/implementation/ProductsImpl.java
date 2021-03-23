// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.apimanagement.fluent.ProductsClient;
import com.azure.resourcemanager.apimanagement.fluent.models.ProductContractInner;
import com.azure.resourcemanager.apimanagement.fluent.models.TagResourceContractInner;
import com.azure.resourcemanager.apimanagement.models.ProductContract;
import com.azure.resourcemanager.apimanagement.models.Products;
import com.azure.resourcemanager.apimanagement.models.ProductsGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ProductsGetResponse;
import com.azure.resourcemanager.apimanagement.models.TagResourceContract;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class ProductsImpl implements Products {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ProductsImpl.class);

    private final ProductsClient innerClient;

    private final com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager;

    public ProductsImpl(
        ProductsClient innerClient, com.azure.resourcemanager.apimanagement.ApiManagementManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ProductContract> listByService(String resourceGroupName, String serviceName) {
        PagedIterable<ProductContractInner> inner = this.serviceClient().listByService(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new ProductContractImpl(inner1, this.manager()));
    }

    public PagedIterable<ProductContract> listByService(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean expandGroups,
        String tags,
        Context context) {
        PagedIterable<ProductContractInner> inner =
            this
                .serviceClient()
                .listByService(resourceGroupName, serviceName, filter, top, skip, expandGroups, tags, context);
        return Utils.mapPage(inner, inner1 -> new ProductContractImpl(inner1, this.manager()));
    }

    public void getEntityTag(String resourceGroupName, String serviceName, String productId) {
        this.serviceClient().getEntityTag(resourceGroupName, serviceName, productId);
    }

    public ProductsGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String productId, Context context) {
        return this.serviceClient().getEntityTagWithResponse(resourceGroupName, serviceName, productId, context);
    }

    public ProductContract get(String resourceGroupName, String serviceName, String productId) {
        ProductContractInner inner = this.serviceClient().get(resourceGroupName, serviceName, productId);
        if (inner != null) {
            return new ProductContractImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<ProductContract> getWithResponse(
        String resourceGroupName, String serviceName, String productId, Context context) {
        ProductsGetResponse inner =
            this.serviceClient().getWithResponse(resourceGroupName, serviceName, productId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new ProductContractImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String serviceName, String productId, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, serviceName, productId, ifMatch);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName,
        String serviceName,
        String productId,
        String ifMatch,
        Boolean deleteSubscriptions,
        Context context) {
        return this
            .serviceClient()
            .deleteWithResponse(resourceGroupName, serviceName, productId, ifMatch, deleteSubscriptions, context);
    }

    public PagedIterable<TagResourceContract> listByTags(String resourceGroupName, String serviceName) {
        PagedIterable<TagResourceContractInner> inner = this.serviceClient().listByTags(resourceGroupName, serviceName);
        return Utils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    public PagedIterable<TagResourceContract> listByTags(
        String resourceGroupName,
        String serviceName,
        String filter,
        Integer top,
        Integer skip,
        Boolean includeNotTaggedProducts,
        Context context) {
        PagedIterable<TagResourceContractInner> inner =
            this
                .serviceClient()
                .listByTags(resourceGroupName, serviceName, filter, top, skip, includeNotTaggedProducts, context);
        return Utils.mapPage(inner, inner1 -> new TagResourceContractImpl(inner1, this.manager()));
    }

    public ProductContract getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String productId = Utils.getValueFromIdByName(id, "products");
        if (productId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, productId, Context.NONE).getValue();
    }

    public Response<ProductContract> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String productId = Utils.getValueFromIdByName(id, "products");
        if (productId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        return this.getWithResponse(resourceGroupName, serviceName, productId, context);
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
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String productId = Utils.getValueFromIdByName(id, "products");
        if (productId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        String localIfMatch = null;
        Boolean localDeleteSubscriptions = null;
        this
            .deleteWithResponse(
                resourceGroupName, serviceName, productId, localIfMatch, localDeleteSubscriptions, Context.NONE)
            .getValue();
    }

    public Response<Void> deleteByIdWithResponse(
        String id, String ifMatch, Boolean deleteSubscriptions, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String serviceName = Utils.getValueFromIdByName(id, "service");
        if (serviceName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'service'.", id)));
        }
        String productId = Utils.getValueFromIdByName(id, "products");
        if (productId == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'products'.", id)));
        }
        return this
            .deleteWithResponse(resourceGroupName, serviceName, productId, ifMatch, deleteSubscriptions, context);
    }

    private ProductsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.apimanagement.ApiManagementManager manager() {
        return this.serviceManager;
    }

    public ProductContractImpl define(String name) {
        return new ProductContractImpl(name, this.manager());
    }
}
