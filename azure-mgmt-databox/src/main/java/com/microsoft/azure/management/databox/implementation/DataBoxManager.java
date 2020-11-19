/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.databox.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.databox.Operations;
import com.microsoft.azure.management.databox.Jobs;
import com.microsoft.azure.management.databox.Services;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure DataBox resource management.
 */
public final class DataBoxManager extends ManagerCore<DataBoxManager, DataBoxManagementClientImpl> {
    private Operations operations;
    private Jobs jobs;
    private Services services;
    /**
    * Get a Configurable instance that can be used to create DataBoxManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new DataBoxManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of DataBoxManager that exposes DataBox resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the DataBoxManager
    */
    public static DataBoxManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new DataBoxManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of DataBoxManager that exposes DataBox resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the DataBoxManager
    */
    public static DataBoxManager authenticate(RestClient restClient, String subscriptionId) {
        return new DataBoxManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of DataBoxManager that exposes DataBox management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DataBox management API entry points that work across subscriptions
        */
        DataBoxManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
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
     * @return Entry point to manage Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(this);
        }
        return this.jobs;
    }

    /**
     * @return Entry point to manage Services.
     */
    public Services services() {
        if (this.services == null) {
            this.services = new ServicesImpl(this);
        }
        return this.services;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public DataBoxManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return DataBoxManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private DataBoxManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new DataBoxManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
