// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearningcompute.models;

import com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterCredentialsInner;

/** An immutable client-side representation of OperationalizationClusterCredentials. */
public interface OperationalizationClusterCredentials {
    /**
     * Gets the storageAccount property: Credentials for the Storage Account.
     *
     * @return the storageAccount value.
     */
    StorageAccountCredentials storageAccount();

    /**
     * Gets the containerRegistry property: Credentials for Azure Container Registry.
     *
     * @return the containerRegistry value.
     */
    ContainerRegistryCredentials containerRegistry();

    /**
     * Gets the containerService property: Credentials for Azure Container Service.
     *
     * @return the containerService value.
     */
    ContainerServiceCredentials containerService();

    /**
     * Gets the appInsights property: Credentials for Azure AppInsights.
     *
     * @return the appInsights value.
     */
    AppInsightsCredentials appInsights();

    /**
     * Gets the serviceAuthConfiguration property: Global authorization keys for all user services deployed in cluster.
     * These are used if the service does not have auth keys.
     *
     * @return the serviceAuthConfiguration value.
     */
    ServiceAuthConfiguration serviceAuthConfiguration();

    /**
     * Gets the sslConfiguration property: The SSL configuration for the services.
     *
     * @return the sslConfiguration value.
     */
    SslConfiguration sslConfiguration();

    /**
     * Gets the inner
     * com.azure.resourcemanager.machinelearningcompute.fluent.models.OperationalizationClusterCredentialsInner object.
     *
     * @return the inner object.
     */
    OperationalizationClusterCredentialsInner innerModel();
}
