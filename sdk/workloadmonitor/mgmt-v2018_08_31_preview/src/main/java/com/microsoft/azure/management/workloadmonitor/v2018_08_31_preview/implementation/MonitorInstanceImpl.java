/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.MonitorInstance;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.AlertGeneration;
import java.util.List;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.HealthState;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.HealthStateCategory;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.HealthStateChange;
import org.joda.time.DateTime;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.MonitorCategory;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.MonitorType;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.WorkloadType;

class MonitorInstanceImpl extends WrapperImpl<MonitorInstanceInner> implements MonitorInstance {
    private final WorkloadMonitorManager manager;
    MonitorInstanceImpl(MonitorInstanceInner inner, WorkloadMonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public WorkloadMonitorManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, String> aggregateProperties() {
        return this.inner().aggregateProperties();
    }

    @Override
    public AlertGeneration alertGeneration() {
        return this.inner().alertGeneration();
    }

    @Override
    public List<MonitorInstanceInner> children() {
        return this.inner().children();
    }

    @Override
    public String componentId() {
        return this.inner().componentId();
    }

    @Override
    public String componentName() {
        return this.inner().componentName();
    }

    @Override
    public String componentTypeId() {
        return this.inner().componentTypeId();
    }

    @Override
    public String componentTypeName() {
        return this.inner().componentTypeName();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public HealthState healthState() {
        return this.inner().healthState();
    }

    @Override
    public HealthStateCategory healthStateCategory() {
        return this.inner().healthStateCategory();
    }

    @Override
    public List<HealthStateChange> healthStateChanges() {
        return this.inner().healthStateChanges();
    }

    @Override
    public DateTime healthStateChangesEndTime() {
        return this.inner().healthStateChangesEndTime();
    }

    @Override
    public DateTime healthStateChangesStartTime() {
        return this.inner().healthStateChangesStartTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastHealthStateChangeTime() {
        return this.inner().lastHealthStateChangeTime();
    }

    @Override
    public MonitorCategory monitorCategory() {
        return this.inner().monitorCategory();
    }

    @Override
    public String monitorId() {
        return this.inner().monitorId();
    }

    @Override
    public String monitorName() {
        return this.inner().monitorName();
    }

    @Override
    public MonitorType monitorType() {
        return this.inner().monitorType();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String solutionId() {
        return this.inner().solutionId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public WorkloadType workloadType() {
        return this.inner().workloadType();
    }

    @Override
    public String workspaceId() {
        return this.inner().workspaceId();
    }

}
