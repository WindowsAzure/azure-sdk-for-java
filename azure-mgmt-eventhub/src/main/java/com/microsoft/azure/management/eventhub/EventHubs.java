/**
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.1.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.eventhub.models.EventHub;
import com.microsoft.azure.management.eventhub.models.EventHubListResult;
import com.microsoft.azure.management.eventhub.models.RegenerateKeysParameters;
import com.microsoft.azure.management.eventhub.models.ResourceListKeys;
import com.microsoft.azure.management.eventhub.models.SharedAccessAuthorizationRule;
import com.microsoft.azure.management.eventhub.models.SharedAccessAuthorizationRuleListResult;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in EventHubs.
 */
public interface EventHubs {
    /**
     * Gets all the Event Hubs in a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventHubListResult object if successful.
     */
    EventHubListResult listByNamespace(String resourceGroupName, String namespaceName);

    /**
     * Gets all the Event Hubs in a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EventHubListResult> listByNamespaceAsync(String resourceGroupName, String namespaceName, final ServiceCallback<EventHubListResult> serviceCallback);

    /**
     * Gets all the Event Hubs in a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHubListResult object
     */
    Observable<EventHubListResult> listByNamespaceAsync(String resourceGroupName, String namespaceName);

    /**
     * Gets all the Event Hubs in a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHubListResult object
     */
    Observable<ServiceResponse<EventHubListResult>> listByNamespaceWithServiceResponseAsync(String resourceGroupName, String namespaceName);

    /**
     * Creates or updates a new Event Hub as a nested resource within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventHub object if successful.
     */
    EventHub createOrUpdate(String resourceGroupName, String namespaceName, String eventHubName, EventHub parameters);

    /**
     * Creates or updates a new Event Hub as a nested resource within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EventHub> createOrUpdateAsync(String resourceGroupName, String namespaceName, String eventHubName, EventHub parameters, final ServiceCallback<EventHub> serviceCallback);

    /**
     * Creates or updates a new Event Hub as a nested resource within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHub object
     */
    Observable<EventHub> createOrUpdateAsync(String resourceGroupName, String namespaceName, String eventHubName, EventHub parameters);

    /**
     * Creates or updates a new Event Hub as a nested resource within a namespace.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param parameters Parameters supplied to create an Event Hub resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHub object
     */
    Observable<ServiceResponse<EventHub>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, EventHub parameters);

    /**
     * Deletes an Event Hub from the specified namespace and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void delete(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Deletes an Event Hub from the specified namespace and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAsync(String resourceGroupName, String namespaceName, String eventHubName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes an Event Hub from the specified namespace and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Deletes an Event Hub from the specified namespace and resource group.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventHub object if successful.
     */
    EventHub get(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<EventHub> getAsync(String resourceGroupName, String namespaceName, String eventHubName, final ServiceCallback<EventHub> serviceCallback);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHub object
     */
    Observable<EventHub> getAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets an Event Hubs description for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventHub object
     */
    Observable<ServiceResponse<EventHub>> getWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRuleListResult object if successful.
     */
    SharedAccessAuthorizationRuleListResult listAuthorizationRules(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRuleListResult> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName, String eventHubName, final ServiceCallback<SharedAccessAuthorizationRuleListResult> serviceCallback);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRuleListResult object
     */
    Observable<SharedAccessAuthorizationRuleListResult> listAuthorizationRulesAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Gets the authorization rules for an Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRuleListResult object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRuleListResult>> listAuthorizationRulesWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName);

    /**
     * Creates or updates an authorization rule for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRule object if successful.
     */
    SharedAccessAuthorizationRule createOrUpdateAuthorizationRule(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Creates or updates an authorization rule for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRule> createOrUpdateAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, SharedAccessAuthorizationRule parameters, final ServiceCallback<SharedAccessAuthorizationRule> serviceCallback);

    /**
     * Creates or updates an authorization rule for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<SharedAccessAuthorizationRule> createOrUpdateAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Creates or updates an authorization rule for the specified Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters The shared access authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRule>> createOrUpdateAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, SharedAccessAuthorizationRule parameters);

    /**
     * Gets an authorization rule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SharedAccessAuthorizationRule object if successful.
     */
    SharedAccessAuthorizationRule getAuthorizationRule(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets an authorization rule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<SharedAccessAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, final ServiceCallback<SharedAccessAuthorizationRule> serviceCallback);

    /**
     * Gets an authorization rule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<SharedAccessAuthorizationRule> getAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets an authorization rule for an Event Hub by rule name.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SharedAccessAuthorizationRule object
     */
    Observable<ServiceResponse<SharedAccessAuthorizationRule>> getAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Deletes an Event Hubs authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    void deleteAuthorizationRule(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Deletes an Event Hubs authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<Void> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, final ServiceCallback<Void> serviceCallback);

    /**
     * Deletes an Event Hubs authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<Void> deleteAuthorizationRuleAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Deletes an Event Hubs authorization rule.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    Observable<ServiceResponse<Void>> deleteAuthorizationRuleWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListKeys object if successful.
     */
    ResourceListKeys listKeys(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, final ServiceCallback<ResourceListKeys> serviceCallback);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ResourceListKeys> listKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Gets the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ServiceResponse<ResourceListKeys>> listKeysWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws RestException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ResourceListKeys object if successful.
     */
    ResourceListKeys regenerateKeys(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateKeysParameters parameters);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    ServiceFuture<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateKeysParameters parameters, final ServiceCallback<ResourceListKeys> serviceCallback);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ResourceListKeys> regenerateKeysAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateKeysParameters parameters);

    /**
     * Regenerates the ACS and SAS connection strings for the Event Hub.
     *
     * @param resourceGroupName Name of the Resource group within the Azure subscription.
     * @param namespaceName The namespace name
     * @param eventHubName The eventhub name
     * @param authorizationRuleName The authorizationrule name.
     * @param parameters Parameters supplied to regenerate the authorization rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ResourceListKeys object
     */
    Observable<ServiceResponse<ResourceListKeys>> regenerateKeysWithServiceResponseAsync(String resourceGroupName, String namespaceName, String eventHubName, String authorizationRuleName, RegenerateKeysParameters parameters);

}
