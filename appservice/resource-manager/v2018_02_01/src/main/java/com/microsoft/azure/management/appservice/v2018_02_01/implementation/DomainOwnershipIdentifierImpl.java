/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import com.microsoft.azure.management.appservice.v2018_02_01.DomainOwnershipIdentifier;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;

class DomainOwnershipIdentifierImpl extends CreatableUpdatableImpl<DomainOwnershipIdentifier, DomainOwnershipIdentifierInner, DomainOwnershipIdentifierImpl> implements DomainOwnershipIdentifier, DomainOwnershipIdentifier.Definition, DomainOwnershipIdentifier.Update {
    private final AppServiceManager manager;
    private String resourceGroupName;
    private String domainName;
    private String name;

    DomainOwnershipIdentifierImpl(String name, AppServiceManager manager) {
        super(name, new DomainOwnershipIdentifierInner());
        this.manager = manager;
        // Set resource name
        this.name = name;
        //
    }

    DomainOwnershipIdentifierImpl(DomainOwnershipIdentifierInner inner, AppServiceManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.name = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.domainName = IdParsingUtils.getValueFromIdByName(inner.id(), "domains");
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "domainOwnershipIdentifiers");
        //
    }

    @Override
    public AppServiceManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DomainOwnershipIdentifier> createResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.createOrUpdateOwnershipIdentifierAsync(this.resourceGroupName, this.domainName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DomainOwnershipIdentifier> updateResourceAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.updateOwnershipIdentifierAsync(this.resourceGroupName, this.domainName, this.name, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DomainOwnershipIdentifierInner> getInnerAsync() {
        DomainsInner client = this.manager().inner().domains();
        return client.getOwnershipIdentifierAsync(this.resourceGroupName, this.domainName, this.name);
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
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String ownershipId() {
        return this.inner().ownershipId();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public DomainOwnershipIdentifierImpl withExistingDomain(String resourceGroupName, String domainName) {
        this.resourceGroupName = resourceGroupName;
        this.domainName = domainName;
        return this;
    }

    @Override
    public DomainOwnershipIdentifierImpl withKind(String kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public DomainOwnershipIdentifierImpl withOwnershipId(String ownershipId) {
        this.inner().withOwnershipId(ownershipId);
        return this;
    }

}
