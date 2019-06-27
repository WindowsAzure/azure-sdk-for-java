/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_09_01.implementation;

import com.microsoft.azure.management.appservice.v2016_09_01.HybridConnection;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class HybridConnectionImpl extends IndexableRefreshableWrapperImpl<HybridConnection, HybridConnectionInner> implements HybridConnection {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String namespaceName;
    private String relayName;

    HybridConnectionImpl(HybridConnectionInner inner,  AppServiceManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "serverfarms");
        this.namespaceName = IdParsingUtils.getValueFromIdByName(inner.id(), "hybridConnectionNamespaces");
        this.relayName = IdParsingUtils.getValueFromIdByName(inner.id(), "relays");
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<HybridConnectionInner> getInnerAsync() {
        AppServicePlansInner client = this.manager().inner().appServicePlans();
        return client.getHybridConnectionAsync(this.resourceGroupName, this.name, this.namespaceName, this.relayName);
    }



    @Override
    public String hostname() {
        return this.inner().hostname();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer port() {
        return this.inner().port();
    }

    @Override
    public String relayArmUri() {
        return this.inner().relayArmUri();
    }

    @Override
    public String relayName() {
        return this.inner().relayName();
    }

    @Override
    public String sendKeyName() {
        return this.inner().sendKeyName();
    }

    @Override
    public String sendKeyValue() {
        return this.inner().sendKeyValue();
    }

    @Override
    public String serviceBusNamespace() {
        return this.inner().serviceBusNamespace();
    }

    @Override
    public String serviceBusSuffix() {
        return this.inner().serviceBusSuffix();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
