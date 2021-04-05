/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_10_01_preview.implementation;

import com.microsoft.azure.management.compute.v2020_10_01_preview.RetrieveBootDiagnosticsDataResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class RetrieveBootDiagnosticsDataResultImpl extends WrapperImpl<RetrieveBootDiagnosticsDataResultInner> implements RetrieveBootDiagnosticsDataResult {
    private final ComputeManager manager;
    RetrieveBootDiagnosticsDataResultImpl(RetrieveBootDiagnosticsDataResultInner inner, ComputeManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public String consoleScreenshotBlobUri() {
        return this.inner().consoleScreenshotBlobUri();
    }

    @Override
    public String serialConsoleLogBlobUri() {
        return this.inner().serialConsoleLogBlobUri();
    }

}
