/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.implementation;

import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableMongodbDatabaseGetResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.ManagedServiceIdentity;
import com.microsoft.azure.management.cosmosdb.v2020_06_01_preview.RestorableMongodbDatabasePropertiesResource;
import java.util.Map;

class RestorableMongodbDatabaseGetResultImpl extends WrapperImpl<RestorableMongodbDatabaseGetResultInner> implements RestorableMongodbDatabaseGetResult {
    private final CosmosDBManager manager;

    RestorableMongodbDatabaseGetResultImpl(RestorableMongodbDatabaseGetResultInner inner,  CosmosDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public CosmosDBManager manager() {
        return this.manager;
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
    public RestorableMongodbDatabasePropertiesResource resource() {
        return this.inner().resource();
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
