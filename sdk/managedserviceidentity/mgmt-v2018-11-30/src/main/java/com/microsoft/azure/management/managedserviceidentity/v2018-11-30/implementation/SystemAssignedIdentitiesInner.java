/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managedserviceidentity.v2018-11-30.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
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
 * in SystemAssignedIdentities.
 */
public class SystemAssignedIdentitiesInner {
    /** The Retrofit service to perform REST calls. */
    private SystemAssignedIdentitiesService service;
    /** The service client containing this operation class. */
    private ManagedServiceIdentityClientImpl client;

    /**
     * Initializes an instance of SystemAssignedIdentitiesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SystemAssignedIdentitiesInner(Retrofit retrofit, ManagedServiceIdentityClientImpl client) {
        this.service = retrofit.create(SystemAssignedIdentitiesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SystemAssignedIdentities to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SystemAssignedIdentitiesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.managedserviceidentity.v2018-11-30.SystemAssignedIdentities getByScope" })
        @GET("{scope}/providers/Microsoft.ManagedIdentity/identities/default")
        Observable<Response<ResponseBody>> getByScope(@Path(value = "scope", encoded = true) String scope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the SystemAssignedIdentityInner object if successful.
     */
    public SystemAssignedIdentityInner getByScope(String scope) {
        return getByScopeWithServiceResponseAsync(scope).toBlocking().single().body();
    }

    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<SystemAssignedIdentityInner> getByScopeAsync(String scope, final ServiceCallback<SystemAssignedIdentityInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByScopeWithServiceResponseAsync(scope), serviceCallback);
    }

    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SystemAssignedIdentityInner object
     */
    public Observable<SystemAssignedIdentityInner> getByScopeAsync(String scope) {
        return getByScopeWithServiceResponseAsync(scope).map(new Func1<ServiceResponse<SystemAssignedIdentityInner>, SystemAssignedIdentityInner>() {
            @Override
            public SystemAssignedIdentityInner call(ServiceResponse<SystemAssignedIdentityInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the systemAssignedIdentity available under the specified RP scope.
     *
     * @param scope The resource provider scope of the resource. Parent resource being extended by Managed Identities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the SystemAssignedIdentityInner object
     */
    public Observable<ServiceResponse<SystemAssignedIdentityInner>> getByScopeWithServiceResponseAsync(String scope) {
        if (scope == null) {
            throw new IllegalArgumentException("Parameter scope is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByScope(scope, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<SystemAssignedIdentityInner>>>() {
                @Override
                public Observable<ServiceResponse<SystemAssignedIdentityInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<SystemAssignedIdentityInner> clientResponse = getByScopeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<SystemAssignedIdentityInner> getByScopeDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<SystemAssignedIdentityInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<SystemAssignedIdentityInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
