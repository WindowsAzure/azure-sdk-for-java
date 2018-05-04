/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Apps;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Features;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.LUISProgrammaticAPI;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Models;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Permissions;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Trains;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Versions;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the LUISProgrammaticAPIImpl class.
 */
public class LUISProgrammaticAPIImpl extends AzureServiceClient implements LUISProgrammaticAPI {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus', 'westus2', 'eastus', 'southcentralus', 'northeurope', 'eastasia', 'australiaeast', 'brazilsouth'. */
    private AzureRegions azureRegion;

    /**
     * Gets Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus', 'westus2', 'eastus', 'southcentralus', 'northeurope', 'eastasia', 'australiaeast', 'brazilsouth'.
     *
     * @return the azureRegion value.
     */
    public AzureRegions azureRegion() {
        return this.azureRegion;
    }

    /**
     * Sets Supported Azure regions for Cognitive Services endpoints. Possible values include: 'westus', 'westeurope', 'southeastasia', 'eastus2', 'westcentralus', 'westus2', 'eastus', 'southcentralus', 'northeurope', 'eastasia', 'australiaeast', 'brazilsouth'.
     *
     * @param azureRegion the azureRegion value.
     * @return the service client itself
     */
    public LUISProgrammaticAPIImpl withAzureRegion(AzureRegions azureRegion) {
        this.azureRegion = azureRegion;
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
    public LUISProgrammaticAPIImpl withAcceptLanguage(String acceptLanguage) {
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
    public LUISProgrammaticAPIImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public LUISProgrammaticAPIImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The Features object to access its operations.
     */
    private Features features;

    /**
     * Gets the Features object to access its operations.
     * @return the Features object.
     */
    public Features features() {
        return this.features;
    }

    /**
     * The Examples object to access its operations.
     */
    private Examples examples;

    /**
     * Gets the Examples object to access its operations.
     * @return the Examples object.
     */
    public Examples examples() {
        return this.examples;
    }

    /**
     * The Models object to access its operations.
     */
    private Models models;

    /**
     * Gets the Models object to access its operations.
     * @return the Models object.
     */
    public Models models() {
        return this.models;
    }

    /**
     * The Apps object to access its operations.
     */
    private Apps apps;

    /**
     * Gets the Apps object to access its operations.
     * @return the Apps object.
     */
    public Apps apps() {
        return this.apps;
    }

    /**
     * The Versions object to access its operations.
     */
    private Versions versions;

    /**
     * Gets the Versions object to access its operations.
     * @return the Versions object.
     */
    public Versions versions() {
        return this.versions;
    }

    /**
     * The Trains object to access its operations.
     */
    private Trains trains;

    /**
     * Gets the Trains object to access its operations.
     * @return the Trains object.
     */
    public Trains trains() {
        return this.trains;
    }

    /**
     * The Permissions object to access its operations.
     */
    private Permissions permissions;

    /**
     * Gets the Permissions object to access its operations.
     * @return the Permissions object.
     */
    public Permissions permissions() {
        return this.permissions;
    }

    /**
     * Initializes an instance of LUISProgrammaticAPI client.
     *
     * @param credentials the management credentials for Azure
     */
    public LUISProgrammaticAPIImpl(ServiceClientCredentials credentials) {
        this("https://{AzureRegion}.api.cognitive.microsoft.com/luis/api/v2.0", credentials);
    }

    /**
     * Initializes an instance of LUISProgrammaticAPI client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    private LUISProgrammaticAPIImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of LUISProgrammaticAPI client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public LUISProgrammaticAPIImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.features = new FeaturesImpl(restClient().retrofit(), this);
        this.examples = new ExamplesImpl(restClient().retrofit(), this);
        this.models = new ModelsImpl(restClient().retrofit(), this);
        this.apps = new AppsImpl(restClient().retrofit(), this);
        this.versions = new VersionsImpl(restClient().retrofit(), this);
        this.trains = new TrainsImpl(restClient().retrofit(), this);
        this.permissions = new PermissionsImpl(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "LUISProgrammaticAPI", "v2.0 preview");
    }
}
