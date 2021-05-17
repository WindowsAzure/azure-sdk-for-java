// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.videoanalyzer.fluent.VideosClient;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoEntityInner;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoStreamingTokenInner;
import com.azure.resourcemanager.videoanalyzer.models.VideoEntity;
import com.azure.resourcemanager.videoanalyzer.models.VideoStreamingToken;
import com.azure.resourcemanager.videoanalyzer.models.Videos;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class VideosImpl implements Videos {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VideosImpl.class);

    private final VideosClient innerClient;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public VideosImpl(
        VideosClient innerClient, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<VideoEntity> list(String resourceGroupName, String accountName) {
        PagedIterable<VideoEntityInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new VideoEntityImpl(inner1, this.manager()));
    }

    public PagedIterable<VideoEntity> list(String resourceGroupName, String accountName, Integer top, Context context) {
        PagedIterable<VideoEntityInner> inner = this.serviceClient().list(resourceGroupName, accountName, top, context);
        return Utils.mapPage(inner, inner1 -> new VideoEntityImpl(inner1, this.manager()));
    }

    public VideoEntity get(String resourceGroupName, String accountName, String videoName) {
        VideoEntityInner inner = this.serviceClient().get(resourceGroupName, accountName, videoName);
        if (inner != null) {
            return new VideoEntityImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VideoEntity> getWithResponse(
        String resourceGroupName, String accountName, String videoName, Context context) {
        Response<VideoEntityInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, videoName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VideoEntityImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String videoName) {
        this.serviceClient().delete(resourceGroupName, accountName, videoName);
    }

    public Response<Void> deleteWithResponse(
        String resourceGroupName, String accountName, String videoName, Context context) {
        return this.serviceClient().deleteWithResponse(resourceGroupName, accountName, videoName, context);
    }

    public VideoStreamingToken listStreamingToken(String resourceGroupName, String accountName, String videoName) {
        VideoStreamingTokenInner inner =
            this.serviceClient().listStreamingToken(resourceGroupName, accountName, videoName);
        if (inner != null) {
            return new VideoStreamingTokenImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VideoStreamingToken> listStreamingTokenWithResponse(
        String resourceGroupName, String accountName, String videoName, Context context) {
        Response<VideoStreamingTokenInner> inner =
            this.serviceClient().listStreamingTokenWithResponse(resourceGroupName, accountName, videoName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VideoStreamingTokenImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public VideoEntity getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String videoName = Utils.getValueFromIdByName(id, "videos");
        if (videoName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'videos'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, videoName, Context.NONE).getValue();
    }

    public Response<VideoEntity> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String videoName = Utils.getValueFromIdByName(id, "videos");
        if (videoName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'videos'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, videoName, context);
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
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String videoName = Utils.getValueFromIdByName(id, "videos");
        if (videoName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'videos'.", id)));
        }
        this.deleteWithResponse(resourceGroupName, accountName, videoName, Context.NONE).getValue();
    }

    public Response<Void> deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "videoAnalyzers");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'videoAnalyzers'.", id)));
        }
        String videoName = Utils.getValueFromIdByName(id, "videos");
        if (videoName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'videos'.", id)));
        }
        return this.deleteWithResponse(resourceGroupName, accountName, videoName, context);
    }

    private VideosClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    public VideoEntityImpl define(String name) {
        return new VideoEntityImpl(name, this.manager());
    }
}
