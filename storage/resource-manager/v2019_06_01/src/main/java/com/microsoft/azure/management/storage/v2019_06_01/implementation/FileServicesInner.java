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
import com.microsoft.azure.management.storage.v2019_06_01.CorsRules;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
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
 * in FileServices.
 */
public class FileServicesInner {
    /** The Retrofit service to perform REST calls. */
    private FileServicesService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of FileServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public FileServicesInner(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(FileServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for FileServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface FileServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.FileServices list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.FileServices setServiceProperties" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices/{FileServicesName}")
        Observable<Response<ResponseBody>> setServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("FileServicesName") String fileServicesName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Body FileServicePropertiesInner parameters, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.FileServices getServiceProperties" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/fileServices/{FileServicesName}")
        Observable<Response<ResponseBody>> getServiceProperties(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("FileServicesName") String fileServicesName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * List all file services in storage accounts.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileServiceItemsInner object if successful.
     */
    public FileServiceItemsInner list(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * List all file services in storage accounts.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileServiceItemsInner> listAsync(String resourceGroupName, String accountName, final ServiceCallback<FileServiceItemsInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * List all file services in storage accounts.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServiceItemsInner object
     */
    public Observable<FileServiceItemsInner> listAsync(String resourceGroupName, String accountName) {
        return listWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<FileServiceItemsInner>, FileServiceItemsInner>() {
            @Override
            public FileServiceItemsInner call(ServiceResponse<FileServiceItemsInner> response) {
                return response.body();
            }
        });
    }

    /**
     * List all file services in storage accounts.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServiceItemsInner object
     */
    public Observable<ServiceResponse<FileServiceItemsInner>> listWithServiceResponseAsync(String resourceGroupName, String accountName) {
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
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileServiceItemsInner>>>() {
                @Override
                public Observable<ServiceResponse<FileServiceItemsInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileServiceItemsInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FileServiceItemsInner> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FileServiceItemsInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FileServiceItemsInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileServicePropertiesInner object if successful.
     */
    public FileServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, final ServiceCallback<FileServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<FileServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<FileServicePropertiesInner>, FileServicePropertiesInner>() {
            @Override
            public FileServicePropertiesInner call(ServiceResponse<FileServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<ServiceResponse<FileServicePropertiesInner>> setServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName) {
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
        final String fileServicesName = "default";
        final CorsRules cors = null;
        FileServicePropertiesInner parameters = new FileServicePropertiesInner();
        parameters.withCors(null);
        return service.setServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), fileServicesName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<FileServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileServicePropertiesInner> clientResponse = setServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileServicePropertiesInner object if successful.
     */
    public FileServicePropertiesInner setServiceProperties(String resourceGroupName, String accountName, CorsRules cors) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors).toBlocking().single().body();
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, CorsRules cors, final ServiceCallback<FileServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors), serviceCallback);
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<FileServicePropertiesInner> setServicePropertiesAsync(String resourceGroupName, String accountName, CorsRules cors) {
        return setServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName, cors).map(new Func1<ServiceResponse<FileServicePropertiesInner>, FileServicePropertiesInner>() {
            @Override
            public FileServicePropertiesInner call(ServiceResponse<FileServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Sets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param cors Specifies CORS rules for the File service. You can include up to five CorsRule elements in the request. If no CorsRule elements are included in the request body, all CORS rules will be deleted, and CORS will be disabled for the File service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<ServiceResponse<FileServicePropertiesInner>> setServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName, CorsRules cors) {
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
        Validator.validate(cors);
        final String fileServicesName = "default";
        FileServicePropertiesInner parameters = new FileServicePropertiesInner();
        parameters.withCors(cors);
        return service.setServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), fileServicesName, this.client.apiVersion(), this.client.acceptLanguage(), parameters, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<FileServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileServicePropertiesInner> clientResponse = setServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FileServicePropertiesInner> setServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FileServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FileServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the FileServicePropertiesInner object if successful.
     */
    public FileServicePropertiesInner getServiceProperties(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).toBlocking().single().body();
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<FileServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName, final ServiceCallback<FileServicePropertiesInner> serviceCallback) {
        return ServiceFuture.fromResponse(getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName), serviceCallback);
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<FileServicePropertiesInner> getServicePropertiesAsync(String resourceGroupName, String accountName) {
        return getServicePropertiesWithServiceResponseAsync(resourceGroupName, accountName).map(new Func1<ServiceResponse<FileServicePropertiesInner>, FileServicePropertiesInner>() {
            @Override
            public FileServicePropertiesInner call(ServiceResponse<FileServicePropertiesInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the properties of file services in storage accounts, including CORS (Cross-Origin Resource Sharing) rules.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the FileServicePropertiesInner object
     */
    public Observable<ServiceResponse<FileServicePropertiesInner>> getServicePropertiesWithServiceResponseAsync(String resourceGroupName, String accountName) {
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
        final String fileServicesName = "default";
        return service.getServiceProperties(resourceGroupName, accountName, this.client.subscriptionId(), fileServicesName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<FileServicePropertiesInner>>>() {
                @Override
                public Observable<ServiceResponse<FileServicePropertiesInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<FileServicePropertiesInner> clientResponse = getServicePropertiesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<FileServicePropertiesInner> getServicePropertiesDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<FileServicePropertiesInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<FileServicePropertiesInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
