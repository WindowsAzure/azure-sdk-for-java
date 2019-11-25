/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.automation.v2015_10_31.ConnectionTypes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.automation.v2015_10_31.ConnectionType;

class ConnectionTypesImpl extends WrapperImpl<ConnectionTypesInner> implements ConnectionTypes {
    private final AutomationManager manager;

    ConnectionTypesImpl(AutomationManager manager) {
        super(manager.inner().connectionTypes());
        this.manager = manager;
    }

    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public ConnectionTypeImpl define(String name) {
        return wrapModel(name);
    }

    private ConnectionTypeImpl wrapModel(ConnectionTypeInner inner) {
        return  new ConnectionTypeImpl(inner, manager());
    }

    private ConnectionTypeImpl wrapModel(String name) {
        return new ConnectionTypeImpl(name, this.manager());
    }

    @Override
    public Observable<ConnectionType> listByAutomationAccountAsync(final String resourceGroupName, final String automationAccountName) {
        ConnectionTypesInner client = this.inner();
        return client.listByAutomationAccountAsync(resourceGroupName, automationAccountName)
        .flatMapIterable(new Func1<Page<ConnectionTypeInner>, Iterable<ConnectionTypeInner>>() {
            @Override
            public Iterable<ConnectionTypeInner> call(Page<ConnectionTypeInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ConnectionTypeInner, ConnectionType>() {
            @Override
            public ConnectionType call(ConnectionTypeInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ConnectionType> getAsync(String resourceGroupName, String automationAccountName, String connectionTypeName) {
        ConnectionTypesInner client = this.inner();
        return client.getAsync(resourceGroupName, automationAccountName, connectionTypeName)
        .map(new Func1<ConnectionTypeInner, ConnectionType>() {
            @Override
            public ConnectionType call(ConnectionTypeInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String automationAccountName, String connectionTypeName) {
        ConnectionTypesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, automationAccountName, connectionTypeName).toCompletable();
    }

}
