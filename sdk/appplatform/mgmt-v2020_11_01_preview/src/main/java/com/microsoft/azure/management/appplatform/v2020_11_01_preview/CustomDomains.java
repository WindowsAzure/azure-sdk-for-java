/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appplatform.v2020_11_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.CustomDomainsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing CustomDomains.
 */
public interface CustomDomains extends SupportsCreating<CustomDomainResource.DefinitionStages.Blank>, HasInner<CustomDomainsInner> {
    /**
     * Get the custom domain of one lifecycle application.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param domainName The name of the custom domain resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomainResource> getAsync(String resourceGroupName, String serviceName, String appName, String domainName);

    /**
     * List the custom domains of one lifecycle application.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CustomDomainResource> listAsync(final String resourceGroupName, final String serviceName, final String appName);

    /**
     * Delete the custom domain of one lifecycle application.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param appName The name of the App resource.
     * @param domainName The name of the custom domain resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String appName, String domainName);

}
