/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.search.v2015_08_19.implementation;

import com.microsoft.azure.management.search.v2015_08_19.QueryKey;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;

class QueryKeyImpl extends WrapperImpl<QueryKeyInner> implements QueryKey {
    private final SearchManager manager;

    QueryKeyImpl(QueryKeyInner inner,  SearchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SearchManager manager() {
        return this.manager;
    }



    @Override
    public String keyVal() {
        return this.inner().key();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
