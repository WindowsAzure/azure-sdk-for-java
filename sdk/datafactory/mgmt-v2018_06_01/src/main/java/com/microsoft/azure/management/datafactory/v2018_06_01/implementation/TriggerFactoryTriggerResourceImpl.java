/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactory.v2018_06_01.TriggerFactoryTriggerResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datafactory.v2018_06_01.RerunTumblingWindowTriggerActionParameters;
import org.joda.time.DateTime;
import rx.functions.Func1;

class TriggerFactoryTriggerResourceImpl extends CreatableUpdatableImpl<TriggerFactoryTriggerResource, TriggerResourceInner, TriggerFactoryTriggerResourceImpl> implements TriggerFactoryTriggerResource, TriggerFactoryTriggerResource.Definition, TriggerFactoryTriggerResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String triggerName;
    private String rerunTriggerName;
    private RerunTumblingWindowTriggerActionParameters createOrUpdateParameter;

    TriggerFactoryTriggerResourceImpl(String name, DataFactoryManager manager) {
        super(name, new TriggerResourceInner());
        this.manager = manager;
        // Set resource name
        this.rerunTriggerName = name;
        //
        this.createOrUpdateParameter = new RerunTumblingWindowTriggerActionParameters();
    }

    TriggerFactoryTriggerResourceImpl(TriggerResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.rerunTriggerName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.triggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "triggers");
        this.rerunTriggerName = IdParsingUtils.getValueFromIdByName(inner.id(), "rerunTriggers");
        //
        this.createOrUpdateParameter = new RerunTumblingWindowTriggerActionParameters();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TriggerFactoryTriggerResource> createResourceAsync() {
        RerunTriggersInner client = this.manager().inner().rerunTriggers();
        return client.createAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.rerunTriggerName, this.createOrUpdateParameter)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<TriggerFactoryTriggerResource> updateResourceAsync() {
        RerunTriggersInner client = this.manager().inner().rerunTriggers();
        return client.createAsync(this.resourceGroupName, this.factoryName, this.triggerName, this.rerunTriggerName, this.createOrUpdateParameter)
            .map(new Func1<TriggerResourceInner, TriggerResourceInner>() {
               @Override
               public TriggerResourceInner call(TriggerResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<TriggerResourceInner> getInnerAsync() {
        RerunTriggersInner client = this.manager().inner().rerunTriggers();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createOrUpdateParameter = new RerunTumblingWindowTriggerActionParameters();
    }

    @Override
    public String etag() {
        return this.inner().etag();
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
    public TriggerInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public TriggerFactoryTriggerResourceImpl withExistingTrigger(String resourceGroupName, String factoryName, String triggerName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        this.triggerName = triggerName;
        return this;
    }

    @Override
    public TriggerFactoryTriggerResourceImpl withEndTime(DateTime endTime) {
        this.createOrUpdateParameter.withEndTime(endTime);
        return this;
    }

    @Override
    public TriggerFactoryTriggerResourceImpl withMaxConcurrency(int maxConcurrency) {
        this.createOrUpdateParameter.withMaxConcurrency(maxConcurrency);
        return this;
    }

    @Override
    public TriggerFactoryTriggerResourceImpl withStartTime(DateTime startTime) {
        this.createOrUpdateParameter.withStartTime(startTime);
        return this;
    }

}
