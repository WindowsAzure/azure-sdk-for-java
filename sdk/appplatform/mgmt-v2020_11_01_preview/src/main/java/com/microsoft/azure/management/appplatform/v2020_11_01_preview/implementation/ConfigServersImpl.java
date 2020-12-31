/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.ConfigServers;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.ConfigServerResource;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.ConfigServerSettingsValidateResult;

class ConfigServersImpl extends WrapperImpl<ConfigServersInner> implements ConfigServers {
    private final AppPlatformManager manager;

    ConfigServersImpl(AppPlatformManager manager) {
        super(manager.inner().configServers());
        this.manager = manager;
    }

    public AppPlatformManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ConfigServerResource> getAsync(String resourceGroupName, String serviceName) {
        ConfigServersInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceName)
        .map(new Func1<ConfigServerResourceInner, ConfigServerResource>() {
            @Override
            public ConfigServerResource call(ConfigServerResourceInner inner) {
                return new ConfigServerResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConfigServerResource> updatePutAsync(String resourceGroupName, String serviceName) {
        ConfigServersInner client = this.inner();
        return client.updatePutAsync(resourceGroupName, serviceName)
        .map(new Func1<ConfigServerResourceInner, ConfigServerResource>() {
            @Override
            public ConfigServerResource call(ConfigServerResourceInner inner) {
                return new ConfigServerResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConfigServerResource> updatePatchAsync(String resourceGroupName, String serviceName) {
        ConfigServersInner client = this.inner();
        return client.updatePatchAsync(resourceGroupName, serviceName)
        .map(new Func1<ConfigServerResourceInner, ConfigServerResource>() {
            @Override
            public ConfigServerResource call(ConfigServerResourceInner inner) {
                return new ConfigServerResourceImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ConfigServerSettingsValidateResult> validateAsync(String resourceGroupName, String serviceName) {
        ConfigServersInner client = this.inner();
        return client.validateAsync(resourceGroupName, serviceName)
        .map(new Func1<ConfigServerSettingsValidateResultInner, ConfigServerSettingsValidateResult>() {
            @Override
            public ConfigServerSettingsValidateResult call(ConfigServerSettingsValidateResultInner inner) {
                return new ConfigServerSettingsValidateResultImpl(inner, manager());
            }
        });
    }

}
