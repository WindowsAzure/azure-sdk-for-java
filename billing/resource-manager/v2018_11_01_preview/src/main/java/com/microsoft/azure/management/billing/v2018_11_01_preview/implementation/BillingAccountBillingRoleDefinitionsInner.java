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
 * in BillingAccountBillingRoleDefinitions.
 */
public class BillingAccountBillingRoleDefinitionsInner {
    /** The Retrofit service to perform REST calls. */
    private BillingAccountBillingRoleDefinitionsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of BillingAccountBillingRoleDefinitionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BillingAccountBillingRoleDefinitionsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(BillingAccountBillingRoleDefinitionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BillingAccountBillingRoleDefinitions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BillingAccountBillingRoleDefinitionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountBillingRoleDefinitions get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/providers/Microsoft.Billing/billingRoleDefinitions/{billingRoleDefinitionName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("billingRoleDefinitionName") String billingRoleDefinitionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountBillingRoleDefinitions list" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/providers/Microsoft.Billing/billingRoleDefinitions")
        Observable<Response<ResponseBody>> list(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleDefinitionInner object if successful.
     */
    public BillingRoleDefinitionInner get(String billingAccountName, String billingRoleDefinitionName) {
        return getWithServiceResponseAsync(billingAccountName, billingRoleDefinitionName).toBlocking().single().body();
    }

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleDefinitionName role definition id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleDefinitionInner> getAsync(String billingAccountName, String billingRoleDefinitionName, final ServiceCallback<BillingRoleDefinitionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, billingRoleDefinitionName), serviceCallback);
    }

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleDefinitionInner object
     */
    public Observable<BillingRoleDefinitionInner> getAsync(String billingAccountName, String billingRoleDefinitionName) {
        return getWithServiceResponseAsync(billingAccountName, billingRoleDefinitionName).map(new Func1<ServiceResponse<BillingRoleDefinitionInner>, BillingRoleDefinitionInner>() {
            @Override
            public BillingRoleDefinitionInner call(ServiceResponse<BillingRoleDefinitionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the role definition for a role.
     *
     * @param billingAccountName billing Account Id.
     * @param billingRoleDefinitionName role definition id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleDefinitionInner object
     */
    public Observable<ServiceResponse<BillingRoleDefinitionInner>> getWithServiceResponseAsync(String billingAccountName, String billingRoleDefinitionName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (billingRoleDefinitionName == null) {
            throw new IllegalArgumentException("Parameter billingRoleDefinitionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, billingRoleDefinitionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleDefinitionInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleDefinitionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleDefinitionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleDefinitionInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleDefinitionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingRoleDefinitionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists the role definition for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BillingRoleDefinitionListResultInner object if successful.
     */
    public BillingRoleDefinitionListResultInner list(String billingAccountName) {
        return listWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists the role definition for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BillingRoleDefinitionListResultInner> listAsync(String billingAccountName, final ServiceCallback<BillingRoleDefinitionListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists the role definition for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleDefinitionListResultInner object
     */
    public Observable<BillingRoleDefinitionListResultInner> listAsync(String billingAccountName) {
        return listWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<BillingRoleDefinitionListResultInner>, BillingRoleDefinitionListResultInner>() {
            @Override
            public BillingRoleDefinitionListResultInner call(ServiceResponse<BillingRoleDefinitionListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the role definition for a billing account.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BillingRoleDefinitionListResultInner object
     */
    public Observable<ServiceResponse<BillingRoleDefinitionListResultInner>> listWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(billingAccountName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BillingRoleDefinitionListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<BillingRoleDefinitionListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BillingRoleDefinitionListResultInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BillingRoleDefinitionListResultInner> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BillingRoleDefinitionListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BillingRoleDefinitionListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
