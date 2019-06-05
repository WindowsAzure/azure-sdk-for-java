/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentAppServicePlan;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.appservice.v2018_02_01.HostingEnvironmentProfile;
import com.microsoft.azure.management.appservice.v2018_02_01.ProvisioningState;
import com.microsoft.azure.management.appservice.v2018_02_01.SkuDescription;
import com.microsoft.azure.management.appservice.v2018_02_01.StatusOptions;
import java.util.Map;

class HostingEnvironmentAppServicePlanImpl extends WrapperImpl<AppServicePlanInner> implements HostingEnvironmentAppServicePlan {
    private final AppServiceManager manager;

    HostingEnvironmentAppServicePlanImpl(AppServicePlanInner inner,  AppServiceManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }



    @Override
    public DateTime freeOfferExpirationTime() {
        return this.inner().freeOfferExpirationTime();
    }

    @Override
    public String geoRegion() {
        return this.inner().geoRegion();
    }

    @Override
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.inner().hostingEnvironmentProfile();
    }

    @Override
    public Boolean hyperV() {
        return this.inner().hyperV();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Boolean isSpot() {
        return this.inner().isSpot();
    }

    @Override
    public Boolean isXenon() {
        return this.inner().isXenon();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public Integer maximumElasticWorkerCount() {
        return this.inner().maximumElasticWorkerCount();
    }

    @Override
    public Integer maximumNumberOfWorkers() {
        return this.inner().maximumNumberOfWorkers();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer numberOfSites() {
        return this.inner().numberOfSites();
    }

    @Override
    public Boolean perSiteScaling() {
        return this.inner().perSiteScaling();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Boolean reserved() {
        return this.inner().reserved();
    }

    @Override
    public String resourceGroup() {
        return this.inner().resourceGroup();
    }

    @Override
    public SkuDescription sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime spotExpirationTime() {
        return this.inner().spotExpirationTime();
    }

    @Override
    public StatusOptions status() {
        return this.inner().status();
    }

    @Override
    public String subscription() {
        return this.inner().subscription();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public Integer targetWorkerCount() {
        return this.inner().targetWorkerCount();
    }

    @Override
    public Integer targetWorkerSizeId() {
        return this.inner().targetWorkerSizeId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String workerTierName() {
        return this.inner().workerTierName();
    }

}
