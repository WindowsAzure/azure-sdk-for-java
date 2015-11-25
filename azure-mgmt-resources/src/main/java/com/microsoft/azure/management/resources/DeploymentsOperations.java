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

import com.microsoft.azure.management.resources.models.Deployment;
import com.microsoft.azure.management.resources.models.DeploymentExtended;
import com.microsoft.azure.management.resources.models.DeploymentExtendedFilter;
import com.microsoft.azure.management.resources.models.DeploymentValidateResult;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.lang.InterruptedException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Header;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in DeploymentsOperations.
 */
public interface DeploymentsOperations {
    /**
     * The interface defining all the services for DeploymentsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DeploymentsService {
        @HTTP(path = "/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @HEAD("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}")
        Call<Void> checkExistence(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @PUT("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Body Deployment parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}/cancel")
        Call<ResponseBody> cancel(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @POST("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/{deploymentName}/validate")
        Call<ResponseBody> validate(@Path("resourceGroupName") String resourceGroupName, @Path("deploymentName") String deploymentName, @Path("subscriptionId") String subscriptionId, @Body Deployment parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET("/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.Resources/deployments/")
        Call<ResponseBody> list(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Begin deleting deployment.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment to be deleted.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String deploymentName) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Begin deleting deployment.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment to be deleted.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, String deploymentName, final ServiceCallback<Void> serviceCallback);

    /**
     * Checks whether deployment exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Boolean object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Boolean> checkExistence(String resourceGroupName, String deploymentName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Checks whether deployment exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> checkExistenceAsync(String resourceGroupName, String deploymentName, final ServiceCallback<Boolean> serviceCallback);

    /**
     * Create a named template deployment using a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the DeploymentExtended object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<DeploymentExtended> createOrUpdate(String resourceGroupName, String deploymentName, Deployment parameters) throws ServiceException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create a named template deployment using a template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Additional parameters supplied to the operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, String deploymentName, Deployment parameters, final ServiceCallback<DeploymentExtended> serviceCallback);

    /**
     * Get a deployment.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentExtended object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<DeploymentExtended> get(String resourceGroupName, String deploymentName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get a deployment.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, String deploymentName, final ServiceCallback<DeploymentExtended> serviceCallback);

    /**
     * Cancel a currently running template deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> cancel(String resourceGroupName, String deploymentName) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Cancel a currently running template deployment.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> cancelAsync(String resourceGroupName, String deploymentName, final ServiceCallback<Void> serviceCallback);

    /**
     * Validate a deployment template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Deployment to validate.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DeploymentValidateResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<DeploymentValidateResult> validate(String resourceGroupName, String deploymentName, Deployment parameters) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Validate a deployment template.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param deploymentName The name of the deployment.
     * @param parameters Deployment to validate.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> validateAsync(String resourceGroupName, String deploymentName, Deployment parameters, final ServiceCallback<DeploymentValidateResult> serviceCallback);

    /**
     * Get a list of deployments.
     *
     * @param resourceGroupName The name of the resource group to filter by. The name is case insensitive.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all deployments.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;DeploymentExtended&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<DeploymentExtended>> list(String resourceGroupName, DeploymentExtendedFilter filter, Integer top) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get a list of deployments.
     *
     * @param resourceGroupName The name of the resource group to filter by. The name is case insensitive.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all deployments.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String resourceGroupName, DeploymentExtendedFilter filter, Integer top, final ServiceCallback<PageImpl<DeploymentExtended>> serviceCallback);

    /**
     * Get a list of deployments.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;DeploymentExtended&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<DeploymentExtended>> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Get a list of deployments.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<DeploymentExtended>> serviceCallback);

}
