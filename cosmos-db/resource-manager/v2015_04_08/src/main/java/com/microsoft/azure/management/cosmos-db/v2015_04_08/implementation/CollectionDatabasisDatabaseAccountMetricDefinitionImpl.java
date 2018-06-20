/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmos-db.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmos-db.v2015_04_08.CollectionDatabasisDatabaseAccountMetricDefinition;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.MetricAvailability;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.MetricName;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.PrimaryAggregationType;
import com.microsoft.azure.management.cosmos-db.v2015_04_08.UnitType;

class CollectionDatabasisDatabaseAccountMetricDefinitionImpl extends WrapperImpl<MetricDefinitionInner> implements CollectionDatabasisDatabaseAccountMetricDefinition {
    private final DocumentDBManager manager;

    CollectionDatabasisDatabaseAccountMetricDefinitionImpl(MetricDefinitionInner inner,  DocumentDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DocumentDBManager manager() {
        return this.manager;
    }



    @Override
    public List<MetricAvailability> metricAvailabilities() {
        return this.inner().metricAvailabilities();
    }

    @Override
    public MetricName name() {
        return this.inner().name();
    }

    @Override
    public PrimaryAggregationType primaryAggregationType() {
        return this.inner().primaryAggregationType();
    }

    @Override
    public String resourceUri() {
        return this.inner().resourceUri();
    }

    @Override
    public UnitType unit() {
        return this.inner().unit();
    }

}
