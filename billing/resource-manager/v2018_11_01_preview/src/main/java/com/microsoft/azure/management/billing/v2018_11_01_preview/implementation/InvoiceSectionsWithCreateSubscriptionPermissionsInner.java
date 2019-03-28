/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
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
 * in InvoiceSectionsWithCreateSubscriptionPermissions.
 */
public class InvoiceSectionsWithCreateSubscriptionPermissionsInner {
    /** The Retrofit service to perform REST calls. */
    private InvoiceSectionsWithCreateSubscriptionPermissionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of InvoiceSectionsWithCreateSubscriptionPermissionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public InvoiceSectionsWithCreateSubscriptionPermissionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(InvoiceSectionsWithCreateSubscriptionPermissionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for InvoiceSectionsWithCreateSubscriptionPermissions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface InvoiceSectionsWithCreateSubscriptionPermissionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionsWithCreateSubscriptionPermissions list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/listInvoiceSectionsWithCreateSubscriptionPermission")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSectionListResultInner object if successful.
     */
    public InvoiceSectionListResultInner list(String billingAccountName) {
        return listWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSectionListResultInner> listAsync(String billingAccountName, final ServiceCallback<InvoiceSectionListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionListResultInner object
     */
    public Observable<InvoiceSectionListResultInner> listAsync(String billingAccountName) {
        return listWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<InvoiceSectionListResultInner>, InvoiceSectionListResultInner>() {
            @Override
            public InvoiceSectionListResultInner call(ServiceResponse<InvoiceSectionListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionListResultInner object
     */
    public Observable<ServiceResponse<InvoiceSectionListResultInner>> listWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        return service.list(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoiceSectionListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<InvoiceSectionListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoiceSectionListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the billingProfiles.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the InvoiceSectionListResultInner object if successful.
     */
    public InvoiceSectionListResultInner list(String billingAccountName, String expand) {
        return listWithServiceResponseAsync(billingAccountName, expand).toBlocking().single().body();
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the billingProfiles.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<InvoiceSectionListResultInner> listAsync(String billingAccountName, String expand, final ServiceCallback<InvoiceSectionListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName, expand), serviceCallback);
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the billingProfiles.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionListResultInner object
     */
    public Observable<InvoiceSectionListResultInner> listAsync(String billingAccountName, String expand) {
        return listWithServiceResponseAsync(billingAccountName, expand).map(new Func1<ServiceResponse<InvoiceSectionListResultInner>, InvoiceSectionListResultInner>() {
            @Override
            public InvoiceSectionListResultInner call(ServiceResponse<InvoiceSectionListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all invoiceSections with create subscription permission for a user.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the billingProfiles.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the InvoiceSectionListResultInner object
     */
    public Observable<ServiceResponse<InvoiceSectionListResultInner>> listWithServiceResponseAsync(String billingAccountName, String expand) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountName, this.client.apiVersion(), expand, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<InvoiceSectionListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<InvoiceSectionListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<InvoiceSectionListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<InvoiceSectionListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<InvoiceSectionListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<InvoiceSectionListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
