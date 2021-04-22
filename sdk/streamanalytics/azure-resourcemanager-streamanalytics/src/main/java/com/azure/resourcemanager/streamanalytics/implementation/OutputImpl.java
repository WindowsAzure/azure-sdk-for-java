// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.streamanalytics.fluent.models.OutputInner;
import com.azure.resourcemanager.streamanalytics.models.Diagnostics;
import com.azure.resourcemanager.streamanalytics.models.Output;
import com.azure.resourcemanager.streamanalytics.models.OutputDataSource;
import com.azure.resourcemanager.streamanalytics.models.Serialization;

public final class OutputImpl implements Output, Output.Definition, Output.Update {
    private OutputInner innerObject;

    private final com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public OutputDataSource datasource() {
        return this.innerModel().datasource();
    }

    public String timeWindow() {
        return this.innerModel().timeWindow();
    }

    public Float sizeWindow() {
        return this.innerModel().sizeWindow();
    }

    public Serialization serialization() {
        return this.innerModel().serialization();
    }

    public Diagnostics diagnostics() {
        return this.innerModel().diagnostics();
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

    public OutputInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String jobName;

    private String outputName;

    private String createIfMatch;

    private String createIfNoneMatch;

    private String updateIfMatch;

    public OutputImpl withExistingStreamingjob(String resourceGroupName, String jobName) {
        this.resourceGroupName = resourceGroupName;
        this.jobName = jobName;
        return this;
    }

    public Output create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .createOrReplaceWithResponse(
                    resourceGroupName,
                    jobName,
                    outputName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    Context.NONE)
                .getValue();
        return this;
    }

    public Output create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .createOrReplaceWithResponse(
                    resourceGroupName,
                    jobName,
                    outputName,
                    this.innerModel(),
                    createIfMatch,
                    createIfNoneMatch,
                    context)
                .getValue();
        return this;
    }

    OutputImpl(String name, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = new OutputInner();
        this.serviceManager = serviceManager;
        this.outputName = name;
        this.createIfMatch = null;
        this.createIfNoneMatch = null;
    }

    public OutputImpl update() {
        this.updateIfMatch = null;
        return this;
    }

    public Output apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .updateWithResponse(
                    resourceGroupName, jobName, outputName, this.innerModel(), updateIfMatch, Context.NONE)
                .getValue();
        return this;
    }

    public Output apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .updateWithResponse(resourceGroupName, jobName, outputName, this.innerModel(), updateIfMatch, context)
                .getValue();
        return this;
    }

    OutputImpl(
        OutputInner innerObject, com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourcegroups");
        this.jobName = Utils.getValueFromIdByName(innerObject.id(), "streamingjobs");
        this.outputName = Utils.getValueFromIdByName(innerObject.id(), "outputs");
    }

    public Output refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .getWithResponse(resourceGroupName, jobName, outputName, Context.NONE)
                .getValue();
        return this;
    }

    public Output refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getOutputs()
                .getWithResponse(resourceGroupName, jobName, outputName, context)
                .getValue();
        return this;
    }

    public OutputImpl withDatasource(OutputDataSource datasource) {
        this.innerModel().withDatasource(datasource);
        return this;
    }

    public OutputImpl withTimeWindow(String timeWindow) {
        this.innerModel().withTimeWindow(timeWindow);
        return this;
    }

    public OutputImpl withSizeWindow(Float sizeWindow) {
        this.innerModel().withSizeWindow(sizeWindow);
        return this;
    }

    public OutputImpl withSerialization(Serialization serialization) {
        this.innerModel().withSerialization(serialization);
        return this;
    }

    public OutputImpl withName(String name) {
        this.innerModel().withName(name);
        return this;
    }

    public OutputImpl withIfMatch(String ifMatch) {
        this.createIfMatch = ifMatch;
        return this;
    }

    public OutputImpl withIfNoneMatch(String ifNoneMatch) {
        this.createIfNoneMatch = ifNoneMatch;
        return this;
    }

    public OutputImpl ifMatch(String ifMatch) {
        this.updateIfMatch = ifMatch;
        return this;
    }
}