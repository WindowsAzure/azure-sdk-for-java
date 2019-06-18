/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.ErrorResponseException;
import com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGitGetHeaders;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.ServiceResponseWithHeaders;
import java.io.IOException;
import okhttp3.ResponseBody;
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
 * in TenantAccessGits.
 */
public class TenantAccessGitsInner {
    /** The Retrofit service to perform REST calls. */
    private TenantAccessGitsService service;
    /** The service client containing this operation class. */
    private ApiManagementClientImpl client;

    /**
     * Initializes an instance of TenantAccessGitsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TenantAccessGitsInner(Retrofit retrofit, ApiManagementClientImpl client) {
        this.service = retrofit.create(TenantAccessGitsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for TenantAccessGits to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantAccessGitsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGits get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}/git")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGits regeneratePrimaryKey" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}/git/regeneratePrimaryKey")
        Observable<Response<ResponseBody>> regeneratePrimaryKey(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.apimanagement.v2018_06_01_preview.TenantAccessGits regenerateSecondaryKey" })
        @POST("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement/service/{serviceName}/tenant/{accessName}/git/regenerateSecondaryKey")
        Observable<Response<ResponseBody>> regenerateSecondaryKey(@Path("resourceGroupName") String resourceGroupName, @Path("serviceName") String serviceName, @Path("subscriptionId") String subscriptionId, @Path("accessName") String accessName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the Git access configuration for the tenant.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the AccessInformationContractInner object if successful.
     */
    public AccessInformationContractInner get(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Gets the Git access configuration for the tenant.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<AccessInformationContractInner> getAsync(String resourceGroupName, String serviceName, final ServiceCallback<AccessInformationContractInner> serviceCallback) {
        return ServiceFuture.fromHeaderResponse(getWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Gets the Git access configuration for the tenant.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessInformationContractInner object
     */
    public Observable<AccessInformationContractInner> getAsync(String resourceGroupName, String serviceName) {
        return getWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders>, AccessInformationContractInner>() {
            @Override
            public AccessInformationContractInner call(ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Git access configuration for the tenant.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the AccessInformationContractInner object
     */
    public Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders>> getWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String accessName = "access";
        final String apiVersion = "2018-06-01-preview";
        return service.get(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders>>>() {
                @Override
                public Observable<ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponseWithHeaders<AccessInformationContractInner, TenantAccessGitGetHeaders> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<AccessInformationContractInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<AccessInformationContractInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .buildWithHeaders(response, TenantAccessGitGetHeaders.class);
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void regeneratePrimaryKey(String resourceGroupName, String serviceName) {
        regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> regeneratePrimaryKeyAsync(String resourceGroupName, String serviceName) {
        return regeneratePrimaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerate primary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> regeneratePrimaryKeyWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String accessName = "access";
        final String apiVersion = "2018-06-01-preview";
        return service.regeneratePrimaryKey(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = regeneratePrimaryKeyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> regeneratePrimaryKeyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void regenerateSecondaryKey(String resourceGroupName, String serviceName) {
        regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).toBlocking().single().body();
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName), serviceCallback);
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> regenerateSecondaryKeyAsync(String resourceGroupName, String serviceName) {
        return regenerateSecondaryKeyWithServiceResponseAsync(resourceGroupName, serviceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Regenerate secondary access key for GIT.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> regenerateSecondaryKeyWithServiceResponseAsync(String resourceGroupName, String serviceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serviceName == null) {
            throw new IllegalArgumentException("Parameter serviceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String accessName = "access";
        final String apiVersion = "2018-06-01-preview";
        return service.regenerateSecondaryKey(resourceGroupName, serviceName, this.client.subscriptionId(), accessName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = regenerateSecondaryKeyDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> regenerateSecondaryKeyDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
