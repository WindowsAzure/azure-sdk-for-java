/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.v2019_10_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyTrackedResources;
import com.microsoft.azure.management.policyinsights.v2019_10_01.Remediations;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyEvents;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyStates;
import com.microsoft.azure.management.policyinsights.v2019_10_01.Operations;
import com.microsoft.azure.management.policyinsights.v2019_10_01.PolicyMetadatas;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure PolicyInsights resource management.
 */
public final class PolicyInsightsManager extends ManagerCore<PolicyInsightsManager, PolicyInsightsClientImpl> {
    private PolicyTrackedResources policyTrackedResources;
    private Remediations remediations;
    private PolicyEvents policyEvents;
    private PolicyStates policyStates;
    private Operations operations;
    private PolicyMetadatas policyMetadatas;
    /**
    * Get a Configurable instance that can be used to create PolicyInsightsManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new PolicyInsightsManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of PolicyInsightsManager that exposes PolicyInsights resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the PolicyInsightsManager
    */
    public static PolicyInsightsManager authenticate(AzureTokenCredentials credentials) {
        return new PolicyInsightsManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of PolicyInsightsManager that exposes PolicyInsights resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the PolicyInsightsManager
    */
    public static PolicyInsightsManager authenticate(RestClient restClient) {
        return new PolicyInsightsManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of PolicyInsightsManager that exposes PolicyInsights management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing PolicyInsights management API entry points that work across subscriptions
        */
        PolicyInsightsManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage PolicyTrackedResources.
     */
    public PolicyTrackedResources policyTrackedResources() {
        if (this.policyTrackedResources == null) {
            this.policyTrackedResources = new PolicyTrackedResourcesImpl(this);
        }
        return this.policyTrackedResources;
    }

    /**
     * @return Entry point to manage Remediations.
     */
    public Remediations remediations() {
        if (this.remediations == null) {
            this.remediations = new RemediationsImpl(this);
        }
        return this.remediations;
    }

    /**
     * @return Entry point to manage PolicyEvents.
     */
    public PolicyEvents policyEvents() {
        if (this.policyEvents == null) {
            this.policyEvents = new PolicyEventsImpl(this);
        }
        return this.policyEvents;
    }

    /**
     * @return Entry point to manage PolicyStates.
     */
    public PolicyStates policyStates() {
        if (this.policyStates == null) {
            this.policyStates = new PolicyStatesImpl(this);
        }
        return this.policyStates;
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
     * @return Entry point to manage PolicyMetadatas.
     */
    public PolicyMetadatas policyMetadatas() {
        if (this.policyMetadatas == null) {
            this.policyMetadatas = new PolicyMetadatasImpl(this);
        }
        return this.policyMetadatas;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public PolicyInsightsManager authenticate(AzureTokenCredentials credentials) {
           return PolicyInsightsManager.authenticate(buildRestClient(credentials));
        }
     }
    private PolicyInsightsManager(RestClient restClient) {
        super(
            restClient,
            null,
            new PolicyInsightsClientImpl(restClient));
    }
}
