/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.network.v2020_08_01.implementation;

import com.microsoft.azure.management.network.v2020_08_01.AzureWebCategory;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class AzureWebCategoryImpl extends IndexableRefreshableWrapperImpl<AzureWebCategory, AzureWebCategoryInner> implements AzureWebCategory {
    private String name;
    private final NetworkManager manager;

    AzureWebCategoryImpl(AzureWebCategoryInner inner,  NetworkManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.name = IdParsingUtils.getValueFromIdByName(inner.id(), "azureWebCategories");
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<AzureWebCategoryInner> getInnerAsync() {
        WebCategoriesInner client = this.manager().inner().webCategories();
        return client.getAsync(this.name);
    }



    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String group() {
        return this.inner().group();
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
    public String type() {
        return this.inner().type();
    }

}
