/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.maintenance.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.MaintenanceManager;
import com.microsoft.azure.management.maintenance.v2018_06_01_preview.implementation.UpdateInner;
import org.joda.time.DateTime;

/**
 * Type representing Update.
 */
public interface Update extends HasInner<UpdateInner>, HasManager<MaintenanceManager> {
    /**
     * @return the impactDurationInSec value.
     */
    Integer impactDurationInSec();

    /**
     * @return the impactType value.
     */
    ImpactType impactType();

    /**
     * @return the maintenanceScope value.
     */
    MaintenanceScope maintenanceScope();

    /**
     * @return the notBefore value.
     */
    DateTime notBefore();

    /**
     * @return the resourceId value.
     */
    String resourceId();

    /**
     * @return the status value.
     */
    UpdateStatus status();

}
