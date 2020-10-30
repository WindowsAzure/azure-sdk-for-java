/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_08_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.DeletedAccountInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2019_08_01_preview.implementation.StorageManager;

/**
 * Type representing DeletedAccount.
 */
public interface DeletedAccount extends HasInner<DeletedAccountInner>, Indexable, Refreshable<DeletedAccount>, HasManager<StorageManager> {
    /**
     * @return the creationTime value.
     */
    String creationTime();

    /**
     * @return the deletionTime value.
     */
    String deletionTime();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the location value.
     */
    String location();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the restoreReference value.
     */
    String restoreReference();

    /**
     * @return the storageAccountResourceId value.
     */
    String storageAccountResourceId();

    /**
     * @return the type value.
     */
    String type();

}
