/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_06_30.implementation;

import com.microsoft.azure.management.consumption.v2018_06_30.CostTag;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.consumption.v2018_06_30.CostTagProperties;

class CostTagImpl extends WrapperImpl<CostTagInner> implements CostTag {
    private final ConsumptionManager manager;
    CostTagImpl(CostTagInner inner, ConsumptionManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ConsumptionManager manager() {
        return this.manager;
    }

    @Override
    public List<CostTagProperties> costTags() {
        return this.inner().costTags();
    }

    @Override
    public String eTag() {
        return this.inner().eTag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
