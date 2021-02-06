// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.DataFlowDebugSessionsImpl;
import com.azure.analytics.synapse.artifacts.models.AddDataFlowToDebugSessionResponse;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.CreateDataFlowDebugSessionRequest;
import com.azure.analytics.synapse.artifacts.models.CreateDataFlowDebugSessionResponse;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugCommandRequest;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugCommandResponse;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugPackage;
import com.azure.analytics.synapse.artifacts.models.DataFlowDebugSessionInfo;
import com.azure.analytics.synapse.artifacts.models.DeleteDataFlowDebugSessionRequest;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class DataFlowDebugSessionClient {
    private final DataFlowDebugSessionsImpl serviceClient;

    /**
     * Initializes an instance of DataFlowDebugSessions client.
     *
     * @param serviceClient the service client implementation.
     */
    DataFlowDebugSessionClient(DataFlowDebugSessionsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CreateDataFlowDebugSessionResponse createDataFlowDebugSession(CreateDataFlowDebugSessionRequest request) {
        return this.serviceClient.createDataFlowDebugSession(request);
    }

    /**
     * Creates a data flow debug session.
     *
     * @param request Data flow debug session definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for creating data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CreateDataFlowDebugSessionResponse> createDataFlowDebugSessionWithResponse(
            CreateDataFlowDebugSessionRequest request, Context context) {
        return this.serviceClient.createDataFlowDebugSessionWithResponse(request, context);
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspace() {
        return this.serviceClient.queryDataFlowDebugSessionsByWorkspace();
    }

    /**
     * Query all active data flow debug sessions.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of active debug sessions.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowDebugSessionInfo> queryDataFlowDebugSessionsByWorkspace(Context context) {
        return this.serviceClient.queryDataFlowDebugSessionsByWorkspace(context);
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public AddDataFlowToDebugSessionResponse addDataFlow(DataFlowDebugPackage request) {
        return this.serviceClient.addDataFlow(request);
    }

    /**
     * Add a data flow into debug session.
     *
     * @param request Data flow debug session definition with debug content.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure for starting data flow debug session.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<AddDataFlowToDebugSessionResponse> addDataFlowWithResponse(
            DataFlowDebugPackage request, Context context) {
        return this.serviceClient.addDataFlowWithResponse(request, context);
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataFlowDebugSession(DeleteDataFlowDebugSessionRequest request) {
        this.serviceClient.deleteDataFlowDebugSession(request);
    }

    /**
     * Deletes a data flow debug session.
     *
     * @param request Data flow debug session definition for deletion.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteDataFlowDebugSessionWithResponse(
            DeleteDataFlowDebugSessionRequest request, Context context) {
        return this.serviceClient.deleteDataFlowDebugSessionWithResponse(request, context);
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowDebugCommandResponse executeCommand(DataFlowDebugCommandRequest request) {
        return this.serviceClient.executeCommand(request);
    }

    /**
     * Execute a data flow debug command.
     *
     * @param request Data flow debug command definition.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response body structure of data flow result for data preview, statistics or expression preview.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataFlowDebugCommandResponse> executeCommandWithResponse(
            DataFlowDebugCommandRequest request, Context context) {
        return this.serviceClient.executeCommandWithResponse(request, context);
    }
}
