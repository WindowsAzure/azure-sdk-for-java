/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import com.microsoft.azure.management.monitor.v2018_03.LogProfileResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2018_03.LogProfileResourcePatch;
import java.util.Map;
import java.util.List;
import com.microsoft.azure.management.monitor.v2018_03.RetentionPolicy;
import rx.functions.Func1;

class LogProfileResourceImpl extends CreatableUpdatableImpl<LogProfileResource, LogProfileResourceInner, LogProfileResourceImpl> implements LogProfileResource, LogProfileResource.Definition, LogProfileResource.Update {
    private String logProfileName;
    private LogProfileResourcePatch updateParameter;
    private final MonitorManager manager;

    LogProfileResourceImpl(String name, MonitorManager manager) {
        super(name, new LogProfileResourceInner());
        this.manager = manager;
        // Set resource name
        this.logProfileName = name;
        //
        this.updateParameter = new LogProfileResourcePatch();
    }

    LogProfileResourceImpl(LogProfileResourceInner inner, MonitorManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.logProfileName = inner.name();
        // resource ancestor names
        this.logProfileName = IdParsingUtils.getValueFromIdByName(inner.id(), "logprofiles");
        //
        this.updateParameter = new LogProfileResourcePatch();
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<LogProfileResource> createResourceAsync() {
        LogProfilesInner client = this.manager().inner().logProfiles();
        return client.createOrUpdateAsync(this.logProfileName, this.inner())
            .map(new Func1<LogProfileResourceInner, LogProfileResourceInner>() {
               @Override
               public LogProfileResourceInner call(LogProfileResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LogProfileResource> updateResourceAsync() {
        LogProfilesInner client = this.manager().inner().logProfiles();
        return client.updateAsync(this.logProfileName, this.updateParameter)
            .map(new Func1<LogProfileResourceInner, LogProfileResourceInner>() {
               @Override
               public LogProfileResourceInner call(LogProfileResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LogProfileResourceInner> getInnerAsync() {
        LogProfilesInner client = this.manager().inner().logProfiles();
        return client.getAsync(this.logProfileName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new LogProfileResourcePatch();
    }

    @Override
    public List<String> categories() {
        return this.inner().categories();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public List<String> locations() {
        return this.inner().locations();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public RetentionPolicy retentionPolicy() {
        return this.inner().retentionPolicy();
    }

    @Override
    public String serviceBusRuleId() {
        return this.inner().serviceBusRuleId();
    }

    @Override
    public String storageAccountId() {
        return this.inner().storageAccountId();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public LogProfileResourceImpl withCategories(List<String> categories) {
        this.inner().withCategories(categories);
        return this;
    }

    @Override
    public LogProfileResourceImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public LogProfileResourceImpl withLocations(List<String> locations) {
        this.inner().withLocations(locations);
        return this;
    }

    @Override
    public LogProfileResourceImpl withRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.inner().withRetentionPolicy(retentionPolicy);
        return this;
    }

    @Override
    public LogProfileResourceImpl withServiceBusRuleId(String serviceBusRuleId) {
        if (isInCreateMode()) {
            this.inner().withServiceBusRuleId(serviceBusRuleId);
        } else {
            this.updateParameter.withServiceBusRuleId(serviceBusRuleId);
        }
        return this;
    }

    @Override
    public LogProfileResourceImpl withStorageAccountId(String storageAccountId) {
        if (isInCreateMode()) {
            this.inner().withStorageAccountId(storageAccountId);
        } else {
            this.updateParameter.withStorageAccountId(storageAccountId);
        }
        return this;
    }

    @Override
    public LogProfileResourceImpl withTags(Map<String, String> tags) {
        if (isInCreateMode()) {
            this.inner().withTags(tags);
        } else {
            this.updateParameter.withTags(tags);
        }
        return this;
    }

}
