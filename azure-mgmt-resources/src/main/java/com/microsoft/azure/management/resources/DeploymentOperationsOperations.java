/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.DeploymentOperation;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in DeploymentOperationsOperations.
 */
public interface DeploymentOperationsOperations {
    /**
     * The interface defining all the services for DeploymentOperationsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeploymentOperationsService {
        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations/{operationId}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/deployments/{deploymentName}/operations")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId Operation Id.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the DeploymentOperation object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<DeploymentOperation> get(String resourceGroupName, String deploymentName, String operationId) throws ServiceException, IOException;

    /**
     * Get a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param operationId Operation Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String deploymentName, String operationId, final ServiceCallback<DeploymentOperation> serviceCallback);

    /**
     * Gets a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param top Query parameters.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;DeploymentOperation&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<DeploymentOperation>> list(String resourceGroupName, String deploymentName, Integer top) throws ServiceException, IOException;

    /**
     * Gets a list of deployments operations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param top Query parameters.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, String deploymentName, Integer top, final ServiceCallback<PageImpl<DeploymentOperation>> serviceCallback);

    /**
     * Gets a list of deployments operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @return the PageImpl&lt;DeploymentOperation&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<DeploymentOperation>> listNext(String nextPageLink) throws ServiceException, IOException;

    /**
     * Gets a list of deployments operations.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<DeploymentOperation>> serviceCallback);

}
