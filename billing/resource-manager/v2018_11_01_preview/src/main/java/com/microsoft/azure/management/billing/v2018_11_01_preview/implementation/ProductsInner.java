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
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductsTransferHeaders;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransferProductRequestProperties;
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
 * in Products.
 */
public class ProductsInner {
    /** The Retrofit service to perform REST calls. */
    private ProductsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of ProductsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ProductsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(ProductsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Products to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ProductsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Products get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoiceSections/{invoiceSectionName}/products/{productName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("invoiceSectionName") String invoiceSectionName, @Path("productName") String productName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Products transfer" })
        @POST("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/invoiceSections/{invoiceSectionName}/products/{productName}/transfer")
        Observable<Response<ResponseBody>> transfer(@Path("billingAccountName") String billingAccountName, @Path("invoiceSectionName") String invoiceSectionName, @Path("productName") String productName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body TransferProductRequestProperties parameters, @Header("User-Agent") String userAgent);

    }

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProductSummaryInner object if successful.
     */
    public ProductSummaryInner get(String billingAccountName, String invoiceSectionName, String productName) {
        return getWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName).toBlocking().single().body();
    }

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProductSummaryInner> getAsync(String billingAccountName, String invoiceSectionName, String productName, final ServiceCallback<ProductSummaryInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName), serviceCallback);
    }

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ProductSummaryInner> getAsync(String billingAccountName, String invoiceSectionName, String productName) {
        return getWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName).map(new Func1<ServiceResponse<ProductSummaryInner>, ProductSummaryInner>() {
            @Override
            public ProductSummaryInner call(ServiceResponse<ProductSummaryInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a single product by name.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ServiceResponse<ProductSummaryInner>> getWithServiceResponseAsync(String billingAccountName, String invoiceSectionName, String productName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (productName == null) {
            throw new IllegalArgumentException("Parameter productName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, invoiceSectionName, productName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ProductSummaryInner>>>() {
                @Override
                public Observable<ServiceResponse<ProductSummaryInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ProductSummaryInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ProductSummaryInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProductSummaryInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProductSummaryInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProductSummaryInner object if successful.
     */
    public ProductSummaryInner transfer(String billingAccountName, String invoiceSectionName, String productName) {
        return transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName).toBlocking().single().body();
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProductSummaryInner> transferAsync(String billingAccountName, String invoiceSectionName, String productName, final ServiceCallback<ProductSummaryInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName), serviceCallback);
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ProductSummaryInner> transferAsync(String billingAccountName, String invoiceSectionName, String productName) {
        return transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName).map(new Func1<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>, ProductSummaryInner>() {
            @Override
            public ProductSummaryInner call(ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>> transferWithServiceResponseAsync(String billingAccountName, String invoiceSectionName, String productName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (productName == null) {
            throw new IllegalArgumentException("Parameter productName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String destinationInvoiceSectionId = null;
        TransferProductRequestProperties parameters = new TransferProductRequestProperties();
        parameters.withDestinationInvoiceSectionId(null);
        return service.transfer(billingAccountName, invoiceSectionName, productName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders> clientResponse = transferDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param destinationInvoiceSectionId Destination invoice section id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ProductSummaryInner object if successful.
     */
    public ProductSummaryInner transfer(String billingAccountName, String invoiceSectionName, String productName, String destinationInvoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName, destinationInvoiceSectionId).toBlocking().single().body();
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param destinationInvoiceSectionId Destination invoice section id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ProductSummaryInner> transferAsync(String billingAccountName, String invoiceSectionName, String productName, String destinationInvoiceSectionId, final ServiceCallback<ProductSummaryInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName, destinationInvoiceSectionId), serviceCallback);
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param destinationInvoiceSectionId Destination invoice section id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ProductSummaryInner> transferAsync(String billingAccountName, String invoiceSectionName, String productName, String destinationInvoiceSectionId) {
        return transferWithServiceResponseAsync(billingAccountName, invoiceSectionName, productName, destinationInvoiceSectionId).map(new Func1<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>, ProductSummaryInner>() {
            @Override
            public ProductSummaryInner call(ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * The operation to transfer a Product to another InvoiceSection.
     *
     * @param billingAccountName billing Account Id.
     * @param invoiceSectionName InvoiceSection Id.
     * @param productName Invoice Id.
     * @param destinationInvoiceSectionId Destination invoice section id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ProductSummaryInner object
     */
    public Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>> transferWithServiceResponseAsync(String billingAccountName, String invoiceSectionName, String productName, String destinationInvoiceSectionId) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (invoiceSectionName == null) {
            throw new IllegalArgumentException("Parameter invoiceSectionName is required and cannot be null.");
        }
        if (productName == null) {
            throw new IllegalArgumentException("Parameter productName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        TransferProductRequestProperties parameters = new TransferProductRequestProperties();
        parameters.withDestinationInvoiceSectionId(destinationInvoiceSectionId);
        return service.transfer(billingAccountName, invoiceSectionName, productName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders> clientResponse = transferDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<ProductSummaryInner, ProductsTransferHeaders> transferDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ProductSummaryInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ProductSummaryInner>() { }.getType())
                .register(202, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, ProductsTransferHeaders.class);
    }

}
