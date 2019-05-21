/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.DatabasisDatabaseAccountUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.MetricName;
import com.microsoft.azure.management.cosmosdb.v2015_04_08.UnitType;

class DatabasisDatabaseAccountUsageImpl extends WrapperImpl<UsageInner> implements DatabasisDatabaseAccountUsage {
    private final CosmosDBManager manager;

    DatabasisDatabaseAccountUsageImpl(UsageInner inner,  CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }



    @Override
    public Integer currentValue() {
        return this.inner().currentValue();
    }

    @Override
    public Integer limit() {
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
