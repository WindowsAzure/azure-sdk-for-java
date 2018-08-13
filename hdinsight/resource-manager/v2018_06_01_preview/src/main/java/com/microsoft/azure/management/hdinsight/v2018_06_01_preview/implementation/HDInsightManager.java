/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Clusters;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Applications;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Locations;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Configurations;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Extensions;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptActions;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.ScriptExecutionHistorys;
import com.microsoft.azure.management.hdinsight.v2018_06_01_preview.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure HDInsight resource management.
 */
public final class HDInsightManager extends ManagerCore<HDInsightManager, HDInsightManagementClientImpl> {
    private Clusters clusters;
    private Applications applications;
    private Locations locations;
    private Configurations configurations;
    private Extensions extensions;
    private ScriptActions scriptActions;
    private ScriptExecutionHistorys scriptExecutionHistorys;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create HDInsightManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new HDInsightManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of HDInsightManager that exposes HDInsight resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the HDInsightManager
    */
    public static HDInsightManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new HDInsightManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of HDInsightManager that exposes HDInsight resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the HDInsightManager
    */
    public static HDInsightManager authenticate(RestClient restClient, String subscriptionId) {
        return new HDInsightManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of HDInsightManager that exposes HDInsight management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing HDInsight management API entry points that work across subscriptions
        */
        HDInsightManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage Clusters.
     */
    public Clusters clusters() {
        if (this.clusters == null) {
            this.clusters = new ClustersImpl(this);
        }
        return this.clusters;
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
     * @return Entry point to manage Configurations.
     */
    public Configurations configurations() {
        if (this.configurations == null) {
            this.configurations = new ConfigurationsImpl(this);
        }
        return this.configurations;
    }

    /**
     * @return Entry point to manage Extensions.
     */
    public Extensions extensions() {
        if (this.extensions == null) {
            this.extensions = new ExtensionsImpl(this);
        }
        return this.extensions;
    }

    /**
     * @return Entry point to manage ScriptActions.
     */
    public ScriptActions scriptActions() {
        if (this.scriptActions == null) {
            this.scriptActions = new ScriptActionsImpl(this);
        }
        return this.scriptActions;
    }

    /**
     * @return Entry point to manage ScriptExecutionHistorys.
     */
    public ScriptExecutionHistorys scriptExecutionHistorys() {
        if (this.scriptExecutionHistorys == null) {
            this.scriptExecutionHistorys = new ScriptExecutionHistorysImpl(this);
        }
        return this.scriptExecutionHistorys;
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
        public HDInsightManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return HDInsightManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private HDInsightManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new HDInsightManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
