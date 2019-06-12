/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.TagResourceContractInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiManagementManager;

/**
 * Type representing TagResourceContract.
 */
public interface TagResourceContract extends HasInner<TagResourceContractInner>, HasManager<ApiManagementManager> {
    /**
     * @return the api value.
     */
    ApiTagResourceContractProperties api();

    /**
     * @return the operation value.
     */
    OperationTagResourceContractProperties operation();

    /**
     * @return the product value.
     */
    ProductTagResourceContractProperties product();

    /**
     * @return the tag value.
     */
    TagTagResourceContractProperties tag();

}
