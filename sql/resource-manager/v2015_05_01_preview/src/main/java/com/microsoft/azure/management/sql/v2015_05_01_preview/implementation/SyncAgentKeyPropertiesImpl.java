/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import com.microsoft.azure.management.sql.v2015_05_01_preview.SyncAgentKeyProperties;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SyncAgentKeyPropertiesImpl extends WrapperImpl<SyncAgentKeyPropertiesInner> implements SyncAgentKeyProperties {
    private final SqlManager manager;
    SyncAgentKeyPropertiesImpl(SyncAgentKeyPropertiesInner inner, SqlManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public String syncAgentKey() {
        return this.inner().syncAgentKey();
    }

}
