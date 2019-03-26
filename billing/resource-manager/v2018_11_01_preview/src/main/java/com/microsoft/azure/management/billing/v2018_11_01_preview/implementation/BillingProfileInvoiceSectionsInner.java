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
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingProfileInvoiceSections.
 */
public class BillingProfileInvoiceSectionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingProfileInvoiceSectionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingProfileInvoiceSectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingProfileInvoiceSectionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingProfileInvoiceSectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingProfileInvoiceSections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingProfileInvoiceSectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileInvoiceSections elevate" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoiceSections/{invoiceSectionName}/elevate")
        Observable<Response<ResponseBody>> elevate(@Path("billingAccountName") String billingAccountName, @Path("invoiceSectionName") String invoiceSectionName, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void elevate(String billingAccountName, String invoiceSectionName) {
        elevateWithServiceResponseAsync(billingAccountName, invoiceSectionName).toBlocking().single().body();
    }

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> elevateAsync(String billingAccountName, String invoiceSectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(elevateWithServiceResponseAsync(billingAccountName, invoiceSectionName), serviceCallback);
    }

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> elevateAsync(String billingAccountName, String invoiceSectionName) {
        return elevateWithServiceResponseAsync(billingAccountName, invoiceSectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Elevates the caller's access to match their billing profile access.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> elevateWithServiceResponseAsync(String billingAccountName, String invoiceSectionName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        return service.elevate(billingAccountName, invoiceSectionName, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = elevateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> elevateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
