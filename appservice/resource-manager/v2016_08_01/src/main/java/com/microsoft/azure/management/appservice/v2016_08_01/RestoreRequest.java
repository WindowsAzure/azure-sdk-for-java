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
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.AppServiceManager;
import com.microsoft.azure.management.appservice.v2016_08_01.implementation.RestoreRequestInner;
import java.util.List;

/**
 * Type representing RestoreRequest.
 */
public interface RestoreRequest extends HasInner<RestoreRequestInner>, HasManager<AppServiceManager> {
    /**
     * @return the adjustConnectionStrings value.
     */
    Boolean adjustConnectionStrings();

    /**
     * @return the appServicePlan value.
     */
    String appServicePlan();

    /**
     * @return the blobName value.
     */
    String blobName();

    /**
     * @return the databases value.
     */
    List<DatabaseBackupSetting> databases();

    /**
     * @return the hostingEnvironment value.
     */
    String hostingEnvironment();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the ignoreConflictingHostNames value.
     */
    Boolean ignoreConflictingHostNames();

    /**
     * @return the ignoreDatabases value.
     */
    Boolean ignoreDatabases();

    /**
     * @return the kind value.
     */
    String kind();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the operationType value.
     */
    BackupRestoreOperationType operationType();

    /**
     * @return the overwrite value.
     */
    boolean overwrite();

    /**
     * @return the siteName value.
     */
    String siteName();

    /**
     * @return the storageAccountUrl value.
     */
    String storageAccountUrl();

    /**
     * @return the type value.
     */
    String type();

}
