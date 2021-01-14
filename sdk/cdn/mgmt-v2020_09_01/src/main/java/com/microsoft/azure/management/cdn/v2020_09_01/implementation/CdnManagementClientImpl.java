/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.azure.LongRunningFinalState;
import com.microsoft.azure.LongRunningOperationOptions;
import com.microsoft.azure.management.cdn.v2020_09_01.CheckNameAvailabilityInput;
import com.microsoft.azure.management.cdn.v2020_09_01.ErrorResponseException;
import com.microsoft.azure.management.cdn.v2020_09_01.ValidateProbeInput;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * Initializes a new instance of the CdnManagementClientImpl class.
 */
public class CdnManagementClientImpl extends AzureServiceClient {
    /** The Retrofit service to perform REST calls. */
    private CdnManagementClientService service;
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** Azure Subscription ID. */
    private String subscriptionId;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets Azure Subscription ID.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** Version of the API to be used with the client request. Current version is 2017-04-02. */
    private String apiVersion;

    /**
     * Gets Version of the API to be used with the client request. Current version is 2017-04-02.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Azure Subscription ID. */
    private String subscriptionId1;

    /**
     * Gets Azure Subscription ID.
     *
     * @return the subscriptionId1 value.
     */
    public String subscriptionId1() {
        return this.subscriptionId1;
    }

    /**
     * Sets Azure Subscription ID.
     *
     * @param subscriptionId1 the subscriptionId1 value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withSubscriptionId1(String subscriptionId1) {
        this.subscriptionId1 = subscriptionId1;
        return this;
    }

    /** Version of the API to be used with the client request. Current version is 2019-09-01. */
    private String apiVersion1;

    /**
     * Gets Version of the API to be used with the client request. Current version is 2019-09-01.
     *
     * @return the apiVersion1 value.
     */
    public String apiVersion1() {
        return this.apiVersion1;
    }

    /**
     * Sets Version of the API to be used with the client request. Current version is 2019-09-01.
     *
     * @param apiVersion1 the apiVersion1 value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withApiVersion1(String apiVersion1) {
        this.apiVersion1 = apiVersion1;
        return this;
    }

    /** The preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets The preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets The preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** The retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets The retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public CdnManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ProfilesInner object to access its operations.
     */
    private ProfilesInner profiles;

    /**
     * Gets the ProfilesInner object to access its operations.
     * @return the ProfilesInner object.
     */
    public ProfilesInner profiles() {
        return this.profiles;
    }

    /**
     * The EndpointsInner object to access its operations.
     */
    private EndpointsInner endpoints;

    /**
     * Gets the EndpointsInner object to access its operations.
     * @return the EndpointsInner object.
     */
    public EndpointsInner endpoints() {
        return this.endpoints;
    }

    /**
     * The OriginsInner object to access its operations.
     */
    private OriginsInner origins;

    /**
     * Gets the OriginsInner object to access its operations.
     * @return the OriginsInner object.
     */
    public OriginsInner origins() {
        return this.origins;
    }

    /**
     * The OriginGroupsInner object to access its operations.
     */
    private OriginGroupsInner originGroups;

    /**
     * Gets the OriginGroupsInner object to access its operations.
     * @return the OriginGroupsInner object.
     */
    public OriginGroupsInner originGroups() {
        return this.originGroups;
    }

    /**
     * The CustomDomainsInner object to access its operations.
     */
    private CustomDomainsInner customDomains;

    /**
     * Gets the CustomDomainsInner object to access its operations.
     * @return the CustomDomainsInner object.
     */
    public CustomDomainsInner customDomains() {
        return this.customDomains;
    }

    /**
     * The ResourceUsagesInner object to access its operations.
     */
    private ResourceUsagesInner resourceUsages;

