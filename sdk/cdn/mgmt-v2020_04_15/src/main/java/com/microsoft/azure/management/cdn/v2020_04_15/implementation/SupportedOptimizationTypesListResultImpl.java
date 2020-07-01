/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.management.cdn.v2020_04_15.SupportedOptimizationTypesListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.cdn.v2020_04_15.OptimizationType;

class SupportedOptimizationTypesListResultImpl extends WrapperImpl<SupportedOptimizationTypesListResultInner> implements SupportedOptimizationTypesListResult {
    private final CdnManager manager;
    SupportedOptimizationTypesListResultImpl(SupportedOptimizationTypesListResultInner inner, CdnManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public List<OptimizationType> supportedOptimizationTypes() {
        return this.inner().supportedOptimizationTypes();
    }

}
