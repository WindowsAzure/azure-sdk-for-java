/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.peering.v2019_09_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.peering.v2019_09_01_preview.LegacyPeerings;
import com.microsoft.azure.management.peering.v2019_09_01_preview.Operations;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeerAsns;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringLocations;
import com.microsoft.azure.management.peering.v2019_09_01_preview.Peerings;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServiceLocations;
import com.microsoft.azure.management.peering.v2019_09_01_preview.Prefixes;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServiceProviders;
import com.microsoft.azure.management.peering.v2019_09_01_preview.PeeringServices;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Peering resource management.
 */
public final class PeeringManager extends ManagerCore<PeeringManager, PeeringManagementClientImpl> {
    private LegacyPeerings legacyPeerings;
    private Operations operations;
    private PeerAsns peerAsns;
    private PeeringLocations peeringLocations;
    private Peerings peerings;
    private PeeringServiceLocations peeringServiceLocations;
    private Prefixes prefixes;
    private PeeringServiceProviders peeringServiceProviders;
    private PeeringServices peeringServices;
    /**
    * Get a Configurable instance that can be used to create PeeringManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new PeeringManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of PeeringManager that exposes Peering resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the PeeringManager
    */
    public static PeeringManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new PeeringManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of PeeringManager that exposes Peering resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the PeeringManager
    */
    public static PeeringManager authenticate(RestClient restClient, String subscriptionId) {
        return new PeeringManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of PeeringManager that exposes Peering management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Peering management API entry points that work across subscriptions
        */
        PeeringManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage LegacyPeerings.
     */
    public LegacyPeerings legacyPeerings() {
        if (this.legacyPeerings == null) {
            this.legacyPeerings = new LegacyPeeringsImpl(this);
        }
        return this.legacyPeerings;
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
     * @return Entry point to manage PeerAsns.
     */
    public PeerAsns peerAsns() {
        if (this.peerAsns == null) {
            this.peerAsns = new PeerAsnsImpl(this);
        }
        return this.peerAsns;
    }

    /**
     * @return Entry point to manage PeeringLocations.
     */
    public PeeringLocations peeringLocations() {
        if (this.peeringLocations == null) {
            this.peeringLocations = new PeeringLocationsImpl(this);
        }
        return this.peeringLocations;
    }

    /**
     * @return Entry point to manage Peerings.
     */
    public Peerings peerings() {
        if (this.peerings == null) {
            this.peerings = new PeeringsImpl(this);
        }
        return this.peerings;
    }

    /**
     * @return Entry point to manage PeeringServiceLocations.
     */
    public PeeringServiceLocations peeringServiceLocations() {
        if (this.peeringServiceLocations == null) {
            this.peeringServiceLocations = new PeeringServiceLocationsImpl(this);
        }
        return this.peeringServiceLocations;
    }

    /**
     * @return Entry point to manage Prefixes.
     */
    public Prefixes prefixes() {
        if (this.prefixes == null) {
            this.prefixes = new PrefixesImpl(this);
        }
        return this.prefixes;
    }

    /**
     * @return Entry point to manage PeeringServiceProviders.
     */
    public PeeringServiceProviders peeringServiceProviders() {
        if (this.peeringServiceProviders == null) {
            this.peeringServiceProviders = new PeeringServiceProvidersImpl(this);
        }
        return this.peeringServiceProviders;
    }

    /**
     * @return Entry point to manage PeeringServices.
     */
    public PeeringServices peeringServices() {
        if (this.peeringServices == null) {
            this.peeringServices = new PeeringServicesImpl(this);
        }
        return this.peeringServices;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public PeeringManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return PeeringManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private PeeringManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new PeeringManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
