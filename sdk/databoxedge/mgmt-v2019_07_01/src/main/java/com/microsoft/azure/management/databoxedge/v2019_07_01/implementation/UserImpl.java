/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databoxedge.v2019_07_01.implementation;

import com.microsoft.azure.management.databoxedge.v2019_07_01.User;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.databoxedge.v2019_07_01.AsymmetricEncryptedSecret;
import java.util.List;
import com.microsoft.azure.management.databoxedge.v2019_07_01.ShareAccessRight;

class UserImpl extends CreatableUpdatableImpl<User, UserInner, UserImpl> implements User, User.Definition, User.Update {
    private final DataBoxEdgeManager manager;
    private String deviceName;
    private String name;
    private String resourceGroupName;

    UserImpl(String name, DataBoxEdgeManager manager) {
        super(name, new UserInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    UserImpl(UserInner inner, DataBoxEdgeManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.deviceName = IdParsingUtils.getValueFromIdByName(inner.id(), "dataBoxEdgeDevices");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "users");
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        //
    }

    @Override
    public DataBoxEdgeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<User> createResourceAsync() {
        UsersInner client = this.manager().inner().users();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<User> updateResourceAsync() {
        UsersInner client = this.manager().inner().users();
        return client.createOrUpdateAsync(this.deviceName, this.name, this.resourceGroupName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<UserInner> getInnerAsync() {
        UsersInner client = this.manager().inner().users();
        return client.getAsync(this.deviceName, this.name, this.resourceGroupName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public AsymmetricEncryptedSecret encryptedPassword() {
        return this.inner().encryptedPassword();
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
    public List<ShareAccessRight> shareAccessRights() {
        return this.inner().shareAccessRights();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public UserImpl withExistingDataBoxEdgeDevice(String deviceName, String resourceGroupName) {
        this.deviceName = deviceName;
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    @Override
    public UserImpl withEncryptedPassword(AsymmetricEncryptedSecret encryptedPassword) {
        this.inner().withEncryptedPassword(encryptedPassword);
        return this;
    }

    @Override
    public UserImpl withShareAccessRights(List<ShareAccessRight> shareAccessRights) {
        this.inner().withShareAccessRights(shareAccessRights);
        return this;
    }

}
