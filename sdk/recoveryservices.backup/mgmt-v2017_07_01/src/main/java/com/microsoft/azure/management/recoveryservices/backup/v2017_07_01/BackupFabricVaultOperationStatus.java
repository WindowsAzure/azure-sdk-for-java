/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.OperationStatusInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.RecoveryServicesManager;
import org.joda.time.DateTime;

/**
 * Type representing BackupFabricVaultOperationStatus.
 */
public interface BackupFabricVaultOperationStatus extends HasInner<OperationStatusInner>, Indexable, Refreshable<BackupFabricVaultOperationStatus>, HasManager<RecoveryServicesManager> {
    /**
     * @return the endTime value.
     */
    DateTime endTime();

    /**
     * @return the error value.
     */
    OperationStatusError error();

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
    OperationStatusExtendedInfo properties();

    /**
     * @return the startTime value.
     */
    DateTime startTime();

    /**
     * @return the status value.
     */
    OperationStatusValues status();

}
