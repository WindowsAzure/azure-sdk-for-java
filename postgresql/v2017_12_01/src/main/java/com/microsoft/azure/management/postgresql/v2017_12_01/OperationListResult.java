/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.PostgreSQLManager;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.OperationListResultInner;
import com.microsoft.azure.management.postgresql.v2017_12_01.implementation.OperationInner;
import java.util.List;

/**
 * Type representing OperationListResult.
 */
public interface OperationListResult extends HasInner<OperationListResultInner>, HasManager<PostgreSQLManager> {
    /**
     * @return the value value.
     */
    List<OperationInner> value();

}
