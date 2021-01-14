/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.network.v2020_08_01.AzureFirewallFqdnTag;
import rx.Observable;
import com.microsoft.azure.management.network.v2020_08_01.ProvisioningState;

class AzureFirewallFqdnTagImpl extends GroupableResourceCoreImpl<AzureFirewallFqdnTag, AzureFirewallFqdnTagInner, AzureFirewallFqdnTagImpl, NetworkManager> implements AzureFirewallFqdnTag {
    AzureFirewallFqdnTagImpl(String name, AzureFirewallFqdnTagInner inner, NetworkManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<AzureFirewallFqdnTag> createResourceAsync() {
        AzureFirewallFqdnTagsInner client = this.manager().inner().azureFirewallFqdnTags();
        return null; // NOP createResourceAsync implementation as create is not supported
    }

    @Override
    public Observable<AzureFirewallFqdnTag> updateResourceAsync() {
        AzureFirewallFqdnTagsInner client = this.manager().inner().azureFirewallFqdnTags();
        return null; // NOP updateResourceAsync implementation as update is not supported
    }

    @Override
    protected Observable<AzureFirewallFqdnTagInner> getInnerAsync() {
        AzureFirewallFqdnTagsInner client = this.manager().inner().azureFirewallFqdnTags();
        return null; // NOP getInnerAsync implementation as get is not supported
    }



    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String fqdnTagName() {
        return this.inner().fqdnTagName();
    }

    @Override
    public ProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

}
