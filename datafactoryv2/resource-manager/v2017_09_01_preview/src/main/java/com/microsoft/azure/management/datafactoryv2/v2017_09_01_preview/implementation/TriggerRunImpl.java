/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.TriggerRun;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.TriggerRunStatus;
import org.joda.time.DateTime;

class TriggerRunImpl extends WrapperImpl<TriggerRunInner> implements TriggerRun {
    private final DataFactoryManager manager;

    TriggerRunImpl(TriggerRunInner inner,  DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }



    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Map<String, String> properties() {
        return this.inner().properties();
    }

    @Override
    public TriggerRunStatus status() {
        return this.inner().status();
    }

    @Override
    public Map<String, String> triggeredPipelines() {
        return this.inner().triggeredPipelines();
    }

    @Override
    public String triggerName() {
        return this.inner().triggerName();
    }

    @Override
    public String triggerRunId() {
        return this.inner().triggerRunId();
    }

    @Override
    public DateTime triggerRunTimestamp() {
        return this.inner().triggerRunTimestamp();
    }

    @Override
    public String triggerType() {
        return this.inner().triggerType();
    }

}
