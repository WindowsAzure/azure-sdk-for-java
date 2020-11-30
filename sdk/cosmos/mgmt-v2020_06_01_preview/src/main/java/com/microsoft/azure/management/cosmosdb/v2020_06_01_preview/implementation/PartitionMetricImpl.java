/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.PartitionMetric;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MetricValue;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.MetricName;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.UnitType;

class PartitionMetricImpl extends WrapperImpl<PartitionMetricInner> implements PartitionMetric {
    private final CosmosDBManager manager;
    PartitionMetricImpl(PartitionMetricInner inner, CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    public DateTime endTime() {
        return this.inner().endTime();
    }

    @Override
    public List<MetricValue> metricValues() {
        return this.inner().metricValues();
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
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public String timeGrain() {
        return this.inner().timeGrain();
    }

    @Override
    public UnitType unit() {
        return this.inner().unit();
    }

}
