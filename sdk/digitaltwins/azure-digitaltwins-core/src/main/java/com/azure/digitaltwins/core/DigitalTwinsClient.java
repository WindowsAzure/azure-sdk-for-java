// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.digitaltwins.core;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.digitaltwins.core.models.*;

import java.util.List;

/**
 * This class provides a client for interacting synchronously with an Azure Digital Twins instance.
 *
 * <p>
 * This client is instantiated through {@link DigitalTwinsClientBuilder}.
 * </p>
 *
 * <p>
 * This client allows for management of digital twins, their components, and their relationships. It also allows for managing
 * the digital twin models and event routes tied to your Azure Digital Twins instance.
 * </p>
 */
@ServiceClient(builder = DigitalTwinsClientBuilder.class)
public final class DigitalTwinsClient {
    private final DigitalTwinsAsyncClient digitalTwinsAsyncClient;

    DigitalTwinsClient(DigitalTwinsAsyncClient digitalTwinsAsyncClient) {
        this.digitalTwinsAsyncClient = digitalTwinsAsyncClient;
    }

    /**
     * Gets the Azure Digital Twins service API version that this client is configured to use for all service requests.
     * Unless configured while building this client through {@link DigitalTwinsClientBuilder#serviceVersion(DigitalTwinsServiceVersion)},
     * this value will be equal to the latest service API version supported by this client.
     *
     * @return The Azure Digital Twins service API version.
     */
    public DigitalTwinsServiceVersion getServiceVersion() {
        return this.digitalTwinsAsyncClient.getServiceVersion();
    }

    //region Digital twin APIs

