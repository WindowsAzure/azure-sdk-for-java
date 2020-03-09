/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.v2019_02_01.implementation;

import com.microsoft.azure.management.storagesync.v2019_02_01.PostBackupResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class PostBackupResponseImpl extends WrapperImpl<PostBackupResponseInner> implements PostBackupResponse {
    private final StorageSyncManager manager;
    PostBackupResponseImpl(PostBackupResponseInner inner, StorageSyncManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageSyncManager manager() {
        return this.manager;
    }

    @Override
    public String cloudEndpointName() {
        return this.inner().cloudEndpointName();
    }

}
