// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagecache.StorageCacheManager;
import com.azure.resourcemanager.storagecache.fluent.SkusClient;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.storagecache.models.ResourceSku;
import com.azure.resourcemanager.storagecache.models.Skus;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class SkusImpl implements Skus {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SkusImpl.class);

    private final SkusClient innerClient;

    private final StorageCacheManager serviceManager;

    public SkusImpl(SkusClient innerClient, StorageCacheManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<ResourceSku> list() {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    public PagedIterable<ResourceSku> list(Context context) {
        PagedIterable<ResourceSkuInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new ResourceSkuImpl(inner1, this.manager()));
    }

    private SkusClient serviceClient() {
        return this.innerClient;
    }

    private StorageCacheManager manager() {
        return this.serviceManager;
    }
}
