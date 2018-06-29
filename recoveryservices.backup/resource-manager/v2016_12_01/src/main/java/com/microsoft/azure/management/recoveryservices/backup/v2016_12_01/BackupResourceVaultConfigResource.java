/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.RecoveryServicesManager;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.BackupResourceVaultConfigResourceInner;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation.BackupResourceVaultConfigInner;
import java.util.Map;

/**
 * Type representing BackupResourceVaultConfigResource.
 */
public interface BackupResourceVaultConfigResource extends HasInner<BackupResourceVaultConfigResourceInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the eTag value.
     */
    String eTag();

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
     * @return the properties value.
     */
    BackupResourceVaultConfigInner properties();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

}
