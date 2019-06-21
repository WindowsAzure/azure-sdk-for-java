/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.Operations;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.HanaInstances;
import com.microsoft.azure.management.hanaonazure.v2017_11_03_preview.SapMonitors;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure HanaOnAzure resource management.
 */
public final class HanaOnAzureManager extends ManagerCore<HanaOnAzureManager, HanaManagementClientImpl> {
    private Operations operations;
    private HanaInstances hanaInstances;
    private SapMonitors sapMonitors;
    /**
    * Get a Configurable instance that can be used to create HanaOnAzureManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new HanaOnAzureManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of HanaOnAzureManager that exposes HanaOnAzure resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the HanaOnAzureManager
    */
    public static HanaOnAzureManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new HanaOnAzureManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of HanaOnAzureManager that exposes HanaOnAzure resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the HanaOnAzureManager
    */
    public static HanaOnAzureManager authenticate(RestClient restClient, String subscriptionId) {
        return new HanaOnAzureManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of HanaOnAzureManager that exposes HanaOnAzure management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing HanaOnAzure management API entry points that work across subscriptions
        */
        HanaOnAzureManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage HanaInstances.
     */
    public HanaInstances hanaInstances() {
        if (this.hanaInstances == null) {
            this.hanaInstances = new HanaInstancesImpl(this);
        }
        return this.hanaInstances;
    }

    /**
     * @return Entry point to manage SapMonitors.
     */
    public SapMonitors sapMonitors() {
        if (this.sapMonitors == null) {
            this.sapMonitors = new SapMonitorsImpl(this);
        }
        return this.sapMonitors;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public HanaOnAzureManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return HanaOnAzureManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private HanaOnAzureManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new HanaManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
