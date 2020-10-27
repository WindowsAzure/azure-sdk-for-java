/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_10_31.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.DigitalTwinsDescription;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.digitaltwins.v2020_10_31.ProvisioningState;

class DigitalTwinsDescriptionImpl extends GroupableResourceCoreImpl<DigitalTwinsDescription, DigitalTwinsDescriptionInner, DigitalTwinsDescriptionImpl, DigitalTwinsManager> implements DigitalTwinsDescription, DigitalTwinsDescription.Definition, DigitalTwinsDescription.Update {
    DigitalTwinsDescriptionImpl(String name, DigitalTwinsDescriptionInner inner, DigitalTwinsManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DigitalTwinsDescription> createResourceAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DigitalTwinsDescription> updateResourceAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DigitalTwinsDescriptionInner> getInnerAsync() {
        DigitalTwinsInner client = this.manager().inner().digitalTwins();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public DateTime createdTime() {
        return this.inner().createdTime();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
    }

    @Override
    public DateTime lastUpdatedTime() {
        return this.inner().lastUpdatedTime();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

}
