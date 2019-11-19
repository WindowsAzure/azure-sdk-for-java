/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2019_03_01.implementation;

import com.microsoft.azure.management.compute.v2019_03_01.LogAnalyticsOperationResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2019_03_01.LogAnalyticsOutput;

class LogAnalyticsOperationResultImpl extends WrapperImpl<LogAnalyticsOperationResultInner> implements LogAnalyticsOperationResult {
    private final ComputeManager manager;
    LogAnalyticsOperationResultImpl(LogAnalyticsOperationResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public LogAnalyticsOutput properties() {
        return this.inner().properties();
    }

}
