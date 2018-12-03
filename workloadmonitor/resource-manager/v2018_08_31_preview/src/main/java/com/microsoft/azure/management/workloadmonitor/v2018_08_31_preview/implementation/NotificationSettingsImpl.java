/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSettings;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.NotificationSetting;

class NotificationSettingsImpl extends WrapperImpl<NotificationSettingsInner> implements NotificationSettings {
    private final WorkloadMonitorManager manager;

    NotificationSettingsImpl(WorkloadMonitorManager manager) {
        super(manager.inner().notificationSettings());
        this.manager = manager;
    }

    public WorkloadMonitorManager manager() {
        return this.manager;
    }

    private NotificationSettingImpl wrapModel(NotificationSettingInner inner) {
        return  new NotificationSettingImpl(inner, manager());
    }

    @Override
    public Observable<NotificationSetting> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        NotificationSettingsInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
        .flatMapIterable(new Func1<Page<NotificationSettingInner>, Iterable<NotificationSettingInner>>() {
            @Override
            public Iterable<NotificationSettingInner> call(Page<NotificationSettingInner> page) {
                return page.items();
            }
        })
        .map(new Func1<NotificationSettingInner, NotificationSetting>() {
            @Override
            public NotificationSetting call(NotificationSettingInner inner) {
                return new NotificationSettingImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<NotificationSetting> getAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName) {
        NotificationSettingsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
        .map(new Func1<NotificationSettingInner, NotificationSetting>() {
            @Override
            public NotificationSetting call(NotificationSettingInner inner) {
                return new NotificationSettingImpl(inner, manager());
            }
        });
    }

}
