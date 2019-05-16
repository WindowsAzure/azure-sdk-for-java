/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cosmosdb.v2015_04_08.implementation;

import com.microsoft.azure.management.cosmosdb.v2015_04_08.GremlinDatabase;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class GremlinDatabaseImpl extends WrapperImpl<GremlinDatabaseInner> implements GremlinDatabase {
    private final DocumentDBManager manager;
    GremlinDatabaseImpl(GremlinDatabaseInner inner, DocumentDBManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DocumentDBManager manager() {
        return this.manager;
    }

    @Override
    public String _etag() {
        return this.inner()._etag();
    }

    @Override
    public String _rid() {
        return this.inner()._rid();
    }

    @Override
    public Object _ts() {
        return this.inner()._ts();
    }

    @Override
    public String gremlinDatabaseId() {
        return this.inner().gremlinDatabaseId();
    }

    @Override
    public String id() {
        return this.inner().id();
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
