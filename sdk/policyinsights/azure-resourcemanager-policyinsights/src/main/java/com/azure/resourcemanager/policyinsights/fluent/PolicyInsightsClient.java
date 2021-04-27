// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/** The interface for PolicyInsightsClient class. */
public interface PolicyInsightsClient {
    /**
     * Gets Microsoft Azure subscription ID.
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
     * Gets the PolicyTrackedResourcesClient object to access its operations.
     *
     * @return the PolicyTrackedResourcesClient object.
     */
    PolicyTrackedResourcesClient getPolicyTrackedResources();

    /**
     * Gets the RemediationsClient object to access its operations.
     *
     * @return the RemediationsClient object.
     */
    RemediationsClient getRemediations();

    /**
     * Gets the PolicyEventsClient object to access its operations.
     *
     * @return the PolicyEventsClient object.
     */
    PolicyEventsClient getPolicyEvents();

    /**
     * Gets the PolicyStatesClient object to access its operations.
     *
     * @return the PolicyStatesClient object.
     */
    PolicyStatesClient getPolicyStates();

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the PolicyMetadatasClient object to access its operations.
     *
     * @return the PolicyMetadatasClient object.
     */
    PolicyMetadatasClient getPolicyMetadatas();

    /**
     * Gets the PolicyRestrictionsClient object to access its operations.
     *
     * @return the PolicyRestrictionsClient object.
     */
    PolicyRestrictionsClient getPolicyRestrictions();

    /**
     * Gets the AttestationsClient object to access its operations.
     *
     * @return the AttestationsClient object.
     */
    AttestationsClient getAttestations();
}
