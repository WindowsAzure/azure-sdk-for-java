/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementManager;
import com.microsoft.azure.management.apimanagement.v2019_01_01.implementation.ApiManagementServiceGetSsoTokenResultInner;

/**
 * Type representing ApiManagementServiceGetSsoTokenResult.
 */
public interface ApiManagementServiceGetSsoTokenResult extends HasInner<ApiManagementServiceGetSsoTokenResultInner>, HasManager<ApiManagementManager> {
    /**
     * @return the redirectUri value.
     */
    String redirectUri();

}
