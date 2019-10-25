/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_04_01.implementation;

import com.microsoft.azure.management.storage.v2019_04_01.FileServiceItems;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;

class FileServiceItemsImpl extends WrapperImpl<FileServiceItemsInner> implements FileServiceItems {
    private final StorageManager manager;
    FileServiceItemsImpl(FileServiceItemsInner inner, StorageManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public List<FileServicePropertiesInner> value() {
        return this.inner().value();
    }

}
