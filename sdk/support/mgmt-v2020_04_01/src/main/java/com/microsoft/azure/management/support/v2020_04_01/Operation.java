/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.support.v2020_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.support.v2020_04_01.implementation.SupportManager;
import com.microsoft.azure.management.support.v2020_04_01.implementation.OperationInner;

/**
 * Type representing Operation.
 */
public interface Operation extends HasInner<OperationInner>, HasManager<SupportManager> {
    /**
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

}
