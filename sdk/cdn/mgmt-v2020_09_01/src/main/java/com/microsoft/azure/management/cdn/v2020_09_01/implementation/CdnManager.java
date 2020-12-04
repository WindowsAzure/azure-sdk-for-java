/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.cdn.v2020_09_01.Profiles;
import com.microsoft.azure.management.cdn.v2020_09_01.Endpoints;
import com.microsoft.azure.management.cdn.v2020_09_01.Origins;
import com.microsoft.azure.management.cdn.v2020_09_01.OriginGroups;
import com.microsoft.azure.management.cdn.v2020_09_01.CustomDomains;
import com.microsoft.azure.management.cdn.v2020_09_01.ResourceUsages;
import com.microsoft.azure.management.cdn.v2020_09_01.Operations;
import com.microsoft.azure.management.cdn.v2020_09_01.EdgeNodes;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDProfiles;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDCustomDomains;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDEndpoints;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDOriginGroups;
import com.microsoft.azure.management.cdn.v2020_09_01.AFDOrigins;
import com.microsoft.azure.management.cdn.v2020_09_01.Routes;
import com.microsoft.azure.management.cdn.v2020_09_01.RuleSets;
import com.microsoft.azure.management.cdn.v2020_09_01.Rules;
import com.microsoft.azure.management.cdn.v2020_09_01.SecurityPolicies;
import com.microsoft.azure.management.cdn.v2020_09_01.Secrets;
import com.microsoft.azure.management.cdn.v2020_09_01.Validates;
import com.microsoft.azure.management.cdn.v2020_09_01.LogAnalytics;
import com.microsoft.azure.management.cdn.v2020_09_01.Policies;
import com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSets;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Cdn resource management.
 */
public final class CdnManager extends ManagerCore<CdnManager, CdnManagementClientImpl> {
    private Profiles profiles;
    private Endpoints endpoints;
    private Origins origins;
    private OriginGroups originGroups;
    private CustomDomains customDomains;
    private ResourceUsages resourceUsages;
    private Operations operations;
    private EdgeNodes edgeNodes;
    private AFDProfiles aFDProfiles;
    private AFDCustomDomains aFDCustomDomains;
    private AFDEndpoints aFDEndpoints;
    private AFDOriginGroups aFDOriginGroups;
    private AFDOrigins aFDOrigins;
    private Routes routes;
    private RuleSets ruleSets;
    private Rules rules;
    private SecurityPolicies securityPolicies;
    private Secrets secrets;
    private Validates validates;
    private LogAnalytics logAnalytics;
    private Policies policies;
    private ManagedRuleSets managedRuleSets;
    /**
    * Get a Configurable instance that can be used to create CdnManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new CdnManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of CdnManager that exposes Cdn resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the CdnManager
    */
    public static CdnManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new CdnManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of CdnManager that exposes Cdn resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the CdnManager
    */
    public static CdnManager authenticate(RestClient restClient, String subscriptionId) {
        return new CdnManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of CdnManager that exposes Cdn management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Cdn management API entry points that work across subscriptions
        */
        CdnManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Profiles.
     */
    public Profiles profiles() {
        if (this.profiles == null) {
            this.profiles = new ProfilesImpl(this);
        }
        return this.profiles;
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
     * @return Entry point to manage Origins.
     */
    public Origins origins() {
        if (this.origins == null) {
            this.origins = new OriginsImpl(this);
        }
        return this.origins;
    }

    /**
     * @return Entry point to manage OriginGroups.
     */
    public OriginGroups originGroups() {
        if (this.originGroups == null) {
            this.originGroups = new OriginGroupsImpl(this);
        }
        return this.originGroups;
    }

    /**
     * @return Entry point to manage CustomDomains.
     */
    public CustomDomains customDomains() {
        if (this.customDomains == null) {
            this.customDomains = new CustomDomainsImpl(this);
        }
        return this.customDomains;
    }

    /**
     * @return Entry point to manage ResourceUsages.
     */
    public ResourceUsages resourceUsages() {
        if (this.resourceUsages == null) {
            this.resourceUsages = new ResourceUsagesImpl(this);
        }
        return this.resourceUsages;
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
     * @return Entry point to manage EdgeNodes.
     */
    public EdgeNodes edgeNodes() {
        if (this.edgeNodes == null) {
            this.edgeNodes = new EdgeNodesImpl(this);
        }
        return this.edgeNodes;
    }

    /**
     * @return Entry point to manage AFDProfiles.
     */
    public AFDProfiles aFDProfiles() {
        if (this.aFDProfiles == null) {
            this.aFDProfiles = new AFDProfilesImpl(this);
        }
        return this.aFDProfiles;
    }

    /**
     * @return Entry point to manage AFDCustomDomains.
     */
    public AFDCustomDomains aFDCustomDomains() {
        if (this.aFDCustomDomains == null) {
            this.aFDCustomDomains = new AFDCustomDomainsImpl(this);
        }
        return this.aFDCustomDomains;
    }

    /**
     * @return Entry point to manage AFDEndpoints.
     */
    public AFDEndpoints aFDEndpoints() {
        if (this.aFDEndpoints == null) {
            this.aFDEndpoints = new AFDEndpointsImpl(this);
        }
        return this.aFDEndpoints;
    }

    /**
     * @return Entry point to manage AFDOriginGroups.
     */
    public AFDOriginGroups aFDOriginGroups() {
        if (this.aFDOriginGroups == null) {
            this.aFDOriginGroups = new AFDOriginGroupsImpl(this);
        }
        return this.aFDOriginGroups;
    }

    /**
     * @return Entry point to manage AFDOrigins.
     */
    public AFDOrigins aFDOrigins() {
        if (this.aFDOrigins == null) {
            this.aFDOrigins = new AFDOriginsImpl(this);
        }
        return this.aFDOrigins;
    }

    /**
     * @return Entry point to manage Routes.
     */
    public Routes routes() {
        if (this.routes == null) {
            this.routes = new RoutesImpl(this);
        }
        return this.routes;
    }

    /**
     * @return Entry point to manage RuleSets.
     */
    public RuleSets ruleSets() {
        if (this.ruleSets == null) {
            this.ruleSets = new RuleSetsImpl(this);
        }
        return this.ruleSets;
    }

    /**
     * @return Entry point to manage Rules.
     */
    public Rules rules() {
        if (this.rules == null) {
            this.rules = new RulesImpl(this);
        }
        return this.rules;
    }

    /**
     * @return Entry point to manage SecurityPolicies.
     */
    public SecurityPolicies securityPolicies() {
        if (this.securityPolicies == null) {
            this.securityPolicies = new SecurityPoliciesImpl(this);
        }
        return this.securityPolicies;
    }

    /**
     * @return Entry point to manage Secrets.
     */
    public Secrets secrets() {
        if (this.secrets == null) {
            this.secrets = new SecretsImpl(this);
        }
        return this.secrets;
    }

    /**
     * @return Entry point to manage Validates.
     */
    public Validates validates() {
        if (this.validates == null) {
            this.validates = new ValidatesImpl(this);
        }
        return this.validates;
    }

    /**
     * @return Entry point to manage LogAnalytics.
     */
    public LogAnalytics logAnalytics() {
        if (this.logAnalytics == null) {
            this.logAnalytics = new LogAnalyticsImpl(this);
        }
        return this.logAnalytics;
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
        public CdnManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return CdnManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private CdnManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new CdnManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
