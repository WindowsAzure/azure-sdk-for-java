/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.QuotaInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azuredatabasemigrationservice.v2018_07_15_preview.implementation.DataMigrationManager;

/**
 * Type representing Quota.
 */
public interface Quota extends HasInner<QuotaInner>, HasManager<DataMigrationManager> {
    /**
     * @return the currentValue value.
     */
    Double currentValue();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the limit value.
     */
    Double limit();

    /**
     * @return the name value.
     */
    QuotaName name();

    /**
     * @return the unit value.
     */
    String unit();

}
