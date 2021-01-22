/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.cdn.v2020_09_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.cdn.v2020_09_01.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagedRuleSets.
 */
public class ManagedRuleSetsInner {
    /** The Retrofit service to perform REST calls. */
    private ManagedRuleSetsService service;
    /** The service client containing this operation class. */
    private CdnManagementClientImpl client;

    /**
     * Initializes an instance of ManagedRuleSetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ManagedRuleSetsInner(Retrofit retrofit, CdnManagementClientImpl client) {
        this.service = retrofit.create(ManagedRuleSetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ManagedRuleSets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagedRuleSetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSets list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Cdn/CdnWebApplicationFirewallManagedRuleSets")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.cdn.v2020_09_01.ManagedRuleSets listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all available managed rule sets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object if successful.
     */
    public PagedList<ManagedRuleSetDefinitionInner> list() {
        ServiceResponse<Page<ManagedRuleSetDefinitionInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ManagedRuleSetDefinitionInner>(response.body()) {
            @Override
            public Page<ManagedRuleSetDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all available managed rule sets.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedRuleSetDefinitionInner>> listAsync(final ListOperationCallback<ManagedRuleSetDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all available managed rule sets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object
     */
    public Observable<Page<ManagedRuleSetDefinitionInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>, Page<ManagedRuleSetDefinitionInner>>() {
                @Override
                public Page<ManagedRuleSetDefinitionInner> call(ServiceResponse<Page<ManagedRuleSetDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all available managed rule sets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(ServiceResponse<Page<ManagedRuleSetDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all available managed rule sets.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedRuleSetDefinitionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedRuleSetDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedRuleSetDefinitionInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedRuleSetDefinitionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedRuleSetDefinitionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists all available managed rule sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object if successful.
     */
    public PagedList<ManagedRuleSetDefinitionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ManagedRuleSetDefinitionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ManagedRuleSetDefinitionInner>(response.body()) {
            @Override
            public Page<ManagedRuleSetDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists all available managed rule sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ManagedRuleSetDefinitionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ManagedRuleSetDefinitionInner>> serviceFuture, final ListOperationCallback<ManagedRuleSetDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists all available managed rule sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object
     */
    public Observable<Page<ManagedRuleSetDefinitionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>, Page<ManagedRuleSetDefinitionInner>>() {
                @Override
                public Page<ManagedRuleSetDefinitionInner> call(ServiceResponse<Page<ManagedRuleSetDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists all available managed rule sets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(ServiceResponse<Page<ManagedRuleSetDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists all available managed rule sets.
     *
    ServiceResponse<PageImpl<ManagedRuleSetDefinitionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ManagedRuleSetDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ManagedRuleSetDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ManagedRuleSetDefinitionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ManagedRuleSetDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ManagedRuleSetDefinitionInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ManagedRuleSetDefinitionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ManagedRuleSetDefinitionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
