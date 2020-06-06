/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2019_10_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2019_10_01_preview.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
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
 * in BillingPermissions.
 */
public class BillingPermissionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingPermissionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingPermissionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingPermissionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingPermissionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingPermissions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingPermissionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissions listByCustomer" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/customers/{customerName}/billingPermissions")
        Observable<Response<ResponseBody>> listByCustomer(@Path("billingAccountName") String billingAccountName, @Path("customerName") String customerName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissions listByBillingAccount" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingPermissions")
        Observable<Response<ResponseBody>> listByBillingAccount(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissions listByInvoiceSections" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/invoiceSections/{invoiceSectionName}/billingPermissions")
        Observable<Response<ResponseBody>> listByInvoiceSections(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Path("invoiceSectionName") String invoiceSectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.BillingPermissions listByBillingProfile" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/billingProfiles/{billingProfileName}/billingPermissions")
        Observable<Response<ResponseBody>> listByBillingProfile(@Path("billingAccountName") String billingAccountName, @Path("billingProfileName") String billingProfileName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPermissionsListResultInner object if successful.
     */
    public BillingPermissionsListResultInner listByCustomer(String billingAccountName, String customerName) {
        return listByCustomerWithServiceResponseAsync(billingAccountName, customerName).toBlocking().single().body();
    }

    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPermissionsListResultInner> listByCustomerAsync(String billingAccountName, String customerName, final ServiceCallback<BillingPermissionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByCustomerWithServiceResponseAsync(billingAccountName, customerName), serviceCallback);
    }

    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<BillingPermissionsListResultInner> listByCustomerAsync(String billingAccountName, String customerName) {
        return listByCustomerWithServiceResponseAsync(billingAccountName, customerName).map(new Func1<ServiceResponse<BillingPermissionsListResultInner>, BillingPermissionsListResultInner>() {
            @Override
            public BillingPermissionsListResultInner call(ServiceResponse<BillingPermissionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the billing permissions the caller has for a customer.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param customerName The ID that uniquely identifies a customer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<ServiceResponse<BillingPermissionsListResultInner>> listByCustomerWithServiceResponseAsync(String billingAccountName, String customerName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Parameter customerName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByCustomer(billingAccountName, customerName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPermissionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPermissionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPermissionsListResultInner> clientResponse = listByCustomerDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPermissionsListResultInner> listByCustomerDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPermissionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPermissionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPermissionsListResultInner object if successful.
     */
    public BillingPermissionsListResultInner listByBillingAccount(String billingAccountName) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPermissionsListResultInner> listByBillingAccountAsync(String billingAccountName, final ServiceCallback<BillingPermissionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<BillingPermissionsListResultInner> listByBillingAccountAsync(String billingAccountName) {
        return listByBillingAccountWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<BillingPermissionsListResultInner>, BillingPermissionsListResultInner>() {
            @Override
            public BillingPermissionsListResultInner call(ServiceResponse<BillingPermissionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the billing permissions the caller has on a billing account.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<ServiceResponse<BillingPermissionsListResultInner>> listByBillingAccountWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccount(billingAccountName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPermissionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPermissionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPermissionsListResultInner> clientResponse = listByBillingAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPermissionsListResultInner> listByBillingAccountDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPermissionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPermissionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPermissionsListResultInner object if successful.
     */
    public BillingPermissionsListResultInner listByInvoiceSections(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        return listByInvoiceSectionsWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName).toBlocking().single().body();
    }

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPermissionsListResultInner> listByInvoiceSectionsAsync(String billingAccountName, String billingProfileName, String invoiceSectionName, final ServiceCallback<BillingPermissionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByInvoiceSectionsWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName), serviceCallback);
    }

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<BillingPermissionsListResultInner> listByInvoiceSectionsAsync(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        return listByInvoiceSectionsWithServiceResponseAsync(billingAccountName, billingProfileName, invoiceSectionName).map(new Func1<ServiceResponse<BillingPermissionsListResultInner>, BillingPermissionsListResultInner>() {
            @Override
            public BillingPermissionsListResultInner call(ServiceResponse<BillingPermissionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the billing permissions the caller has on an invoice section.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param invoiceSectionName The ID that uniquely identifies an invoice section.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<ServiceResponse<BillingPermissionsListResultInner>> listByInvoiceSectionsWithServiceResponseAsync(String billingAccountName, String billingProfileName, String invoiceSectionName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByInvoiceSections(billingAccountName, billingProfileName, invoiceSectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPermissionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPermissionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPermissionsListResultInner> clientResponse = listByInvoiceSectionsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPermissionsListResultInner> listByInvoiceSectionsDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPermissionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPermissionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingPermissionsListResultInner object if successful.
     */
    public BillingPermissionsListResultInner listByBillingProfile(String billingAccountName, String billingProfileName) {
        return listByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName).toBlocking().single().body();
    }

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingPermissionsListResultInner> listByBillingProfileAsync(String billingAccountName, String billingProfileName, final ServiceCallback<BillingPermissionsListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName), serviceCallback);
    }

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<BillingPermissionsListResultInner> listByBillingProfileAsync(String billingAccountName, String billingProfileName) {
        return listByBillingProfileWithServiceResponseAsync(billingAccountName, billingProfileName).map(new Func1<ServiceResponse<BillingPermissionsListResultInner>, BillingPermissionsListResultInner>() {
            @Override
            public BillingPermissionsListResultInner call(ServiceResponse<BillingPermissionsListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the billing permissions the caller has on a billing profile.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param billingProfileName The ID that uniquely identifies a billing profile.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingPermissionsListResultInner object
     */
    public Observable<ServiceResponse<BillingPermissionsListResultInner>> listByBillingProfileWithServiceResponseAsync(String billingAccountName, String billingProfileName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingProfileName == null) {
            throw new IllegalArgumentException("Parameter billingProfileName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingProfile(billingAccountName, billingProfileName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingPermissionsListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingPermissionsListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingPermissionsListResultInner> clientResponse = listByBillingProfileDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingPermissionsListResultInner> listByBillingProfileDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingPermissionsListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingPermissionsListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
