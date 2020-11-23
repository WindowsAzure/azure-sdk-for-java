// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.generated.ComputeManager;
import com.azure.resourcemanager.compute.generated.fluent.GalleryApplicationsClient;
import com.azure.resourcemanager.compute.generated.fluent.models.GalleryApplicationInner;
import com.azure.resourcemanager.compute.generated.models.GalleryApplication;
import com.azure.resourcemanager.compute.generated.models.GalleryApplications;

public final class GalleryApplicationsImpl implements GalleryApplications {
    private final GalleryApplicationsClient innerClient;

    private final ComputeManager serviceManager;

    public GalleryApplicationsImpl(GalleryApplicationsClient innerClient, ComputeManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public GalleryApplication get(String resourceGroupName, String galleryName, String galleryApplicationName) {
        GalleryApplicationInner inner =
            this.serviceClient().get(resourceGroupName, galleryName, galleryApplicationName);
        if (inner != null) {
            return new GalleryApplicationImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<GalleryApplication> getWithResponse(
        String resourceGroupName, String galleryName, String galleryApplicationName, Context context) {
        Response<GalleryApplicationInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, galleryName, galleryApplicationName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new GalleryApplicationImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String galleryName, String galleryApplicationName) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryApplicationName);
    }

    public void delete(String resourceGroupName, String galleryName, String galleryApplicationName, Context context) {
        this.serviceClient().delete(resourceGroupName, galleryName, galleryApplicationName, context);
    }

    public PagedIterable<GalleryApplication> listByGallery(String resourceGroupName, String galleryName) {
        PagedIterable<GalleryApplicationInner> inner =
            this.serviceClient().listByGallery(resourceGroupName, galleryName);
        return inner.mapPage(inner1 -> new GalleryApplicationImpl(inner1, this.manager()));
    }

    public PagedIterable<GalleryApplication> listByGallery(
        String resourceGroupName, String galleryName, Context context) {
        PagedIterable<GalleryApplicationInner> inner =
            this.serviceClient().listByGallery(resourceGroupName, galleryName, context);
        return inner.mapPage(inner1 -> new GalleryApplicationImpl(inner1, this.manager()));
    }

    private GalleryApplicationsClient serviceClient() {
        return this.innerClient;
    }

    private ComputeManager manager() {
        return this.serviceManager;
    }

    public GalleryApplicationImpl define(String name) {
        return new GalleryApplicationImpl(name, this.manager());
    }
}
