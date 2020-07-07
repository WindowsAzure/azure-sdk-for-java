/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2020_05_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.billing.v2020_05_01.ErrorResponseException;
import com.microsoft.azure.management.billing.v2020_05_01.InvoiceSectionsCreateOrUpdateHeaders;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in InvoiceSections.
 */
public class InvoiceSectionsInner {
    /** The Retrofit service to perform REST calls. */
    private InvoiceSectionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of InvoiceSectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InvoiceSectionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(InvoiceSectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for InvoiceSections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InvoiceSectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections listByBillingProfile" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections")
        Observable<Response<ResponseBody>> listByBillingProfile(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{invoiceSectionName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("invoiceSectionName") String invoiceSectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections createOrUpdate" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{invoiceSectionName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("invoiceSectionName") String invoiceSectionName, @Query("api-version") String apiVersion, @Body InvoiceSectionInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections beginCreateOrUpdate" })
        @PUT("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{invoiceSectionName}")
        Observable<Response<ResponseBody>> beginCreateOrUpdate(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("invoiceSectionName") String invoiceSectionName, @Query("api-version") String apiVersion, @Body InvoiceSectionInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2020_05_01.InvoiceSections listByBillingProfileNext" })
        @GET
        Observable<Response<ResponseBody>> listByBillingProfileNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;InvoiceSectionInner&gt; object if successful.
     */
    public PagedList<InvoiceSectionInner> listByBillingProfile(final String billingAccountName, final String billingProfileName) {
        ServiceResponse<Page<InvoiceSectionInner>> response = listByBillingProfileSinglePageAsync(billingAccountName, billingProfileName).toBlocking().single();
        return new PagedList<InvoiceSectionInner>(response.body()) {
            @Override
            public Page<InvoiceSectionInner> nextPage(String nextPageLink) {
                return listByBillingProfileNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<InvoiceSectionInner>> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName, final ListOperationCallback<InvoiceSectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingProfileSinglePageAsync(billingAccountName, billingProfileName),
            new Func1<String, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(String nextPageLink) {
                    return listByBillingProfileNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;InvoiceSectionInner&gt; object
     */
    public Observable<Page<InvoiceSectionInner>> listByBillingProfileAsync(final String billingAccountName, final String billingProfileName) {
        return listByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName)
            .map(new Func1<ServiceResponse<Page<InvoiceSectionInner>>, Page<InvoiceSectionInner>>() {
                @Override
                public Page<InvoiceSectionInner> call(ServiceResponse<Page<InvoiceSectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;InvoiceSectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<InvoiceSectionInner>>> listByBillingProfileWithServiceResponseAsync(final String billingAccountName, final String billingProfileName) {
        return listByBillingProfileSinglePageAsync(billingAccountName, billingProfileName)
            .concatMap(new Func1<ServiceResponse<Page<InvoiceSectionInner>>, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(ServiceResponse<Page<InvoiceSectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingProfileNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
    ServiceResponse<PageImpl<InvoiceSectionInner>> * @param billingAccountName The ID that uniquely identifies a billing account.
    ServiceResponse<PageImpl<InvoiceSectionInner>> * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;InvoiceSectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<InvoiceSectionInner>>> listByBillingProfileSinglePageAsync(final String billingAccountName, final String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.listByBillingProfile(billingAccountName, billingProfileName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<InvoiceSectionInner>> result = listByBillingProfileDelegate(response);
                        return Observable.just(new ServiceResponse<Page<InvoiceSectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<InvoiceSectionInner>> listByBillingProfileDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<InvoiceSectionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<InvoiceSectionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSectionInner object if successful.
     */
    public InvoiceSectionInner get(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName).toBlocking().single().body();
    }

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSectionInner> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, final ServiceCallback<InvoiceSectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName), serviceCallback);
    }

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionInner object
     */
    public Observable<InvoiceSectionInner> getAsync(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        return getWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName).map(new Func1<ServiceResponse<InvoiceSectionInner>, InvoiceSectionInner>() {
            @Override
            public InvoiceSectionInner call(ServiceResponse<InvoiceSectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets an invoice section by its ID. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionInner object
     */
    public Observable<ServiceResponse<InvoiceSectionInner>> getWithServiceResponseAsync(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        final String apiVersion = "2020-05-01";
        return service.get(billingAccountName, billingProfileName, invoiceSectionName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoiceSectionInner>>>() {
                @Override
                public Observable<ServiceResponse<InvoiceSectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoiceSectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoiceSectionInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InvoiceSectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoiceSectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSectionInner object if successful.
     */
    public InvoiceSectionInner createOrUpdate(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        return createOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters).toBlocking().last().body();
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSectionInner> createOrUpdateAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters, final ServiceCallback<InvoiceSectionInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(createOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<InvoiceSectionInner> createOrUpdateAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        return createOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters).map(new Func1<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>, InvoiceSectionInner>() {
            @Override
            public InvoiceSectionInner call(ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>> createOrUpdateWithServiceResponseAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-05-01";
        Observable<Response<ResponseBody>> observable = service.createOrUpdate(billingAccountName, billingProfileName, invoiceSectionName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent());
        return client.getAzureClient().getPutOrPatchResultWithHeadersAsync(observable, new TypeToken<InvoiceSectionInner>() { }.getType(), InvoiceSectionsCreateOrUpdateHeaders.class);
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSectionInner object if successful.
     */
    public InvoiceSectionInner beginCreateOrUpdate(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters).toBlocking().single().body();
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSectionInner> beginCreateOrUpdateAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters, final ServiceCallback<InvoiceSectionInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginCreateOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters), serviceCallback);
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionInner object
     */
    public Observable<InvoiceSectionInner> beginCreateOrUpdateAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        return beginCreateOrUpdateWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName, parameters).map(new Func1<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>, InvoiceSectionInner>() {
            @Override
            public InvoiceSectionInner call(ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates an invoice section. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param parameters The new or updated invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionInner object
     */
    public Observable<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>> beginCreateOrUpdateWithServiceResponseAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, InvoiceSectionInner parameters) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String apiVersion = "2020-05-01";
        return service.beginCreateOrUpdate(billingAccountName, billingProfileName, invoiceSectionName, apiVersion, parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders> clientResponse = beginCreateOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<InvoiceSectionInner, InvoiceSectionsCreateOrUpdateHeaders> beginCreateOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InvoiceSectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoiceSectionInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, InvoiceSectionsCreateOrUpdateHeaders.class);
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;InvoiceSectionInner&gt; object if successful.
     */
    public PagedList<InvoiceSectionInner> listByBillingProfileNext(final String nextPageLink) {
        ServiceResponse<Page<InvoiceSectionInner>> response = listByBillingProfileNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<InvoiceSectionInner>(response.body()) {
            @Override
            public Page<InvoiceSectionInner> nextPage(String nextPageLink) {
                return listByBillingProfileNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<InvoiceSectionInner>> listByBillingProfileNextAsync(final String nextPageLink, final ServiceFuture<List<InvoiceSectionInner>> serviceFuture, final ListOperationCallback<InvoiceSectionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByBillingProfileNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(String nextPageLink) {
                    return listByBillingProfileNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;InvoiceSectionInner&gt; object
     */
    public Observable<Page<InvoiceSectionInner>> listByBillingProfileNextAsync(final String nextPageLink) {
        return listByBillingProfileNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<InvoiceSectionInner>>, Page<InvoiceSectionInner>>() {
                @Override
                public Page<InvoiceSectionInner> call(ServiceResponse<Page<InvoiceSectionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;InvoiceSectionInner&gt; object
     */
    public Observable<ServiceResponse<Page<InvoiceSectionInner>>> listByBillingProfileNextWithServiceResponseAsync(final String nextPageLink) {
        return listByBillingProfileNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<InvoiceSectionInner>>, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(ServiceResponse<Page<InvoiceSectionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByBillingProfileNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the invoice sections that a user has access to. The operation is supported only for billing accounts with agreement type Microsoft Customer Agreement.
     *
    ServiceResponse<PageImpl<InvoiceSectionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;InvoiceSectionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<InvoiceSectionInner>>> listByBillingProfileNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByBillingProfileNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<InvoiceSectionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<InvoiceSectionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<InvoiceSectionInner>> result = listByBillingProfileNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<InvoiceSectionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<InvoiceSectionInner>> listByBillingProfileNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<InvoiceSectionInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<InvoiceSectionInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
