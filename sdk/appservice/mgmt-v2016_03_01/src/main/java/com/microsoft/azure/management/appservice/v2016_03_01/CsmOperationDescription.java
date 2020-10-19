/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2016_03_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.WebManager;
import com.microsoft.azure.management.appservice.v2016_03_01.implementation.CsmOperationDescriptionInner;

/**
 * Type representing CsmOperationDescription.
 */
public interface CsmOperationDescription extends HasInner<CsmOperationDescriptionInner>, HasManager<WebManager> {
    /**
     * @return the display value.
     */
    CsmOperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the origin value.
     */
    String origin();

    /**
     * @return the properties value.
     */
    CsmOperationDescriptionProperties properties();

}
