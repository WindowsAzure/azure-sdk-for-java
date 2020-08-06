/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_08_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.WebManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.BackupRequestInner;
import java.util.List;

/**
 * Type representing BackupRequest.
 */
public interface BackupRequest extends HasInner<BackupRequestInner>, HasManager<WebManager> {
    /**
     * @return the backupRequestName value.
     */
    String backupRequestName();

    /**
     * @return the backupRequestType value.
     */
    BackupRestoreOperationType backupRequestType();

    /**
     * @return the backupSchedule value.
     */
    BackupSchedule backupSchedule();

    /**
     * @return the databases value.
     */
    List<DatabaseBackupSetting> databases();

    /**
     * @return the enabled value.
     */
    Boolean enabled();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the storageAccountUrl value.
     */
    String storageAccountUrl();

    /**
     * @return the type value.
     */
    String type();

}
