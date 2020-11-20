/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlabs.v2016_05_15.ApplicableSchedule;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class ApplicableScheduleImpl extends WrapperImpl<ApplicableScheduleInner> implements ApplicableSchedule {
    private final DevTestLabsManager manager;
    ApplicableScheduleImpl(ApplicableScheduleInner inner, DevTestLabsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DevTestLabsManager manager() {
        return this.manager;
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ScheduleInner labVmsShutdown() {
        return this.inner().labVmsShutdown();
    }

    @Override
    public ScheduleInner labVmsStartup() {
        return this.inner().labVmsStartup();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
