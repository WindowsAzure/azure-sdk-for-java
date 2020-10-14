/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.azurestackhci.v2020-10-01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.azurestackhci.v2020-10-01.implementation.AzureStackHCIManager;
import com.microsoft.azure.management.azurestackhci.v2020-10-01.implementation.AvailableOperationsInner;
import java.util.List;

/**
 * Type representing AvailableOperations.
 */
public interface AvailableOperations extends HasInner<AvailableOperationsInner>, HasManager<AzureStackHCIManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<OperationDetail> value();

}
