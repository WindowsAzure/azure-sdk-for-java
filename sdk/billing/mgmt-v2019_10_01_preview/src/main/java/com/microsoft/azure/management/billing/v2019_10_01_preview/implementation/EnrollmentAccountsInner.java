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
 * in EnrollmentAccounts.
 */
public class EnrollmentAccountsInner {
    /** The Retrofit service to perform REST calls. */
    private EnrollmentAccountsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of EnrollmentAccountsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EnrollmentAccountsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(EnrollmentAccountsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for EnrollmentAccounts to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EnrollmentAccountsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.EnrollmentAccounts listByBillingAccountName" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/enrollmentAccounts")
        Observable<Response<ResponseBody>> listByBillingAccountName(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.EnrollmentAccounts getByEnrollmentAccountId" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/enrollmentAccounts/{enrollmentAccountName}")
        Observable<Response<ResponseBody>> getByEnrollmentAccountId(@Path("billingAccountName") String billingAccountName, @Path("enrollmentAccountName") String enrollmentAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountListResultInner object if successful.
     */
    public EnrollmentAccountListResultInner listByBillingAccountName(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountListResultInner> listByBillingAccountNameAsync(String billingAccountName, final ServiceCallback<EnrollmentAccountListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<EnrollmentAccountListResultInner> listByBillingAccountNameAsync(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<EnrollmentAccountListResultInner>, EnrollmentAccountListResultInner>() {
            @Override
            public EnrollmentAccountListResultInner call(ServiceResponse<EnrollmentAccountListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountListResultInner object if successful.
     */
    public EnrollmentAccountListResultInner listByBillingAccountName(String billingAccountName, String expand, String filter) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter).toBlocking().single().body();
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand, String filter, final ServiceCallback<EnrollmentAccountListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter), serviceCallback);
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<EnrollmentAccountListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand, String filter) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter).map(new Func1<ServiceResponse<EnrollmentAccountListResultInner>, EnrollmentAccountListResultInner>() {
            @Override
            public EnrollmentAccountListResultInner call(ServiceResponse<EnrollmentAccountListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all Enrollment Accounts for a user which he has access to.
     *
     * @param billingAccountName billing Account Id.
     * @param expand May be used to expand the department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountListResultInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EnrollmentAccountListResultInner> listByBillingAccountNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EnrollmentAccountListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EnrollmentAccountListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountInner object if successful.
     */
    public EnrollmentAccountInner getByEnrollmentAccountId(String billingAccountName, String enrollmentAccountName) {
        return getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName).toBlocking().single().body();
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountInner> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName, final ServiceCallback<EnrollmentAccountInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName), serviceCallback);
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountInner object
     */
    public Observable<EnrollmentAccountInner> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName) {
        return getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName).map(new Func1<ServiceResponse<EnrollmentAccountInner>, EnrollmentAccountInner>() {
            @Override
            public EnrollmentAccountInner call(ServiceResponse<EnrollmentAccountInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountInner>> getByEnrollmentAccountIdWithServiceResponseAsync(String billingAccountName, String enrollmentAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (enrollmentAccountName == null) {
            throw new IllegalArgumentException("Parameter enrollmentAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.getByEnrollmentAccountId(billingAccountName, enrollmentAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountInner> clientResponse = getByEnrollmentAccountIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @param expand May be used to expand the Department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EnrollmentAccountInner object if successful.
     */
    public EnrollmentAccountInner getByEnrollmentAccountId(String billingAccountName, String enrollmentAccountName, String expand, String filter) {
        return getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName, expand, filter).toBlocking().single().body();
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @param expand May be used to expand the Department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EnrollmentAccountInner> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName, String expand, String filter, final ServiceCallback<EnrollmentAccountInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName, expand, filter), serviceCallback);
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @param expand May be used to expand the Department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountInner object
     */
    public Observable<EnrollmentAccountInner> getByEnrollmentAccountIdAsync(String billingAccountName, String enrollmentAccountName, String expand, String filter) {
        return getByEnrollmentAccountIdWithServiceResponseAsync(billingAccountName, enrollmentAccountName, expand, filter).map(new Func1<ServiceResponse<EnrollmentAccountInner>, EnrollmentAccountInner>() {
            @Override
            public EnrollmentAccountInner call(ServiceResponse<EnrollmentAccountInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the enrollment account by id.
     *
     * @param billingAccountName billing Account Id.
     * @param enrollmentAccountName Enrollment Account Id.
     * @param expand May be used to expand the Department.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EnrollmentAccountInner object
     */
    public Observable<ServiceResponse<EnrollmentAccountInner>> getByEnrollmentAccountIdWithServiceResponseAsync(String billingAccountName, String enrollmentAccountName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (enrollmentAccountName == null) {
            throw new IllegalArgumentException("Parameter enrollmentAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByEnrollmentAccountId(billingAccountName, enrollmentAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EnrollmentAccountInner>>>() {
                @Override
                public Observable<ServiceResponse<EnrollmentAccountInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EnrollmentAccountInner> clientResponse = getByEnrollmentAccountIdDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EnrollmentAccountInner> getByEnrollmentAccountIdDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EnrollmentAccountInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EnrollmentAccountInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
