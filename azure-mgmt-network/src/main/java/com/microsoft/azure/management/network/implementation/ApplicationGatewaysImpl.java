/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.ApplicationGateway;
import com.microsoft.azure.management.network.ApplicationGatewaySkuName;
import com.microsoft.azure.management.network.ApplicationGateways;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.ListableGroupableResourcesPageImpl;
import rx.Completable;
import rx.Observable;

/**
 *  Implementation for ApplicationGateways.
 */
@LangDefinition
class ApplicationGatewaysImpl
        extends ListableGroupableResourcesPageImpl<
            ApplicationGateway,
            ApplicationGatewayImpl,
            ApplicationGatewayInner,
            ApplicationGatewaysInner,
            NetworkManager>
        implements ApplicationGateways {

    ApplicationGatewaysImpl(final NetworkManager networkManager) {
        super(networkManager.inner().applicationGateways(), networkManager);
    }

    @Override
    public PagedList<ApplicationGateway> list() {
        return wrapList(this.inner().listAll());
    }

    @Override
    public PagedList<ApplicationGateway> listByGroup(String groupName) {
        return wrapList(this.inner().list(groupName));
    }

    @Override
    public ApplicationGatewayImpl getByGroup(String groupName, String name) {
        return wrapModel(this.inner().get(groupName, name));
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    @Override
    public ApplicationGatewayImpl define(String name) {
        return wrapModel(name).withSize(ApplicationGatewaySkuName.STANDARD_SMALL).withInstanceCount(1);
    }

    // Fluent model create helpers

    @Override
    protected ApplicationGatewayImpl wrapModel(String name) {
        ApplicationGatewayInner inner = new ApplicationGatewayInner();
        return new ApplicationGatewayImpl(name, inner, this.manager());
    }

    @Override
    protected ApplicationGatewayImpl wrapModel(ApplicationGatewayInner inner) {
        return (inner == null) ? null : new ApplicationGatewayImpl(inner.name(), inner, this.manager());
    }

    @Override
    protected Observable<Page<ApplicationGatewayInner>> listAsyncPage() {
        return inner().listAllAsync();
    }

    @Override
    protected Observable<Page<ApplicationGatewayInner>> listByGroupAsyncPage(String resourceGroupName) {
        return inner().listAsync(resourceGroupName);
    }
}
