/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ErrorCount;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ErrorCountImpl extends WrapperImpl<ErrorCountInner> implements ErrorCount {
    private final ADHybridHealthServiceManager manager;
    ErrorCountImpl(ErrorCountInner inner, ADHybridHealthServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }

    @Override
    public Integer count() {
        return this.inner().count();
    }

    @Override
    public String errorBucket() {
        return this.inner().errorBucket();
    }

    @Override
    public Boolean truncated() {
        return this.inner().truncated();
    }

}