    /**
     * Creates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param digitalTwin The application/json digital twin to create.
     * @return The application/json string representing the digital twin created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String createDigitalTwin(String digitalTwinId, String digitalTwin)
    {
        return createDigitalTwinWithResponse(digitalTwinId, digitalTwin, Context.NONE).getValue();
    }

    /**
     * Creates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param digitalTwin The application/json digital twin to create.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the application/json string representing the digital twin created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<String> createDigitalTwinWithResponse(String digitalTwinId, String digitalTwin, Context context)
    {
        return digitalTwinsAsyncClient.createDigitalTwinWithResponse(digitalTwinId, digitalTwin, context).block();
    }

    /**
     * Creates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param clazz The model class to deserialize the response with.
     * @param <T> The generic type to deserialize the digital twin with.
     * @param digitalTwin The application/json digital twin to create.
     * @return The deserialized application/json object representing the digital twin created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> T createDigitalTwin(String digitalTwinId, Object digitalTwin, Class<T> clazz)
    {
        return createDigitalTwinWithResponse(digitalTwinId, digitalTwin, clazz, Context.NONE).getValue();
    }

    /**
     * Creates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param digitalTwin The application/json digital twin to create.
     * @param clazz The model class to deserialize the response with.
     * @param <T> The generic type to deserialize the digital twin with.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the deserialized application/json object representing the digital twin created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> Response<T> createDigitalTwinWithResponse(String digitalTwinId, Object digitalTwin, Class<T> clazz, Context context)
    {
        return digitalTwinsAsyncClient.createDigitalTwinWithResponse(digitalTwinId, digitalTwin, clazz, context).block();
    }

    /**
     * Gets a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     * @return The application/json string representing the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String getDigitalTwin(String digitalTwinId)
    {
        return getDigitalTwinWithResponse(digitalTwinId, Context.NONE).getValue();
    }

    /**
     * Gets a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the application/json string representing the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<String> getDigitalTwinWithResponse(String digitalTwinId, Context context)
    {
        return digitalTwinsAsyncClient.getDigitalTwinWithResponse(digitalTwinId, context).block();
    }

    /**
     * Gets a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     * @param clazz The model class to deserialize the response with.
     * @param <T> The generic type to deserialize the digital twin with.
     * @return The deserialized application/json object representing the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> T getDigitalTwin(String digitalTwinId, Class<T> clazz)
    {
        return getDigitalTwinWithResponse(digitalTwinId, clazz, Context.NONE).getValue();
    }

    /**
     * Gets a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     * @param clazz The model class to deserialize the response with.
     * @param <T> The generic type to deserialize the digital twin with.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the deserialized application/json object representing the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> DigitalTwinsResponse<T> getDigitalTwinWithResponse(String digitalTwinId, Class<T> clazz, Context context)
    {
        return digitalTwinsAsyncClient.getDigitalTwinWithResponse(digitalTwinId, clazz, context).block();
    }

    /**
     * Updates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param digitalTwinUpdateOperations The application/json-patch+json operations to be performed on the specified digital twin
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateDigitalTwin(String digitalTwinId, List<Object> digitalTwinUpdateOperations)
    {
        updateDigitalTwinWithResponse(digitalTwinId, digitalTwinUpdateOperations, new UpdateDigitalTwinRequestOptions(), Context.NONE);
    }

    /**
     * Updates a digital twin.
     *
     * @param digitalTwinId The Id of the digital twin.
     * @param digitalTwinUpdateOperations The application/json-patch+json operations to be performed on the specified digital twin
     * @param options The optional settings for this request
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse}
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<Void> updateDigitalTwinWithResponse(String digitalTwinId, List<Object> digitalTwinUpdateOperations, UpdateDigitalTwinRequestOptions options, Context context)
    {
        return digitalTwinsAsyncClient.updateDigitalTwinWithResponse(digitalTwinId, digitalTwinUpdateOperations, options, context).block();
    }

    /**
     * Deletes a digital twin. All relationships referencing the digital twin must already be deleted.
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteDigitalTwin(String digitalTwinId)
    {
        deleteDigitalTwinWithResponse(digitalTwinId, new DeleteDigitalTwinRequestOptions(), Context.NONE);
    }

    /**
     * Deletes a digital twin. All relationships referencing the digital twin must already be deleted.
     *
     * @param digitalTwinId The Id of the digital twin. The Id is unique within the service and case sensitive.
     * @param options The optional settings for this request
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteDigitalTwinWithResponse(String digitalTwinId, DeleteDigitalTwinRequestOptions options, Context context)
    {
        return digitalTwinsAsyncClient.deleteDigitalTwinWithResponse(digitalTwinId, options, context).block();
    }

    //endregion Digital twin APIs

    //region Relationship APIs

    /**
     * Creates a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be created.
     * @param relationship The application/json relationship to be created.
     * @return The application/json relationship created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String createRelationship(String digitalTwinId, String relationshipId, String relationship) {
        return createRelationshipWithResponse(digitalTwinId, relationshipId, relationship, Context.NONE).getValue();
    }

    /**
     * Creates a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be created.
     * @param relationship The application/json relationship to be created.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response containing the application/json relationship created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<String> createRelationshipWithResponse(String digitalTwinId, String relationshipId, String relationship, Context context) {
        return digitalTwinsAsyncClient.createRelationshipWithResponse(digitalTwinId, relationshipId, relationship, context).block();
    }

    /**
     * Creates a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be created.
     * @param relationship The relationship to be created.
     * @param clazz The model class to convert the relationship to.
     * @param <T> The generic type to convert the relationship to.
     * @return The relationship created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> T createRelationship(String digitalTwinId, String relationshipId, Object relationship, Class<T> clazz) {
        return createRelationshipWithResponse(digitalTwinId, relationshipId, relationship, clazz, Context.NONE).getValue();
    }

    /**
     * Creates a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be created.
     * @param relationship The relationship to be created.
     * @param clazz The model class to convert the relationship to.
     * @param <T> The generic type to convert the relationship to.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response containing the relationship created.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> DigitalTwinsResponse<T> createRelationshipWithResponse(String digitalTwinId, String relationshipId, Object relationship, Class<T> clazz, Context context) {
        return digitalTwinsAsyncClient.createRelationshipWithResponse(digitalTwinId, relationshipId, relationship, clazz, context).block();
    }

    /**
     * Gets a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to retrieve.
     * @return The application/json relationship corresponding to the provided relationshipId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String getRelationship(String digitalTwinId, String relationshipId) {
        return getRelationshipWithResponse(digitalTwinId, relationshipId, Context.NONE).getValue();
    }

    /**
     * Gets a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to retrieve.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response containing the application/json relationship corresponding to the provided relationshipId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<String> getRelationshipWithResponse(String digitalTwinId, String relationshipId, Context context) {
        return digitalTwinsAsyncClient.getRelationshipWithResponse(digitalTwinId, relationshipId, context).block();
    }

    /**
     * Gets a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to retrieve.
     * @param clazz The model class to convert the relationship to.
     * @param <T> The generic type to convert the relationship to.
     * @return The relationship corresponding to the provided relationshipId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> T getRelationship(String digitalTwinId, String relationshipId, Class<T> clazz) {
        return getRelationshipWithResponse(digitalTwinId, relationshipId, clazz, Context.NONE).getValue();
    }

    /**
     * Gets a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to retrieve.
     * @param clazz The model class to convert the relationship to.
     * @param <T> The generic type to convert the relationship to.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response containing the relationship corresponding to the provided relationshipId.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> DigitalTwinsResponse<T> getRelationshipWithResponse(String digitalTwinId, String relationshipId, Class<T> clazz, Context context) {
        return digitalTwinsAsyncClient.getRelationshipWithResponse(digitalTwinId, relationshipId, clazz, context).block();
    }

    /**
     * Updates the properties of a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be updated.
     * @param relationshipUpdateOperations The list of application/json-patch+json operations to be performed on the specified digital twin's relationship.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateRelationship(String digitalTwinId, String relationshipId, List<Object> relationshipUpdateOperations) {
        updateRelationshipWithResponse(digitalTwinId, relationshipId, relationshipUpdateOperations, new UpdateRelationshipRequestOptions(), Context.NONE);
    }

    /**
     * Updates the properties of a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to be updated.
     * @param relationshipUpdateOperations The list of application/json-patch+json operations to be performed on the specified digital twin's relationship.
     * @param options The optional settings for this request.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<Void> updateRelationshipWithResponse(String digitalTwinId, String relationshipId, List<Object> relationshipUpdateOperations, UpdateRelationshipRequestOptions options, Context context) {
        return digitalTwinsAsyncClient.updateRelationshipWithResponse(digitalTwinId, relationshipId, relationshipUpdateOperations, options, context).block();
    }

    /**
     * Deletes a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to delete.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteRelationship(String digitalTwinId, String relationshipId) {
        deleteRelationshipWithResponse(digitalTwinId, relationshipId, new DeleteRelationshipRequestOptions(), Context.NONE);
    }

    /**
     * Deletes a relationship on a digital twin.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipId The Id of the relationship to delete.
     * @param options The optional settings for this request.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The Http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteRelationshipWithResponse(String digitalTwinId, String relationshipId, DeleteRelationshipRequestOptions options, Context context) {
        return digitalTwinsAsyncClient.deleteRelationshipWithResponse(digitalTwinId, relationshipId, options, context).block();
    }

    /**
     * Gets all the relationships on a digital twin by iterating through a collection.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @return A {@link PagedIterable} of application/json relationships belonging to the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> listRelationships(String digitalTwinId) {
        return listRelationships(digitalTwinId, null, Context.NONE);
    }

    /**
     * Gets all the relationships on a digital twin filtered by the relationship name, by iterating through a collection.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipName The name of a relationship to filter to.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} of application/json relationships belonging to the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> listRelationships(String digitalTwinId, String relationshipName, Context context) {
        return new PagedIterable<>(digitalTwinsAsyncClient.listRelationships(digitalTwinId, relationshipName, context));
    }

    /**
     * Gets all the relationships on a digital twin by iterating through a collection.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param clazz The model class to convert the relationship to. Since a digital twin might have relationships conforming to different models, it is advisable to convert them to a generic model like {@link BasicRelationship}.
     * @param <T> The generic type to convert the relationship to.
     * @return A {@link PagedIterable} of relationships belonging to the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public <T> PagedIterable<T> listRelationships(String digitalTwinId, Class<T> clazz) {
        return listRelationships(digitalTwinId, null, clazz, Context.NONE);
    }

    /**
     * Gets all the relationships on a digital twin filtered by the relationship name, by iterating through a collection.
     *
     * @param digitalTwinId The Id of the source digital twin.
     * @param relationshipName The name of a relationship to filter to.
     * @param clazz The model class to convert the relationship to.
     * @param <T> The generic type to convert the relationship to.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} of relationships belonging to the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public <T> PagedIterable<T> listRelationships(String digitalTwinId, String relationshipName, Class<T> clazz, Context context) {
        return new PagedIterable<>(digitalTwinsAsyncClient.listRelationships(digitalTwinId, relationshipName, clazz, context));
    }

    /**
     * Gets all the relationships referencing a digital twin as a target by iterating through a collection.
     *
     * @param digitalTwinId The Id of the target digital twin.
     * @return A {@link PagedIterable} of application/json relationships directed towards the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IncomingRelationship> listIncomingRelationships(String digitalTwinId) {
        return listIncomingRelationships(digitalTwinId, Context.NONE);
    }

    /**
     * Gets all the relationships referencing a digital twin as a target by iterating through a collection.
     *
     * @param digitalTwinId The Id of the target digital twin.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} of application/json relationships directed towards the specified digital twin and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<IncomingRelationship> listIncomingRelationships(String digitalTwinId, Context context) {
        return new PagedIterable<>(digitalTwinsAsyncClient.listIncomingRelationships(digitalTwinId, context));
    }

    //endregion Relationship APIs

    //region Model APIs

    /**
     * Creates one or many models.
     * @param models The list of models to create. Each string corresponds to exactly one model.
     * @return A List of created models.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public List<ModelData> createModels(List<String> models) {
        return createModelsWithResponse(models, Context.NONE).getValue();
    }

    /**
     * Creates one or many models.
     * @param models The list of models to create. Each string corresponds to exactly one model.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A List of created models and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public Response<List<ModelData>> createModelsWithResponse(List<String> models, Context context) {
        return digitalTwinsAsyncClient.createModelsWithResponse(models, context).block();
    }

    /**
     * Gets a model, including the model metadata and the model definition.
     * @param modelId The Id of the model.
     * @return The ModelData
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public ModelData getModel(String modelId) {

        return getModelWithResponse(modelId, Context.NONE).getValue();
    }

    /**
     * Gets a model, including the model metadata and the model definition.
     * @param modelId The Id of the model.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The ModelData and the http response
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<ModelData> getModelWithResponse(String modelId, Context context) {
        return digitalTwinsAsyncClient.getModelWithResponse(modelId, context).block();
    }

    /**
     * Gets the list of models by iterating through a collection.
     * @param listModelOptions The options to follow when listing the models. For example, the page size hint can be specified.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} of ModelData and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModelData> listModels(ListModelOptions listModelOptions, Context context) {
        return new PagedIterable<>(
            digitalTwinsAsyncClient.listModels(listModelOptions, context));
    }

    /**
     * Gets the list of models by iterating through a collection.
     * @return A {@link PagedFlux} of ModelData and the http response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ModelData> listModels() {
        return new PagedIterable<>(digitalTwinsAsyncClient.listModels());
    }

    /**
     * Deletes a model.
     * @param modelId The Id for the model. The Id is globally unique and case sensitive.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteModel(String modelId) {
        deleteModelWithResponse(modelId, Context.NONE);
    }

    /**
     * Deletes a model.
     * @param modelId The Id for the model. The Id is globally unique and case sensitive.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteModelWithResponse(String modelId, Context context) {
        return digitalTwinsAsyncClient.deleteModelWithResponse(modelId, context).block();
    }

    /**
     * Decommissions a model.
     * @param modelId The Id of the model to decommission.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void decommissionModel(String modelId) {
        decommissionModelWithResponse(modelId, Context.NONE);
    }

    /**
     * Decommissions a model.
     * @param modelId The Id of the model to decommission.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> decommissionModelWithResponse(String modelId, Context context) {
        return digitalTwinsAsyncClient.decommissionModelWithResponse(modelId, context).block();
    }

    //endregion Model APIs

    //region Component APIs

    /**
     * Get a component of a digital twin.
     * @param digitalTwinId The Id of the digital twin to get the component from.
     * @param componentPath The path of the component on the digital twin to retrieve.
     * @return The application/json string representing the component of the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public String getComponent(String digitalTwinId, String componentPath) {
        return getComponentWithResponse(digitalTwinId, componentPath, Context.NONE).getValue();
    }

    /**
     * Get a component of a digital twin.
     * @param digitalTwinId The Id of the digital twin to get the component from.
     * @param componentPath The path of the component on the digital twin to retrieve.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the application/json string representing the component of the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<String> getComponentWithResponse(String digitalTwinId, String componentPath, Context context) {
        return digitalTwinsAsyncClient.getComponentWithResponse(digitalTwinId, componentPath, context).block();
    }

    /**
     * Get a component of a digital twin.
     * @param digitalTwinId The Id of the digital twin to get the component from.
     * @param componentPath The path of the component on the digital twin to retrieve.
     * @param clazz The class to deserialize the application/json component into.
     * @param <T> The generic type to deserialize the component to.
     * @return The deserialized application/json object representing the component of the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> T getComponent(String digitalTwinId, String componentPath, Class<T> clazz) {
        return getComponentWithResponse(digitalTwinId, componentPath, clazz, Context.NONE).getValue();
    }

    /**
     * Get a component of a digital twin.
     * @param digitalTwinId The Id of the digital twin to get the component from.
     * @param componentPath The path of the component on the digital twin to retrieve.
     * @param clazz The class to deserialize the application/json component into.
     * @param <T> The generic type to deserialize the component to.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link DigitalTwinsResponse} containing the deserialized application/json object representing the component of the digital twin.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public <T> DigitalTwinsResponse<T> getComponentWithResponse(String digitalTwinId, String componentPath, Class<T> clazz, Context context) {
        return digitalTwinsAsyncClient.getComponentWithResponse(digitalTwinId, componentPath, clazz, context).block();
    }

    /**
     * Patch a component on a digital twin.
     * @param digitalTwinId The Id of the digital twin that has the component to patch.
     * @param componentPath The path of the component on the digital twin.
     * @param componentUpdateOperations The application json patch to apply to the component. See {@link UpdateOperationUtility} for building
     *                                  this argument.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void updateComponent(String digitalTwinId, String componentPath, List<Object> componentUpdateOperations) {
        updateComponentWithResponse(digitalTwinId, componentPath, componentUpdateOperations, new UpdateComponentRequestOptions(), Context.NONE);
    }

    /**
     * Patch a component on a digital twin.
     * @param digitalTwinId The Id of the digital twin that has the component to patch.
     * @param componentPath The path of the component on the digital twin.
     * @param componentUpdateOperations The application json patch to apply to the component. See {@link UpdateOperationUtility} for building
     *                                  this argument.
     * @param options The optional parameters for this request.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return The http response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public DigitalTwinsResponse<Void> updateComponentWithResponse(String digitalTwinId, String componentPath, List<Object> componentUpdateOperations, UpdateComponentRequestOptions options, Context context) {
        return digitalTwinsAsyncClient.updateComponentWithResponse(digitalTwinId, componentPath, componentUpdateOperations, options, context).block();
    }

    //endregion Component APIs

    //region Query APIs

    /**
     * Query digital twins.
     *
     * @param query The query string, in SQL-like syntax.
     * @return A {@link PagedIterable} of application/json query result items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> query(String query) {
        return query(query, Context.NONE);
    }

    /**
     * Query digital twins.
     *
     * @param query The query string, in SQL-like syntax.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} of application/json query result items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<String> query(String query, Context context) {
        return new PagedIterable<>(digitalTwinsAsyncClient.query(query, context));
    }

    /**
     * Query digital twins.
     *
     * @param query The query string, in SQL-like syntax.
     * @param clazz The model class to convert the query response to.
     * @param <T> The generic type to convert the query response to.
     * @return A {@link PagedIterable} of application/json query result items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public <T> PagedIterable<T> query(String query, Class<T> clazz) {
        return query(query, clazz, Context.NONE);
    }

    /**
     * Query digital twins.
     *
     * @param query The query string, in SQL-like syntax.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @param clazz The model class to convert the query response to.
     * @param <T> The generic type to convert the query response to.
     * @return A {@link PagedIterable} of application/json query result items.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public <T> PagedIterable<T> query(String query, Class<T> clazz, Context context) {
        return new PagedIterable<>(digitalTwinsAsyncClient.query(query, clazz, context));
    }

    //endregion Query APIs

    //region Event Route APIs
    /**
     * Create an event route.
     * @param eventRouteId The id of the event route to create.
     * @param eventRoute The event route to create.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void createEventRoute(String eventRouteId, EventRoute eventRoute) {
        createEventRouteWithResponse(eventRouteId, eventRoute, Context.NONE);
    }

    /**
     * Create an event route.
     * @param eventRouteId The id of the event route to create.
     * @param eventRoute The event route to create.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> createEventRouteWithResponse(String eventRouteId, EventRoute eventRoute, Context context) {
        return this.digitalTwinsAsyncClient.createEventRouteWithResponse(eventRouteId, eventRoute, context).block();
    }

    /**
     * Get an event route.
     * @param eventRouteId The Id of the event route to get.
     * @return The retrieved event route.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public EventRoute getEventRoute(String eventRouteId) {
        return getEventRouteWithResponse(eventRouteId, Context.NONE).getValue();
    }

    /**
     * Get an event route.
     * @param eventRouteId The Id of the event route to get.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link Response} containing the retrieved event route.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<EventRoute> getEventRouteWithResponse(String eventRouteId, Context context) {
        return this.digitalTwinsAsyncClient.getEventRouteWithResponse(eventRouteId, context).block();
    }

    /**
     * Delete an event route.
     * @param eventRouteId The Id of the event route to delete.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteEventRoute(String eventRouteId)
    {
        deleteEventRouteWithResponse(eventRouteId, Context.NONE);
    }

    /**
     * Delete an event route.
     * @param eventRouteId The Id of the event route to delete.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link Response} containing no parsed value.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteEventRouteWithResponse(String eventRouteId, Context context)
    {
        return this.digitalTwinsAsyncClient.deleteEventRouteWithResponse(eventRouteId, context).block();
    }

    /**
     * List all the event routes that exist in your digital twins instance.
     * @return A {@link PagedIterable} containing all the event routes that exist in your digital twins instance.
     * This PagedIterable may take multiple service requests to iterate over all event routes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventRoute> listEventRoutes() {
        return listEventRoutes(new EventRoutesListOptions(), Context.NONE);
    }

    /**
     * List all the event routes that exist in your digital twins instance.
     * @param options The optional parameters to use when listing event routes. See {@link EventRoutesListOptions} for more details
     * on what optional parameters can be set.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link PagedIterable} containing all the event routes that exist in your digital twins instance.
     * This PagedIterable may take multiple service requests to iterate over all event routes.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<EventRoute> listEventRoutes(EventRoutesListOptions options, Context context) {
        return new PagedIterable<>(this.digitalTwinsAsyncClient.listEventRoutes(options, context));
    }

    //endregion Event Route APIs

    //region Telemetry APIs

    /**
     * Publishes telemetry from a digital twin
     * The result is then consumed by one or many destination endpoints (subscribers) defined under {@link EventRoute}
     * These event routes need to be set before publishing a telemetry message, in order for the telemetry message to be consumed.
     * @param digitalTwinId The Id of the digital twin.
     * @param payload The application/json telemetry payload to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void publishTelemetry(String digitalTwinId, String payload) {
        PublishTelemetryRequestOptions publishTelemetryRequestOptions = new PublishTelemetryRequestOptions();
        publishTelemetryWithResponse(digitalTwinId, payload, publishTelemetryRequestOptions, Context.NONE);
    }

    /**
     * Publishes telemetry from a digital twin
     * The result is then consumed by one or many destination endpoints (subscribers) defined under {@link EventRoute}
     * These event routes need to be set before publishing a telemetry message, in order for the telemetry message to be consumed.
     * @param digitalTwinId The Id of the digital twin.
     * @param payload The application/json telemetry payload to be sent.
     * @param publishTelemetryRequestOptions The additional information to be used when processing a telemetry request.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> publishTelemetryWithResponse(String digitalTwinId, String payload, PublishTelemetryRequestOptions publishTelemetryRequestOptions, Context context) {
        return digitalTwinsAsyncClient.publishTelemetryWithResponse(digitalTwinId, payload, publishTelemetryRequestOptions, context).block();
    }

    /**
     * Publishes telemetry from a digital twin's component
     * The result is then consumed by one or many destination endpoints (subscribers) defined under {@link EventRoute}
     * These event routes need to be set before publishing a telemetry message, in order for the telemetry message to be consumed.
     * @param digitalTwinId The Id of the digital twin.
     * @param componentName The name of the DTDL component.
     * @param payload The application/json telemetry payload to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void publishComponentTelemetry(String digitalTwinId, String componentName, String payload) {
        PublishTelemetryRequestOptions publishTelemetryRequestOptions = new PublishTelemetryRequestOptions();
        publishComponentTelemetryWithResponse(digitalTwinId, componentName, payload, publishTelemetryRequestOptions, Context.NONE);
    }

    /**
     * Publishes telemetry from a digital twin's component
     * The result is then consumed by one or many destination endpoints (subscribers) defined under {@link EventRoute}
     * These event routes need to be set before publishing a telemetry message, in order for the telemetry message to be consumed.
     * @param digitalTwinId The Id of the digital twin.
     * @param componentName The name of the DTDL component.
     * @param payload The application/json telemetry payload to be sent.
     * @param publishTelemetryRequestOptions The additional information to be used when processing a telemetry request.
     * @param context Additional context that is passed through the Http pipeline during the service call.
     * @return A {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> publishComponentTelemetryWithResponse(String digitalTwinId, String componentName, String payload, PublishTelemetryRequestOptions publishTelemetryRequestOptions, Context context) {
        return digitalTwinsAsyncClient.publishComponentTelemetryWithResponse(digitalTwinId, componentName, payload, publishTelemetryRequestOptions, context).block();
    }

    //endregion TelemetryAPIs
}
