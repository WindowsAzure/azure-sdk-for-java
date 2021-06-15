// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupManagementUsageInner;
import java.time.OffsetDateTime;

/** An immutable client-side representation of BackupManagementUsage. */
public interface BackupManagementUsage {
    /**
     * Gets the unit property: Unit of the usage.
     *
     * @return the unit value.
     */
    UsagesUnit unit();

    /**
     * Gets the quotaPeriod property: Quota period of usage.
     *
     * @return the quotaPeriod value.
     */
    String quotaPeriod();

    /**
     * Gets the nextResetTime property: Next reset time of usage.
     *
     * @return the nextResetTime value.
     */
    OffsetDateTime nextResetTime();

    /**
     * Gets the currentValue property: Current value of usage.
     *
     * @return the currentValue value.
     */
    Long currentValue();

    /**
     * Gets the limit property: Limit of usage.
     *
     * @return the limit value.
     */
    Long limit();

    /**
     * Gets the name property: Name of usage.
     *
     * @return the name value.
     */
    NameInfo name();

    /**
     * Gets the inner com.azure.resourcemanager.recoveryservicesbackup.fluent.models.BackupManagementUsageInner object.
     *
     * @return the inner object.
     */
    BackupManagementUsageInner innerModel();
}
