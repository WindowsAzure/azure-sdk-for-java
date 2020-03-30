/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2020_02_02;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.BackupManagementUsageInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.recoveryservices.backup.v2020_02_02.implementation.RecoveryServicesManager;
import org.joda.time.DateTime;

/**
 * Type representing BackupManagementUsage.
 */
public interface BackupManagementUsage extends HasInner<BackupManagementUsageInner>, HasManager<RecoveryServicesManager> {
    /**
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * @return the limit value.
     */
    Long limit();

    /**
     * @return the name value.
     */
    NameInfo name();

    /**
     * @return the nextResetTime value.
     */
    DateTime nextResetTime();

    /**
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * @return the unit value.
     */
    UsagesUnit unit();

}
