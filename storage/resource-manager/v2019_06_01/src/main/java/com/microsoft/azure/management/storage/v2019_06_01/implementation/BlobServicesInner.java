/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BlobServices.
 */
public class BlobServicesInner {
    /** The Retrofit service to perform REST calls. */
    private BlobServicesService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of BlobServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BlobServicesInner(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(BlobServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BlobServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BlobServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.BlobServices list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/blobServices")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.BlobServices setServiceProperties" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/blobServices/{BlobServicesName}")
        Observable<Response<ResponseBody>> setServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("BlobServicesName") String blobServicesName, @Query("api-version") String apiVersion, @Body BlobServicePropertiesInner parameters, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.BlobServices getServiceProperties" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/blobServices/{BlobServicesName}")
        Observable<Response<ResponseBody>> getServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("BlobServicesName") String blobServicesName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BlobServicePropertiesInner&gt; object if successful.
     */
    public List<BlobServicePropertiesInner> list(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BlobServicePropertiesInner>> listAsync(String resourceGroupName, String accountName, final ServiceCallback<List<BlobServicePropertiesInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BlobServicePropertiesInner&gt; object
     */
    public Observable<List<BlobServicePropertiesInner>> listAsync(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<List<BlobServicePropertiesInner>>, List<BlobServicePropertiesInner>>() {
            @Override
            public List<BlobServicePropertiesInner> call(ServiceResponse<List<BlobServicePropertiesInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * List blob services of storage account. It returns a collection of one object named default.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BlobServicePropertiesInner&gt; object
     */
    public Observable<ServiceResponse<List<BlobServicePropertiesInner>>> listWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(resourceGroupName, accountName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BlobServicePropertiesInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<BlobServicePropertiesInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<BlobServicePropertiesInner>> result = listDelegate(response);
                        List<BlobServicePropertiesInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<BlobServicePropertiesInner>> clientResponse = new ServiceResponse<List<BlobServicePropertiesInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<BlobServicePropertiesInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<BlobServicePropertiesInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<BlobServicePropertiesInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlobServicePropertiesInner object if successful.
     */
    public BlobServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName, BlobServicePropertiesInner parameters) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, parameters).toBlocking().single().body();
    }

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlobServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, BlobServicePropertiesInner parameters, final ServiceCallback<BlobServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, parameters), serviceCallback);
    }

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlobServicePropertiesInner object
     */
    public Observable<BlobServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, BlobServicePropertiesInner parameters) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, parameters).map(new Func1<ServiceResponse<BlobServicePropertiesInner>, BlobServicePropertiesInner>() {
            @Override
            public BlobServicePropertiesInner call(ServiceResponse<BlobServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param parameters The properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlobServicePropertiesInner object
     */
    public Observable<ServiceResponse<BlobServicePropertiesInner>> setServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName, BlobServicePropertiesInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        Validator.validate(parameters);
        final String blobServicesName = "default";
        return service.setServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), blobServicesName, this.client.apiVersion(), parameters, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlobServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<BlobServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlobServicePropertiesInner> clientResponse = setServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlobServicePropertiesInner> setServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlobServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlobServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the BlobServicePropertiesInner object if successful.
     */
    public BlobServicePropertiesInner getServiceProperties(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<BlobServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName, final ServiceCallback<BlobServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlobServicePropertiesInner object
     */
    public Observable<BlobServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<BlobServicePropertiesInner>, BlobServicePropertiesInner>() {
            @Override
            public BlobServicePropertiesInner call(ServiceResponse<BlobServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the properties of a storage account’s Blob service, including properties for Storage Analytics and CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the BlobServicePropertiesInner object
     */
    public Observable<ServiceResponse<BlobServicePropertiesInner>> getServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String blobServicesName = "default";
        return service.getServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), blobServicesName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<BlobServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<BlobServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<BlobServicePropertiesInner> clientResponse = getServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<BlobServicePropertiesInner> getServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<BlobServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<BlobServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
