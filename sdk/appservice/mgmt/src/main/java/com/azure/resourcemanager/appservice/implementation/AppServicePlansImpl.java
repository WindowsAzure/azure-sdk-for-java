// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.appservice.implementation;

import com.azure.resourcemanager.appservice.AppServicePlan;
import com.azure.resourcemanager.appservice.AppServicePlans;
import com.azure.resourcemanager.appservice.models.AppServicePlanInner;
import com.azure.resourcemanager.appservice.models.AppServicePlansInner;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.implementation.TopLevelModifiableResourcesImpl;

/** The implementation for AppServicePlans. */
class AppServicePlansImpl
    extends TopLevelModifiableResourcesImpl<
        AppServicePlan, AppServicePlanImpl, AppServicePlanInner, AppServicePlansInner, AppServiceManager>
    implements AppServicePlans {

    AppServicePlansImpl(AppServiceManager manager) {
        super(manager.inner().appServicePlans(), manager);
    }

    @Override
    protected AppServicePlanImpl wrapModel(String name) {
        return new AppServicePlanImpl(name, new AppServicePlanInner(), this.manager());
    }

    @Override
    protected AppServicePlanImpl wrapModel(AppServicePlanInner inner) {
        if (inner == null) {
            return null;
        }
        return new AppServicePlanImpl(inner.name(), inner, this.manager());
    }

    @Override
    public AppServicePlanImpl define(String name) {
        return wrapModel(name);
    }
}
