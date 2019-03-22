/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2019_02_28_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.Operations;
import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.SpatialAnchorsAccounts;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure MixedReality resource management.
 */
public final class MixedRealityManager extends ManagerCore<MixedRealityManager, MixedRealityClientImpl> {
    private Operations operations;
    private SpatialAnchorsAccounts spatialAnchorsAccounts;
    /**
    * Get a Configurable instance that can be used to create MixedRealityManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new MixedRealityManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of MixedRealityManager that exposes MixedReality resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the MixedRealityManager
    */
    public static MixedRealityManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new MixedRealityManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of MixedRealityManager that exposes MixedReality resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the MixedRealityManager
    */
    public static MixedRealityManager authenticate(RestClient restClient, String subscriptionId) {
        return new MixedRealityManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of MixedRealityManager that exposes MixedReality management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing MixedReality management API entry points that work across subscriptions
        */
        MixedRealityManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage SpatialAnchorsAccounts.
     */
    public SpatialAnchorsAccounts spatialAnchorsAccounts() {
        if (this.spatialAnchorsAccounts == null) {
            this.spatialAnchorsAccounts = new SpatialAnchorsAccountsImpl(this);
        }
        return this.spatialAnchorsAccounts;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public MixedRealityManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return MixedRealityManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private MixedRealityManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new MixedRealityClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
