/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.search.imagesearch;

/**
 * The interface for ImageSearchClient class.
 */
public interface ImageSearchClient {
    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: "https://westus.api.cognitive.microsoft.com", "https://api.cognitive.microsoft.com").
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: "https://westus.api.cognitive.microsoft.com", "https://api.cognitive.microsoft.com").
     *
     * @param endpoint the endpoint value.
     * @return the service client itself.
     */
    ImageSearchClient withEndpoint(String endpoint);

    /**
     * Gets the ImagesOperations object to access its operations.
     *
     * @return the ImagesOperations object.
     */
    ImagesOperations imagesOperations();
}
