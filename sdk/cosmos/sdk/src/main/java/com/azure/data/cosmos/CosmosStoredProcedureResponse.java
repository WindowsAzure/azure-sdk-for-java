// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.data.cosmos;

import com.azure.data.cosmos.internal.ResourceResponse;
import com.azure.data.cosmos.internal.StoredProcedure;
import com.azure.data.cosmos.internal.StoredProcedureResponse;

public class CosmosStoredProcedureResponse extends CosmosResponse<CosmosStoredProcedureProperties> {

    private CosmosStoredProcedure storedProcedure;
    private StoredProcedureResponse storedProcedureResponse;

    CosmosStoredProcedureResponse(ResourceResponse<StoredProcedure> response, CosmosContainer cosmosContainer) {
        super(response);
        if(response.getResource() != null){
            super.resourceSettings(new CosmosStoredProcedureProperties(response));
            storedProcedure = new CosmosStoredProcedure(resourceSettings().id(), cosmosContainer);
        }
    }

    CosmosStoredProcedureResponse(StoredProcedureResponse response, CosmosContainer cosmosContainer) {
        super(response);
        this.storedProcedureResponse = response;
    }

    /**
     * Gets the stored procedure properties
     * @return the stored procedure properties or null
     */
    public CosmosStoredProcedureProperties properties() {
        return super.resourceSettings();
    }

    /**
     * Gets the stored procedure object
     * @return the stored procedure object or null
     */
    public CosmosStoredProcedure storedProcedure() {
        return this.storedProcedure;
    }

    /**
     * Gets the Activity ID for the request.
     *
     * @return the activity id.
     */
    @Override
    public String activityId() {
        if(storedProcedureResponse != null){
            return this.storedProcedureResponse.getActivityId();
        }
        return super.activityId();
    }

    /**
     * Gets the token used for managing client's consistency requirements.
     *
     * @return the session token.
     */
    @Override
    public String sessionToken() {
        if(storedProcedureResponse != null){
            return this.storedProcedureResponse.getSessionToken();
        }
        return super.sessionToken();
    }

    /**
     * Gets the HTTP status code associated with the response.
     *
     * @return the status code.
     */
    @Override
    public int statusCode() {
        if(storedProcedureResponse != null){
            return this.storedProcedureResponse.getStatusCode();
        }
        return super.statusCode();
    }

    /**
     * Gets the number of index paths (terms) generated by the operation.
     *
     * @return the request charge.
     */
    @Override
    public double requestCharge() {
        if(storedProcedureResponse != null){
            return storedProcedureResponse.getRequestCharge();
        }
        return super.requestCharge();
    }

    /**
     * Gets the response of the stored procedure as a string.
     *
     * @return the response as a string.
     */
    public String responseAsString() {
        return this.storedProcedureResponse.getResponseAsString();
    }

    /**
     * Gets the output from stored procedure console.log() statements.
     *
     * @return the output string from the stored procedure console.log() statements.
     */
    public String scriptLog() {
        return this.storedProcedureResponse.getScriptLog();
    }
}
