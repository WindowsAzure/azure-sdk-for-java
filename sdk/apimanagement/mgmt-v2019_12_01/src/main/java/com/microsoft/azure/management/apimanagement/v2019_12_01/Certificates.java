/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2019_12_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2019_12_01.implementation.CertificatesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Certificates.
 */
public interface Certificates extends SupportsCreating<CertificateContract.DefinitionStages.Blank>, HasInner<CertificatesInner> {
    /**
     * Lists a collection of all certificates in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateContract> listByServiceAsync(final String resourceGroupName, final String serviceName);

    /**
     * Gets the entity state (Etag) version of the certificate specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param certificateId Identifier of the certificate entity. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String certificateId);

    /**
     * Gets the details of the certificate specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param certificateId Identifier of the certificate entity. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<CertificateContract> getAsync(String resourceGroupName, String serviceName, String certificateId);

    /**
     * Deletes specific certificate.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param certificateId Identifier of the certificate entity. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String certificateId, String ifMatch);

}
