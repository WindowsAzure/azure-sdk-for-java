// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.digitaltwins.core.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.serializer.CollectionFormat;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.digitaltwins.core.implementation.models.DigitalTwinModelsListOptions;
import com.azure.digitaltwins.core.implementation.models.ErrorResponseException;
import com.azure.digitaltwins.core.implementation.models.PagedModelDataCollection;
import com.azure.digitaltwins.core.models.ModelData;
import java.util.List;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in DigitalTwinModels. */
public final class DigitalTwinModelsImpl {
    /** The proxy service used to perform REST calls. */
    private final DigitalTwinModelsService service;

    /** The service client containing this operation class. */
    private final AzureDigitalTwinsAPIImpl client;

    /**
     * Initializes an instance of DigitalTwinModelsImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    DigitalTwinModelsImpl(AzureDigitalTwinsAPIImpl client) {
        this.service =
                RestProxy.create(
                        DigitalTwinModelsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for AzureDigitalTwinsAPIDigitalTwinModels to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "AzureDigitalTwinsAPI")
    private interface DigitalTwinModelsService {
        @Post("/models")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<List<ModelData>>> add(
                @HostParam("$host") String host,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") List<Object> models,
                Context context);

        @Get("/models")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PagedModelDataCollection>> list(
                @HostParam("$host") String host,
                @QueryParam("dependenciesFor") String dependenciesFor,
                @QueryParam("includeModelDefinition") Boolean includeModelDefinition,
                @HeaderParam("x-ms-max-item-count") Integer maxItemCount,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("/models/{id}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<ModelData>> getById(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("includeModelDefinition") Boolean includeModelDefinition,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Patch("/models/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> update(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json-patch+json") List<Object> updateModel,
                Context context);

        @Delete("/models/{id}")
        @ExpectedResponses({204})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<Void>> delete(
                @HostParam("$host") String host,
                @PathParam("id") String id,
                @QueryParam("api-version") String apiVersion,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorResponseException.class)
        Mono<Response<PagedModelDataCollection>> listNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Uploads one or more models. When any error occurs, no models are uploaded. Status codes: 200 (OK): Success. 400
     * (Bad Request): The request is invalid. 409 (Conflict): One or more of the provided models already exist.
     *
     * @param models Array of any.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of ModelData objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<List<ModelData>>> addWithResponseAsync(List<Object> models, Context context) {
        return service.add(this.client.getHost(), this.client.getApiVersion(), models, context);
    }

    /**
     * Retrieves model metadata and, optionally, model definitions. Status codes: 200 (OK): Success. 400 (Bad Request):
     * The request is invalid.
     *
     * @param dependenciesFor Array of Get0ItemsItem.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param digitalTwinModelsListOptions Parameter group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of ModelData objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ModelData>> listSinglePageAsync(
            List<String> dependenciesFor,
            Boolean includeModelDefinition,
            DigitalTwinModelsListOptions digitalTwinModelsListOptions,
            Context context) {
        Integer maxItemCountInternal = null;
        if (digitalTwinModelsListOptions != null) {
            maxItemCountInternal = digitalTwinModelsListOptions.getMaxItemCount();
        }
        Integer maxItemCount = maxItemCountInternal;
        String dependenciesForConverted =
                JacksonAdapter.createDefaultSerializerAdapter().serializeList(dependenciesFor, CollectionFormat.CSV);
        return service.list(
                        this.client.getHost(),
                        dependenciesForConverted,
                        includeModelDefinition,
                        maxItemCount,
                        this.client.getApiVersion(),
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Retrieves model metadata and optionally the model definition. Status codes: 200 (OK): Success. 404 (Not Found):
     * There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param includeModelDefinition When true the model definition will be returned as part of the result.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a model definition and metadata for that model.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<ModelData>> getByIdWithResponseAsync(
            String id, Boolean includeModelDefinition, Context context) {
        return service.getById(this.client.getHost(), id, includeModelDefinition, this.client.getApiVersion(), context);
    }

    /**
     * Updates the metadata for a model. Status codes: 200 (OK): Success. 400 (Bad Request): The request is invalid. 404
     * (Not Found): There is no model with the provided id.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param updateModel Array of any.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> updateWithResponseAsync(String id, List<Object> updateModel, Context context) {
        return service.update(this.client.getHost(), id, this.client.getApiVersion(), updateModel, context);
    }

    /**
     * Deletes a model. A model can only be deleted if no other models reference it. Status codes: 204 (No Content):
     * Success. 400 (Bad Request): The request is invalid. 404 (Not Found): There is no model with the provided id. 409
     * (Conflict): There are dependencies on the model that prevent it from being deleted.
     *
     * @param id The id for the model. The id is globally unique and case sensitive.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> deleteWithResponseAsync(String id, Context context) {
        return service.delete(this.client.getHost(), id, this.client.getApiVersion(), context);
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of ModelData objects.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ModelData>> listNextSinglePageAsync(String nextLink, Context context) {
        return service.listNext(nextLink, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
