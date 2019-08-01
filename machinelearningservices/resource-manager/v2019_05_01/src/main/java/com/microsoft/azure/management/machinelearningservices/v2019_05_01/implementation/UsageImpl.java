/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01.implementation;

import com.microsoft.azure.management.machinelearningservices.v2019_05_01.Usage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.UsageName;
import com.microsoft.azure.management.machinelearningservices.v2019_05_01.UsageUnit;

class UsageImpl extends WrapperImpl<UsageInner> implements Usage {
    private final MachineLearningServicesManager manager;

    UsageImpl(UsageInner inner,  MachineLearningServicesManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MachineLearningServicesManager manager() {
        return this.manager;
    }



    @Override
    public Long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Long limit() {
        return this.inner().limit();
    }

    @Override
    public UsageName name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UsageUnit unit() {
        return this.inner().unit();
    }

}
