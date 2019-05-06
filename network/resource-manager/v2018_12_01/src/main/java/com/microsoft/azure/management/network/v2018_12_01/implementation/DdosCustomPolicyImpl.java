/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_12_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2018_12_01.DdosCustomPolicy;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.network.v2018_12_01.ProtocolCustomSettingsFormat;

class DdosCustomPolicyImpl extends GroupableResourceCoreImpl<DdosCustomPolicy, DdosCustomPolicyInner, DdosCustomPolicyImpl, NetworkManager> implements DdosCustomPolicy, DdosCustomPolicy.Definition, DdosCustomPolicy.Update {
    DdosCustomPolicyImpl(String name, DdosCustomPolicyInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<DdosCustomPolicy> createResourceAsync() {
        DdosCustomPoliciesInner client = this.manager().inner().ddosCustomPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DdosCustomPolicy> updateResourceAsync() {
        DdosCustomPoliciesInner client = this.manager().inner().ddosCustomPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DdosCustomPolicyInner> getInnerAsync() {
        DdosCustomPoliciesInner client = this.manager().inner().ddosCustomPolicies();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public List<ProtocolCustomSettingsFormat> protocolCustomSettings() {
        return this.inner().protocolCustomSettings();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public List<SubResource> publicIPAddresses() {
        return this.inner().publicIPAddresses();
    }

    @Override
    public String resourceGuid() {
        return this.inner().resourceGuid();
    }

    @Override
    public DdosCustomPolicyImpl withProtocolCustomSettings(List<ProtocolCustomSettingsFormat> protocolCustomSettings) {
        this.inner().withProtocolCustomSettings(protocolCustomSettings);
        return this;
    }

}
