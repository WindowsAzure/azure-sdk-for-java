// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentExportConfigurationInner;

/** An immutable client-side representation of ApplicationInsightsComponentExportConfiguration. */
public interface ApplicationInsightsComponentExportConfiguration {
    /**
     * Gets the exportId property: The unique ID of the export configuration inside an Application Insights component.
     * It is auto generated when the Continuous Export configuration is created.
     *
     * @return the exportId value.
     */
    String exportId();

    /**
     * Gets the instrumentationKey property: The instrumentation key of the Application Insights component.
     *
     * @return the instrumentationKey value.
     */
    String instrumentationKey();

    /**
     * Gets the recordTypes property: This comma separated list of document types that will be exported. The possible
     * values include 'Requests', 'Event', 'Exceptions', 'Metrics', 'PageViews', 'PageViewPerformance', 'Rdd',
     * 'PerformanceCounters', 'Availability', 'Messages'.
     *
     * @return the recordTypes value.
     */
    String recordTypes();

    /**
     * Gets the applicationName property: The name of the Application Insights component.
     *
     * @return the applicationName value.
     */
    String applicationName();

    /**
     * Gets the subscriptionId property: The subscription of the Application Insights component.
     *
     * @return the subscriptionId value.
     */
    String subscriptionId();

    /**
     * Gets the resourceGroup property: The resource group of the Application Insights component.
     *
     * @return the resourceGroup value.
     */
    String resourceGroup();

    /**
     * Gets the destinationStorageSubscriptionId property: The destination storage account subscription ID.
     *
     * @return the destinationStorageSubscriptionId value.
     */
    String destinationStorageSubscriptionId();

    /**
     * Gets the destinationStorageLocationId property: The destination account location ID.
     *
     * @return the destinationStorageLocationId value.
     */
    String destinationStorageLocationId();

    /**
     * Gets the destinationAccountId property: The name of destination account.
     *
     * @return the destinationAccountId value.
     */
    String destinationAccountId();

    /**
     * Gets the destinationType property: The destination type.
     *
     * @return the destinationType value.
     */
    String destinationType();

    /**
     * Gets the isUserEnabled property: This will be 'true' if the Continuous Export configuration is enabled, otherwise
     * it will be 'false'.
     *
     * @return the isUserEnabled value.
     */
    String isUserEnabled();

    /**
     * Gets the lastUserUpdate property: Last time the Continuous Export configuration was updated.
     *
     * @return the lastUserUpdate value.
     */
    String lastUserUpdate();

    /**
     * Gets the notificationQueueEnabled property: Deprecated.
     *
     * @return the notificationQueueEnabled value.
     */
    String notificationQueueEnabled();

    /**
     * Gets the exportStatus property: This indicates current Continuous Export configuration status. The possible
     * values are 'Preparing', 'Success', 'Failure'.
     *
     * @return the exportStatus value.
     */
    String exportStatus();

    /**
     * Gets the lastSuccessTime property: The last time data was successfully delivered to the destination storage
     * container for this Continuous Export configuration.
     *
     * @return the lastSuccessTime value.
     */
    String lastSuccessTime();

    /**
     * Gets the lastGapTime property: The last time the Continuous Export configuration started failing.
     *
     * @return the lastGapTime value.
     */
    String lastGapTime();

    /**
     * Gets the permanentErrorReason property: This is the reason the Continuous Export configuration started failing.
     * It can be 'AzureStorageNotFound' or 'AzureStorageAccessDenied'.
     *
     * @return the permanentErrorReason value.
     */
    String permanentErrorReason();

    /**
     * Gets the storageName property: The name of the destination storage account.
     *
     * @return the storageName value.
     */
    String storageName();

    /**
     * Gets the containerName property: The name of the destination storage container.
     *
     * @return the containerName value.
     */
    String containerName();

    /**
     * Gets the inner
     * com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentExportConfigurationInner
     * object.
     *
     * @return the inner object.
     */
    ApplicationInsightsComponentExportConfigurationInner innerModel();
}
