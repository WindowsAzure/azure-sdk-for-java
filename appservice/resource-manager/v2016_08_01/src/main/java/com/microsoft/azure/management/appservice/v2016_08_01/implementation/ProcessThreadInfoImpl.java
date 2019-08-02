/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01.implementation;

import com.microsoft.azure.management.appservice.v2016_08_01.ProcessThreadInfo;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;

class ProcessThreadInfoImpl extends IndexableRefreshableWrapperImpl<ProcessThreadInfo, ProcessThreadInfoInner> implements ProcessThreadInfo {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String processId;
    private String threadId;
    private String instanceId;

    ProcessThreadInfoImpl(ProcessThreadInfoInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.processId = IdParsingUtils.getValueFromIdByName(inner.id(), "processes");
        this.threadId = IdParsingUtils.getValueFromIdByName(inner.id(), "threads");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "instances");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<ProcessThreadInfoInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getInstanceProcessThreadAsync(this.resourceGroupName, this.name, this.processId, this.threadId, this.instanceId);
    }



    @Override
    public Integer basePriority() {
        return this.inner().basePriority();
    }

    @Override
    public Integer currentPriority() {
        return this.inner().currentPriority();
    }

    @Override
    public String href() {
        return this.inner().href();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String priorityLevel() {
        return this.inner().priorityLevel();
    }

    @Override
    public String priviledgedProcessorTime() {
        return this.inner().priviledgedProcessorTime();
    }

    @Override
    public String process() {
        return this.inner().process();
    }

    @Override
    public Integer processThreadInfoId() {
        return this.inner().processThreadInfoId();
    }

    @Override
    public String startAddress() {
        return this.inner().startAddress();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String state() {
        return this.inner().state();
    }

    @Override
    public String totalProcessorTime() {
        return this.inner().totalProcessorTime();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userProcessorTime() {
        return this.inner().userProcessorTime();
    }

    @Override
    public String waitReason() {
        return this.inner().waitReason();
    }

}
