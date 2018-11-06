/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.authorization.v2018_09_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.ClassicAdministrators;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.ProviderOperationsMetadatas;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleAssignments;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.Permissions;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.RoleDefinitions;
import com.microsoft.azure.management.authorization.v2018_09_01_preview.DenyAssignments;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Authorization resource management.
 */
public final class AuthorizationManager extends ManagerCore<AuthorizationManager, AuthorizationManagementClientImpl> {
    private ClassicAdministrators classicAdministrators;
    private ProviderOperationsMetadatas providerOperationsMetadatas;
    private RoleAssignments roleAssignments;
    private Permissions permissions;
    private RoleDefinitions roleDefinitions;
    private DenyAssignments denyAssignments;
    /**
    * Get a Configurable instance that can be used to create AuthorizationManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new AuthorizationManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of AuthorizationManager that exposes Authorization resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the AuthorizationManager
    */
    public static AuthorizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new AuthorizationManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of AuthorizationManager that exposes Authorization resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the AuthorizationManager
    */
    public static AuthorizationManager authenticate(RestClient restClient, String subscriptionId) {
        return new AuthorizationManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of AuthorizationManager that exposes Authorization management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Authorization management API entry points that work across subscriptions
        */
        AuthorizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ClassicAdministrators.
     */
    public ClassicAdministrators classicAdministrators() {
        if (this.classicAdministrators == null) {
            this.classicAdministrators = new ClassicAdministratorsImpl(this);
        }
        return this.classicAdministrators;
    }

    /**
     * @return Entry point to manage ProviderOperationsMetadatas.
     */
    public ProviderOperationsMetadatas providerOperationsMetadatas() {
        if (this.providerOperationsMetadatas == null) {
            this.providerOperationsMetadatas = new ProviderOperationsMetadatasImpl(this);
        }
        return this.providerOperationsMetadatas;
    }

    /**
     * @return Entry point to manage RoleAssignments.
     */
    public RoleAssignments roleAssignments() {
        if (this.roleAssignments == null) {
            this.roleAssignments = new RoleAssignmentsImpl(this);
        }
        return this.roleAssignments;
    }

    /**
     * @return Entry point to manage Permissions.
     */
    public Permissions permissions() {
        if (this.permissions == null) {
            this.permissions = new PermissionsImpl(this);
        }
        return this.permissions;
    }

    /**
     * @return Entry point to manage RoleDefinitions.
     */
    public RoleDefinitions roleDefinitions() {
        if (this.roleDefinitions == null) {
            this.roleDefinitions = new RoleDefinitionsImpl(this);
        }
        return this.roleDefinitions;
    }

    /**
     * @return Entry point to manage DenyAssignments.
     */
    public DenyAssignments denyAssignments() {
        if (this.denyAssignments == null) {
            this.denyAssignments = new DenyAssignmentsImpl(this);
        }
        return this.denyAssignments;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public AuthorizationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return AuthorizationManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private AuthorizationManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AuthorizationManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
