/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01.implementation;

import com.microsoft.azure.management.storage.v2019_04_01.ListContainerItems;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.storage.v2019_04_01.ListContainerItem;

class ListContainerItemsImpl extends WrapperImpl<ListContainerItemsInner> implements ListContainerItems {
    private final StorageManager manager;
    ListContainerItemsImpl(ListContainerItemsInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<ListContainerItem> value() {
        return this.inner().value();
    }

}
