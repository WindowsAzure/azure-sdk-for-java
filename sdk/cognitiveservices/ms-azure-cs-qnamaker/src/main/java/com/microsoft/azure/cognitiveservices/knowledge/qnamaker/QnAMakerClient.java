/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for QnAMakerClient class.
 */
public interface QnAMakerClient {
    /**
     * Gets the REST client.
     *
     * @return the {@link RestClient} object.
    */
    RestClient restClient();

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    AzureClient getAzureClient();

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    String userAgent();

    /**
     * Gets Supported Cognitive Services endpoint (e.g., https://< qnamaker-resource-name >.api.cognitiveservices.azure.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoint (e.g., https://< qnamaker-resource-name >.api.cognitiveservices.azure.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    QnAMakerClient withEndpoint(String endpoint);

    /**
     * Gets Gets or sets the preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets Gets or sets the preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    QnAMakerClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    QnAMakerClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    QnAMakerClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the EndpointSettings object to access its operations.
     * @return the EndpointSettings object.
     */
    EndpointSettings endpointSettings();

    /**
     * Gets the EndpointKeys object to access its operations.
     * @return the EndpointKeys object.
     */
    EndpointKeys endpointKeys();

    /**
     * Gets the Alterations object to access its operations.
     * @return the Alterations object.
     */
    Alterations alterations();

    /**
     * Gets the Knowledgebases object to access its operations.
     * @return the Knowledgebases object.
     */
    Knowledgebases knowledgebases();

    /**
     * Gets the Operations object to access its operations.
     * @return the Operations object.
     */
    Operations operations();

}
