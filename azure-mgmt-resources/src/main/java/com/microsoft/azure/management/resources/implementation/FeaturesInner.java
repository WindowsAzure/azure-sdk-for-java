/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
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
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Features.
 */
public class FeaturesInner {
    /** The Retrofit service to perform REST calls. */
    private FeaturesService service;
    /** The service client containing this operation class. */
    private FeatureClientImpl client;

    /**
     * Initializes an instance of FeaturesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FeaturesInner(Retrofit retrofit, FeatureClientImpl client) {
        this.service = retrofit.create(FeaturesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Features to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FeaturesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Features/features")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features list1" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features")
        Observable<Response<ResponseBody>> list1(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features get" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features/{featureName}")
        Observable<Response<ResponseBody>> get(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("featureName") String featureName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features register" })
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.Features/providers/{resourceProviderNamespace}/features/{featureName}/register")
        Observable<Response<ResponseBody>> register(@Path("resourceProviderNamespace") String resourceProviderNamespace, @Path("featureName") String featureName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.resources.Features list1Next" })
        @GET
        Observable<Response<ResponseBody>> list1Next(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FeatureResultInner&gt; object if successful.
     */
    public PagedList<FeatureResultInner> list() {
        ServiceResponse<Page<FeatureResultInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<FeatureResultInner>(response.body()) {
            @Override
            public Page<FeatureResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FeatureResultInner>> listAsync(final ListOperationCallback<FeatureResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<Page<FeatureResultInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<FeatureResultInner>>, Page<FeatureResultInner>>() {
                @Override
                public Page<FeatureResultInner> call(ServiceResponse<Page<FeatureResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<FeatureResultInner>>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(ServiceResponse<Page<FeatureResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;FeatureResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<FeatureResultInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<FeatureResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<FeatureResultInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<FeatureResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<FeatureResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FeatureResultInner&gt; object if successful.
     */
    public PagedList<FeatureResultInner> list1(final String resourceProviderNamespace) {
        ServiceResponse<Page<FeatureResultInner>> response = list1SinglePageAsync(resourceProviderNamespace).toBlocking().single();
        return new PagedList<FeatureResultInner>(response.body()) {
            @Override
            public Page<FeatureResultInner> nextPage(String nextPageLink) {
                return list1NextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FeatureResultInner>> list1Async(final String resourceProviderNamespace, final ListOperationCallback<FeatureResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            list1SinglePageAsync(resourceProviderNamespace),
            new Func1<String, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(String nextPageLink) {
                    return list1NextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<Page<FeatureResultInner>> list1Async(final String resourceProviderNamespace) {
        return list1WithServiceResponseAsync(resourceProviderNamespace)
            .map(new Func1<ServiceResponse<Page<FeatureResultInner>>, Page<FeatureResultInner>>() {
                @Override
                public Page<FeatureResultInner> call(ServiceResponse<Page<FeatureResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> list1WithServiceResponseAsync(final String resourceProviderNamespace) {
        return list1SinglePageAsync(resourceProviderNamespace)
            .concatMap(new Func1<ServiceResponse<Page<FeatureResultInner>>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(ServiceResponse<Page<FeatureResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(list1NextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
    ServiceResponse<PageImpl<FeatureResultInner>> * @param resourceProviderNamespace The namespace of the resource provider for getting features.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;FeatureResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> list1SinglePageAsync(final String resourceProviderNamespace) {
        if (resourceProviderNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list1(resourceProviderNamespace, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<FeatureResultInner>> result = list1Delegate(response);
                        return Observable.just(new ServiceResponse<Page<FeatureResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<FeatureResultInner>> list1Delegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<FeatureResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<FeatureResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FeatureResultInner object if successful.
     */
    public FeatureResultInner get(String resourceProviderNamespace, String featureName) {
        return getWithServiceResponseAsync(resourceProviderNamespace, featureName).toBlocking().single().body();
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FeatureResultInner> getAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceProviderNamespace, featureName), serviceCallback);
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FeatureResultInner object
     */
    public Observable<FeatureResultInner> getAsync(String resourceProviderNamespace, String featureName) {
        return getWithServiceResponseAsync(resourceProviderNamespace, featureName).map(new Func1<ServiceResponse<FeatureResultInner>, FeatureResultInner>() {
            @Override
            public FeatureResultInner call(ServiceResponse<FeatureResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the preview feature with the specified name.
     *
     * @param resourceProviderNamespace The resource provider namespace for the feature.
     * @param featureName The name of the feature to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FeatureResultInner object
     */
    public Observable<ServiceResponse<FeatureResultInner>> getWithServiceResponseAsync(String resourceProviderNamespace, String featureName) {
        if (resourceProviderNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null.");
        }
        if (featureName == null) {
            throw new IllegalArgumentException("Parameter featureName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceProviderNamespace, featureName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FeatureResultInner>>>() {
                @Override
                public Observable<ServiceResponse<FeatureResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FeatureResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FeatureResultInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FeatureResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FeatureResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FeatureResultInner object if successful.
     */
    public FeatureResultInner register(String resourceProviderNamespace, String featureName) {
        return registerWithServiceResponseAsync(resourceProviderNamespace, featureName).toBlocking().single().body();
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FeatureResultInner> registerAsync(String resourceProviderNamespace, String featureName, final ServiceCallback<FeatureResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(registerWithServiceResponseAsync(resourceProviderNamespace, featureName), serviceCallback);
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FeatureResultInner object
     */
    public Observable<FeatureResultInner> registerAsync(String resourceProviderNamespace, String featureName) {
        return registerWithServiceResponseAsync(resourceProviderNamespace, featureName).map(new Func1<ServiceResponse<FeatureResultInner>, FeatureResultInner>() {
            @Override
            public FeatureResultInner call(ServiceResponse<FeatureResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Registers the preview feature for the subscription.
     *
     * @param resourceProviderNamespace The namespace of the resource provider.
     * @param featureName The name of the feature to register.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FeatureResultInner object
     */
    public Observable<ServiceResponse<FeatureResultInner>> registerWithServiceResponseAsync(String resourceProviderNamespace, String featureName) {
        if (resourceProviderNamespace == null) {
            throw new IllegalArgumentException("Parameter resourceProviderNamespace is required and cannot be null.");
        }
        if (featureName == null) {
            throw new IllegalArgumentException("Parameter featureName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.register(resourceProviderNamespace, featureName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FeatureResultInner>>>() {
                @Override
                public Observable<ServiceResponse<FeatureResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FeatureResultInner> clientResponse = registerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FeatureResultInner> registerDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FeatureResultInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FeatureResultInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FeatureResultInner&gt; object if successful.
     */
    public PagedList<FeatureResultInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<FeatureResultInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<FeatureResultInner>(response.body()) {
            @Override
            public Page<FeatureResultInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FeatureResultInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<FeatureResultInner>> serviceFuture, final ListOperationCallback<FeatureResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<Page<FeatureResultInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<FeatureResultInner>>, Page<FeatureResultInner>>() {
                @Override
                public Page<FeatureResultInner> call(ServiceResponse<Page<FeatureResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<FeatureResultInner>>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(ServiceResponse<Page<FeatureResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the preview features that are available through AFEC for the subscription.
     *
    ServiceResponse<PageImpl<FeatureResultInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;FeatureResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<FeatureResultInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<FeatureResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<FeatureResultInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<FeatureResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<FeatureResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;FeatureResultInner&gt; object if successful.
     */
    public PagedList<FeatureResultInner> list1Next(final String nextPageLink) {
        ServiceResponse<Page<FeatureResultInner>> response = list1NextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<FeatureResultInner>(response.body()) {
            @Override
            public Page<FeatureResultInner> nextPage(String nextPageLink) {
                return list1NextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<FeatureResultInner>> list1NextAsync(final String nextPageLink, final ServiceFuture<List<FeatureResultInner>> serviceFuture, final ListOperationCallback<FeatureResultInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            list1NextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(String nextPageLink) {
                    return list1NextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<Page<FeatureResultInner>> list1NextAsync(final String nextPageLink) {
        return list1NextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<FeatureResultInner>>, Page<FeatureResultInner>>() {
                @Override
                public Page<FeatureResultInner> call(ServiceResponse<Page<FeatureResultInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;FeatureResultInner&gt; object
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> list1NextWithServiceResponseAsync(final String nextPageLink) {
        return list1NextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<FeatureResultInner>>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(ServiceResponse<Page<FeatureResultInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(list1NextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the preview features in a provider namespace that are available through AFEC for the subscription.
     *
    ServiceResponse<PageImpl<FeatureResultInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;FeatureResultInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<FeatureResultInner>>> list1NextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.list1Next(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<FeatureResultInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<FeatureResultInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<FeatureResultInner>> result = list1NextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<FeatureResultInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<FeatureResultInner>> list1NextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<FeatureResultInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<FeatureResultInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
