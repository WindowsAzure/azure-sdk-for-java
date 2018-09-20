/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.policyinsights.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.policyinsights.QueryFailureException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private PolicyInsightsClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, PolicyInsightsClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.policyinsights.Operations list" })
        @GET("providers/Microsoft.PolicyInsights/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws QueryFailureException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationsListResultsInner object if successful.
     */
    public OperationsListResultsInner list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Lists available operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationsListResultsInner> listAsync(final ServiceCallback<OperationsListResultsInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationsListResultsInner object
     */
    public Observable<OperationsListResultsInner> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<OperationsListResultsInner>, OperationsListResultsInner>() {
            @Override
            public OperationsListResultsInner call(ServiceResponse<OperationsListResultsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists available operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationsListResultsInner object
     */
    public Observable<ServiceResponse<OperationsListResultsInner>> listWithServiceResponseAsync() {
        final String apiVersion = "2018-04-04";
        return service.list(apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationsListResultsInner>>>() {
                @Override
                public Observable<ServiceResponse<OperationsListResultsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationsListResultsInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationsListResultsInner> listDelegate(Response<ResponseBody> response) throws QueryFailureException, IOException {
        return this.client.restClient().responseBuilderFactory().<OperationsListResultsInner, QueryFailureException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationsListResultsInner>() { }.getType())
                .registerError(QueryFailureException.class)
                .build(response);
    }

}
