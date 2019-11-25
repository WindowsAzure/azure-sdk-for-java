/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance.v2017_12_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation.ContainerInstanceManager;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation.OperationListResultInner;
import com.microsoft.azure.management.containerinstance.v2017_12_01_preview.implementation.OperationInner;
import java.util.List;

/**
 * Type representing OperationListResult.
 */
public interface OperationListResult extends HasInner<OperationListResultInner>, HasManager<ContainerInstanceManager> {
    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the value value.
     */
    List<OperationInner> value();

}
