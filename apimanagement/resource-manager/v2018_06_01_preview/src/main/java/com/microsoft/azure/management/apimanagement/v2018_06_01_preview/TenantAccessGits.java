/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.TenantAccessGitsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TenantAccessGits.
 */
public interface TenantAccessGits extends HasInner<TenantAccessGitsInner> {
    /**
     * Gets the Git access configuration for the tenant.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<AccessInformationContract> getAsync(String resourceGroupName, String serviceName);

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName);

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName);

}
