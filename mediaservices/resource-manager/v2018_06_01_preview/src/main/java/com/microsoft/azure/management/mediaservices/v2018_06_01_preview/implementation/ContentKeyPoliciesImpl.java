/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.ContentKeyPolicies;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.ContentKeyPolicyProperties;
import com.microsoft.azure.management.mediaservices.v2018_06_01_preview.ContentKeyPolicy;

class ContentKeyPoliciesImpl extends WrapperImpl<ContentKeyPoliciesInner> implements ContentKeyPolicies {
    private final MediaManager manager;

    ContentKeyPoliciesImpl(MediaManager manager) {
        super(manager.inner().contentKeyPolicies());
        this.manager = manager;
    }

    public MediaManager manager() {
        return this.manager;
    }

    @Override
    public ContentKeyPolicyImpl define(String name) {
        return wrapModel(name);
    }

    private ContentKeyPolicyImpl wrapModel(ContentKeyPolicyInner inner) {
        return  new ContentKeyPolicyImpl(inner, manager());
    }

    private ContentKeyPolicyImpl wrapModel(String name) {
        return new ContentKeyPolicyImpl(name, this.manager());
    }

    @Override
    public Observable<ContentKeyPolicyProperties> getPolicyPropertiesWithSecretsAsync(String resourceGroupName, String accountName, String contentKeyPolicyName) {
        ContentKeyPoliciesInner client = this.inner();
        return client.getPolicyPropertiesWithSecretsAsync(resourceGroupName, accountName, contentKeyPolicyName)
        .map(new Func1<ContentKeyPolicyPropertiesInner, ContentKeyPolicyProperties>() {
            @Override
            public ContentKeyPolicyProperties call(ContentKeyPolicyPropertiesInner inner) {
                return new ContentKeyPolicyPropertiesImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ContentKeyPolicy> listAsync(final String resourceGroupName, final String accountName) {
        ContentKeyPoliciesInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .flatMapIterable(new Func1<Page<ContentKeyPolicyInner>, Iterable<ContentKeyPolicyInner>>() {
            @Override
            public Iterable<ContentKeyPolicyInner> call(Page<ContentKeyPolicyInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ContentKeyPolicyInner, ContentKeyPolicy>() {
            @Override
            public ContentKeyPolicy call(ContentKeyPolicyInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public Observable<ContentKeyPolicy> getAsync(String resourceGroupName, String accountName, String contentKeyPolicyName) {
        ContentKeyPoliciesInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, contentKeyPolicyName)
        .map(new Func1<ContentKeyPolicyInner, ContentKeyPolicy>() {
            @Override
            public ContentKeyPolicy call(ContentKeyPolicyInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String contentKeyPolicyName) {
        ContentKeyPoliciesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, contentKeyPolicyName).toCompletable();
    }

}
