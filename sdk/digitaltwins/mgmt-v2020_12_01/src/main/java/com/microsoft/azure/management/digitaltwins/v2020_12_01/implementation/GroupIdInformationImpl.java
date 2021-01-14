/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.management.digitaltwins.v2020_12_01.GroupIdInformation;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.GroupIdInformationPropertiesModel;

class GroupIdInformationImpl extends IndexableRefreshableWrapperImpl<GroupIdInformation, GroupIdInformationInner> implements GroupIdInformation {
    private final DigitalTwinsManager manager;
    private String resourceGroupName;
    private String resourceName;
    private String resourceId;

    GroupIdInformationImpl(GroupIdInformationInner inner,  DigitalTwinsManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.resourceName = IdParsingUtils.getValueFromIdByName(inner.id(), "digitalTwinsInstances");
        this.resourceId = IdParsingUtils.getValueFromIdByName(inner.id(), "privateLinkResources");
    }

    @Override
    public DigitalTwinsManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<GroupIdInformationInner> getInnerAsync() {
        PrivateLinkResourcesInner client = this.manager().inner().privateLinkResources();
        return client.getAsync(this.resourceGroupName, this.resourceName, this.resourceId);
    }



    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public GroupIdInformationPropertiesModel properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
