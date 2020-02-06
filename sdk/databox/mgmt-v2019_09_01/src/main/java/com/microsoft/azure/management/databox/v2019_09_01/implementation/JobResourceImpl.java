/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.v2019_09_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.databox.v2019_09_01.JobResource;
import rx.Observable;
import com.microsoft.azure.management.databox.v2019_09_01.JobResourceUpdateParameter;
import java.util.List;
import com.microsoft.azure.management.databox.v2019_09_01.Sku;
import com.microsoft.azure.management.databox.v2019_09_01.StageName;
import org.joda.time.DateTime;
import com.microsoft.azure.management.databox.v2019_09_01.Error;
import com.microsoft.azure.management.databox.v2019_09_01.JobDetails;
import com.microsoft.azure.management.databox.v2019_09_01.JobDeliveryType;
import com.microsoft.azure.management.databox.v2019_09_01.JobDeliveryInfo;
import com.microsoft.azure.management.databox.v2019_09_01.DestinationAccountDetails;
import com.microsoft.azure.management.databox.v2019_09_01.UpdateJobDetails;
import rx.functions.Func1;

class JobResourceImpl extends GroupableResourceCoreImpl<JobResource, JobResourceInner, JobResourceImpl, DataBoxManager> implements JobResource, JobResource.Definition, JobResource.Update {
    private String uifMatch;
    private JobResourceUpdateParameter updateParameter;
    JobResourceImpl(String name, JobResourceInner inner, DataBoxManager manager) {
        super(name, inner, manager);
        this.updateParameter = new JobResourceUpdateParameter();
    }

    @Override
    public Observable<JobResource> createResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<JobResourceInner, JobResourceInner>() {
               @Override
               public JobResourceInner call(JobResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<JobResource> updateResourceAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter, this.uifMatch)
            .map(new Func1<JobResourceInner, JobResourceInner>() {
               @Override
               public JobResourceInner call(JobResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<JobResourceInner> getInnerAsync() {
        JobsInner client = this.manager().inner().jobs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new JobResourceUpdateParameter();
    }

    @Override
    public String cancellationReason() {
        return this.inner().cancellationReason();
    }

    @Override
    public JobDeliveryInfo deliveryInfo() {
        return this.inner().deliveryInfo();
    }

    @Override
    public JobDeliveryType deliveryType() {
        return this.inner().deliveryType();
    }

    @Override
    public JobDetails details() {
        return this.inner().details();
    }

    @Override
    public Error error() {
        return this.inner().error();
    }

    @Override
    public Boolean isCancellable() {
        return this.inner().isCancellable();
    }

    @Override
    public Boolean isCancellableWithoutFee() {
        return this.inner().isCancellableWithoutFee();
    }

    @Override
    public Boolean isDeletable() {
        return this.inner().isDeletable();
    }

    @Override
    public Boolean isShippingAddressEditable() {
        return this.inner().isShippingAddressEditable();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime startTime() {
        return this.inner().startTime();
    }

    @Override
    public StageName status() {
        return this.inner().status();
    }

    @Override
    public JobResourceImpl withSku(Sku sku) {
        this.inner().withSku(sku);
        return this;
    }

    @Override
    public JobResourceImpl withDeliveryInfo(JobDeliveryInfo deliveryInfo) {
        this.inner().withDeliveryInfo(deliveryInfo);
        return this;
    }

    @Override
    public JobResourceImpl withDeliveryType(JobDeliveryType deliveryType) {
        this.inner().withDeliveryType(deliveryType);
        return this;
    }

    @Override
    public JobResourceImpl withDetails(JobDetails details) {
        this.inner().withDetails(details);
        return this;
    }

    @Override
    public JobResourceImpl withIfMatch(String ifMatch) {
        this.uifMatch = ifMatch;
        return this;
    }

    @Override
    public JobResourceImpl withDestinationAccountDetails(List<DestinationAccountDetails> destinationAccountDetails) {
        this.updateParameter.withDestinationAccountDetails(destinationAccountDetails);
        return this;
    }

    @Override
    public JobResourceImpl withDetails(UpdateJobDetails details) {
        this.updateParameter.withDetails(details);
        return this;
    }

}
