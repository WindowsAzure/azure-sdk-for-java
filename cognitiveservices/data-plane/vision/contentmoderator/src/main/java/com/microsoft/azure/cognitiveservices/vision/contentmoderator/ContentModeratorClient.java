/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.AzureRegionBaseUrl;
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
     * Gets Supported Azure regions for Content Moderator endpoints. Possible values include: 'westus.api.cognitive.microsoft.com', 'westus2.api.cognitive.microsoft.com', 'eastus.api.cognitive.microsoft.com', 'eastus2.api.cognitive.microsoft.com', 'westcentralus.api.cognitive.microsoft.com', 'southcentralus.api.cognitive.microsoft.com', 'westeurope.api.cognitive.microsoft.com', 'northeurope.api.cognitive.microsoft.com', 'southeastasia.api.cognitive.microsoft.com', 'eastasia.api.cognitive.microsoft.com', 'australiaeast.api.cognitive.microsoft.com', 'brazilsouth.api.cognitive.microsoft.com', 'contentmoderatortest.azure-api.net'.
     *
     * @return the baseUrl value.
     */
    AzureRegionBaseUrl baseUrl();

    /**
     * Sets Supported Azure regions for Content Moderator endpoints. Possible values include: 'westus.api.cognitive.microsoft.com', 'westus2.api.cognitive.microsoft.com', 'eastus.api.cognitive.microsoft.com', 'eastus2.api.cognitive.microsoft.com', 'westcentralus.api.cognitive.microsoft.com', 'southcentralus.api.cognitive.microsoft.com', 'westeurope.api.cognitive.microsoft.com', 'northeurope.api.cognitive.microsoft.com', 'southeastasia.api.cognitive.microsoft.com', 'eastasia.api.cognitive.microsoft.com', 'australiaeast.api.cognitive.microsoft.com', 'brazilsouth.api.cognitive.microsoft.com', 'contentmoderatortest.azure-api.net'.
     *
     * @param baseUrl the baseUrl value.
     * @return the service client itself
     */
    ContentModeratorClient withBaseUrl(AzureRegionBaseUrl baseUrl);

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
    ContentModeratorClient withAcceptLanguage(String acceptLanguage);

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
    ContentModeratorClient withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout);

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
