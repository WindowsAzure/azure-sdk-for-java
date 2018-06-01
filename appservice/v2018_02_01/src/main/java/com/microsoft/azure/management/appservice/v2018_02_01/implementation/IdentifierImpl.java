/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.Identifier;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class IdentifierImpl extends CreatableUpdatableImpl<Identifier, IdentifierInner, IdentifierImpl> implements Identifier, Identifier.Definition, Identifier.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String name;
    private String domainOwnershipIdentifierName;

    IdentifierImpl(String name, AppServiceManager manager) {
        super(name, new IdentifierInner());
        this.manager = manager;
        // Set resource name
        this.domainOwnershipIdentifierName = name;
        //
    }

    IdentifierImpl(IdentifierInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.domainOwnershipIdentifierName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "sites");
        this.domainOwnershipIdentifierName = IdParsingUtils.getValueFromIdByName(inner.id(), "domainOwnershipIdentifiers");
        //
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Identifier> createResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.createOrUpdateDomainOwnershipIdentifierAsync(this.resourceGroupName, this.name, this.domainOwnershipIdentifierName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Identifier> updateResourceAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.updateDomainOwnershipIdentifierAsync(this.resourceGroupName, this.name, this.domainOwnershipIdentifierName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IdentifierInner> getInnerAsync() {
        WebAppsInner client = this.manager().inner().webApps();
        return client.getDomainOwnershipIdentifierAsync(this.resourceGroupName, this.name, this.domainOwnershipIdentifierName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String identifierId() {
        return this.inner().identifierId();
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
    public String type() {
        return this.inner().type();
    }

    @Override
    public IdentifierImpl withExistingSite(String resourceGroupName, String name) {
        this.resourceGroupName = resourceGroupName;
        this.name = name;
        return this;
    }

    @Override
    public IdentifierImpl withIdentifierId(String identifierId) {
        this.inner().withIdentifierId(identifierId);
        return this;
    }

    @Override
    public IdentifierImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

}
