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
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.billing.v2018_11_01_preview.Departments get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/departments/{departmentId}")
        Observable<Response<ResponseBody>> get(@Path("billingAccountId") String billingAccountId, @Path("departmentId") String departmentId, @Query("api-version") String apiVersion, @Query("$expand") String expand, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountId, String departmentId) {
        return getWithServiceResponseAsync(billingAccountId, departmentId).toBlocking().single().body();
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountId, String departmentId, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountId, departmentId), serviceCallback);
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountId, String departmentId) {
        return getWithServiceResponseAsync(billingAccountId, departmentId).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountId, String departmentId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("Parameter departmentId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String expand = null;
        final String filter = null;
        return service.get(billingAccountId, departmentId, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
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
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DepartmentInner object if successful.
     */
    public DepartmentInner get(String billingAccountId, String departmentId, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountId, departmentId, expand, filter).toBlocking().single().body();
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DepartmentInner> getAsync(String billingAccountId, String departmentId, String expand, String filter, final ServiceCallback<DepartmentInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountId, departmentId, expand, filter), serviceCallback);
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<DepartmentInner> getAsync(String billingAccountId, String departmentId, String expand, String filter) {
        return getWithServiceResponseAsync(billingAccountId, departmentId, expand, filter).map(new Func1<ServiceResponse<DepartmentInner>, DepartmentInner>() {
            @Override
            public DepartmentInner call(ServiceResponse<DepartmentInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the department by id.
     *
     * @param billingAccountId billing Account Id.
     * @param departmentId Department Id.
     * @param expand May be used to expand the enrollmentAccounts.
     * @param filter The filter supports 'eq', 'lt', 'gt', 'le', 'ge', and 'and'. It does not currently support 'ne', 'or', or 'not'. Tag filter is a key value pair string where key and value is separated by a colon (:).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DepartmentInner object
     */
    public Observable<ServiceResponse<DepartmentInner>> getWithServiceResponseAsync(String billingAccountId, String departmentId, String expand, String filter) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (departmentId == null) {
            throw new IllegalArgumentException("Parameter departmentId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountId, departmentId, this.client.apiVersion(), expand, filter, this.client.acceptLanguage(), this.client.userAgent())
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
