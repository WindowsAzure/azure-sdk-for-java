/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.avs.v2020_03_20;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.avs.v20200320.models.ExpressRouteAuthorization;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Authorizations.
 */
public interface Authorizations {
    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRouteAuthorization&gt; object if successful.
     */
    PagedList<ExpressRouteAuthorization> list(final String resourceGroupName, final String privateCloudName);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ExpressRouteAuthorization>> listAsync(final String resourceGroupName, final String privateCloudName, final ListOperationCallback<ExpressRouteAuthorization> serviceCallback);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteAuthorization&gt; object
     */
    Observable<Page<ExpressRouteAuthorization>> listAsync(final String resourceGroupName, final String privateCloudName);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteAuthorization&gt; object
     */
    Observable<ServiceResponse<Page<ExpressRouteAuthorization>>> listWithServiceResponseAsync(final String resourceGroupName, final String privateCloudName);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteAuthorization object if successful.
     */
    ExpressRouteAuthorization get(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpressRouteAuthorization> getAsync(String resourceGroupName, String privateCloudName, String authorizationName, final ServiceCallback<ExpressRouteAuthorization> serviceCallback);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ExpressRouteAuthorization> getAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Get an ExpressRoute Circuit Authorization by name in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ServiceResponse<ExpressRouteAuthorization>> getWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteAuthorization object if successful.
     */
    ExpressRouteAuthorization createOrUpdate(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpressRouteAuthorization> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String authorizationName, final ServiceCallback<ExpressRouteAuthorization> serviceCallback);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ExpressRouteAuthorization> createOrUpdateAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ServiceResponse<ExpressRouteAuthorization>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ExpressRouteAuthorization object if successful.
     */
    ExpressRouteAuthorization beginCreateOrUpdate(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ExpressRouteAuthorization> beginCreateOrUpdateAsync(String resourceGroupName, String privateCloudName, String authorizationName, final ServiceCallback<ExpressRouteAuthorization> serviceCallback);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ExpressRouteAuthorization> beginCreateOrUpdateAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Create or update an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName The name of the private cloud.
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ExpressRouteAuthorization object
     */
    Observable<ServiceResponse<ExpressRouteAuthorization>> beginCreateOrUpdateWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String privateCloudName, String authorizationName, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void beginDelete(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> beginDeleteAsync(String resourceGroupName, String privateCloudName, String authorizationName, final ServiceCallback<Void> serviceCallback);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> beginDeleteAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * Delete an ExpressRoute Circuit Authorization in a private cloud.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param privateCloudName Name of the private cloud
     * @param authorizationName Name of the ExpressRoute Circuit Authorization in the private cloud
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> beginDeleteWithServiceResponseAsync(String resourceGroupName, String privateCloudName, String authorizationName);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ExpressRouteAuthorization&gt; object if successful.
     */
    PagedList<ExpressRouteAuthorization> listNext(final String nextPageLink);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<ExpressRouteAuthorization>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ExpressRouteAuthorization>> serviceFuture, final ListOperationCallback<ExpressRouteAuthorization> serviceCallback);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteAuthorization&gt; object
     */
    Observable<Page<ExpressRouteAuthorization>> listNextAsync(final String nextPageLink);

    /**
     * List ExpressRoute Circuit Authorizations in a private cloud.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ExpressRouteAuthorization&gt; object
     */
    Observable<ServiceResponse<Page<ExpressRouteAuthorization>>> listNextWithServiceResponseAsync(final String nextPageLink);

}
