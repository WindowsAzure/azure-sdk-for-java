/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.frontdoor.v2020_05_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.frontdoor.v2020_05_01.NetworkExperimentProfiles;
import com.microsoft.azure.management.frontdoor.v2020_05_01.PreconfiguredEndpoints;
import com.microsoft.azure.management.frontdoor.v2020_05_01.Experiments;
import com.microsoft.azure.management.frontdoor.v2020_05_01.Reports;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorNameAvailabilitys;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoorNameAvailabilityWithSubscriptions;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontDoors;
import com.microsoft.azure.management.frontdoor.v2020_05_01.FrontendEndpoints;
import com.microsoft.azure.management.frontdoor.v2020_05_01.Endpoints;
import com.microsoft.azure.management.frontdoor.v2020_05_01.RulesEngines;
import com.microsoft.azure.management.frontdoor.v2020_05_01.Policies;
import com.microsoft.azure.management.frontdoor.v2020_05_01.ManagedRuleSets;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Network resource management.
 */
public final class NetworkManager extends ManagerCore<NetworkManager, FrontDoorManagementClientImpl> {
    private NetworkExperimentProfiles networkExperimentProfiles;
    private PreconfiguredEndpoints preconfiguredEndpoints;
    private Experiments experiments;
    private Reports reports;
    private FrontDoorNameAvailabilitys frontDoorNameAvailabilitys;
    private FrontDoorNameAvailabilityWithSubscriptions frontDoorNameAvailabilityWithSubscriptions;
    private FrontDoors frontDoors;
    private FrontendEndpoints frontendEndpoints;
    private Endpoints endpoints;
    private RulesEngines rulesEngines;
    private Policies policies;
    private ManagedRuleSets managedRuleSets;
    /**
    * Get a Configurable instance that can be used to create NetworkManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new NetworkManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new NetworkManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of NetworkManager that exposes Network resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the NetworkManager
    */
    public static NetworkManager authenticate(RestClient restClient, String subscriptionId) {
        return new NetworkManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of NetworkManager that exposes Network management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Network management API entry points that work across subscriptions
        */
        NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage NetworkExperimentProfiles.
     */
    public NetworkExperimentProfiles networkExperimentProfiles() {
        if (this.networkExperimentProfiles == null) {
            this.networkExperimentProfiles = new NetworkExperimentProfilesImpl(this);
        }
        return this.networkExperimentProfiles;
    }

    /**
     * @return Entry point to manage PreconfiguredEndpoints.
     */
    public PreconfiguredEndpoints preconfiguredEndpoints() {
        if (this.preconfiguredEndpoints == null) {
            this.preconfiguredEndpoints = new PreconfiguredEndpointsImpl(this);
        }
        return this.preconfiguredEndpoints;
    }

    /**
     * @return Entry point to manage Experiments.
     */
    public Experiments experiments() {
        if (this.experiments == null) {
            this.experiments = new ExperimentsImpl(this);
        }
        return this.experiments;
    }

    /**
     * @return Entry point to manage Reports.
     */
    public Reports reports() {
        if (this.reports == null) {
            this.reports = new ReportsImpl(this);
        }
        return this.reports;
    }

    /**
     * @return Entry point to manage FrontDoorNameAvailabilitys.
     */
    public FrontDoorNameAvailabilitys frontDoorNameAvailabilitys() {
        if (this.frontDoorNameAvailabilitys == null) {
            this.frontDoorNameAvailabilitys = new FrontDoorNameAvailabilitysImpl(this);
        }
        return this.frontDoorNameAvailabilitys;
    }

    /**
     * @return Entry point to manage FrontDoorNameAvailabilityWithSubscriptions.
     */
    public FrontDoorNameAvailabilityWithSubscriptions frontDoorNameAvailabilityWithSubscriptions() {
        if (this.frontDoorNameAvailabilityWithSubscriptions == null) {
            this.frontDoorNameAvailabilityWithSubscriptions = new FrontDoorNameAvailabilityWithSubscriptionsImpl(this);
        }
        return this.frontDoorNameAvailabilityWithSubscriptions;
    }

    /**
     * @return Entry point to manage FrontDoors.
     */
    public FrontDoors frontDoors() {
        if (this.frontDoors == null) {
            this.frontDoors = new FrontDoorsImpl(this);
        }
        return this.frontDoors;
    }

    /**
     * @return Entry point to manage FrontendEndpoints.
     */
    public FrontendEndpoints frontendEndpoints() {
        if (this.frontendEndpoints == null) {
            this.frontendEndpoints = new FrontendEndpointsImpl(this);
        }
        return this.frontendEndpoints;
    }

    /**
     * @return Entry point to manage Endpoints.
     */
    public Endpoints endpoints() {
        if (this.endpoints == null) {
            this.endpoints = new EndpointsImpl(this);
        }
        return this.endpoints;
    }

    /**
     * @return Entry point to manage RulesEngines.
     */
    public RulesEngines rulesEngines() {
        if (this.rulesEngines == null) {
            this.rulesEngines = new RulesEnginesImpl(this);
        }
        return this.rulesEngines;
    }

    /**
     * @return Entry point to manage Policies.
     */
    public Policies policies() {
        if (this.policies == null) {
            this.policies = new PoliciesImpl(this);
        }
        return this.policies;
    }

    /**
     * @return Entry point to manage ManagedRuleSets.
     */
    public ManagedRuleSets managedRuleSets() {
        if (this.managedRuleSets == null) {
            this.managedRuleSets = new ManagedRuleSetsImpl(this);
        }
        return this.managedRuleSets;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public NetworkManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return NetworkManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private NetworkManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new FrontDoorManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
