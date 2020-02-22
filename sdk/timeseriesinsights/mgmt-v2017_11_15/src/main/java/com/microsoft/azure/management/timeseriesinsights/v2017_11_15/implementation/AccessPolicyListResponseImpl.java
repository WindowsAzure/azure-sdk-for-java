/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.timeseriesinsights.v2017_11_15.implementation;

import com.microsoft.azure.management.timeseriesinsights.v2017_11_15.AccessPolicyListResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class AccessPolicyListResponseImpl extends WrapperImpl<AccessPolicyListResponseInner> implements AccessPolicyListResponse {
    private final TimeSeriesInsightsManager manager;
    AccessPolicyListResponseImpl(AccessPolicyListResponseInner inner, TimeSeriesInsightsManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public TimeSeriesInsightsManager manager() {
        return this.manager;
    }

    @Override
    public List<AccessPolicyResourceInner> value() {
        return this.inner().value();
    }

}
