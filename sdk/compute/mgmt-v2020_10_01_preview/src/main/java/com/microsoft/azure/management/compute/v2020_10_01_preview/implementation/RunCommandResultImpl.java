/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.RunCommandResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.compute.v2020_10_01_preview.InstanceViewStatus;

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
    public List<InstanceViewStatus> value() {
        return this.inner().value();
    }

}
