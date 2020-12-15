// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.advisor.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.advisor.AdvisorManager;
import com.azure.resourcemanager.advisor.fluent.RecommendationMetadatasClient;
import com.azure.resourcemanager.advisor.fluent.models.MetadataEntityInner;
import com.azure.resourcemanager.advisor.models.MetadataEntity;
import com.azure.resourcemanager.advisor.models.RecommendationMetadatas;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class RecommendationMetadatasImpl implements RecommendationMetadatas {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RecommendationMetadatasImpl.class);

    private final RecommendationMetadatasClient innerClient;

    private final AdvisorManager serviceManager;

    public RecommendationMetadatasImpl(RecommendationMetadatasClient innerClient, AdvisorManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public MetadataEntity get(String name) {
        MetadataEntityInner inner = this.serviceClient().get(name);
        if (inner != null) {
            return new MetadataEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<MetadataEntity> getWithResponse(String name, Context context) {
        Response<MetadataEntityInner> inner = this.serviceClient().getWithResponse(name, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new MetadataEntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<MetadataEntity> list() {
        PagedIterable<MetadataEntityInner> inner = this.serviceClient().list();
        return inner.mapPage(inner1 -> new MetadataEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<MetadataEntity> list(Context context) {
        PagedIterable<MetadataEntityInner> inner = this.serviceClient().list(context);
        return inner.mapPage(inner1 -> new MetadataEntityImpl(inner1, this.manager()));
    }

    private RecommendationMetadatasClient serviceClient() {
        return this.innerClient;
    }

    private AdvisorManager manager() {
        return this.serviceManager;
    }
}
