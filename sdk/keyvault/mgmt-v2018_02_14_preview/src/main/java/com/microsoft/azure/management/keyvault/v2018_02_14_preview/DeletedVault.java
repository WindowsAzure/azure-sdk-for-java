/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.v2018_02_14_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation.DeletedVaultInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.keyvault.v2018_02_14_preview.implementation.KeyVaultManager;

/**
 * Type representing DeletedVault.
 */
public interface DeletedVault extends HasInner<DeletedVaultInner>, Indexable, Refreshable<DeletedVault>, HasManager<KeyVaultManager> {
    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the properties value.
     */
    DeletedVaultProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
