// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.VideoEntityInner;
import com.azure.resourcemanager.videoanalyzer.models.VideoEntity;
import com.azure.resourcemanager.videoanalyzer.models.VideoFlags;
import com.azure.resourcemanager.videoanalyzer.models.VideoMediaInfo;
import com.azure.resourcemanager.videoanalyzer.models.VideoStreaming;
import com.azure.resourcemanager.videoanalyzer.models.VideoStreamingToken;
import com.azure.resourcemanager.videoanalyzer.models.VideoType;

public final class VideoEntityImpl implements VideoEntity, VideoEntity.Definition, VideoEntity.Update {
    private VideoEntityInner innerObject;

    private final com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public String title() {
        return this.innerModel().title();
    }

    public String description() {
        return this.innerModel().description();
    }

    public VideoType typePropertiesType() {
        return this.innerModel().typePropertiesType();
    }

    public VideoFlags flags() {
        return this.innerModel().flags();
    }

    public VideoStreaming streaming() {
        return this.innerModel().streaming();
    }

    public VideoMediaInfo mediaInfo() {
        return this.innerModel().mediaInfo();
    }

    public VideoEntityInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String accountName;

    private String videoName;

    public VideoEntityImpl withExistingVideoAnalyzer(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    public VideoEntity create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .createOrUpdateWithResponse(resourceGroupName, accountName, videoName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VideoEntity create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .createOrUpdateWithResponse(resourceGroupName, accountName, videoName, this.innerModel(), context)
                .getValue();
        return this;
    }

    VideoEntityImpl(String name, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = new VideoEntityInner();
        this.serviceManager = serviceManager;
        this.videoName = name;
    }

    public VideoEntityImpl update() {
        return this;
    }

    public VideoEntity apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .updateWithResponse(resourceGroupName, accountName, videoName, this.innerModel(), Context.NONE)
                .getValue();
        return this;
    }

    public VideoEntity apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .updateWithResponse(resourceGroupName, accountName, videoName, this.innerModel(), context)
                .getValue();
        return this;
    }

    VideoEntityImpl(
        VideoEntityInner innerObject, com.azure.resourcemanager.videoanalyzer.VideoAnalyzerManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.accountName = Utils.getValueFromIdByName(innerObject.id(), "videoAnalyzers");
        this.videoName = Utils.getValueFromIdByName(innerObject.id(), "videos");
    }

    public VideoEntity refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .getWithResponse(resourceGroupName, accountName, videoName, Context.NONE)
                .getValue();
        return this;
    }

    public VideoEntity refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getVideos()
                .getWithResponse(resourceGroupName, accountName, videoName, context)
                .getValue();
        return this;
    }

    public VideoStreamingToken listStreamingToken() {
        return serviceManager.videos().listStreamingToken(resourceGroupName, accountName, videoName);
    }

    public Response<VideoStreamingToken> listStreamingTokenWithResponse(Context context) {
        return serviceManager
            .videos()
            .listStreamingTokenWithResponse(resourceGroupName, accountName, videoName, context);
    }

    public VideoEntityImpl withTitle(String title) {
        this.innerModel().withTitle(title);
        return this;
    }

    public VideoEntityImpl withDescription(String description) {
        this.innerModel().withDescription(description);
        return this;
    }
}
