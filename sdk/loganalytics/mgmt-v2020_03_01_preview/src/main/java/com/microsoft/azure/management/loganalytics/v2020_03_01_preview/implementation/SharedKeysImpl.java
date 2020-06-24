/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2020_03_01_preview.implementation;

import com.microsoft.azure.management.loganalytics.v2020_03_01_preview.SharedKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SharedKeysImpl extends WrapperImpl<SharedKeysInner> implements SharedKeys {
    private final LogAnalyticsManager manager;
    SharedKeysImpl(SharedKeysInner inner, LogAnalyticsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public LogAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public String primarySharedKey() {
        return this.inner().primarySharedKey();
    }

    @Override
    public String secondarySharedKey() {
        return this.inner().secondarySharedKey();
    }

}
