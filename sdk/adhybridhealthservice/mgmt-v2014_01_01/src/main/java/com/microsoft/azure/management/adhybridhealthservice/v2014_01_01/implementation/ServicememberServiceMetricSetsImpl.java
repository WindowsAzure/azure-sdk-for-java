/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.implementation;

import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.ServicememberServiceMetricSets;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.adhybridhealthservice.v2014_01_01.MetricSet;
import org.joda.time.DateTime;

class ServicememberServiceMetricSetsImpl extends WrapperImpl<MetricSetsInner> implements ServicememberServiceMetricSets {
    private final ADHybridHealthServiceManager manager;
    private String serviceName;
    private String metricName;
    private String groupName;
    private UUID serviceMemberId;

    ServicememberServiceMetricSetsImpl(MetricSetsInner inner,  ADHybridHealthServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ADHybridHealthServiceManager manager() {
        return this.manager;
    }



    @Override
    public List<MetricSet> sets() {
        return this.inner().sets();
    }

    @Override
    public List<DateTime> timeStamps() {
        return this.inner().timeStamps();
    }

}
