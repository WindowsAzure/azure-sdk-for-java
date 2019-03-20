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
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionTransferHeaders;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ErrorResponseException;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransferBillingSubscriptionRequestProperties;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BillingSubscriptions.
 */
public class BillingSubscriptionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingSubscriptionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingSubscriptionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingSubscriptionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingSubscriptionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingSubscriptions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingSubscriptionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}/billingSubscriptions/{billingSubscriptionId}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountId") String billingAccountId, @Path("invoiceSectionId") String invoiceSectionId, @Path("billingSubscriptionId") String billingSubscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions transfer" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}/billingSubscriptions/{subscriptionId}/transfer")
        Observable<Response<ResponseBody>> transfer(@Path("billingAccountId") String billingAccountId, @Path("invoiceSectionId") String invoiceSectionId, @Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage, @Body TransferBillingSubscriptionRequestProperties parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions beginTransfer" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/invoiceSections/{invoiceSectionId}/billingSubscriptions/{subscriptionId}/transfer")
        Observable<Response<ResponseBody>> beginTransfer(@Path("billingAccountId") String billingAccountId, @Path("invoiceSectionId") String invoiceSectionId, @Path("subscriptionId") String subscriptionId, @Header("accept-language") String acceptLanguage, @Body TransferBillingSubscriptionRequestProperties parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param billingSubscriptionId Billing Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingSubscriptionSummaryInner object if successful.
     */
    public BillingSubscriptionSummaryInner get(String billingAccountId, String invoiceSectionId, String billingSubscriptionId) {
        return getWithServiceResponseAsync(billingAccountId, invoiceSectionId, billingSubscriptionId).toBlocking().single().body();
    }

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param billingSubscriptionId Billing Subscription Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingSubscriptionSummaryInner> getAsync(String billingAccountId, String invoiceSectionId, String billingSubscriptionId, final ServiceCallback<BillingSubscriptionSummaryInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountId, invoiceSectionId, billingSubscriptionId), serviceCallback);
    }

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param billingSubscriptionId Billing Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingSubscriptionSummaryInner object
     */
    public Observable<BillingSubscriptionSummaryInner> getAsync(String billingAccountId, String invoiceSectionId, String billingSubscriptionId) {
        return getWithServiceResponseAsync(billingAccountId, invoiceSectionId, billingSubscriptionId).map(new Func1<ServiceResponse<BillingSubscriptionSummaryInner>, BillingSubscriptionSummaryInner>() {
            @Override
            public BillingSubscriptionSummaryInner call(ServiceResponse<BillingSubscriptionSummaryInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a single billing subscription by name.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param billingSubscriptionId Billing Subscription Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingSubscriptionSummaryInner object
     */
    public Observable<ServiceResponse<BillingSubscriptionSummaryInner>> getWithServiceResponseAsync(String billingAccountId, String invoiceSectionId, String billingSubscriptionId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (invoiceSectionId == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionId is required and cannot be null.");
        }
        if (billingSubscriptionId == null) {
            throw new IllegalArgumentException("Parameter billingSubscriptionId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountId, invoiceSectionId, billingSubscriptionId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingSubscriptionSummaryInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingSubscriptionSummaryInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingSubscriptionSummaryInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingSubscriptionSummaryInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingSubscriptionSummaryInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingSubscriptionSummaryInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransferBillingSubscriptionResultInner object if successful.
     */
    public TransferBillingSubscriptionResultInner transfer(String billingAccountId, String invoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountId, invoiceSectionId).toBlocking().last().body();
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransferBillingSubscriptionResultInner> transferAsync(String billingAccountId, String invoiceSectionId, final ServiceCallback<TransferBillingSubscriptionResultInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(transferWithServiceResponseAsync(billingAccountId, invoiceSectionId), serviceCallback);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<TransferBillingSubscriptionResultInner> transferAsync(String billingAccountId, String invoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountId, invoiceSectionId).map(new Func1<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>, TransferBillingSubscriptionResultInner>() {
            @Override
            public TransferBillingSubscriptionResultInner call(ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> transferWithServiceResponseAsync(String billingAccountId, String invoiceSectionId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (invoiceSectionId == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String destinationInvoiceSectionId = null;
        TransferBillingSubscriptionRequestProperties parameters = new TransferBillingSubscriptionRequestProperties();
        parameters.withDestinationInvoiceSectionId(null);
        Observable<Response<ResponseBody>> observable = service.transfer(billingAccountId, invoiceSectionId, this.client.subscriptionId(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<TransferBillingSubscriptionResultInner>() { }.getType(), BillingSubscriptionTransferHeaders.class);
    }
    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransferBillingSubscriptionResultInner object if successful.
     */
    public TransferBillingSubscriptionResultInner transfer(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId).toBlocking().last().body();
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransferBillingSubscriptionResultInner> transferAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId, final ServiceCallback<TransferBillingSubscriptionResultInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(transferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId), serviceCallback);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<TransferBillingSubscriptionResultInner> transferAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId).map(new Func1<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>, TransferBillingSubscriptionResultInner>() {
            @Override
            public TransferBillingSubscriptionResultInner call(ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> transferWithServiceResponseAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (invoiceSectionId == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        TransferBillingSubscriptionRequestProperties parameters = new TransferBillingSubscriptionRequestProperties();
        parameters.withDestinationInvoiceSectionId(destinationInvoiceSectionId);
        Observable<Response<ResponseBody>> observable = service.transfer(billingAccountId, invoiceSectionId, this.client.subscriptionId(), this.client.acceptLanguage(), parameters, this.client.userAgent());
        return client.getAzureClient().getPostOrDeleteResultWithHeadersAsync(observable, new TypeToken<TransferBillingSubscriptionResultInner>() { }.getType(), BillingSubscriptionTransferHeaders.class);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransferBillingSubscriptionResultInner object if successful.
     */
    public TransferBillingSubscriptionResultInner beginTransfer(String billingAccountId, String invoiceSectionId) {
        return beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId).toBlocking().single().body();
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransferBillingSubscriptionResultInner> beginTransferAsync(String billingAccountId, String invoiceSectionId, final ServiceCallback<TransferBillingSubscriptionResultInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId), serviceCallback);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransferBillingSubscriptionResultInner object
     */
    public Observable<TransferBillingSubscriptionResultInner> beginTransferAsync(String billingAccountId, String invoiceSectionId) {
        return beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId).map(new Func1<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>, TransferBillingSubscriptionResultInner>() {
            @Override
            public TransferBillingSubscriptionResultInner call(ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransferBillingSubscriptionResultInner object
     */
    public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> beginTransferWithServiceResponseAsync(String billingAccountId, String invoiceSectionId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (invoiceSectionId == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String destinationInvoiceSectionId = null;
        TransferBillingSubscriptionRequestProperties parameters = new TransferBillingSubscriptionRequestProperties();
        parameters.withDestinationInvoiceSectionId(null);
        return service.beginTransfer(billingAccountId, invoiceSectionId, this.client.subscriptionId(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> clientResponse = beginTransferDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TransferBillingSubscriptionResultInner object if successful.
     */
    public TransferBillingSubscriptionResultInner beginTransfer(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        return beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId).toBlocking().single().body();
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TransferBillingSubscriptionResultInner> beginTransferAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId, final ServiceCallback<TransferBillingSubscriptionResultInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId), serviceCallback);
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransferBillingSubscriptionResultInner object
     */
    public Observable<TransferBillingSubscriptionResultInner> beginTransferAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        return beginTransferWithServiceResponseAsync(billingAccountId, invoiceSectionId, destinationInvoiceSectionId).map(new Func1<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>, TransferBillingSubscriptionResultInner>() {
            @Override
            public TransferBillingSubscriptionResultInner call(ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Transfers the GTM subscription from one invoice section to another within a billing account.
     *
     * @param billingAccountId billing Account Id.
     * @param invoiceSectionId InvoiceSection Id.
     * @param destinationInvoiceSectionId The destination invoiceSectionId.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TransferBillingSubscriptionResultInner object
     */
    public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> beginTransferWithServiceResponseAsync(String billingAccountId, String invoiceSectionId, String destinationInvoiceSectionId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (invoiceSectionId == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        TransferBillingSubscriptionRequestProperties parameters = new TransferBillingSubscriptionRequestProperties();
        parameters.withDestinationInvoiceSectionId(destinationInvoiceSectionId);
        return service.beginTransfer(billingAccountId, invoiceSectionId, this.client.subscriptionId(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> clientResponse = beginTransferDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<TransferBillingSubscriptionResultInner, BillingSubscriptionTransferHeaders> beginTransferDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TransferBillingSubscriptionResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TransferBillingSubscriptionResultInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, BillingSubscriptionTransferHeaders.class);
    }

}
