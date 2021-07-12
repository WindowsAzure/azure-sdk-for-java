// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.implementation;

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
import com.azure.resourcemanager.datafactory.fluent.ActivityRunsClient;
import com.azure.resourcemanager.datafactory.fluent.DataFactoryManagementClient;
import com.azure.resourcemanager.datafactory.fluent.DataFlowDebugSessionsClient;
import com.azure.resourcemanager.datafactory.fluent.DataFlowsClient;
import com.azure.resourcemanager.datafactory.fluent.DatasetsClient;
import com.azure.resourcemanager.datafactory.fluent.ExposureControlsClient;
import com.azure.resourcemanager.datafactory.fluent.FactoriesClient;
import com.azure.resourcemanager.datafactory.fluent.IntegrationRuntimeNodesClient;
import com.azure.resourcemanager.datafactory.fluent.IntegrationRuntimeObjectMetadatasClient;
import com.azure.resourcemanager.datafactory.fluent.IntegrationRuntimesClient;
import com.azure.resourcemanager.datafactory.fluent.LinkedServicesClient;
import com.azure.resourcemanager.datafactory.fluent.ManagedPrivateEndpointsClient;
import com.azure.resourcemanager.datafactory.fluent.ManagedVirtualNetworksClient;
import com.azure.resourcemanager.datafactory.fluent.OperationsClient;
import com.azure.resourcemanager.datafactory.fluent.PipelineRunsClient;
import com.azure.resourcemanager.datafactory.fluent.PipelinesClient;
import com.azure.resourcemanager.datafactory.fluent.PrivateEndPointConnectionsClient;
import com.azure.resourcemanager.datafactory.fluent.PrivateEndpointConnectionOperationsClient;
import com.azure.resourcemanager.datafactory.fluent.PrivateLinkResourcesClient;
import com.azure.resourcemanager.datafactory.fluent.TriggerRunsClient;
import com.azure.resourcemanager.datafactory.fluent.TriggersClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Map;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the DataFactoryManagementClientImpl type. */
@ServiceClient(builder = DataFactoryManagementClientBuilder.class)
public final class DataFactoryManagementClientImpl implements DataFactoryManagementClient {
    private final ClientLogger logger = new ClientLogger(DataFactoryManagementClientImpl.class);

    /** The subscription identifier. */
    private final String subscriptionId;

    /**
     * Gets The subscription identifier.
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

    /** The FactoriesClient object to access its operations. */
    private final FactoriesClient factories;

    /**
     * Gets the FactoriesClient object to access its operations.
     *
     * @return the FactoriesClient object.
     */
    public FactoriesClient getFactories() {
        return this.factories;
    }

    /** The ExposureControlsClient object to access its operations. */
    private final ExposureControlsClient exposureControls;

    /**
     * Gets the ExposureControlsClient object to access its operations.
     *
     * @return the ExposureControlsClient object.
     */
    public ExposureControlsClient getExposureControls() {
        return this.exposureControls;
    }

    /** The IntegrationRuntimesClient object to access its operations. */
    private final IntegrationRuntimesClient integrationRuntimes;

    /**
     * Gets the IntegrationRuntimesClient object to access its operations.
     *
     * @return the IntegrationRuntimesClient object.
     */
    public IntegrationRuntimesClient getIntegrationRuntimes() {
        return this.integrationRuntimes;
    }

    /** The IntegrationRuntimeObjectMetadatasClient object to access its operations. */
    private final IntegrationRuntimeObjectMetadatasClient integrationRuntimeObjectMetadatas;

    /**
     * Gets the IntegrationRuntimeObjectMetadatasClient object to access its operations.
     *
     * @return the IntegrationRuntimeObjectMetadatasClient object.
     */
    public IntegrationRuntimeObjectMetadatasClient getIntegrationRuntimeObjectMetadatas() {
        return this.integrationRuntimeObjectMetadatas;
    }

    /** The IntegrationRuntimeNodesClient object to access its operations. */
    private final IntegrationRuntimeNodesClient integrationRuntimeNodes;

    /**
     * Gets the IntegrationRuntimeNodesClient object to access its operations.
     *
     * @return the IntegrationRuntimeNodesClient object.
     */
    public IntegrationRuntimeNodesClient getIntegrationRuntimeNodes() {
        return this.integrationRuntimeNodes;
    }

    /** The LinkedServicesClient object to access its operations. */
    private final LinkedServicesClient linkedServices;

    /**
     * Gets the LinkedServicesClient object to access its operations.
     *
     * @return the LinkedServicesClient object.
     */
    public LinkedServicesClient getLinkedServices() {
        return this.linkedServices;
    }

    /** The DatasetsClient object to access its operations. */
    private final DatasetsClient datasets;

    /**
     * Gets the DatasetsClient object to access its operations.
     *
     * @return the DatasetsClient object.
     */
    public DatasetsClient getDatasets() {
        return this.datasets;
    }

    /** The PipelinesClient object to access its operations. */
    private final PipelinesClient pipelines;

    /**
     * Gets the PipelinesClient object to access its operations.
     *
     * @return the PipelinesClient object.
     */
    public PipelinesClient getPipelines() {
        return this.pipelines;
    }

    /** The PipelineRunsClient object to access its operations. */
    private final PipelineRunsClient pipelineRuns;

    /**
     * Gets the PipelineRunsClient object to access its operations.
     *
     * @return the PipelineRunsClient object.
     */
    public PipelineRunsClient getPipelineRuns() {
        return this.pipelineRuns;
    }

