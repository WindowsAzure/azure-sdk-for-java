/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactory.v2017_09_01_preview.ActivityRun;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import java.util.Map;

class ActivityRunImpl extends WrapperImpl<ActivityRunInner> implements ActivityRun {
    private final DataFactoryManager manager;

    ActivityRunImpl(ActivityRunInner inner,  DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }



    @Override
    public String activityName() {
        return this.inner().activityName();
    }

    @Override
    public DateTime activityRunEnd() {
        return this.inner().activityRunEnd();
    }

    @Override
    public String activityRunId() {
        return this.inner().activityRunId();
    }

    @Override
    public DateTime activityRunStart() {
        return this.inner().activityRunStart();
    }

    @Override
    public String activityType() {
        return this.inner().activityType();
    }

    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public Integer durationInMs() {
        return this.inner().durationInMs();
    }

    @Override
    public Object error() {
        return this.inner().error();
    }

    @Override
    public Object input() {
        return this.inner().input();
    }

    @Override
    public String linkedServiceName() {
        return this.inner().linkedServiceName();
    }

    @Override
    public Object output() {
        return this.inner().output();
    }

    @Override
    public String pipelineName() {
        return this.inner().pipelineName();
    }

    @Override
    public String pipelineRunId() {
        return this.inner().pipelineRunId();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
