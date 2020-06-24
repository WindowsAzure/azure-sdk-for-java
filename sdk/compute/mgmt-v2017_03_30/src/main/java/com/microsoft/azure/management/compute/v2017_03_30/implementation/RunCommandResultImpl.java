/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.management.compute.v2017_03_30.RunCommandResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import com.microsoft.azure.management.compute.v2017_03_30.ApiError;

class RunCommandResultImpl extends WrapperImpl<RunCommandResultInner> implements RunCommandResult {
    private final ComputeManager manager;
    RunCommandResultImpl(RunCommandResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public ApiError error() {
        return this.inner().error();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Object output() {
        return this.inner().output();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
