/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.BackupItemInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2018_02_01.implementation.CertificateRegistrationManager;
import org.joda.time.DateTime;
import java.util.List;

/**
 * Type representing BackupItem.
 */
public interface BackupItem extends HasInner<BackupItemInner>, Indexable, Refreshable<BackupItem>, HasManager<CertificateRegistrationManager> {
    /**
     * @return the backupId value.
     */
    Integer backupId();

    /**
     * @return the backupName value.
     */
    String backupName();

    /**
     * @return the blobName value.
     */
    String blobName();

    /**
     * @return the correlationId value.
     */
    String correlationId();

    /**
     * @return the created value.
     */
    DateTime created();

    /**
     * @return the databases value.
     */
    List<DatabaseBackupSetting> databases();

    /**
     * @return the finishedTimeStamp value.
     */
    DateTime finishedTimeStamp();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the lastRestoreTimeStamp value.
     */
    DateTime lastRestoreTimeStamp();

    /**
     * @return the log value.
     */
    String log();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the scheduled value.
     */
    Boolean scheduled();

    /**
     * @return the sizeInBytes value.
     */
    Long sizeInBytes();

    /**
     * @return the status value.
     */
    BackupItemStatus status();

    /**
     * @return the storageAccountUrl value.
     */
    String storageAccountUrl();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the websiteSizeInBytes value.
     */
    Long websiteSizeInBytes();

}
