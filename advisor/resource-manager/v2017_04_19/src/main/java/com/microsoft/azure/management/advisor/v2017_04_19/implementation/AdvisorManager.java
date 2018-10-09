/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2017_04_19.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.advisor.v2017_04_19.Configurations;
import com.microsoft.azure.management.advisor.v2017_04_19.Recommendations;
import com.microsoft.azure.management.advisor.v2017_04_19.Operations;
import com.microsoft.azure.management.advisor.v2017_04_19.Suppressions;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Advisor resource management.
 */
public final class AdvisorManager extends ManagerCore<AdvisorManager, AdvisorManagementClientImpl> {
    private Configurations configurations;
    private Recommendations recommendations;
    private Operations operations;
    private Suppressions suppressions;
    /**
    * Get a Configurable instance that can be used to create AdvisorManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new AdvisorManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of AdvisorManager that exposes Advisor resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the AdvisorManager
    */
    public static AdvisorManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new AdvisorManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of AdvisorManager that exposes Advisor resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the AdvisorManager
    */
    public static AdvisorManager authenticate(RestClient restClient, String subscriptionId) {
        return new AdvisorManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of AdvisorManager that exposes Advisor management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Advisor management API entry points that work across subscriptions
        */
        AdvisorManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(this);
        }
        return this.configurations;
    }

    /**
     * @return Entry point to manage Recommendations.
     */
    public Recommendations recommendations() {
        if (this.recommendations == null) {
            this.recommendations = new RecommendationsImpl(this);
        }
        return this.recommendations;
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
     * @return Entry point to manage Suppressions.
     */
    public Suppressions suppressions() {
        if (this.suppressions == null) {
            this.suppressions = new SuppressionsImpl(this);
        }
        return this.suppressions;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public AdvisorManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return AdvisorManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private AdvisorManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new AdvisorManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
