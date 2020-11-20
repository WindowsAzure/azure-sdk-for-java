/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlabs.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.DevTestLabsManager;
import com.microsoft.azure.management.devtestlabs.v2016_05_15.implementation.OperationMetadataInner;

/**
 * Type representing OperationMetadata.
 */
public interface OperationMetadata extends HasInner<OperationMetadataInner>, HasManager<DevTestLabsManager> {
    /**
     * @return the display value.
     */
    OperationMetadataDisplay display();

    /**
     * @return the name value.
     */
    String name();

}
