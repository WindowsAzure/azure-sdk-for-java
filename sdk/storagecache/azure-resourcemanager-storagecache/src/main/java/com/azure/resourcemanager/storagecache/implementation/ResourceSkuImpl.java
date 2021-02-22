// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.implementation;

import com.azure.resourcemanager.storagecache.StorageCacheManager;
import com.azure.resourcemanager.storagecache.fluent.models.ResourceSkuInner;
import com.azure.resourcemanager.storagecache.models.ResourceSku;
import com.azure.resourcemanager.storagecache.models.ResourceSkuCapabilities;
import com.azure.resourcemanager.storagecache.models.ResourceSkuLocationInfo;
import com.azure.resourcemanager.storagecache.models.Restriction;
import java.util.Collections;
import java.util.List;

public final class ResourceSkuImpl implements ResourceSku {
    private ResourceSkuInner innerObject;

    private final StorageCacheManager serviceManager;

    ResourceSkuImpl(ResourceSkuInner innerObject, StorageCacheManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String resourceType() {
        return this.innerModel().resourceType();
    }

    public List<ResourceSkuCapabilities> capabilities() {
        List<ResourceSkuCapabilities> inner = this.innerModel().capabilities();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<String> locations() {
        List<String> inner = this.innerModel().locations();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<ResourceSkuLocationInfo> locationInfo() {
        List<ResourceSkuLocationInfo> inner = this.innerModel().locationInfo();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String name() {
        return this.innerModel().name();
    }

    public List<Restriction> restrictions() {
        List<Restriction> inner = this.innerModel().restrictions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public ResourceSkuInner innerModel() {
        return this.innerObject;
    }

    private StorageCacheManager manager() {
        return this.serviceManager;
    }
}
