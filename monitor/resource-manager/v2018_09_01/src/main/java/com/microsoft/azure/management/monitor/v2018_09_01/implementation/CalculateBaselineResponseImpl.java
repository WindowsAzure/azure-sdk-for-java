/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_09_01.implementation;

import com.microsoft.azure.management.monitor.v2018_09_01.CalculateBaselineResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import org.joda.time.DateTime;

class CalculateBaselineResponseImpl extends WrapperImpl<CalculateBaselineResponseInner> implements CalculateBaselineResponse {
    private final MonitorManager manager;
    CalculateBaselineResponseImpl(CalculateBaselineResponseInner inner, MonitorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MonitorManager manager() {
        return this.manager;
    }

    @Override
    public List<BaselineInner> baseline() {
        return this.inner().baseline();
    }

    @Override
    public List<DateTime> timestamps() {
        return this.inner().timestamps();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
