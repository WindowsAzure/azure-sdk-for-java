/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakestore.v2016_11_01;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalakestore.v20161101.models.CreateOrUpdateTrustedIdProviderParameters;
import com.microsoft.azure.management.datalakestore.v20161101.models.TrustedIdProvider;
import com.microsoft.azure.management.datalakestore.v20161101.models.UpdateTrustedIdProviderParameters;
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
 * in TrustedIdProviders.
 */
public interface TrustedIdProviders {
    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TrustedIdProvider&gt; object if successful.
     */
    PagedList<TrustedIdProvider> listByAccount(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TrustedIdProvider>> listByAccountAsync(final String resourceGroupName, final String accountName, final ListOperationCallback<TrustedIdProvider> serviceCallback);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<Page<TrustedIdProvider>> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<ServiceResponse<Page<TrustedIdProvider>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to create or replace the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider createOrUpdate(String resourceGroupName, String accountName, String trustedIdProviderName, CreateOrUpdateTrustedIdProviderParameters parameters);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to create or replace the trusted identity provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> createOrUpdateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, CreateOrUpdateTrustedIdProviderParameters parameters, final ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to create or replace the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> createOrUpdateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, CreateOrUpdateTrustedIdProviderParameters parameters);

    /**
     * Creates or updates the specified trusted identity provider. During update, the trusted identity provider with the specified name will be replaced with this new provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to create or replace the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName, CreateOrUpdateTrustedIdProviderParameters parameters);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider get(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> getAsync(String resourceGroupName, String accountName, String trustedIdProviderName, final ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> getAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Gets the specified Data Lake Store trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to retrieve.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider update(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, final ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);
    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to update the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TrustedIdProvider object if successful.
     */
    TrustedIdProvider update(String resourceGroupName, String accountName, String trustedIdProviderName, UpdateTrustedIdProviderParameters parameters);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to update the trusted identity provider.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, UpdateTrustedIdProviderParameters parameters, final ServiceCallback<TrustedIdProvider> serviceCallback);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to update the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<TrustedIdProvider> updateAsync(String resourceGroupName, String accountName, String trustedIdProviderName, UpdateTrustedIdProviderParameters parameters);

    /**
     * Updates the specified trusted identity provider.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider. This is used for differentiation of providers in the account.
     * @param parameters Parameters supplied to update the trusted identity provider.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TrustedIdProvider object
     */
    Observable<ServiceResponse<TrustedIdProvider>> updateWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName, UpdateTrustedIdProviderParameters parameters);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String trustedIdProviderName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Deletes the specified trusted identity provider from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group.
     * @param accountName The name of the Data Lake Store account.
     * @param trustedIdProviderName The name of the trusted identity provider to delete.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String trustedIdProviderName);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;TrustedIdProvider&gt; object if successful.
     */
    PagedList<TrustedIdProvider> listByAccountNext(final String nextPageLink);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<List<TrustedIdProvider>> listByAccountNextAsync(final String nextPageLink, final ServiceFuture<List<TrustedIdProvider>> serviceFuture, final ListOperationCallback<TrustedIdProvider> serviceCallback);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<Page<TrustedIdProvider>> listByAccountNextAsync(final String nextPageLink);

    /**
     * Lists the Data Lake Store trusted identity providers within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;TrustedIdProvider&gt; object
     */
    Observable<ServiceResponse<Page<TrustedIdProvider>>> listByAccountNextWithServiceResponseAsync(final String nextPageLink);

}
