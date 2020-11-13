/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2019_11_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricAlertResource;
import rx.Observable;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricAlertResourcePatch;
import java.util.List;
import org.joda.time.Period;
import org.joda.time.DateTime;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricAlertCriteria;
import com.microsoft.azure.management.monitor.v2019_11_01.MetricAlertAction;
import rx.functions.Func1;

class MetricAlertResourceImpl extends GroupableResourceCoreImpl<MetricAlertResource, MetricAlertResourceInner, MetricAlertResourceImpl, MonitorManager> implements MetricAlertResource, MetricAlertResource.Definition, MetricAlertResource.Update {
    private MetricAlertResourcePatch updateParameter;
    MetricAlertResourceImpl(String name, MetricAlertResourceInner inner, MonitorManager manager) {
        super(name, inner, manager);
        this.updateParameter = new MetricAlertResourcePatch();
    }

    @Override
    public Observable<MetricAlertResource> createResourceAsync() {
        MetricAlertsInner client = this.manager().inner().metricAlerts();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<MetricAlertResourceInner, MetricAlertResourceInner>() {
               @Override
               public MetricAlertResourceInner call(MetricAlertResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<MetricAlertResource> updateResourceAsync() {
        MetricAlertsInner client = this.manager().inner().metricAlerts();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<MetricAlertResourceInner, MetricAlertResourceInner>() {
               @Override
               public MetricAlertResourceInner call(MetricAlertResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<MetricAlertResourceInner> getInnerAsync() {
        MetricAlertsInner client = this.manager().inner().metricAlerts();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new MetricAlertResourcePatch();
    }

    @Override
    public List<MetricAlertAction> actions() {
        return this.inner().actions();
    }

    @Override
    public Boolean autoMitigate() {
        return this.inner().autoMitigate();
    }

    @Override
    public MetricAlertCriteria criteria() {
        return this.inner().criteria();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public boolean enabled() {
        return this.inner().enabled();
    }

    @Override
    public Period evaluationFrequency() {
        return this.inner().evaluationFrequency();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public List<String> scopes() {
        return this.inner().scopes();
    }

    @Override
    public int severity() {
        return this.inner().severity();
    }

    @Override
    public String targetResourceRegion() {
        return this.inner().targetResourceRegion();
    }

    @Override
    public String targetResourceType() {
        return this.inner().targetResourceType();
    }

    @Override
    public Period windowSize() {
        return this.inner().windowSize();
    }

    @Override
    public MetricAlertResourceImpl withCriteria(MetricAlertCriteria criteria) {
        this.inner().withCriteria(criteria);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withEnabled(boolean enabled) {
        this.inner().withEnabled(enabled);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withEvaluationFrequency(Period evaluationFrequency) {
        this.inner().withEvaluationFrequency(evaluationFrequency);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withSeverity(int severity) {
        this.inner().withSeverity(severity);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withWindowSize(Period windowSize) {
        this.inner().withWindowSize(windowSize);
        return this;
    }

    @Override
    public MetricAlertResourceImpl withActions(List<MetricAlertAction> actions) {
        if (isInCreateMode()) {
            this.inner().withActions(actions);
        } else {
            this.updateParameter.withActions(actions);
        }
        return this;
    }

    @Override
    public MetricAlertResourceImpl withAutoMitigate(Boolean autoMitigate) {
        if (isInCreateMode()) {
            this.inner().withAutoMitigate(autoMitigate);
        } else {
            this.updateParameter.withAutoMitigate(autoMitigate);
        }
        return this;
    }

    @Override
    public MetricAlertResourceImpl withScopes(List<String> scopes) {
        if (isInCreateMode()) {
            this.inner().withScopes(scopes);
        } else {
            this.updateParameter.withScopes(scopes);
        }
        return this;
    }

    @Override
    public MetricAlertResourceImpl withTargetResourceRegion(String targetResourceRegion) {
        if (isInCreateMode()) {
            this.inner().withTargetResourceRegion(targetResourceRegion);
        } else {
            this.updateParameter.withTargetResourceRegion(targetResourceRegion);
        }
        return this;
    }

    @Override
    public MetricAlertResourceImpl withTargetResourceType(String targetResourceType) {
        if (isInCreateMode()) {
            this.inner().withTargetResourceType(targetResourceType);
        } else {
            this.updateParameter.withTargetResourceType(targetResourceType);
        }
        return this;
    }

}