    /** The ActivityRunsClient object to access its operations. */
    private final ActivityRunsClient activityRuns;

    /**
     * Gets the ActivityRunsClient object to access its operations.
     *
     * @return the ActivityRunsClient object.
     */
    public ActivityRunsClient getActivityRuns() {
        return this.activityRuns;
    }

    /** The TriggersClient object to access its operations. */
    private final TriggersClient triggers;

    /**
     * Gets the TriggersClient object to access its operations.
     *
     * @return the TriggersClient object.
     */
    public TriggersClient getTriggers() {
        return this.triggers;
    }

    /** The TriggerRunsClient object to access its operations. */
    private final TriggerRunsClient triggerRuns;

    /**
     * Gets the TriggerRunsClient object to access its operations.
     *
     * @return the TriggerRunsClient object.
     */
    public TriggerRunsClient getTriggerRuns() {
        return this.triggerRuns;
    }

    /** The DataFlowsClient object to access its operations. */
    private final DataFlowsClient dataFlows;

    /**
     * Gets the DataFlowsClient object to access its operations.
     *
     * @return the DataFlowsClient object.
     */
    public DataFlowsClient getDataFlows() {
        return this.dataFlows;
    }

    /** The DataFlowDebugSessionsClient object to access its operations. */
    private final DataFlowDebugSessionsClient dataFlowDebugSessions;

    /**
     * Gets the DataFlowDebugSessionsClient object to access its operations.
     *
     * @return the DataFlowDebugSessionsClient object.
     */
    public DataFlowDebugSessionsClient getDataFlowDebugSessions() {
        return this.dataFlowDebugSessions;
    }

    /** The ManagedVirtualNetworksClient object to access its operations. */
    private final ManagedVirtualNetworksClient managedVirtualNetworks;

    /**
     * Gets the ManagedVirtualNetworksClient object to access its operations.
     *
     * @return the ManagedVirtualNetworksClient object.
     */
    public ManagedVirtualNetworksClient getManagedVirtualNetworks() {
        return this.managedVirtualNetworks;
    }

    /** The ManagedPrivateEndpointsClient object to access its operations. */
    private final ManagedPrivateEndpointsClient managedPrivateEndpoints;

    /**
     * Gets the ManagedPrivateEndpointsClient object to access its operations.
     *
     * @return the ManagedPrivateEndpointsClient object.
     */
    public ManagedPrivateEndpointsClient getManagedPrivateEndpoints() {
        return this.managedPrivateEndpoints;
    }

    /** The PrivateEndPointConnectionsClient object to access its operations. */
    private final PrivateEndPointConnectionsClient privateEndPointConnections;

    /**
     * Gets the PrivateEndPointConnectionsClient object to access its operations.
     *
     * @return the PrivateEndPointConnectionsClient object.
     */
    public PrivateEndPointConnectionsClient getPrivateEndPointConnections() {
        return this.privateEndPointConnections;
    }

    /** The PrivateEndpointConnectionOperationsClient object to access its operations. */
    private final PrivateEndpointConnectionOperationsClient privateEndpointConnectionOperations;

    /**
     * Gets the PrivateEndpointConnectionOperationsClient object to access its operations.
     *
     * @return the PrivateEndpointConnectionOperationsClient object.
     */
    public PrivateEndpointConnectionOperationsClient getPrivateEndpointConnectionOperations() {
        return this.privateEndpointConnectionOperations;
    }

    /** The PrivateLinkResourcesClient object to access its operations. */
    private final PrivateLinkResourcesClient privateLinkResources;

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     *
     * @return the PrivateLinkResourcesClient object.
     */
    public PrivateLinkResourcesClient getPrivateLinkResources() {
        return this.privateLinkResources;
    }

    /**
     * Initializes an instance of DataFactoryManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The subscription identifier.
     * @param endpoint server parameter.
     */
    DataFactoryManagementClientImpl(
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
        this.apiVersion = "2018-06-01";
        this.operations = new OperationsClientImpl(this);
        this.factories = new FactoriesClientImpl(this);
        this.exposureControls = new ExposureControlsClientImpl(this);
        this.integrationRuntimes = new IntegrationRuntimesClientImpl(this);
        this.integrationRuntimeObjectMetadatas = new IntegrationRuntimeObjectMetadatasClientImpl(this);
        this.integrationRuntimeNodes = new IntegrationRuntimeNodesClientImpl(this);
        this.linkedServices = new LinkedServicesClientImpl(this);
        this.datasets = new DatasetsClientImpl(this);
        this.pipelines = new PipelinesClientImpl(this);
        this.pipelineRuns = new PipelineRunsClientImpl(this);
        this.activityRuns = new ActivityRunsClientImpl(this);
        this.triggers = new TriggersClientImpl(this);
        this.triggerRuns = new TriggerRunsClientImpl(this);
        this.dataFlows = new DataFlowsClientImpl(this);
        this.dataFlowDebugSessions = new DataFlowDebugSessionsClientImpl(this);
        this.managedVirtualNetworks = new ManagedVirtualNetworksClientImpl(this);
        this.managedPrivateEndpoints = new ManagedPrivateEndpointsClientImpl(this);
        this.privateEndPointConnections = new PrivateEndPointConnectionsClientImpl(this);
        this.privateEndpointConnectionOperations = new PrivateEndpointConnectionOperationsClientImpl(this);
        this.privateLinkResources = new PrivateLinkResourcesClientImpl(this);
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
                    } catch (IOException | RuntimeException ioe) {
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
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
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
