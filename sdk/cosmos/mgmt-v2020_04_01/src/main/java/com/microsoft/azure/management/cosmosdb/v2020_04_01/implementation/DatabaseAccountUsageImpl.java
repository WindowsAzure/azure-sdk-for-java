/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_04_01.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_04_01.DatabaseAccountUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.MetricName;
import com.microsoft.azure.management.cosmosdb.v2020_04_01.UnitType;

class DatabaseAccountUsageImpl extends WrapperImpl<UsageInner> implements DatabaseAccountUsage {
    private final CosmosDBManager manager;

    DatabaseAccountUsageImpl(UsageInner inner,  CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }



    @Override
    public Long currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Long limit() {
        return this.inner().limit();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public String quotaPeriod() {
        return this.inner().quotaPeriod();
    }

    @Override
    public UnitType unit() {
        return this.inner().unit();
    }

}
