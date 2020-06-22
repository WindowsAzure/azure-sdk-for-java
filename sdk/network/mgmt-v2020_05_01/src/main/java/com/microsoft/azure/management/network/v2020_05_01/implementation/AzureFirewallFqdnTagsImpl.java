/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.network.v2020_05_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallFqdnTags;
import com.microsoft.azure.management.network.v2020_05_01.AzureFirewallFqdnTag;
import rx.Observable;
import rx.Completable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class AzureFirewallFqdnTagsImpl extends GroupableResourcesCoreImpl<AzureFirewallFqdnTag, AzureFirewallFqdnTagImpl, AzureFirewallFqdnTagInner, AzureFirewallFqdnTagsInner, NetworkManager>  implements AzureFirewallFqdnTags {
    protected AzureFirewallFqdnTagsImpl(NetworkManager manager) {
        super(manager.inner().azureFirewallFqdnTags(), manager);
    }

    @Override
    protected Observable<AzureFirewallFqdnTagInner> getInnerAsync(String resourceGroupName, String name) {
        return null; // NOP Retrieve by resource group not supported
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        AzureFirewallFqdnTagsInner client = this.inner();
        return Completable.error(new Throwable("Delete by RG not supported for this resource")); // NOP Delete by RG not supported
    }

    @Override
    public PagedList<AzureFirewallFqdnTag> list() {
        AzureFirewallFqdnTagsInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<AzureFirewallFqdnTag> listAsync() {
        AzureFirewallFqdnTagsInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<AzureFirewallFqdnTagInner>, Iterable<AzureFirewallFqdnTagInner>>() {
            @Override
            public Iterable<AzureFirewallFqdnTagInner> call(Page<AzureFirewallFqdnTagInner> page) {
                return page.items();
            }
        })
        .map(new Func1<AzureFirewallFqdnTagInner, AzureFirewallFqdnTag>() {
            @Override
            public AzureFirewallFqdnTag call(AzureFirewallFqdnTagInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    protected AzureFirewallFqdnTagImpl wrapModel(AzureFirewallFqdnTagInner inner) {
        return  new AzureFirewallFqdnTagImpl(inner.name(), inner, manager());
    }

    @Override
    protected AzureFirewallFqdnTagImpl wrapModel(String name) {
        return null; // Model is not creatable
    }

}
