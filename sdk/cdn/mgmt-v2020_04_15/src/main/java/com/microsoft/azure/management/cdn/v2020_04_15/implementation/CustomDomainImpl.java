/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_04_15.implementation;

import com.microsoft.azure.management.cdn.v2020_04_15.CustomDomain;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.cdn.v2020_04_15.CustomHttpsProvisioningState;
import com.microsoft.azure.management.cdn.v2020_04_15.CustomHttpsProvisioningSubstate;
import com.microsoft.azure.management.cdn.v2020_04_15.CustomDomainResourceState;

class CustomDomainImpl extends CreatableUpdatableImpl<CustomDomain, CustomDomainInner, CustomDomainImpl> implements CustomDomain, CustomDomain.Definition, CustomDomain.Update {
    private final CdnManager manager;
    private String resourceGroupName;
    private String profileName;
    private String endpointName;
    private String customDomainName;
    private String chostName;
    private String uhostName;

    CustomDomainImpl(String name, CdnManager manager) {
        super(name, new CustomDomainInner());
        this.manager = manager;
        // Set resource name
        this.customDomainName = name;
        //
    }

    CustomDomainImpl(CustomDomainInner inner, CdnManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.customDomainName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.profileName = IdParsingUtils.getValueFromIdByName(inner.id(), "profiles");
        this.endpointName = IdParsingUtils.getValueFromIdByName(inner.id(), "endpoints");
        this.customDomainName = IdParsingUtils.getValueFromIdByName(inner.id(), "customDomains");
        //
    }

    @Override
    public CdnManager manager() {
        return this.manager;
    }

    @Override
    public Observable<CustomDomain> createResourceAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.createAsync(this.resourceGroupName, this.profileName, this.endpointName, this.customDomainName, this.chostName)
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<CustomDomain> updateResourceAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.createAsync(this.resourceGroupName, this.profileName, this.endpointName, this.customDomainName, this.uhostName)
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CustomDomainInner> getInnerAsync() {
        CustomDomainsInner client = this.manager().inner().customDomains();
        return client.getAsync(this.resourceGroupName, this.profileName, this.endpointName, this.customDomainName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public CustomHttpsProvisioningState customHttpsProvisioningState() {
        return this.inner().customHttpsProvisioningState();
    }

    @Override
    public CustomHttpsProvisioningSubstate customHttpsProvisioningSubstate() {
        return this.inner().customHttpsProvisioningSubstate();
    }

    @Override
    public String hostName() {
        return this.inner().hostName();
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
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public CustomDomainResourceState resourceState() {
        return this.inner().resourceState();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String validationData() {
        return this.inner().validationData();
    }

    @Override
    public CustomDomainImpl withExistingEndpoint(String resourceGroupName, String profileName, String endpointName) {
        this.resourceGroupName = resourceGroupName;
        this.profileName = profileName;
        this.endpointName = endpointName;
        return this;
    }

    @Override
    public CustomDomainImpl withHostName(String hostName) {
        if (isInCreateMode()) {
            this.chostName = hostName;
        } else {
            this.uhostName = hostName;
        }
        return this;
    }

}
