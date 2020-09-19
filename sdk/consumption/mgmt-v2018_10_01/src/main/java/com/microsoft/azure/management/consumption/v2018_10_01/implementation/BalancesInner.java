/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.consumption.v2018_10_01.ErrorResponseException;
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
 * in Balances.
 */
public class BalancesInner {
    /** The Retrofit service to perform REST calls. */
    private BalancesService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of BalancesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BalancesInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(BalancesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Balances to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BalancesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_10_01.Balances getByBillingAccount" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.Consumption/balances")
        Observable<Response<ResponseBody>> getByBillingAccount(@Path("billingAccountId") String billingAccountId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_10_01.Balances getForBillingPeriodByBillingAccount" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/providers/Microsoft.Billing/billingPeriods/{billingPeriodName}/providers/Microsoft.Consumption/balances")
        Observable<Response<ResponseBody>> getForBillingPeriodByBillingAccount(@Path("billingAccountId") String billingAccountId, @Path("billingPeriodName") String billingPeriodName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BalanceInner object if successful.
     */
    public BalanceInner getByBillingAccount(String billingAccountId) {
        return getByBillingAccountWithServiceResponseAsync(billingAccountId).toBlocking().single().body();
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BalanceInner> getByBillingAccountAsync(String billingAccountId, final ServiceCallback<BalanceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByBillingAccountWithServiceResponseAsync(billingAccountId), serviceCallback);
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BalanceInner object
     */
    public Observable<BalanceInner> getByBillingAccountAsync(String billingAccountId) {
        return getByBillingAccountWithServiceResponseAsync(billingAccountId).map(new Func1<ServiceResponse<BalanceInner>, BalanceInner>() {
            @Override
            public BalanceInner call(ServiceResponse<BalanceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the balances for a scope by billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BalanceInner object
     */
    public Observable<ServiceResponse<BalanceInner>> getByBillingAccountWithServiceResponseAsync(String billingAccountId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByBillingAccount(billingAccountId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BalanceInner>>>() {
                @Override
                public Observable<ServiceResponse<BalanceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BalanceInner> clientResponse = getByBillingAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BalanceInner> getByBillingAccountDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BalanceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BalanceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BalanceInner object if successful.
     */
    public BalanceInner getForBillingPeriodByBillingAccount(String billingAccountId, String billingPeriodName) {
        return getForBillingPeriodByBillingAccountWithServiceResponseAsync(billingAccountId, billingPeriodName).toBlocking().single().body();
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BalanceInner> getForBillingPeriodByBillingAccountAsync(String billingAccountId, String billingPeriodName, final ServiceCallback<BalanceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getForBillingPeriodByBillingAccountWithServiceResponseAsync(billingAccountId, billingPeriodName), serviceCallback);
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BalanceInner object
     */
    public Observable<BalanceInner> getForBillingPeriodByBillingAccountAsync(String billingAccountId, String billingPeriodName) {
        return getForBillingPeriodByBillingAccountWithServiceResponseAsync(billingAccountId, billingPeriodName).map(new Func1<ServiceResponse<BalanceInner>, BalanceInner>() {
            @Override
            public BalanceInner call(ServiceResponse<BalanceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the balances for a scope by billing period and billingAccountId. Balances are available via this API only for May 1, 2014 or later.
     *
     * @param billingAccountId BillingAccount ID
     * @param billingPeriodName Billing Period Name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BalanceInner object
     */
    public Observable<ServiceResponse<BalanceInner>> getForBillingPeriodByBillingAccountWithServiceResponseAsync(String billingAccountId, String billingPeriodName) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (billingPeriodName == null) {
            throw new IllegalArgumentException("Parameter billingPeriodName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getForBillingPeriodByBillingAccount(billingAccountId, billingPeriodName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BalanceInner>>>() {
                @Override
                public Observable<ServiceResponse<BalanceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BalanceInner> clientResponse = getForBillingPeriodByBillingAccountDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BalanceInner> getForBillingPeriodByBillingAccountDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BalanceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BalanceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
