/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview.implementation;

import com.microsoft.azure.management.storage.v2019_08_01_preview.ListServiceSasResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class ListServiceSasResponseImpl extends WrapperImpl<ListServiceSasResponseInner> implements ListServiceSasResponse {
    private final StorageManager manager;
    ListServiceSasResponseImpl(ListServiceSasResponseInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String serviceSasToken() {
        return this.inner().serviceSasToken();
    }

}
