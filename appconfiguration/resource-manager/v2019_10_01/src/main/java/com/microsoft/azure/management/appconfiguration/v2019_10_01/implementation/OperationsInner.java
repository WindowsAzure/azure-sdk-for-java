/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appconfiguration.v2019_10_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.appconfiguration.v2019_10_01.CheckNameAvailabilityParameters;
import com.microsoft.azure.management.appconfiguration.v2019_10_01.ErrorException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
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
    private AppConfigurationManagementClientImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, AppConfigurationManagementClientImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appconfiguration.v2019_10_01.Operations checkNameAvailability" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.AppConfiguration/checkNameAvailability")
        Observable<Response<ResponseBody>> checkNameAvailability(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body CheckNameAvailabilityParameters checkNameAvailabilityParameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appconfiguration.v2019_10_01.Operations list" })
        @GET("providers/Microsoft.AppConfiguration/operations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Query("$skipToken") String skipToken, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.appconfiguration.v2019_10_01.Operations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param name The name to check for availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the NameAvailabilityStatusInner object if successful.
     */
    public NameAvailabilityStatusInner checkNameAvailability(String name) {
        return checkNameAvailabilityWithServiceResponseAsync(name).toBlocking().single().body();
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param name The name to check for availability.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<NameAvailabilityStatusInner> checkNameAvailabilityAsync(String name, final ServiceCallback<NameAvailabilityStatusInner> serviceCallback) {
        return ServiceFuture.fromResponse(checkNameAvailabilityWithServiceResponseAsync(name), serviceCallback);
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param name The name to check for availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NameAvailabilityStatusInner object
     */
    public Observable<NameAvailabilityStatusInner> checkNameAvailabilityAsync(String name) {
        return checkNameAvailabilityWithServiceResponseAsync(name).map(new Func1<ServiceResponse<NameAvailabilityStatusInner>, NameAvailabilityStatusInner>() {
            @Override
            public NameAvailabilityStatusInner call(ServiceResponse<NameAvailabilityStatusInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Checks whether the configuration store name is available for use.
     *
     * @param name The name to check for availability.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the NameAvailabilityStatusInner object
     */
    public Observable<ServiceResponse<NameAvailabilityStatusInner>> checkNameAvailabilityWithServiceResponseAsync(String name) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (name == null) {
            throw new IllegalArgumentException("Parameter name is required and cannot be null.");
        }
        CheckNameAvailabilityParameters checkNameAvailabilityParameters = new CheckNameAvailabilityParameters();
        checkNameAvailabilityParameters.withName(name);
        return service.checkNameAvailability(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), checkNameAvailabilityParameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<NameAvailabilityStatusInner>>>() {
                @Override
                public Observable<ServiceResponse<NameAvailabilityStatusInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<NameAvailabilityStatusInner> clientResponse = checkNameAvailabilityDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<NameAvailabilityStatusInner> checkNameAvailabilityDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<NameAvailabilityStatusInner, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<NameAvailabilityStatusInner>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationDefinitionInner&gt; object if successful.
     */
    public PagedList<OperationDefinitionInner> list() {
        ServiceResponse<Page<OperationDefinitionInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<OperationDefinitionInner>(response.body()) {
            @Override
            public Page<OperationDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationDefinitionInner>> listAsync(final ListOperationCallback<OperationDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<Page<OperationDefinitionInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Page<OperationDefinitionInner>>() {
                @Override
                public Page<OperationDefinitionInner> call(ServiceResponse<Page<OperationDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(ServiceResponse<Page<OperationDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listSinglePageAsync() {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String skipToken = null;
        return service.list(this.client.apiVersion(), skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationDefinitionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationDefinitionInner&gt; object if successful.
     */
    public PagedList<OperationDefinitionInner> list(final String skipToken) {
        ServiceResponse<Page<OperationDefinitionInner>> response = listSinglePageAsync(skipToken).toBlocking().single();
        return new PagedList<OperationDefinitionInner>(response.body()) {
            @Override
            public Page<OperationDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationDefinitionInner>> listAsync(final String skipToken, final ListOperationCallback<OperationDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(skipToken),
            new Func1<String, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<Page<OperationDefinitionInner>> listAsync(final String skipToken) {
        return listWithServiceResponseAsync(skipToken)
            .map(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Page<OperationDefinitionInner>>() {
                @Override
                public Page<OperationDefinitionInner> call(ServiceResponse<Page<OperationDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listWithServiceResponseAsync(final String skipToken) {
        return listSinglePageAsync(skipToken)
            .concatMap(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(ServiceResponse<Page<OperationDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
    ServiceResponse<PageImpl<OperationDefinitionInner>> * @param skipToken A skip token is used to continue retrieving items after an operation returns a partial result. If a previous response contains a nextLink element, the value of the nextLink element will include a skipToken parameter that specifies a starting point to use for subsequent calls.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listSinglePageAsync(final String skipToken) {
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.apiVersion(), skipToken, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationDefinitionInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationDefinitionInner>> listDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationDefinitionInner>, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationDefinitionInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;OperationDefinitionInner&gt; object if successful.
     */
    public PagedList<OperationDefinitionInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<OperationDefinitionInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<OperationDefinitionInner>(response.body()) {
            @Override
            public Page<OperationDefinitionInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationDefinitionInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<OperationDefinitionInner>> serviceFuture, final ListOperationCallback<OperationDefinitionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<Page<OperationDefinitionInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Page<OperationDefinitionInner>>() {
                @Override
                public Page<OperationDefinitionInner> call(ServiceResponse<Page<OperationDefinitionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;OperationDefinitionInner&gt; object
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<OperationDefinitionInner>>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(ServiceResponse<Page<OperationDefinitionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the operations available from this provider.
     *
    ServiceResponse<PageImpl<OperationDefinitionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;OperationDefinitionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<OperationDefinitionInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<OperationDefinitionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<OperationDefinitionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationDefinitionInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<OperationDefinitionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationDefinitionInner>> listNextDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationDefinitionInner>, ErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationDefinitionInner>>() { }.getType())
                .registerError(ErrorException.class)
                .build(response);
    }

}
