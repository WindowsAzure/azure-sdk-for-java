/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.SignInSettings;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.PortalSigninSettings;

class SignInSettingsImpl extends WrapperImpl<SignInSettingsInner> implements SignInSettings {
    private final ApiManagementManager manager;

    SignInSettingsImpl(ApiManagementManager manager) {
        super(manager.inner().signInSettings());
        this.manager = manager;
    }

    public ApiManagementManager manager() {
        return this.manager;
    }

    @Override
    public Completable getEntityTagAsync(String resourceGroupName, String serviceName) {
        SignInSettingsInner client = this.inner();
        return client.getEntityTagAsync(resourceGroupName, serviceName).toCompletable();
    }

    @Override
    public Observable<PortalSigninSettings> getAsync(String resourceGroupName, String serviceName) {
        SignInSettingsInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<PortalSigninSettingsInner, PortalSigninSettings>() {
            @Override
            public PortalSigninSettings call(PortalSigninSettingsInner inner) {
                return new PortalSigninSettingsImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable updateAsync(String resourceGroupName, String serviceName, String ifMatch) {
        SignInSettingsInner client = this.inner();
        return client.updateAsync(resourceGroupName, serviceName, ifMatch).toCompletable();
    }

    @Override
    public Observable<PortalSigninSettings> createOrUpdateAsync(String resourceGroupName, String serviceName) {
        SignInSettingsInner client = this.inner();
        return client.createOrUpdateAsync(resourceGroupName, serviceName)
        .map(new Func1<PortalSigninSettingsInner, PortalSigninSettings>() {
            @Override
            public PortalSigninSettings call(PortalSigninSettingsInner inner) {
                return new PortalSigninSettingsImpl(inner, manager());
            }
        });
    }

}
