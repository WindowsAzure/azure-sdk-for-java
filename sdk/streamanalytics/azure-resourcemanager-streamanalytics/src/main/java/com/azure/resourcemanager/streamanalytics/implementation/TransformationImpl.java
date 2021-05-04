// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.TransformationInner;
import com.azure.resourcemanager.streamanalytics.models.Transformation;

public final class TransformationImpl implements Transformation, Transformation.Definition, Transformation.Update {
    private TransformationInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public Integer streamingUnits() {
        return this.innerModel().streamingUnits();
    }

    public String query() {
        return this.innerModel().query();
    }

    public String etag() {
        return this.innerModel().etag();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public TransformationInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobName;

    private String transformationName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    public TransformationImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    public Transformation create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .createOrReplaceWithResponse(
                    resourceGroupName,
                    jobName,
                    transformationName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public Transformation create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .createOrReplaceWithResponse(
                    resourceGroupName,
                    jobName,
                    transformationName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    TransformationImpl(String name, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = new TransformationInner();
        this.serviceManager = serviceManager;
        this.transformationName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public TransformationImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public Transformation apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .updateWithResponse(
                    resourceGroupName, jobName, transformationName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Transformation apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .updateWithResponse(
                    resourceGroupName, jobName, transformationName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    TransformationImpl(
        TransformationInner innerObject,
        com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "streamingjobs");
        this.transformationName = Utils.getValueFromIdByName(innerObject.id(), "transformations");
    }

    public Transformation refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .getWithResponse(resourceGroupName, jobName, transformationName, Context.NONE)
                .getValue();
        return this;
    }

    public Transformation refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getTransformations()
                .getWithResponse(resourceGroupName, jobName, transformationName, context)
                .getValue();
        return this;
    }

    public TransformationImpl withStreamingUnits(Integer streamingUnits) {
        this.innerModel().withStreamingUnits(streamingUnits);
        return this;
    }

    public TransformationImpl withQuery(String query) {
        this.innerModel().withQuery(query);
        return this;
    }

    public TransformationImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public TransformationImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public TransformationImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    public TransformationImpl ifMatch(String ifMatch) {
        this.updateIfMatch = ifMatch;
        return this;
    }
}
