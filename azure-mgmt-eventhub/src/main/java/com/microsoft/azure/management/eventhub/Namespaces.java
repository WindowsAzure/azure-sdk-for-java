/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.eventhub.models.CheckNameAvailability;
import com.microsoft.azure.management.eventhub.models.CheckNameAvailabilityResult;
import com.microsoft.azure.management.eventhub.models.Namespace;
import com.microsoft.azure.management.eventhub.models.NamespaceListResult;
import com.microsoft.azure.management.eventhub.models.NamespaceUpdateParameter;
import com.microsoft.azure.management.eventhub.models.RegenerateKeysParameters;
import com.microsoft.azure.management.eventhub.models.ResourceListKeys;
import com.microsoft.azure.management.eventhub.models.SharedAccessAuthorizationRule;
import com.microsoft.azure.management.eventhub.models.SharedAccessAuthorizationRuleListResult;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Namespaces.
 */
public interface Namespaces {
    /**
     * Check the give namespace name availability.
     *
     * @param parameters Parameters to check availability of the given namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckNameAvailabilityResult object if successful.
     */
    CheckNameAvailabilityResult checkNameAvailabilityMethod(CheckNameAvailability parameters);

    /**
     * Check the give namespace name availability.
     *
     * @param parameters Parameters to check availability of the given namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<CheckNameAvailabilityResult> checkNameAvailabilityMethodAsync(CheckNameAvailability parameters, final ServiceCallback<CheckNameAvailabilityResult> serviceCallback);

    /**
     * Check the give namespace name availability.
     *
     * @param parameters Parameters to check availability of the given namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResult object
     */
    Observable<CheckNameAvailabilityResult> checkNameAvailabilityMethodAsync(CheckNameAvailability parameters);

    /**
     * Check the give namespace name availability.
     *
     * @param parameters Parameters to check availability of the given namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityResult object
     */
    Observable<ServiceResponse<CheckNameAvailabilityResult>> checkNameAvailabilityMethodWithServiceResponseAsync(CheckNameAvailability parameters);

    /**
     * Lists all the available namespaces within a subscription, irrespective of the resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NamespaceListResult object if successful.
     */
    NamespaceListResult list();

    /**
     * Lists all the available namespaces within a subscription, irrespective of the resource groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NamespaceListResult> listAsync(final ServiceCallback<NamespaceListResult> serviceCallback);

    /**
     * Lists all the available namespaces within a subscription, irrespective of the resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NamespaceListResult object
     */
    Observable<NamespaceListResult> listAsync();

    /**
     * Lists all the available namespaces within a subscription, irrespective of the resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NamespaceListResult object
     */
    Observable<ServiceResponse<NamespaceListResult>> listWithServiceResponseAsync();

    /**
     * Lists the available namespaces within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NamespaceListResult object if successful.
     */
    NamespaceListResult listByResourceGroup(String resourceGroupName);

    /**
     * Lists the available namespaces within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<NamespaceListResult> listByResourceGroupAsync(String resourceGroupName, final ServiceCallback<NamespaceListResult> serviceCallback);

    /**
     * Lists the available namespaces within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NamespaceListResult object
     */
    Observable<NamespaceListResult> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists the available namespaces within a resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NamespaceListResult object
     */
    Observable<ServiceResponse<NamespaceListResult>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for creating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Namespace object if successful.
     */
    Namespace createOrUpdate(String resourceGroupName, String namespaceName, Namespace parameters);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for creating a namespace resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Namespace> createOrUpdateAsync(String resourceGroupName, String namespaceName, Namespace parameters, final ServiceCallback<Namespace> serviceCallback);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for creating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<Namespace> createOrUpdateAsync(String resourceGroupName, String namespaceName, Namespace parameters);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for creating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<ServiceResponse<Namespace>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String namespaceName, Namespace parameters);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String namespaceName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String namespaceName);

    /**
     * Deletes an existing namespace. This operation also removes all associated resources under the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Namespace object if successful.
     */
    Namespace get(String resourceGroupName, String namespaceName);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Namespace> getAsync(String resourceGroupName, String namespaceName, final ServiceCallback<Namespace> serviceCallback);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<Namespace> getAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets the description of the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<ServiceResponse<Namespace>> getWithServiceResponseAsync(String resourceGroupName, String namespaceName);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for updating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the Namespace object if successful.
     */
    Namespace update(String resourceGroupName, String namespaceName, NamespaceUpdateParameter parameters);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for updating a namespace resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Namespace> updateAsync(String resourceGroupName, String namespaceName, NamespaceUpdateParameter parameters, final ServiceCallback<Namespace> serviceCallback);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for updating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<Namespace> updateAsync(String resourceGroupName, String namespaceName, NamespaceUpdateParameter parameters);

    /**
     * Creates or updates a namespace. Once created, this namespace's resource manifest is immutable. This operation is idempotent.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param parameters Parameters for updating a namespace resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the Namespace object
     */
    Observable<ServiceResponse<Namespace>> updateWithServiceResponseAsync(String resourceGroupName, String namespaceName, NamespaceUpdateParameter parameters);

    /**
     * Gets a list of authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRuleListResult object if successful.
     */
    SharedAccessAuthorizationRuleListResult listAuthorizationRules(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRuleListResult> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName, final ServiceCallback<SharedAccessAuthorizationRuleListResult> serviceCallback);

    /**
     * Gets a list of authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRuleListResult object
     */
    Observable<SharedAccessAuthorizationRuleListResult> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets a list of authorization rules for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRuleListResult object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRuleListResult>> listAuthorizationRulesWithServiceResponseAsync(String resourceGroupName, String namespaceName);

    /**
     * Creates or updates an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRule object if successful.
     */
    SharedAccessAuthorizationRule createOrUpdateAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Creates or updates an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRule> createOrUpdateAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, SharedAccessAuthorizationRule parameters, final ServiceCallback<SharedAccessAuthorizationRule> serviceCallback);

    /**
     * Creates or updates an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<SharedAccessAuthorizationRule> createOrUpdateAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Creates or updates an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRule>> createOrUpdateAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Deletes an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Deletes an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Deletes an authorization rule for a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a namespace by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRule object if successful.
     */
    SharedAccessAuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a namespace by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, final ServiceCallback<SharedAccessAuthorizationRule> serviceCallback);

    /**
     * Gets an authorization rule for a namespace by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<SharedAccessAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets an authorization rule for a namespace by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRule>> getAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListKeys object if successful.
     */
    ResourceListKeys listKeys(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, final ServiceCallback<ResourceListKeys> serviceCallback);

    /**
     * Gets the primary and secondary connection strings for the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Gets the primary and secondary connection strings for the namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ServiceResponse<ResourceListKeys>> listKeysWithServiceResponseAsync(String resourceGroupName, String namespaceName, String authorizationRuleName);

    /**
     * Regenerates the primary or secondary connection strings for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListKeys object if successful.
     */
    ResourceListKeys regenerateKeys(String resourceGroupName, String namespaceName, String authorizationRuleName, RegenerateKeysParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, RegenerateKeysParameters parameters, final ServiceCallback<ResourceListKeys> serviceCallback);

    /**
     * Regenerates the primary or secondary connection strings for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, RegenerateKeysParameters parameters);

    /**
     * Regenerates the primary or secondary connection strings for the specified namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters required to regenerate the connection string.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ServiceResponse<ResourceListKeys>> regenerateKeysWithServiceResponseAsync(String resourceGroupName, String namespaceName, String authorizationRuleName, RegenerateKeysParameters parameters);

}
