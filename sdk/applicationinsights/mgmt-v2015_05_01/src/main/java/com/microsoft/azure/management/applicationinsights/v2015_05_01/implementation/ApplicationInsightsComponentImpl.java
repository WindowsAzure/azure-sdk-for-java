/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationInsightsComponent;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.ApplicationType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.FlowType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.RequestSource;
import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.PrivateLinkScopedResource;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.IngestionMode;

class ApplicationInsightsComponentImpl extends GroupableResourceCoreImpl<ApplicationInsightsComponent, ApplicationInsightsComponentInner, ApplicationInsightsComponentImpl, InsightsManager> implements ApplicationInsightsComponent, ApplicationInsightsComponent.Definition, ApplicationInsightsComponent.Update {
    ApplicationInsightsComponentImpl(String name, ApplicationInsightsComponentInner inner, InsightsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ApplicationInsightsComponent> createResourceAsync() {
        ComponentsInner client = this.manager().inner().components();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ApplicationInsightsComponent> updateResourceAsync() {
        ComponentsInner client = this.manager().inner().components();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ApplicationInsightsComponentInner> getInnerAsync() {
        ComponentsInner client = this.manager().inner().components();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String appId() {
        return this.inner().appId();
    }

    @Override
    public String applicationId() {
        return this.inner().applicationId();
    }

    @Override
    public ApplicationType applicationType() {
        return this.inner().applicationType();
    }

    @Override
    public String connectionString() {
        return this.inner().connectionString();
    }

    @Override
    public DateTime creationDate() {
        return this.inner().creationDate();
    }

    @Override
    public Boolean disableIpMasking() {
        return this.inner().disableIpMasking();
    }

    @Override
    public FlowType flowType() {
        return this.inner().flowType();
    }

    @Override
    public String hockeyAppId() {
        return this.inner().hockeyAppId();
    }

    @Override
    public String hockeyAppToken() {
        return this.inner().hockeyAppToken();
    }

    @Override
    public Boolean immediatePurgeDataOn30Days() {
        return this.inner().immediatePurgeDataOn30Days();
    }

    @Override
    public IngestionMode ingestionMode() {
        return this.inner().ingestionMode();
    }

    @Override
    public String instrumentationKey() {
        return this.inner().instrumentationKey();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public List<PrivateLinkScopedResource> privateLinkScopedResources() {
        return this.inner().privateLinkScopedResources();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public RequestSource requestSource() {
        return this.inner().requestSource();
    }

    @Override
    public Integer retentionInDays() {
        return this.inner().retentionInDays();
    }

    @Override
    public Double samplingPercentage() {
        return this.inner().samplingPercentage();
    }

    @Override
    public String tenantId() {
        return this.inner().tenantId();
    }

    @Override
    public ApplicationInsightsComponentImpl withApplicationType(ApplicationType applicationType) {
        this.inner().withApplicationType(applicationType);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withDisableIpMasking(Boolean disableIpMasking) {
        this.inner().withDisableIpMasking(disableIpMasking);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withFlowType(FlowType flowType) {
        this.inner().withFlowType(flowType);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withHockeyAppId(String hockeyAppId) {
        this.inner().withHockeyAppId(hockeyAppId);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withImmediatePurgeDataOn30Days(Boolean immediatePurgeDataOn30Days) {
        this.inner().withImmediatePurgeDataOn30Days(immediatePurgeDataOn30Days);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withIngestionMode(IngestionMode ingestionMode) {
        this.inner().withIngestionMode(ingestionMode);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withRequestSource(RequestSource requestSource) {
        this.inner().withRequestSource(requestSource);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withRetentionInDays(Integer retentionInDays) {
        this.inner().withRetentionInDays(retentionInDays);
        return this;
    }

    @Override
    public ApplicationInsightsComponentImpl withSamplingPercentage(Double samplingPercentage) {
        this.inner().withSamplingPercentage(samplingPercentage);
        return this;
    }

}
