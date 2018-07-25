/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.cognitiveservices.vision.faceapi.FaceClient;
import com.microsoft.azure.cognitiveservices.vision.faceapi.FaceLists;
import com.microsoft.azure.cognitiveservices.vision.faceapi.Faces;
import com.microsoft.azure.cognitiveservices.vision.faceapi.PersonGroupPersons;
import com.microsoft.azure.cognitiveservices.vision.faceapi.PersonGroups;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the FaceClientImpl class.
 */
public class FaceClientImpl extends AzureServiceClient implements FaceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com). */
    private String endpoint;

    /**
     * Gets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com).
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Sets Supported Cognitive Services endpoints (protocol and hostname, for example: https://westus.api.cognitive.microsoft.com).
     *
     * @param endpoint the endpoint value.
     * @return the service client itself
     */
    public FaceClientImpl withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public FaceClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public FaceClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public FaceClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The Faces object to access its operations.
     */
    private Faces faces;

    /**
     * Gets the Faces object to access its operations.
     * @return the Faces object.
     */
    public Faces faces() {
        return this.faces;
    }

    /**
     * The PersonGroupPersons object to access its operations.
     */
    private PersonGroupPersons personGroupPersons;

    /**
     * Gets the PersonGroupPersons object to access its operations.
     * @return the PersonGroupPersons object.
     */
    public PersonGroupPersons personGroupPersons() {
        return this.personGroupPersons;
    }

    /**
     * The PersonGroups object to access its operations.
     */
    private PersonGroups personGroups;

    /**
     * Gets the PersonGroups object to access its operations.
     * @return the PersonGroups object.
     */
    public PersonGroups personGroups() {
        return this.personGroups;
    }

    /**
     * The FaceLists object to access its operations.
     */
    private FaceLists faceLists;

    /**
     * Gets the FaceLists object to access its operations.
     * @return the FaceLists object.
     */
    public FaceLists faceLists() {
        return this.faceLists;
    }

    /**
     * Initializes an instance of FaceClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public FaceClientImpl(ServiceClientCredentials credentials) {
        this("https://{Endpoint}/face/v1.0", credentials);
    }

    /**
     * Initializes an instance of FaceClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    private FaceClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of FaceClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public FaceClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.faces = new FacesImpl(restClient().retrofit(), this);
        this.personGroupPersons = new PersonGroupPersonsImpl(restClient().retrofit(), this);
        this.personGroups = new PersonGroupsImpl(restClient().retrofit(), this);
        this.faceLists = new FaceListsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "FaceClient", "1.0");
    }
}
