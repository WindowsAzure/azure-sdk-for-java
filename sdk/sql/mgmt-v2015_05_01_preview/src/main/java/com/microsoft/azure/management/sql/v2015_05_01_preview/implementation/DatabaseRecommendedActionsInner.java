/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2015_05_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.management.sql.v2015_05_01_preview.RecommendedActionStateInfo;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in DatabaseRecommendedActions.
 */
public class DatabaseRecommendedActionsInner {
    /** The Retrofit service to perform REST calls. */
    private DatabaseRecommendedActionsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of DatabaseRecommendedActionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatabaseRecommendedActionsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(DatabaseRecommendedActionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for DatabaseRecommendedActions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatabaseRecommendedActionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseRecommendedActions listByDatabaseAdvisor" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions")
        Observable<Response<ResponseBody>> listByDatabaseAdvisor(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("advisorName") String advisorName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseRecommendedActions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions/{recommendedActionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("advisorName") String advisorName, @Path("recommendedActionName") String recommendedActionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2015_05_01_preview.DatabaseRecommendedActions update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/databases/{databaseName}/advisors/{advisorName}/recommendedActions/{recommendedActionName}")
        Observable<Response<ResponseBody>> update(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("databaseName") String databaseName, @Path("advisorName") String advisorName, @Path("recommendedActionName") String recommendedActionName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body RecommendedActionInner parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;RecommendedActionInner&gt; object if successful.
     */
    public List<RecommendedActionInner> listByDatabaseAdvisor(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName).toBlocking().single().body();
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<RecommendedActionInner>> listByDatabaseAdvisorAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, final ServiceCallback<List<RecommendedActionInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByDatabaseAdvisorWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName), serviceCallback);
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedActionInner&gt; object
     */
    public Observable<List<RecommendedActionInner>> listByDatabaseAdvisorAsync(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        return listByDatabaseAdvisorWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName).map(new Func1<ServiceResponse<List<RecommendedActionInner>>, List<RecommendedActionInner>>() {
            @Override
            public List<RecommendedActionInner> call(ServiceResponse<List<RecommendedActionInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets list of Database Recommended Actions.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;RecommendedActionInner&gt; object
     */
    public Observable<ServiceResponse<List<RecommendedActionInner>>> listByDatabaseAdvisorWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, String advisorName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByDatabaseAdvisor(resourceGroupName, serverName, databaseName, advisorName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<RecommendedActionInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<RecommendedActionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<RecommendedActionInner>> clientResponse = listByDatabaseAdvisorDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<RecommendedActionInner>> listByDatabaseAdvisorDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<RecommendedActionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<RecommendedActionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecommendedActionInner object if successful.
     */
    public RecommendedActionInner get(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName).toBlocking().single().body();
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecommendedActionInner> getAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName, final ServiceCallback<RecommendedActionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName), serviceCallback);
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedActionInner object
     */
    public Observable<RecommendedActionInner> getAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName).map(new Func1<ServiceResponse<RecommendedActionInner>, RecommendedActionInner>() {
            @Override
            public RecommendedActionInner call(ServiceResponse<RecommendedActionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedActionInner object
     */
    public Observable<ServiceResponse<RecommendedActionInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (recommendedActionName == null) {
            throw new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecommendedActionInner>>>() {
                @Override
                public Observable<ServiceResponse<RecommendedActionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecommendedActionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecommendedActionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecommendedActionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecommendedActionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param state Gets the info of the current state the recommended action is in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RecommendedActionInner object if successful.
     */
    public RecommendedActionInner update(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName, RecommendedActionStateInfo state) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, state).toBlocking().single().body();
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param state Gets the info of the current state the recommended action is in.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RecommendedActionInner> updateAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName, RecommendedActionStateInfo state, final ServiceCallback<RecommendedActionInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, state), serviceCallback);
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param state Gets the info of the current state the recommended action is in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedActionInner object
     */
    public Observable<RecommendedActionInner> updateAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName, RecommendedActionStateInfo state) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, state).map(new Func1<ServiceResponse<RecommendedActionInner>, RecommendedActionInner>() {
            @Override
            public RecommendedActionInner call(ServiceResponse<RecommendedActionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a database recommended action.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param databaseName The name of the database.
     * @param advisorName The name of the Database Advisor.
     * @param recommendedActionName The name of Database Recommended Action.
     * @param state Gets the info of the current state the recommended action is in.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RecommendedActionInner object
     */
    public Observable<ServiceResponse<RecommendedActionInner>> updateWithServiceResponseAsync(String resourceGroupName, String serverName, String databaseName, String advisorName, String recommendedActionName, RecommendedActionStateInfo state) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (databaseName == null) {
            throw new IllegalArgumentException("Parameter databaseName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (recommendedActionName == null) {
            throw new IllegalArgumentException("Parameter recommendedActionName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (state == null) {
            throw new IllegalArgumentException("Parameter state is required and cannot be null.");
        }
        Validator.validate(state);
        RecommendedActionInner parameters = new RecommendedActionInner();
        parameters.withState(state);
        return service.update(resourceGroupName, serverName, databaseName, advisorName, recommendedActionName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RecommendedActionInner>>>() {
                @Override
                public Observable<ServiceResponse<RecommendedActionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RecommendedActionInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RecommendedActionInner> updateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RecommendedActionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RecommendedActionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
