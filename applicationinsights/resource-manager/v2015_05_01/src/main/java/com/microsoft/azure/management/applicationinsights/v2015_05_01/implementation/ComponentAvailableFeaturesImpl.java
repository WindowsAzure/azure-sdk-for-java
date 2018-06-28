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
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ComponentAvailableFeatures;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponentAvailableFeatures;

class ComponentAvailableFeaturesImpl extends WrapperImpl<ComponentAvailableFeaturesInner> implements ComponentAvailableFeatures {
    private final InsightsManager manager;

    ComponentAvailableFeaturesImpl(InsightsManager manager) {
        super(manager.inner().componentAvailableFeatures());
        this.manager = manager;
    }

    public InsightsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ApplicationInsightsComponentAvailableFeatures> getAsync(String resourceGroupName, String resourceName) {
        ComponentAvailableFeaturesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName)
        .map(new Func1<ApplicationInsightsComponentAvailableFeaturesInner, ApplicationInsightsComponentAvailableFeatures>() {
            @Override
            public ApplicationInsightsComponentAvailableFeatures call(ApplicationInsightsComponentAvailableFeaturesInner inner) {
                return new ApplicationInsightsComponentAvailableFeaturesImpl(inner, manager());
            }
        });
    }

}
