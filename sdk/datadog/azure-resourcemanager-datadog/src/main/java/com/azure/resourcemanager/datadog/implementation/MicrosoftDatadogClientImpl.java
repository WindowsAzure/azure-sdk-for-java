// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datadog.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datadog.fluent.ApiKeysClient;
import com.azure.resourcemanager.datadog.fluent.HostsClient;
import com.azure.resourcemanager.datadog.fluent.LinkedResourcesClient;
import com.azure.resourcemanager.datadog.fluent.MarketplaceAgreementsClient;
import com.azure.resourcemanager.datadog.fluent.MicrosoftDatadogClient;
import com.azure.resourcemanager.datadog.fluent.MonitoredResourcesClient;
import com.azure.resourcemanager.datadog.fluent.MonitorsClient;
import com.azure.resourcemanager.datadog.fluent.OperationsClient;
import com.azure.resourcemanager.datadog.fluent.RefreshSetPasswordsClient;
import com.azure.resourcemanager.datadog.fluent.SingleSignOnConfigurationsClient;
import com.azure.resourcemanager.datadog.fluent.TagRulesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the MicrosoftDatadogClientImpl type. */
@ServiceClient(builder = MicrosoftDatadogClientBuilder.class)
public final class MicrosoftDatadogClientImpl implements MicrosoftDatadogClient {
    private final ClientLogger logger = new ClientLogger(MicrosoftDatadogClientImpl.class);

    /** The Microsoft Azure subscription ID. */
    private final String subscriptionId;

    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The MarketplaceAgreementsClient object to access its operations. */
    private final MarketplaceAgreementsClient marketplaceAgreements;

    /**
     * Gets the MarketplaceAgreementsClient object to access its operations.
     *
     * @return the MarketplaceAgreementsClient object.
     */
    public MarketplaceAgreementsClient getMarketplaceAgreements() {
        return this.marketplaceAgreements;
    }

    /** The ApiKeysClient object to access its operations. */
    private final ApiKeysClient apiKeys;

    /**
     * Gets the ApiKeysClient object to access its operations.
     *
     * @return the ApiKeysClient object.
     */
    public ApiKeysClient getApiKeys() {
        return this.apiKeys;
    }

    /** The HostsClient object to access its operations. */
    private final HostsClient hosts;

    /**
     * Gets the HostsClient object to access its operations.
     *
     * @return the HostsClient object.
     */
    public HostsClient getHosts() {
        return this.hosts;
    }

    /** The LinkedResourcesClient object to access its operations. */
    private final LinkedResourcesClient linkedResources;

    /**
     * Gets the LinkedResourcesClient object to access its operations.
     *
     * @return the LinkedResourcesClient object.
     */
    public LinkedResourcesClient getLinkedResources() {
        return this.linkedResources;
    }

    /** The MonitoredResourcesClient object to access its operations. */
    private final MonitoredResourcesClient monitoredResources;

    /**
     * Gets the MonitoredResourcesClient object to access its operations.
     *
     * @return the MonitoredResourcesClient object.
     */
    public MonitoredResourcesClient getMonitoredResources() {
        return this.monitoredResources;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The MonitorsClient object to access its operations. */
    private final MonitorsClient monitors;

    /**
     * Gets the MonitorsClient object to access its operations.
     *
     * @return the MonitorsClient object.
     */
    public MonitorsClient getMonitors() {
        return this.monitors;
    }

    /** The RefreshSetPasswordsClient object to access its operations. */
    private final RefreshSetPasswordsClient refreshSetPasswords;

    /**
     * Gets the RefreshSetPasswordsClient object to access its operations.
     *
     * @return the RefreshSetPasswordsClient object.
     */
    public RefreshSetPasswordsClient getRefreshSetPasswords() {
        return this.refreshSetPasswords;
    }

    /** The TagRulesClient object to access its operations. */
    private final TagRulesClient tagRules;

    /**
     * Gets the TagRulesClient object to access its operations.
     *
     * @return the TagRulesClient object.
     */
    public TagRulesClient getTagRules() {
        return this.tagRules;
    }

    /** The SingleSignOnConfigurationsClient object to access its operations. */
    private final SingleSignOnConfigurationsClient singleSignOnConfigurations;

    /**
     * Gets the SingleSignOnConfigurationsClient object to access its operations.
     *
     * @return the SingleSignOnConfigurationsClient object.
     */
    public SingleSignOnConfigurationsClient getSingleSignOnConfigurations() {
        return this.singleSignOnConfigurations;
    }

    /**
     * Initializes an instance of MicrosoftDatadogClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The Microsoft Azure subscription ID.
     * @param endpoint server parameter.
     */
    MicrosoftDatadogClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2020-02-01-preview";
        this.marketplaceAgreements = new MarketplaceAgreementsClientImpl(this);
        this.apiKeys = new ApiKeysClientImpl(this);
        this.hosts = new HostsClientImpl(this);
        this.linkedResources = new LinkedResourcesClientImpl(this);
        this.monitoredResources = new MonitoredResourcesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.monitors = new MonitorsClientImpl(this);
        this.refreshSetPasswords = new RefreshSetPasswordsClientImpl(this);
        this.tagRules = new TagRulesClientImpl(this);
        this.singleSignOnConfigurations = new SingleSignOnConfigurationsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        for (Map.Entry<Object, Object> entry : this.getContext().getValues().entrySet()) {
            context = context.addData(entry.getKey(), entry.getValue());
        }
        return context;
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException ioe) {
                        logger.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }
}
