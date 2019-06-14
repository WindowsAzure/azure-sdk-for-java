/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiDiagnosticsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApiDiagnostics.
 */
public interface ApiDiagnostics extends SupportsCreating<ApiDiagnosticContract.DefinitionStages.Blank>, HasInner<ApiDiagnosticsInner> {
    /**
     * Gets the entity state (Etag) version of the Diagnostic for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId);

    /**
     * Gets the details of the Diagnostic for an API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiDiagnosticContract> getAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId);

    /**
     * Lists all diagnostics of an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApiDiagnosticContract> listByServiceAsync(final String resourceGroupName, final String serviceName, final String apiId);

    /**
     * Deletes the specified Diagnostic from an API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param diagnosticId Diagnostic identifier. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String diagnosticId, String ifMatch);

}
