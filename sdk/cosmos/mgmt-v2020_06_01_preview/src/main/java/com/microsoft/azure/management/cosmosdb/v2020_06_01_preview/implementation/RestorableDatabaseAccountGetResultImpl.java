/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableDatabaseAccountGetResult;
import com.microsoft.azure.arm.model.implementation.IndexableRefreshableWrapperImpl;
import rx.Observable;
import org.joda.time.DateTime;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ManagedServiceIdentity;
import java.util.Map;

class RestorableDatabaseAccountGetResultImpl extends IndexableRefreshableWrapperImpl<RestorableDatabaseAccountGetResult, RestorableDatabaseAccountGetResultInner> implements RestorableDatabaseAccountGetResult {
    private final CosmosDBManager manager;
    private String location;
    private String instanceId;

    RestorableDatabaseAccountGetResultImpl(RestorableDatabaseAccountGetResultInner inner,  CosmosDBManager manager) {
        super(null, inner);
        this.manager = manager;
        // set resource ancestor and positional variables
        this.location = IdParsingUtils.getValueFromIdByName(inner.id(), "locations");
        this.instanceId = IdParsingUtils.getValueFromIdByName(inner.id(), "restorableDatabaseAccounts");
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
    }

    @Override
    protected Observable<RestorableDatabaseAccountGetResultInner> getInnerAsync() {
        RestorableDatabaseAccountsInner client = this.manager().inner().restorableDatabaseAccounts();
        return client.getByLocationAsync(this.location, this.instanceId);
    }



    @Override
    public String accountName() {
        return this.inner().accountName();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public DateTime deletionTime() {
        return this.inner().deletionTime();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public ManagedServiceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Map<String, String> tags() {
        return this.inner().getTags();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

}
