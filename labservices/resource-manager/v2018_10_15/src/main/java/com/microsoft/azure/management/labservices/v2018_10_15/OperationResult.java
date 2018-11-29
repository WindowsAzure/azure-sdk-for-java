/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.labservices.v2018_10_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.OperationResultInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.labservices.v2018_10_15.implementation.LabServicesManager;

/**
 * Type representing OperationResult.
 */
public interface OperationResult extends HasInner<OperationResultInner>, HasManager<LabServicesManager> {
    /**
     * @return the error value.
     */
    OperationError error();

    /**
     * @return the status value.
     */
    String status();

}
