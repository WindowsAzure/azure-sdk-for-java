// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.resourcemanager.cosmos.implementation;

import com.azure.resourcemanager.cosmos.DatabaseAccountConnectionString;
import com.azure.resourcemanager.cosmos.DatabaseAccountListConnectionStringsResult;
import com.azure.resourcemanager.cosmos.models.DatabaseAccountListConnectionStringsResultInner;
import com.azure.resourcemanager.resources.fluentcore.model.implementation.WrapperImpl;
import java.util.List;

/** The implementation for DatabaseAccountListConnectionStringsResult. */
public class DatabaseAccountListConnectionStringsResultImpl
    extends WrapperImpl<DatabaseAccountListConnectionStringsResultInner>
    implements DatabaseAccountListConnectionStringsResult {
    DatabaseAccountListConnectionStringsResultImpl(DatabaseAccountListConnectionStringsResultInner innerObject) {
        super(innerObject);
    }

    @Override
    public List<DatabaseAccountConnectionString> connectionStrings() {
        return this.inner().connectionStrings();
    }
}
