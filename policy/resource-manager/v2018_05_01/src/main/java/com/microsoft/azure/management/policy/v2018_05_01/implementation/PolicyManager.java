/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policy.v2018_05_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.policy.v2018_05_01.PolicyAssignments;
import com.microsoft.azure.management.policy.v2018_05_01.PolicyDefinitions;
import com.microsoft.azure.management.policy.v2018_05_01.PolicySetDefinitions;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Authorization resource management.
 */
public final class PolicyManager extends ManagerCore<PolicyManager, PolicyClientImpl> {
    private PolicyAssignments policyAssignments;
    private PolicyDefinitions policyDefinitions;
    private PolicySetDefinitions policySetDefinitions;
    /**
    * Get a Configurable instance that can be used to create PolicyManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new PolicyManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of PolicyManager that exposes Authorization resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the PolicyManager
    */
    public static PolicyManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new PolicyManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of PolicyManager that exposes Authorization resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the PolicyManager
    */
    public static PolicyManager authenticate(RestClient restClient, String subscriptionId) {
        return new PolicyManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of PolicyManager that exposes Authorization management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Authorization management API entry points that work across subscriptions
        */
        PolicyManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage PolicyAssignments.
     */
    public PolicyAssignments policyAssignments() {
        if (this.policyAssignments == null) {
            this.policyAssignments = new PolicyAssignmentsImpl(this);
        }
        return this.policyAssignments;
    }

    /**
     * @return Entry point to manage PolicyDefinitions.
     */
    public PolicyDefinitions policyDefinitions() {
        if (this.policyDefinitions == null) {
            this.policyDefinitions = new PolicyDefinitionsImpl(this);
        }
        return this.policyDefinitions;
    }

    /**
     * @return Entry point to manage PolicySetDefinitions.
     */
    public PolicySetDefinitions policySetDefinitions() {
        if (this.policySetDefinitions == null) {
            this.policySetDefinitions = new PolicySetDefinitionsImpl(this);
        }
        return this.policySetDefinitions;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public PolicyManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return PolicyManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private PolicyManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new PolicyClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
