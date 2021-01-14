// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.DataFlowsImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorException;
import com.azure.analytics.synapse.artifacts.models.DataFlowResource;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class DataFlowClient {
    private final DataFlowsImpl serviceClient;

    /**
     * Initializes an instance of DataFlows client.
     *
     * @param serviceClient the service client implementation.
     */
    DataFlowClient(DataFlowsImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResource createOrUpdateDataFlow(String dataFlowName, DataFlowResource dataFlow, String ifMatch) {
        return this.serviceClient.createOrUpdateDataFlow(dataFlowName, dataFlow, ifMatch);
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResource createOrUpdateDataFlow(String dataFlowName, DataFlowResource dataFlow) {
        return this.serviceClient.createOrUpdateDataFlow(dataFlowName, dataFlow);
    }

    /**
     * Creates or updates a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param dataFlow Data flow resource definition.
     * @param ifMatch ETag of the data flow entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return data flow resource type.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataFlowResource> createOrUpdateDataFlowWithResponse(
            String dataFlowName, DataFlowResource dataFlow, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateDataFlowWithResponse(dataFlowName, dataFlow, ifMatch, context);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResource getDataFlow(String dataFlowName, String ifNoneMatch) {
        return this.serviceClient.getDataFlow(dataFlowName, ifNoneMatch);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DataFlowResource getDataFlow(String dataFlowName) {
        return this.serviceClient.getDataFlow(dataFlowName);
    }

    /**
     * Gets a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param ifNoneMatch ETag of the data flow entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a data flow.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<DataFlowResource> getDataFlowWithResponse(
            String dataFlowName, String ifNoneMatch, Context context) {
        return this.serviceClient.getDataFlowWithResponse(dataFlowName, ifNoneMatch, context);
    }

    /**
     * Deletes a data flow.
     *
     * @param dataFlowName The data flow name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDataFlow(String dataFlowName) {
        this.serviceClient.deleteDataFlow(dataFlowName);
    }

    /**
     * Deletes a data flow.
     *
     * @param dataFlowName The data flow name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteDataFlowWithResponse(String dataFlowName, Context context) {
        return this.serviceClient.deleteDataFlowWithResponse(dataFlowName, context);
    }

    /**
     * Renames a dataflow.
     *
     * @param dataFlowName The data flow name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameDataFlow(String dataFlowName, ArtifactRenameRequest request) {
        this.serviceClient.renameDataFlow(dataFlowName, request);
    }

    /**
     * Renames a dataflow.
     *
     * @param dataFlowName The data flow name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameDataFlowWithResponse(
            String dataFlowName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renameDataFlowWithResponse(dataFlowName, request, context);
    }

    /**
     * Lists data flows.
     *
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowResource> getDataFlowsByWorkspace() {
        return this.serviceClient.getDataFlowsByWorkspace();
    }

    /**
     * Lists data flows.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of data flow resources.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<DataFlowResource> getDataFlowsByWorkspace(Context context) {
        return this.serviceClient.getDataFlowsByWorkspace(context);
    }
}
