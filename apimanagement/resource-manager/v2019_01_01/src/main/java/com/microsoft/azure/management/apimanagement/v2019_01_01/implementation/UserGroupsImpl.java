/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2019_01_01.UserGroups;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.apimanagement.v2019_01_01.UserGroupContract;

class UserGroupsImpl extends WrapperImpl<UserGroupsInner> implements UserGroups {
    private final ApiManagementManager manager;

    UserGroupsImpl(ApiManagementManager manager) {
        super(manager.inner().userGroups());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    private UserGroupContractImpl wrapModel(GroupContractInner inner) {
        return  new UserGroupContractImpl(inner, manager());
    }

    @Override
    public Observable<UserGroupContract> listAsync(final String resourceGroupName, final String serviceName, final String userId) {
        UserGroupsInner client = this.inner();
        return client.listAsync(resourceGroupName, serviceName, userId)
        .flatMapIterable(new Func1<Page<GroupContractInner>, Iterable<GroupContractInner>>() {
            @Override
            public Iterable<GroupContractInner> call(Page<GroupContractInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GroupContractInner, UserGroupContract>() {
            @Override
            public UserGroupContract call(GroupContractInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
