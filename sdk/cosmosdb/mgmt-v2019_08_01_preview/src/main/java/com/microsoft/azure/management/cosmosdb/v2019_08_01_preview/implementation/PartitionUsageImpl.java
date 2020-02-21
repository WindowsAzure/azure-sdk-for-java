/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.PartitionUsage;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.MetricName;
import com.microsoft.azure.management.cosmosdb.v2019_08_01_preview.UnitType;

class PartitionUsageImpl extends WrapperImpl<PartitionUsageInner> implements PartitionUsage {
    private final CosmosDBManager manager;
    PartitionUsageImpl(PartitionUsageInner inner, CosmosDBManager manager) {
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
    public String partitionId() {
        return this.inner().partitionId();
    }

    @Override
    public String partitionKeyRangeId() {
        return this.inner().partitionKeyRangeId();
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
