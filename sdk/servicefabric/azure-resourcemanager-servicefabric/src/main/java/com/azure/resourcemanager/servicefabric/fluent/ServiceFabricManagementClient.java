// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for ServiceFabricManagementClient class. */
public interface ServiceFabricManagementClient {
    /**
     * Gets The customer subscription identifier.
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
     * Gets the ClustersClient object to access its operations.
     *
     * @return the ClustersClient object.
     */
    ClustersClient getClusters();

    /**
     * Gets the ClusterVersionsClient object to access its operations.
     *
     * @return the ClusterVersionsClient object.
     */
    ClusterVersionsClient getClusterVersions();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the ApplicationTypesClient object to access its operations.
     *
     * @return the ApplicationTypesClient object.
     */
    ApplicationTypesClient getApplicationTypes();

    /**
     * Gets the ApplicationTypeVersionsClient object to access its operations.
     *
     * @return the ApplicationTypeVersionsClient object.
     */
    ApplicationTypeVersionsClient getApplicationTypeVersions();

    /**
     * Gets the ApplicationsClient object to access its operations.
     *
     * @return the ApplicationsClient object.
     */
    ApplicationsClient getApplications();

    /**
     * Gets the ServicesClient object to access its operations.
     *
     * @return the ServicesClient object.
     */
    ServicesClient getServices();
}
