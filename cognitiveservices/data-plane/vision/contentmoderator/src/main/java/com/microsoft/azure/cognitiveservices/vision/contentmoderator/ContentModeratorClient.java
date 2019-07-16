/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.AzureClient;
import com.microsoft.rest.RestClient;

/**
 * The interface for ContentModeratorClient class.
 */
public interface ContentModeratorClient {
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
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com)..
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    ContentModeratorClient withEndpoint(String endpoint);

    /**
     * Gets The preferred language for the response..
     *
     * @return the acceptLanguage value.
     */
    String acceptLanguage();

    /**
     * Sets The preferred language for the response..
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    ContentModeratorClient withAcceptLanguage(String acceptLanguage);

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    int longRunningOperationRetryTimeout();

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30..
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    ContentModeratorClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @return the generateClientRequestId value.
     */
    boolean generateClientRequestId();

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true..
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    ContentModeratorClient withGenerateClientRequestId(boolean generateClientRequestId);

    /**
     * Gets the ImageModerations object to access its operations.
     * @return the ImageModerations object.
     */
    ImageModerations imageModerations();

    /**
     * Gets the TextModerations object to access its operations.
     * @return the TextModerations object.
     */
    TextModerations textModerations();

    /**
     * Gets the ListManagementImageLists object to access its operations.
     * @return the ListManagementImageLists object.
     */
    ListManagementImageLists listManagementImageLists();

    /**
     * Gets the ListManagementTermLists object to access its operations.
     * @return the ListManagementTermLists object.
     */
    ListManagementTermLists listManagementTermLists();

    /**
     * Gets the ListManagementImages object to access its operations.
     * @return the ListManagementImages object.
     */
    ListManagementImages listManagementImages();

    /**
     * Gets the ListManagementTerms object to access its operations.
     * @return the ListManagementTerms object.
     */
    ListManagementTerms listManagementTerms();

    /**
     * Gets the Reviews object to access its operations.
     * @return the Reviews object.
     */
    Reviews reviews();

}
