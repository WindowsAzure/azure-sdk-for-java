/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_01_21.implementation;

import com.microsoft.azure.management.kusto.v2019_01_21.CheckNameResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class CheckNameResultImpl extends WrapperImpl<CheckNameResultInner> implements CheckNameResult {
    private final KustoManager manager;
    CheckNameResultImpl(CheckNameResultInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Boolean nameAvailable() {
        return this.inner().nameAvailable();
    }

}
