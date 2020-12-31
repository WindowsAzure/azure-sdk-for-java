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
import com.microsoft.azure.management.appplatform.v2020_11_01_preview.implementation.CertificatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Certificates.
 */
public interface Certificates extends SupportsCreating<CertificateResource.DefinitionStages.Blank>, HasInner<CertificatesInner> {
    /**
     * Get the certificate resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param certificateName The name of the certificate resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateResource> getAsync(String resourceGroupName, String serviceName, String certificateName);

    /**
     * Delete the certificate resource.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @param certificateName The name of the certificate resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String certificateName);

    /**
     * List all the certificates of one user.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serviceName The name of the Service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateResource> listAsync(final String resourceGroupName, final String serviceName);

}
