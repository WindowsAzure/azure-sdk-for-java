/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datamigration.v2017_11_15_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.ResourceSkus;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.Services;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.Tasks;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.Projects;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.Usages;
import com.microsoft.azure.management.datamigration.v2017_11_15_preview.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure DataMigration resource management.
 */
public final class DataMigrationManager extends ManagerCore<DataMigrationManager, DataMigrationServiceClientImpl> {
    private ResourceSkus resourceSkus;
    private Services services;
    private Tasks tasks;
    private Projects projects;
    private Usages usages;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create DataMigrationManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new DataMigrationManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of DataMigrationManager that exposes DataMigration resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the DataMigrationManager
    */
    public static DataMigrationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new DataMigrationManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of DataMigrationManager that exposes DataMigration resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the DataMigrationManager
    */
    public static DataMigrationManager authenticate(RestClient restClient, String subscriptionId) {
        return new DataMigrationManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of DataMigrationManager that exposes DataMigration management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing DataMigration management API entry points that work across subscriptions
        */
        DataMigrationManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ResourceSkus.
     */
    public ResourceSkus resourceSkus() {
        if (this.resourceSkus == null) {
            this.resourceSkus = new ResourceSkusImpl(this);
        }
        return this.resourceSkus;
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
     * @return Entry point to manage Tasks.
     */
    public Tasks tasks() {
        if (this.tasks == null) {
            this.tasks = new TasksImpl(this);
        }
        return this.tasks;
    }

    /**
     * @return Entry point to manage Projects.
     */
    public Projects projects() {
        if (this.projects == null) {
            this.projects = new ProjectsImpl(this);
        }
        return this.projects;
    }

    /**
     * @return Entry point to manage Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(this);
        }
        return this.usages;
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
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public DataMigrationManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return DataMigrationManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private DataMigrationManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new DataMigrationServiceClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
