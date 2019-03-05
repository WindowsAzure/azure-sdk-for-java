/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.searchmanagementclient.v2015_08_19.implementation;

import com.microsoft.azure.management.searchmanagementclient.v2015_08_19.AdminKeyResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class AdminKeyResultImpl extends WrapperImpl<AdminKeyResultInner> implements AdminKeyResult {
    private final SearchManager manager;
    AdminKeyResultImpl(AdminKeyResultInner inner, SearchManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SearchManager manager() {
        return this.manager;
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}
