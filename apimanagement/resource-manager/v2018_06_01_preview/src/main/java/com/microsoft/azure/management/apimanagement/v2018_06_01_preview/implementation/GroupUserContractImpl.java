/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.GroupUserContract;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.GroupContractProperties;
import java.util.ArrayList;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserIdentityContract;
import org.joda.time.DateTime;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.UserState;

class GroupUserContractImpl extends CreatableUpdatableImpl<GroupUserContract, UserContractInner, GroupUserContractImpl> implements GroupUserContract, GroupUserContract.Definition, GroupUserContract.Update {
    private final ApiManagementManager manager;
    private String resourceGroupName;
    private String serviceName;
    private String groupId;
    private String userId;

    GroupUserContractImpl(String name, ApiManagementManager manager) {
        super(name, new UserContractInner());
        this.manager = manager;
        // Set resource name
        this.userId = name;
        //
    }

    GroupUserContractImpl(UserContractInner inner, ApiManagementManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.userId = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "service");
        this.groupId = IdParsingUtils.getValueFromIdByName(inner.id(), "groups");
        this.userId = IdParsingUtils.getValueFromIdByName(inner.id(), "users");
        //
    }

    @Override
    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Observable<GroupUserContract> createResourceAsync() {
        GroupUsersInner client = this.manager().inner().groupUsers();
        return client.createAsync(this.resourceGroupName, this.serviceName, this.groupId, this.userId)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<GroupUserContract> updateResourceAsync() {
        GroupUsersInner client = this.manager().inner().groupUsers();
        return client.createAsync(this.resourceGroupName, this.serviceName, this.groupId, this.userId)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<UserContractInner> getInnerAsync() {
        GroupUsersInner client = this.manager().inner().groupUsers();
        return null; // NOP getInnerAsync implementation as get is not supported
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String email() {
        return this.inner().email();
    }

    @Override
    public String firstName() {
        return this.inner().firstName();
    }

    @Override
    public List<GroupContractProperties> groups() {
        return this.inner().groups();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<UserIdentityContract> identities() {
        List<UserIdentityContract> lst = new ArrayList<UserIdentityContract>();
        if (this.inner().identities() != null) {
            for (UserIdentityContractInner inner : this.inner().identities()) {
                lst.add( new UserIdentityContractImpl(inner, manager()));
            }
        }
        return lst;
    }

    @Override
    public String lastName() {
        return this.inner().lastName();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String note() {
        return this.inner().note();
    }

    @Override
    public DateTime registrationDate() {
        return this.inner().registrationDate();
    }

    @Override
    public UserState state() {
        return this.inner().state();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public GroupUserContractImpl withExistingGroup(String resourceGroupName, String serviceName, String groupId) {
        this.resourceGroupName = resourceGroupName;
        this.serviceName = serviceName;
        this.groupId = groupId;
        return this;
    }

}
