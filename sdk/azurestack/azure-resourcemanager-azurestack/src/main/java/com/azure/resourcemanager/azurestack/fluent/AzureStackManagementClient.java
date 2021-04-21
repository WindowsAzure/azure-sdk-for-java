// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for AzureStackManagementClient class. */
public interface AzureStackManagementClient {
    /**
     * Gets Subscription credentials that uniquely identify Microsoft Azure subscription. The subscription ID forms part
     * of the URI for every service call.
     *
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the CloudManifestFilesClient object to access its operations.
     *
     * @return the CloudManifestFilesClient object.
     */
    CloudManifestFilesClient getCloudManifestFiles();

    /**
     * Gets the CustomerSubscriptionsClient object to access its operations.
     *
     * @return the CustomerSubscriptionsClient object.
     */
    CustomerSubscriptionsClient getCustomerSubscriptions();

    /**
     * Gets the ProductsClient object to access its operations.
     *
     * @return the ProductsClient object.
     */
    ProductsClient getProducts();

    /**
     * Gets the RegistrationsClient object to access its operations.
     *
     * @return the RegistrationsClient object.
     */
    RegistrationsClient getRegistrations();

    /**
     * Gets the LinkedSubscriptionsClient object to access its operations.
     *
     * @return the LinkedSubscriptionsClient object.
     */
    LinkedSubscriptionsClient getLinkedSubscriptions();
}
