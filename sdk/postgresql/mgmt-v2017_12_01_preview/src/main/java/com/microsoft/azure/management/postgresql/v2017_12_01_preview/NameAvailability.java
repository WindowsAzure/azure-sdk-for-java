/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation.DBforPostgreSQLManager;
import com.microsoft.azure.management.postgresql.v2017_12_01_preview.implementation.NameAvailabilityInner;

/**
 * Type representing NameAvailability.
 */
public interface NameAvailability extends HasInner<NameAvailabilityInner>, HasManager<DBforPostgreSQLManager> {
    /**
     * @return the message value.
     */
    String message();

    /**
     * @return the nameAvailable value.
     */
    Boolean nameAvailable();

    /**
     * @return the reason value.
     */
    String reason();

}
