/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_03.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.monitor.v2018_03.LogSearchRuleResource;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2018_03.Enabled;
import org.joda.time.DateTime;
import com.microsoft.azure.management.monitor.v2018_03.ProvisioningState;
import com.microsoft.azure.management.monitor.v2018_03.Source;
import com.microsoft.azure.management.monitor.v2018_03.Schedule;
import com.microsoft.azure.management.monitor.v2018_03.Action;

class LogSearchRuleResourceImpl extends GroupableResourceCoreImpl<LogSearchRuleResource, LogSearchRuleResourceInner, LogSearchRuleResourceImpl, MonitorManager> implements LogSearchRuleResource, LogSearchRuleResource.Definition, LogSearchRuleResource.Update {
    LogSearchRuleResourceImpl(String name, LogSearchRuleResourceInner inner, MonitorManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<LogSearchRuleResource> createResourceAsync() {
        ScheduledQueryRulesInner client = this.manager().inner().scheduledQueryRules();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<LogSearchRuleResource> updateResourceAsync() {
        ScheduledQueryRulesInner client = this.manager().inner().scheduledQueryRules();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LogSearchRuleResourceInner> getInnerAsync() {
        ScheduledQueryRulesInner client = this.manager().inner().scheduledQueryRules();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public Action action() {
        return this.inner().action();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public Enabled enabled() {
        return this.inner().enabled();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Schedule schedule() {
        return this.inner().schedule();
    }

    @Override
    public Source source() {
        return this.inner().source();
    }

    @Override
    public LogSearchRuleResourceImpl withAction(Action action) {
        this.inner().withAction(action);
        return this;
    }

    @Override
    public LogSearchRuleResourceImpl withSchedule(Schedule schedule) {
        this.inner().withSchedule(schedule);
        return this;
    }

    @Override
    public LogSearchRuleResourceImpl withSource(Source source) {
        this.inner().withSource(source);
        return this;
    }

    @Override
    public LogSearchRuleResourceImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public LogSearchRuleResourceImpl withEnabled(Enabled enabled) {
        this.inner().withEnabled(enabled);
        return this;
    }

}
