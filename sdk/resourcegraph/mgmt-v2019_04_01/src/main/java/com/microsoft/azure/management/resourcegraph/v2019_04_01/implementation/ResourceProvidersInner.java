/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resourcegraph.v2019_04_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.resourcegraph.v2019_04_01.ErrorResponseException;
import com.microsoft.azure.management.resourcegraph.v2019_04_01.QueryRequest;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceProviders.
 */
public class ResourceProvidersInner {
    /** The Retrofit service to perform REST calls. */
    private ResourceProvidersService service;
    /** The service client containing this operation class. */
    private ResourceGraphClientImpl client;

    /**
     * Initializes an instance of ResourceProvidersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ResourceProvidersInner(Retrofit retrofit, ResourceGraphClientImpl client) {
        this.service = retrofit.create(ResourceProvidersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ResourceProviders to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceProvidersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resourcegraph.v2019_04_01.ResourceProviders resources" })
        @POST("providers/Microsoft.ResourceGraph/resources")
        Observable<Response<ResponseBody>> resources(@Query("api-version") String apiVersion, @Body QueryRequest query, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the QueryResponseInner object if successful.
     */
    public QueryResponseInner resources(QueryRequest query) {
        return resourcesWithServiceResponseAsync(query).toBlocking().single().body();
    }

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<QueryResponseInner> resourcesAsync(QueryRequest query, final ServiceCallback<QueryResponseInner> serviceCallback) {
        return ServiceFuture.fromResponse(resourcesWithServiceResponseAsync(query), serviceCallback);
    }

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueryResponseInner object
     */
    public Observable<QueryResponseInner> resourcesAsync(QueryRequest query) {
        return resourcesWithServiceResponseAsync(query).map(new Func1<ServiceResponse<QueryResponseInner>, QueryResponseInner>() {
            @Override
            public QueryResponseInner call(ServiceResponse<QueryResponseInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Queries the resources managed by Azure Resource Manager for all subscriptions specified in the request.
     *
     * @param query Request specifying query and its options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the QueryResponseInner object
     */
    public Observable<ServiceResponse<QueryResponseInner>> resourcesWithServiceResponseAsync(QueryRequest query) {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (query == null) {
            throw new IllegalArgumentException("Parameter query is required and cannot be null.");
        }
        Validator.validate(query);
        return service.resources(this.client.apiVersion(), query, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<QueryResponseInner>>>() {
                @Override
                public Observable<ServiceResponse<QueryResponseInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<QueryResponseInner> clientResponse = resourcesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<QueryResponseInner> resourcesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<QueryResponseInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<QueryResponseInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