    /**
     * Gets the ResourceUsagesInner object to access its operations.
     * @return the ResourceUsagesInner object.
     */
    public ResourceUsagesInner resourceUsages() {
        return this.resourceUsages;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The EdgeNodesInner object to access its operations.
     */
    private EdgeNodesInner edgeNodes;

    /**
     * Gets the EdgeNodesInner object to access its operations.
     * @return the EdgeNodesInner object.
     */
    public EdgeNodesInner edgeNodes() {
        return this.edgeNodes;
    }

    /**
     * The AFDProfilesInner object to access its operations.
     */
    private AFDProfilesInner aFDProfiles;

    /**
     * Gets the AFDProfilesInner object to access its operations.
     * @return the AFDProfilesInner object.
     */
    public AFDProfilesInner aFDProfiles() {
        return this.aFDProfiles;
    }

    /**
     * The AFDCustomDomainsInner object to access its operations.
     */
    private AFDCustomDomainsInner aFDCustomDomains;

    /**
     * Gets the AFDCustomDomainsInner object to access its operations.
     * @return the AFDCustomDomainsInner object.
     */
    public AFDCustomDomainsInner aFDCustomDomains() {
        return this.aFDCustomDomains;
    }

    /**
     * The AFDEndpointsInner object to access its operations.
     */
    private AFDEndpointsInner aFDEndpoints;

    /**
     * Gets the AFDEndpointsInner object to access its operations.
     * @return the AFDEndpointsInner object.
     */
    public AFDEndpointsInner aFDEndpoints() {
        return this.aFDEndpoints;
    }

    /**
     * The AFDOriginGroupsInner object to access its operations.
     */
    private AFDOriginGroupsInner aFDOriginGroups;

    /**
     * Gets the AFDOriginGroupsInner object to access its operations.
     * @return the AFDOriginGroupsInner object.
     */
    public AFDOriginGroupsInner aFDOriginGroups() {
        return this.aFDOriginGroups;
    }

    /**
     * The AFDOriginsInner object to access its operations.
     */
    private AFDOriginsInner aFDOrigins;

    /**
     * Gets the AFDOriginsInner object to access its operations.
     * @return the AFDOriginsInner object.
     */
    public AFDOriginsInner aFDOrigins() {
        return this.aFDOrigins;
    }

    /**
     * The RoutesInner object to access its operations.
     */
    private RoutesInner routes;

    /**
     * Gets the RoutesInner object to access its operations.
     * @return the RoutesInner object.
     */
    public RoutesInner routes() {
        return this.routes;
    }

    /**
     * The RuleSetsInner object to access its operations.
     */
    private RuleSetsInner ruleSets;

    /**
     * Gets the RuleSetsInner object to access its operations.
     * @return the RuleSetsInner object.
     */
    public RuleSetsInner ruleSets() {
        return this.ruleSets;
    }

    /**
     * The RulesInner object to access its operations.
     */
    private RulesInner rules;

    /**
     * Gets the RulesInner object to access its operations.
     * @return the RulesInner object.
     */
    public RulesInner rules() {
        return this.rules;
    }

    /**
     * The SecurityPoliciesInner object to access its operations.
     */
    private SecurityPoliciesInner securityPolicies;

    /**
     * Gets the SecurityPoliciesInner object to access its operations.
     * @return the SecurityPoliciesInner object.
     */
    public SecurityPoliciesInner securityPolicies() {
        return this.securityPolicies;
    }

    /**
     * The SecretsInner object to access its operations.
     */
    private SecretsInner secrets;

    /**
     * Gets the SecretsInner object to access its operations.
     * @return the SecretsInner object.
     */
    public SecretsInner secrets() {
        return this.secrets;
    }

    /**
     * The ValidatesInner object to access its operations.
     */
    private ValidatesInner validates;

    /**
     * Gets the ValidatesInner object to access its operations.
     * @return the ValidatesInner object.
     */
    public ValidatesInner validates() {
        return this.validates;
    }

    /**
     * The LogAnalyticsInner object to access its operations.
     */
    private LogAnalyticsInner logAnalytics;

    /**
     * Gets the LogAnalyticsInner object to access its operations.
     * @return the LogAnalyticsInner object.
     */
    public LogAnalyticsInner logAnalytics() {
        return this.logAnalytics;
    }

    /**
     * The PoliciesInner object to access its operations.
     */
    private PoliciesInner policies;

    /**
     * Gets the PoliciesInner object to access its operations.
     * @return the PoliciesInner object.
     */
    public PoliciesInner policies() {
        return this.policies;
    }

    /**
     * The ManagedRuleSetsInner object to access its operations.
     */
    private ManagedRuleSetsInner managedRuleSets;

    /**
     * Gets the ManagedRuleSetsInner object to access its operations.
     * @return the ManagedRuleSetsInner object.
     */
    public ManagedRuleSetsInner managedRuleSets() {
        return this.managedRuleSets;
    }

    /**
     * Initializes an instance of CdnManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public CdnManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of CdnManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public CdnManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of CdnManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public CdnManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2020-09-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.profiles = new ProfilesInner(restClient().retrofit(), this);
        this.endpoints = new EndpointsInner(restClient().retrofit(), this);
        this.origins = new OriginsInner(restClient().retrofit(), this);
        this.originGroups = new OriginGroupsInner(restClient().retrofit(), this);
        this.customDomains = new CustomDomainsInner(restClient().retrofit(), this);
        this.resourceUsages = new ResourceUsagesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.edgeNodes = new EdgeNodesInner(restClient().retrofit(), this);
        this.aFDProfiles = new AFDProfilesInner(restClient().retrofit(), this);
        this.aFDCustomDomains = new AFDCustomDomainsInner(restClient().retrofit(), this);
        this.aFDEndpoints = new AFDEndpointsInner(restClient().retrofit(), this);
        this.aFDOriginGroups = new AFDOriginGroupsInner(restClient().retrofit(), this);
        this.aFDOrigins = new AFDOriginsInner(restClient().retrofit(), this);
        this.routes = new RoutesInner(restClient().retrofit(), this);
        this.ruleSets = new RuleSetsInner(restClient().retrofit(), this);
        this.rules = new RulesInner(restClient().retrofit(), this);
        this.securityPolicies = new SecurityPoliciesInner(restClient().retrofit(), this);
        this.secrets = new SecretsInner(restClient().retrofit(), this);
        this.validates = new ValidatesInner(restClient().retrofit(), this);
        this.logAnalytics = new LogAnalyticsInner(restClient().retrofit(), this);
        this.policies = new PoliciesInner(restClient().retrofit(), this);
        this.managedRuleSets = new ManagedRuleSetsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
        initializeService();
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s, auto-generated)", super.userAgent(), "CdnManagementClient", "2020-09-01");
    }

    private void initializeService() {
        service = restClient().retrofit().create(CdnManagementClientService.class);
    }

    /**
     * The interface defining all the services for CdnManagementClient to be
     * used by Retrofit to perform actually REST calls.
     */
    interface CdnManagementClientService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.v2020_09_01.CdnManagementClient checkNameAvailability" })
        @POST("providers/Microsoft.Cdn/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckNameAvailabilityInput checkNameAvailabilityInput, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.v2020_09_01.CdnManagementClient checkNameAvailabilityWithSubscription" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Cdn/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailabilityWithSubscription(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckNameAvailabilityInput checkNameAvailabilityInput, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.v2020_09_01.CdnManagementClient validateProbe" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Cdn/validateProbe")
        Observable<Response<ResponseBody>> validateProbe(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body ValidateProbeInput validateProbeInput, @Header("User-Agent") String userAgent);

    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckNameAvailabilityOutputInner object if successful.
     */
    public CheckNameAvailabilityOutputInner checkNameAvailability(String name) {
        return checkNameAvailabilityWithServiceResponseAsync(name).toBlocking().single().body();
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(String name, final ServiceCallback<CheckNameAvailabilityOutputInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(name), serviceCallback);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityOutputInner object
     */
    public Observable<CheckNameAvailabilityOutputInner> checkNameAvailabilityAsync(String name) {
        return checkNameAvailabilityWithServiceResponseAsync(name).map(new Func1<ServiceResponse<CheckNameAvailabilityOutputInner>, CheckNameAvailabilityOutputInner>() {
            @Override
            public CheckNameAvailabilityOutputInner call(ServiceResponse<CheckNameAvailabilityOutputInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityOutputInner object
     */
    public Observable<ServiceResponse<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithServiceResponseAsync(String name) {
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        return service.checkNameAvailability(this.apiVersion(), this.acceptLanguage(), checkNameAvailabilityInput, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckNameAvailabilityOutputInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckNameAvailabilityOutputInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckNameAvailabilityOutputInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckNameAvailabilityOutputInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckNameAvailabilityOutputInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckNameAvailabilityOutputInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the CheckNameAvailabilityOutputInner object if successful.
     */
    public CheckNameAvailabilityOutputInner checkNameAvailabilityWithSubscription(String name) {
        return checkNameAvailabilityWithSubscriptionWithServiceResponseAsync(name).toBlocking().single().body();
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionAsync(String name, final ServiceCallback<CheckNameAvailabilityOutputInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithSubscriptionWithServiceResponseAsync(name), serviceCallback);
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityOutputInner object
     */
    public Observable<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionAsync(String name) {
        return checkNameAvailabilityWithSubscriptionWithServiceResponseAsync(name).map(new Func1<ServiceResponse<CheckNameAvailabilityOutputInner>, CheckNameAvailabilityOutputInner>() {
            @Override
            public CheckNameAvailabilityOutputInner call(ServiceResponse<CheckNameAvailabilityOutputInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check the availability of a resource name. This is needed for resources where name is globally unique, such as a CDN endpoint.
     *
     * @param name The resource name to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the CheckNameAvailabilityOutputInner object
     */
    public Observable<ServiceResponse<CheckNameAvailabilityOutputInner>> checkNameAvailabilityWithSubscriptionWithServiceResponseAsync(String name) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        CheckNameAvailabilityInput checkNameAvailabilityInput = new CheckNameAvailabilityInput();
        checkNameAvailabilityInput.withName(name);
        return service.checkNameAvailabilityWithSubscription(this.subscriptionId(), this.apiVersion(), this.acceptLanguage(), checkNameAvailabilityInput, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<CheckNameAvailabilityOutputInner>>>() {
                @Override
                public Observable<ServiceResponse<CheckNameAvailabilityOutputInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<CheckNameAvailabilityOutputInner> clientResponse = checkNameAvailabilityWithSubscriptionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<CheckNameAvailabilityOutputInner> checkNameAvailabilityWithSubscriptionDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<CheckNameAvailabilityOutputInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<CheckNameAvailabilityOutputInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative to the origin path specified in the endpoint configuration.
     *
     * @param probeURL The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ValidateProbeOutputInner object if successful.
     */
    public ValidateProbeOutputInner validateProbe(String probeURL) {
        return validateProbeWithServiceResponseAsync(probeURL).toBlocking().single().body();
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative to the origin path specified in the endpoint configuration.
     *
     * @param probeURL The probe URL to validate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ValidateProbeOutputInner> validateProbeAsync(String probeURL, final ServiceCallback<ValidateProbeOutputInner> serviceCallback) {
        return ServiceFuture.fromResponse(validateProbeWithServiceResponseAsync(probeURL), serviceCallback);
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative to the origin path specified in the endpoint configuration.
     *
     * @param probeURL The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ValidateProbeOutputInner object
     */
    public Observable<ValidateProbeOutputInner> validateProbeAsync(String probeURL) {
        return validateProbeWithServiceResponseAsync(probeURL).map(new Func1<ServiceResponse<ValidateProbeOutputInner>, ValidateProbeOutputInner>() {
            @Override
            public ValidateProbeOutputInner call(ServiceResponse<ValidateProbeOutputInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Check if the probe path is a valid path and the file can be accessed. Probe path is the path to a file hosted on the origin server to help accelerate the delivery of dynamic content via the CDN endpoint. This path is relative to the origin path specified in the endpoint configuration.
     *
     * @param probeURL The probe URL to validate.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ValidateProbeOutputInner object
     */
    public Observable<ServiceResponse<ValidateProbeOutputInner>> validateProbeWithServiceResponseAsync(String probeURL) {
        if (this.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.subscriptionId() is required and cannot be null.");
        }
        if (this.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.apiVersion() is required and cannot be null.");
        }
        if (probeURL == null) {
            throw new IllegalArgumentException("Parameter probeURL is required and cannot be null.");
        }
        ValidateProbeInput validateProbeInput = new ValidateProbeInput();
        validateProbeInput.withProbeURL(probeURL);
        return service.validateProbe(this.subscriptionId(), this.apiVersion(), this.acceptLanguage(), validateProbeInput, this.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ValidateProbeOutputInner>>>() {
                @Override
                public Observable<ServiceResponse<ValidateProbeOutputInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ValidateProbeOutputInner> clientResponse = validateProbeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ValidateProbeOutputInner> validateProbeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.restClient().responseBuilderFactory().<ValidateProbeOutputInner, ErrorResponseException>newInstance(this.serializerAdapter())
                .register(200, new TypeToken<ValidateProbeOutputInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
