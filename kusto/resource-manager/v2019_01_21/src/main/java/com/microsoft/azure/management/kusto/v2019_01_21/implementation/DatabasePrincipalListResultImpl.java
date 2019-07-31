/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2019_01_21.implementation;

import com.microsoft.azure.management.kusto.v2019_01_21.DatabasePrincipalListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class DatabasePrincipalListResultImpl extends WrapperImpl<DatabasePrincipalListResultInner> implements DatabasePrincipalListResult {
    private final KustoManager manager;
    DatabasePrincipalListResultImpl(DatabasePrincipalListResultInner inner, KustoManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public KustoManager manager() {
        return this.manager;
    }

    @Override
    public List<DatabasePrincipalInner> value() {
        return this.inner().value();
    }

}
