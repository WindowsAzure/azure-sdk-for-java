// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.hybridnetwork.fluent.VendorSkuPreviewsClient;
import com.azure.resourcemanager.hybridnetwork.fluent.models.PreviewSubscriptionInner;
import com.azure.resourcemanager.hybridnetwork.models.PreviewSubscription;
import com.azure.resourcemanager.hybridnetwork.models.VendorSkuPreviews;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VendorSkuPreviewsImpl implements VendorSkuPreviews {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VendorSkuPreviewsImpl.class);

    private final VendorSkuPreviewsClient innerClient;

    private final com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager;

    public VendorSkuPreviewsImpl(
        VendorSkuPreviewsClient innerClient,
        com.azure.resourcemanager.hybridnetwork.HybridNetworkManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<PreviewSubscription> list(String vendorName, String skuName) {
        PagedIterable<PreviewSubscriptionInner> inner = this.serviceClient().list(vendorName, skuName);
        return Utils.mapPage(inner, inner1 -> new PreviewSubscriptionImpl(inner1, this.manager()));
    }

    public PagedIterable<PreviewSubscription> list(String vendorName, String skuName, Context context) {
        PagedIterable<PreviewSubscriptionInner> inner = this.serviceClient().list(vendorName, skuName, context);
        return Utils.mapPage(inner, inner1 -> new PreviewSubscriptionImpl(inner1, this.manager()));
    }

    public PreviewSubscription get(String vendorName, String skuName, String previewSubscription) {
        PreviewSubscriptionInner inner = this.serviceClient().get(vendorName, skuName, previewSubscription);
        if (inner != null) {
            return new PreviewSubscriptionImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<PreviewSubscription> getWithResponse(
        String vendorName, String skuName, String previewSubscription, Context context) {
        Response<PreviewSubscriptionInner> inner =
            this.serviceClient().getWithResponse(vendorName, skuName, previewSubscription, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new PreviewSubscriptionImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String vendorName, String skuName, String previewSubscription) {
        this.serviceClient().delete(vendorName, skuName, previewSubscription);
    }

    public void delete(String vendorName, String skuName, String previewSubscription, Context context) {
        this.serviceClient().delete(vendorName, skuName, previewSubscription, context);
    }

    public PreviewSubscription getById(String id) {
        String vendorName = Utils.getValueFromIdByName(id, "vendors");
        if (vendorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendors'.", id)));
        }
        String skuName = Utils.getValueFromIdByName(id, "vendorSkus");
        if (skuName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendorSkus'.", id)));
        }
        String previewSubscription = Utils.getValueFromIdByName(id, "previewSubscriptions");
        if (previewSubscription == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'previewSubscriptions'.",
                                id)));
        }
        return this.getWithResponse(vendorName, skuName, previewSubscription, Context.NONE).getValue();
    }

    public Response<PreviewSubscription> getByIdWithResponse(String id, Context context) {
        String vendorName = Utils.getValueFromIdByName(id, "vendors");
        if (vendorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendors'.", id)));
        }
        String skuName = Utils.getValueFromIdByName(id, "vendorSkus");
        if (skuName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendorSkus'.", id)));
        }
        String previewSubscription = Utils.getValueFromIdByName(id, "previewSubscriptions");
        if (previewSubscription == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'previewSubscriptions'.",
                                id)));
        }
        return this.getWithResponse(vendorName, skuName, previewSubscription, context);
    }

    public void deleteById(String id) {
        String vendorName = Utils.getValueFromIdByName(id, "vendors");
        if (vendorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendors'.", id)));
        }
        String skuName = Utils.getValueFromIdByName(id, "vendorSkus");
        if (skuName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendorSkus'.", id)));
        }
        String previewSubscription = Utils.getValueFromIdByName(id, "previewSubscriptions");
        if (previewSubscription == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'previewSubscriptions'.",
                                id)));
        }
        this.delete(vendorName, skuName, previewSubscription, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String vendorName = Utils.getValueFromIdByName(id, "vendors");
        if (vendorName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendors'.", id)));
        }
        String skuName = Utils.getValueFromIdByName(id, "vendorSkus");
        if (skuName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'vendorSkus'.", id)));
        }
        String previewSubscription = Utils.getValueFromIdByName(id, "previewSubscriptions");
        if (previewSubscription == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'previewSubscriptions'.",
                                id)));
        }
        this.delete(vendorName, skuName, previewSubscription, context);
    }

    private VendorSkuPreviewsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.hybridnetwork.HybridNetworkManager manager() {
        return this.serviceManager;
    }

    public PreviewSubscriptionImpl define(String name) {
        return new PreviewSubscriptionImpl(name, this.manager());
    }
}
