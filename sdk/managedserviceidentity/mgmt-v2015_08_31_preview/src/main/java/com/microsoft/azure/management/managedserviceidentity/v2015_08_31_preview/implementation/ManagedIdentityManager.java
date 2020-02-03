/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.SystemAssignedIdentities;
import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.Operations;
import com.microsoft.azure.management.managedserviceidentity.v2015_08_31_preview.UserAssignedIdentities;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure ManagedIdentity resource management.
 */
public final class ManagedIdentityManager extends ManagerCore<ManagedIdentityManager, ManagedServiceIdentityClientImpl> {
    private SystemAssignedIdentities systemAssignedIdentities;
    private Operations operations;
    private UserAssignedIdentities userAssignedIdentities;
    /**
    * Get a Configurable instance that can be used to create ManagedIdentityManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ManagedIdentityManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ManagedIdentityManager that exposes ManagedIdentity resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the ManagedIdentityManager
    */
    public static ManagedIdentityManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new ManagedIdentityManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of ManagedIdentityManager that exposes ManagedIdentity resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the ManagedIdentityManager
    */
    public static ManagedIdentityManager authenticate(RestClient restClient, String subscriptionId) {
        return new ManagedIdentityManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ManagedIdentityManager that exposes ManagedIdentity management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing ManagedIdentity management API entry points that work across subscriptions
        */
        ManagedIdentityManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage SystemAssignedIdentities.
     */
    public SystemAssignedIdentities systemAssignedIdentities() {
        if (this.systemAssignedIdentities == null) {
            this.systemAssignedIdentities = new SystemAssignedIdentitiesImpl(this);
        }
        return this.systemAssignedIdentities;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage UserAssignedIdentities.
     */
    public UserAssignedIdentities userAssignedIdentities() {
        if (this.userAssignedIdentities == null) {
            this.userAssignedIdentities = new UserAssignedIdentitiesImpl(this);
        }
        return this.userAssignedIdentities;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ManagedIdentityManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return ManagedIdentityManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private ManagedIdentityManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new ManagedServiceIdentityClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
