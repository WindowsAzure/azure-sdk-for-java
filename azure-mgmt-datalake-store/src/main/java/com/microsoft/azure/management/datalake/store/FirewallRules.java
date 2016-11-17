/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store;

import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datalake.store.models.FirewallRule;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.util.List;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in FirewallRules.
 */
public interface FirewallRules {
    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account to which to add the firewall rule.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @return the FirewallRule object if successful.
     */
    FirewallRule createOrUpdate(String resourceGroupName, String accountName, String firewallRuleName, FirewallRule parameters);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account to which to add the firewall rule.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<FirewallRule> createOrUpdateAsync(String resourceGroupName, String accountName, String firewallRuleName, FirewallRule parameters, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account to which to add the firewall rule.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> createOrUpdateAsync(String resourceGroupName, String accountName, String firewallRuleName, FirewallRule parameters);

    /**
     * Creates or updates the specified firewall rule. During update, the firewall rule with the specified name will be replaced with this new firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account to which to add the firewall rule.
     * @param firewallRuleName The name of the firewall rule to create or update.
     * @param parameters Parameters supplied to create or update the firewall rule.
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName, FirewallRule parameters);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to delete the firewall rule.
     * @param firewallRuleName The name of the firewall rule to delete.
     */
    void delete(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to delete the firewall rule.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<Void> deleteAsync(String resourceGroupName, String accountName, String firewallRuleName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to delete the firewall rule.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Deletes the specified firewall rule from the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to delete the firewall rule.
     * @param firewallRuleName The name of the firewall rule to delete.
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rule.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @return the FirewallRule object if successful.
     */
    FirewallRule get(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rule.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<FirewallRule> getAsync(String resourceGroupName, String accountName, String firewallRuleName, final ServiceCallback<FirewallRule> serviceCallback);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rule.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @return the observable to the FirewallRule object
     */
    Observable<FirewallRule> getAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Gets the specified Data Lake Store firewall rule.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rule.
     * @param firewallRuleName The name of the firewall rule to retrieve.
     * @return the observable to the FirewallRule object
     */
    Observable<ServiceResponse<FirewallRule>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String firewallRuleName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rules.
     * @return the PagedList&lt;FirewallRule&gt; object if successful.
     */
    PagedList<FirewallRule> listByAccount(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rules.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<List<FirewallRule>> listByAccountAsync(final String resourceGroupName, final String accountName, final ListOperationCallback<FirewallRule> serviceCallback);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rules.
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<Page<FirewallRule>> listByAccountAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param resourceGroupName The name of the Azure resource group that contains the Data Lake Store account.
     * @param accountName The name of the Data Lake Store account from which to get the firewall rules.
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<ServiceResponse<Page<FirewallRule>>> listByAccountWithServiceResponseAsync(final String resourceGroupName, final String accountName);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the PagedList&lt;FirewallRule&gt; object if successful.
     */
    PagedList<FirewallRule> listByAccountNext(final String nextPageLink);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    ServiceCall<List<FirewallRule>> listByAccountNextAsync(final String nextPageLink, final ServiceCall<List<FirewallRule>> serviceCall, final ListOperationCallback<FirewallRule> serviceCallback);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<Page<FirewallRule>> listByAccountNextAsync(final String nextPageLink);

    /**
     * Lists the Data Lake Store firewall rules within the specified Data Lake Store account.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the PagedList&lt;FirewallRule&gt; object
     */
    Observable<ServiceResponse<Page<FirewallRule>>> listByAccountNextWithServiceResponseAsync(final String nextPageLink);

}
