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
 * in Departments.
 */
public class DepartmentsInner {
    /** The Retrofit service to perform REST calls. */
    private DepartmentsService service;
    /** The service client containing this operation class. */
    private BillingManagementClientImpl client;

    /**
     * Initializes an instance of DepartmentsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DepartmentsInner(Retrofit retrofit, BillingManagementClientImpl client) {
        this.service = retrofit.create(DepartmentsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Departments to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DepartmentsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Departments listByBillingAccountName" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments")
        Observable<Response<ResponseBody>> listByBillingAccountName(@Path("billingAccountName") String billingAccountName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2019_10_01_preview.Departments get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountName}/departments/{departmentName}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountName") String billingAccountName, @Path("departmentName") String departmentName, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentListResultInner object if successful.
     */
    public DepartmentListResultInner listByBillingAccountName(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).toBlocking().single().body();
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentListResultInner> listByBillingAccountNameAsync(String billingAccountName, final ServiceCallback<DepartmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName), serviceCallback);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<DepartmentListResultInner> listByBillingAccountNameAsync(String billingAccountName) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName).map(new Func1<ServiceResponse<DepartmentListResultInner>, DepartmentListResultInner>() {
            @Override
            public DepartmentListResultInner call(ServiceResponse<DepartmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<ServiceResponse<DepartmentListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentListResultInner object if successful.
     */
    public DepartmentListResultInner listByBillingAccountName(String billingAccountName, String expand, String filter) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter).toBlocking().single().body();
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand, String filter, final ServiceCallback<DepartmentListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter), serviceCallback);
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<DepartmentListResultInner> listByBillingAccountNameAsync(String billingAccountName, String expand, String filter) {
        return listByBillingAccountNameWithServiceResponseAsync(billingAccountName, expand, filter).map(new Func1<ServiceResponse<DepartmentListResultInner>, DepartmentListResultInner>() {
            @Override
            public DepartmentListResultInner call(ServiceResponse<DepartmentListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists the departments that a user has access to. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentListResultInner object
     */
    public Observable<ServiceResponse<DepartmentListResultInner>> listByBillingAccountNameWithServiceResponseAsync(String billingAccountName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByBillingAccountName(billingAccountName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentListResultInner> clientResponse = listByBillingAccountNameDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DepartmentListResultInner> listByBillingAccountNameDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DepartmentListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DepartmentListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).toBlocking().single().body();
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName), serviceCallback);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName) {
        return getWithServiceResponseAsync(billingAccountName, departmentName).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).toBlocking().single().body();
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter), serviceCallback);
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountName, String departmentName, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountName, departmentName, expand, filter).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a department by ID. The operation is supported only for billing accounts with agreement type Enterprise Agreement.
     *
     * @param billingAccountName The ID that uniquely identifies a billing account.
     * @param departmentName The ID that uniquely identifies a department.
     * @param expand May be used to expand the enrollment accounts.
     * @param filter May be used to filter by department name. The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value are separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountName, String departmentName, String expand, String filter) {
        if (billingAccountName == null) {
            throw new IllegalArgumentException("Parameter billingAccountName is required and cannot be null.");
        }
        if (departmentName == null) {
            throw new IllegalArgumentException("Parameter departmentName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountName, departmentName, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DepartmentInner>>>() {
                @Override
                public Observable<ServiceResponse<DepartmentInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DepartmentInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DepartmentInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DepartmentInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DepartmentInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
