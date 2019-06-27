/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcehealth.v2015_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resourcehealth.v2015_01_01.implementation.AvailabilityStatusInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resourcehealth.v2015_01_01.implementation.ResourceHealthManager;

/**
 * Type representing AvailabilityStatus.
 */
public interface AvailabilityStatus extends HasInner<AvailabilityStatusInner>, HasManager<ResourceHealthManager> {
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
    AvailabilityStatusProperties properties();

    /**
     * @return the type value.
     */
    String type();

}
