/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.ReplicationAlertSettings;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.Alert;

class ReplicationAlertSettingsImpl extends WrapperImpl<ReplicationAlertSettingsInner> implements ReplicationAlertSettings {
    private final RecoveryServicesManager manager;

    ReplicationAlertSettingsImpl(RecoveryServicesManager manager) {
        super(manager.inner().replicationAlertSettings());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    @Override
    public AlertImpl define(String name) {
        return wrapModel(name);
    }

    private AlertImpl wrapModel(AlertInner inner) {
        return  new AlertImpl(inner, manager());
    }

    private AlertImpl wrapModel(String name) {
        return new AlertImpl(name, this.manager());
    }

    @Override
    public Observable<Alert> listAsync() {
        ReplicationAlertSettingsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AlertInner>, Iterable<AlertInner>>() {
            @Override
            public Iterable<AlertInner> call(Page<AlertInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AlertInner, Alert>() {
            @Override
            public Alert call(AlertInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<Alert> getAsync(String alertSettingName) {
        ReplicationAlertSettingsInner client = this.inner();
        return client.getAsync(alertSettingName)
        .flatMap(new Func1<AlertInner, Observable<Alert>>() {
            @Override
            public Observable<Alert> call(AlertInner inner) {
                if (inner == null) {
                    return Observable.empty();
                } else {
                    return Observable.just((Alert)wrapModel(inner));
                }
            }
       });
    }

}
