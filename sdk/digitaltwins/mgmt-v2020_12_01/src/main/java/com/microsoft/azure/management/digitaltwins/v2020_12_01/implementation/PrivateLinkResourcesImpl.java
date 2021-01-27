/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.digitaltwins.v2020_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.PrivateLinkResources;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.GroupIdInformationResponse;
import com.microsoft.azure.management.digitaltwins.v2020_12_01.GroupIdInformation;

class PrivateLinkResourcesImpl extends WrapperImpl<PrivateLinkResourcesInner> implements PrivateLinkResources {
    private final DigitalTwinsManager manager;

    PrivateLinkResourcesImpl(DigitalTwinsManager manager) {
        super(manager.inner().privateLinkResources());
        this.manager = manager;
    }

    public DigitalTwinsManager manager() {
        return this.manager;
    }

    private GroupIdInformationImpl wrapModel(GroupIdInformationInner inner) {
        return  new GroupIdInformationImpl(inner, manager());
    }

    @Override
    public Observable<GroupIdInformationResponse> listAsync(String resourceGroupName, String resourceName) {
        PrivateLinkResourcesInner client = this.inner();
        return client.listAsync(resourceGroupName, resourceName)
        .map(new Func1<GroupIdInformationResponseInner, GroupIdInformationResponse>() {
            @Override
            public GroupIdInformationResponse call(GroupIdInformationResponseInner inner) {
                return new GroupIdInformationResponseImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<GroupIdInformation> getAsync(String resourceGroupName, String resourceName, String resourceId) {
        PrivateLinkResourcesInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceName, resourceId)
        .flatMap(new Func1<GroupIdInformationInner, Observable<GroupIdInformation>>() {
            @Override
            public Observable<GroupIdInformation> call(GroupIdInformationInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((GroupIdInformation)wrapModel(inner));
                }
            }
       });
    }

}
