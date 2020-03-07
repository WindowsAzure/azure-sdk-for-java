/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batch.v2015_12_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.batch.v2015_12_01.BatchAccounts;
import com.microsoft.azure.management.batch.v2015_12_01.ApplicationPackages;
import com.microsoft.azure.management.batch.v2015_12_01.Applications;
import com.microsoft.azure.management.batch.v2015_12_01.Locations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Batch resource management.
 */
public final class BatchManager extends ManagerCore<BatchManager, BatchManagementClientImpl> {
    private BatchAccounts batchAccounts;
    private ApplicationPackages applicationPackages;
    private Applications applications;
    private Locations locations;
    /**
    * Get a Configurable instance that can be used to create BatchManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new BatchManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of BatchManager that exposes Batch resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the BatchManager
    */
    public static BatchManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new BatchManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of BatchManager that exposes Batch resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the BatchManager
    */
    public static BatchManager authenticate(RestClient restClient, String subscriptionId) {
        return new BatchManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of BatchManager that exposes Batch management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Batch management API entry points that work across subscriptions
        */
        BatchManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage BatchAccounts.
     */
    public BatchAccounts batchAccounts() {
        if (this.batchAccounts == null) {
            this.batchAccounts = new BatchAccountsImpl(this);
        }
        return this.batchAccounts;
    }

    /**
     * @return Entry point to manage ApplicationPackages.
     */
    public ApplicationPackages applicationPackages() {
        if (this.applicationPackages == null) {
            this.applicationPackages = new ApplicationPackagesImpl(this);
        }
        return this.applicationPackages;
    }

    /**
     * @return Entry point to manage Applications.
     */
    public Applications applications() {
        if (this.applications == null) {
            this.applications = new ApplicationsImpl(this);
        }
        return this.applications;
    }

    /**
     * @return Entry point to manage Locations.
     */
    public Locations locations() {
        if (this.locations == null) {
            this.locations = new LocationsImpl(this);
        }
        return this.locations;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public BatchManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return BatchManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private BatchManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new BatchManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
