/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.costmanagement.v2018_05_31.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ReportConfigs;
import com.microsoft.azure.management.costmanagement.v2018_05_31.BillingAccountDimensions;
import com.microsoft.azure.management.costmanagement.v2018_05_31.SubscriptionDimensions;
import com.microsoft.azure.management.costmanagement.v2018_05_31.ResourceGroupDimensions;
import com.microsoft.azure.management.costmanagement.v2018_05_31.Operations;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure CostManagement resource management.
 */
public final class CostManagementManager extends ManagerCore<CostManagementManager, CostManagementClientImpl> {
    private ReportConfigs reportConfigs;
    private BillingAccountDimensions billingAccountDimensions;
    private SubscriptionDimensions subscriptionDimensions;
    private ResourceGroupDimensions resourceGroupDimensions;
    private Operations operations;
    /**
    * Get a Configurable instance that can be used to create CostManagementManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new CostManagementManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of CostManagementManager that exposes CostManagement resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the CostManagementManager
    */
    public static CostManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new CostManagementManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of CostManagementManager that exposes CostManagement resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the CostManagementManager
    */
    public static CostManagementManager authenticate(RestClient restClient, String subscriptionId) {
        return new CostManagementManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of CostManagementManager that exposes CostManagement management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing CostManagement management API entry points that work across subscriptions
        */
        CostManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage ReportConfigs.
     */
    public ReportConfigs reportConfigs() {
        if (this.reportConfigs == null) {
            this.reportConfigs = new ReportConfigsImpl(this);
        }
        return this.reportConfigs;
    }

    /**
     * @return Entry point to manage BillingAccountDimensions.
     */
    public BillingAccountDimensions billingAccountDimensions() {
        if (this.billingAccountDimensions == null) {
            this.billingAccountDimensions = new BillingAccountDimensionsImpl(this);
        }
        return this.billingAccountDimensions;
    }

    /**
     * @return Entry point to manage SubscriptionDimensions.
     */
    public SubscriptionDimensions subscriptionDimensions() {
        if (this.subscriptionDimensions == null) {
            this.subscriptionDimensions = new SubscriptionDimensionsImpl(this);
        }
        return this.subscriptionDimensions;
    }

    /**
     * @return Entry point to manage ResourceGroupDimensions.
     */
    public ResourceGroupDimensions resourceGroupDimensions() {
        if (this.resourceGroupDimensions == null) {
            this.resourceGroupDimensions = new ResourceGroupDimensionsImpl(this);
        }
        return this.resourceGroupDimensions;
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
        public CostManagementManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return CostManagementManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private CostManagementManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new CostManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
