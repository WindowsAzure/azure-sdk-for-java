/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mariadb.v2018_06_01.implementation;

import com.microsoft.azure.management.mariadb.v2018_06_01.QueryText;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;

class QueryTextImpl extends IndexableRefreshableWrapperImpl<QueryText, QueryTextInner> implements QueryText {
    private final MariaDBManager manager;
    private String resourceGroupName;
    private String serverName;
    private String queryId;

    QueryTextImpl(QueryTextInner inner,  MariaDBManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.queryId = IdParsingUtils.getValueFromIdByName(inner.id(), "queryTexts");
    }

    @Override
    public MariaDBManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<QueryTextInner> getInnerAsync() {
        QueryTextsInner client = this.manager().inner().queryTexts();
        return client.getAsync(this.resourceGroupName, this.serverName, this.queryId);
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
    public String queryId() {
        return this.inner().queryId();
    }

    @Override
    public String queryText() {
        return this.inner().queryText();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
