/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
    private ComputeManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, ComputeManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.compute.v2020_12_01.Operations list" })
        @GET("providers/Microsoft.Compute/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a list of compute operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;ComputeOperationValueInner&gt; object if successful.
     */
    public List<ComputeOperationValueInner> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Gets a list of compute operations.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ComputeOperationValueInner>> listAsync(final ServiceCallback<List<ComputeOperationValueInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets a list of compute operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ComputeOperationValueInner&gt; object
     */
    public Observable<List<ComputeOperationValueInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<ComputeOperationValueInner>>, List<ComputeOperationValueInner>>() {
            @Override
            public List<ComputeOperationValueInner> call(ServiceResponse<List<ComputeOperationValueInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a list of compute operations.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;ComputeOperationValueInner&gt; object
     */
    public Observable<ServiceResponse<List<ComputeOperationValueInner>>> listWithServiceResponseAsync() {
        final String apiVersion = "2020-12-01";
        return service.list(apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ComputeOperationValueInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ComputeOperationValueInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ComputeOperationValueInner>> result = listDelegate(response);
                        List<ComputeOperationValueInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ComputeOperationValueInner>> clientResponse = new ServiceResponse<List<ComputeOperationValueInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ComputeOperationValueInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ComputeOperationValueInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ComputeOperationValueInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
