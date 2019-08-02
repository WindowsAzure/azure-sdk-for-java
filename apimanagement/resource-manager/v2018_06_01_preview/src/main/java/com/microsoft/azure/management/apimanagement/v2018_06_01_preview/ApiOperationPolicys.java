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
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation.ApiOperationPolicysInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ApiOperationPolicys.
 */
public interface ApiOperationPolicys extends SupportsCreating<OperationApiPolicyContract.DefinitionStages.Blank>, HasInner<ApiOperationPolicysInner> {
    /**
     * Get the list of policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<PolicyCollection> listByOperationAsync(String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Gets the entity state (Etag) version of the API operation policy specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable getEntityTagAsync(String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Get the policy configuration at the API Operation level.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<OperationApiPolicyContract> getAsync(String resourceGroupName, String serviceName, String apiId, String operationId);

    /**
     * Deletes the policy configuration at the Api Operation.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API revision identifier. Must be unique in the current API Management service instance. Non-current revision has ;rev=n as a suffix where n is the revision number.
     * @param operationId Operation identifier within an API. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceName, String apiId, String operationId, String ifMatch);

}
