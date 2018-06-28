/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentQuotaStatus;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentQuotaStatus;

class ComponentQuotaStatusImpl extends WrapperImpl<ComponentQuotaStatusInner> implements ComponentQuotaStatus {
    private final InsightsManager manager;

    ComponentQuotaStatusImpl(InsightsManager manager) {
        super(manager.inner().componentQuotaStatus());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApplicationInsightsComponentQuotaStatus> getAsync(String resourceGroupName, String resourceName) {
        ComponentQuotaStatusInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName)
        .map(new Func1<ApplicationInsightsComponentQuotaStatusInner, ApplicationInsightsComponentQuotaStatus>() {
            @Override
            public ApplicationInsightsComponentQuotaStatus call(ApplicationInsightsComponentQuotaStatusInner inner) {
                return new ApplicationInsightsComponentQuotaStatusImpl(inner, manager());
            }
        });
    }

}
