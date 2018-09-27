/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Skus.
 */
public class SkusInner {
    /** The Retrofit service to perform REST calls. */
    private SkusService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of SkusInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SkusInner(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(SkusService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Skus to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SkusService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2018_07_01.Skus list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Storage/skus")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @return the PagedList<SkuInner> object if successful.
     */
    public PagedList<SkuInner> list() {
        PageImpl<SkuInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<SkuInner>(page) {
            @Override
            public Page<SkuInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<SkuInner>> listAsync(final ServiceCallback<List<SkuInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @return the observable to the List&lt;SkuInner&gt; object
     */
    public Observable<Page<SkuInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<SkuInner>>, Page<SkuInner>>() {
            @Override
            public Page<SkuInner> call(ServiceResponse<List<SkuInner>> response) {
                PageImpl<SkuInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Lists the available SKUs supported by Microsoft.Storage for given subscription.
     *
     * @return the observable to the List&lt;SkuInner&gt; object
     */
    public Observable<ServiceResponse<List<SkuInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<SkuInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<SkuInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<SkuInner>> result = listDelegate(response);
                        List<SkuInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<SkuInner>> clientResponse = new ServiceResponse<List<SkuInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<SkuInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<SkuInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<SkuInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
