/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.Activity;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.ParameterSpecification;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineFolder;

class PipelineResourceImpl extends CreatableUpdatableImpl<PipelineResource, PipelineResourceInner, PipelineResourceImpl> implements PipelineResource, PipelineResource.Definition, PipelineResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String pipelineName;

    PipelineResourceImpl(String name, DataFactoryManager manager) {
        super(name, new PipelineResourceInner());
        this.manager = manager;
        // Set resource name
        this.pipelineName = name;
        //
    }

    PipelineResourceImpl(PipelineResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.pipelineName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.pipelineName = IdParsingUtils.getValueFromIdByName(inner.id(), "pipelines");
        //
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<PipelineResource> createResourceAsync() {
        PipelinesInner client = this.manager().inner().pipelines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.pipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<PipelineResource> updateResourceAsync() {
        PipelinesInner client = this.manager().inner().pipelines();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.pipelineName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<PipelineResourceInner> getInnerAsync() {
        PipelinesInner client = this.manager().inner().pipelines();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.pipelineName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public List<Activity> activities() {
        return this.inner().activities();
    }

    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public List<Object> annotations() {
        return this.inner().annotations();
    }

    @Override
    public Integer concurrency() {
        return this.inner().concurrency();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public PipelineFolder folder() {
        return this.inner().folder();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, ParameterSpecification> parameters() {
        return this.inner().parameters();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public PipelineResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public PipelineResourceImpl withActivities(List<Activity> activities) {
        this.inner().withActivities(activities);
        return this;
    }

    @Override
    public PipelineResourceImpl withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.inner().withAdditionalProperties(additionalProperties);
        return this;
    }

    @Override
    public PipelineResourceImpl withAnnotations(List<Object> annotations) {
        this.inner().withAnnotations(annotations);
        return this;
    }

    @Override
    public PipelineResourceImpl withConcurrency(Integer concurrency) {
        this.inner().withConcurrency(concurrency);
        return this;
    }

    @Override
    public PipelineResourceImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public PipelineResourceImpl withFolder(PipelineFolder folder) {
        this.inner().withFolder(folder);
        return this;
    }

    @Override
    public PipelineResourceImpl withParameters(Map<String, ParameterSpecification> parameters) {
        this.inner().withParameters(parameters);
        return this;
    }

}
