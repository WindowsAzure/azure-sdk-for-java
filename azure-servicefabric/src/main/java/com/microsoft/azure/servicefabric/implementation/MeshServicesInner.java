/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.servicefabric.FabricErrorException;
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
 * in MeshServices.
 */
public class MeshServicesInner {
    /** The Retrofit service to perform REST calls. */
    private MeshServicesService service;
    /** The service client containing this operation class. */
    private ServiceFabricClientAPIsImpl client;

    /**
     * Initializes an instance of MeshServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public MeshServicesInner(Retrofit retrofit, ServiceFabricClientAPIsImpl client) {
        this.service = retrofit.create(MeshServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for MeshServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface MeshServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshServices get" })
        @GET("Resources/Applications/{applicationResourceName}/Services/{serviceResourceName}")
        Observable<Response<ResponseBody>> get(@Path(value = "applicationResourceName", encoded = true) String applicationResourceName, @Path(value = "serviceResourceName", encoded = true) String serviceResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.servicefabric.MeshServices list" })
        @GET("Resources/Applications/{applicationResourceName}/Services")
        Observable<Response<ResponseBody>> list(@Path(value = "applicationResourceName", encoded = true) String applicationResourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the Service resource with the given name.
     * Gets the information about the Service resource with the given name. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ServiceResourceDescriptionInner object if successful.
     */
    public ServiceResourceDescriptionInner get(String applicationResourceName, String serviceResourceName) {
        return getWithServiceResponseAsync(applicationResourceName, serviceResourceName).toBlocking().single().body();
    }

    /**
     * Gets the Service resource with the given name.
     * Gets the information about the Service resource with the given name. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ServiceResourceDescriptionInner> getAsync(String applicationResourceName, String serviceResourceName, final ServiceCallback<ServiceResourceDescriptionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(applicationResourceName, serviceResourceName), serviceCallback);
    }

    /**
     * Gets the Service resource with the given name.
     * Gets the information about the Service resource with the given name. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceDescriptionInner object
     */
    public Observable<ServiceResourceDescriptionInner> getAsync(String applicationResourceName, String serviceResourceName) {
        return getWithServiceResponseAsync(applicationResourceName, serviceResourceName).map(new Func1<ServiceResponse<ServiceResourceDescriptionInner>, ServiceResourceDescriptionInner>() {
            @Override
            public ServiceResourceDescriptionInner call(ServiceResponse<ServiceResourceDescriptionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the Service resource with the given name.
     * Gets the information about the Service resource with the given name. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceResourceName The identity of the service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ServiceResourceDescriptionInner object
     */
    public Observable<ServiceResponse<ServiceResourceDescriptionInner>> getWithServiceResponseAsync(String applicationResourceName, String serviceResourceName) {
        if (applicationResourceName == null) {
            throw new IllegalArgumentException("Parameter applicationResourceName is required and cannot be null.");
        }
        if (serviceResourceName == null) {
            throw new IllegalArgumentException("Parameter serviceResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.get(applicationResourceName, serviceResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ServiceResourceDescriptionInner>>>() {
                @Override
                public Observable<ServiceResponse<ServiceResourceDescriptionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ServiceResourceDescriptionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ServiceResourceDescriptionInner> getDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ServiceResourceDescriptionInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ServiceResourceDescriptionInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

    /**
     * Lists all the service resources.
     * Gets the information about all services of an application resource. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws FabricErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedServiceResourceDescriptionListInner object if successful.
     */
    public PagedServiceResourceDescriptionListInner list(String applicationResourceName) {
        return listWithServiceResponseAsync(applicationResourceName).toBlocking().single().body();
    }

    /**
     * Lists all the service resources.
     * Gets the information about all services of an application resource. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PagedServiceResourceDescriptionListInner> listAsync(String applicationResourceName, final ServiceCallback<PagedServiceResourceDescriptionListInner> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(applicationResourceName), serviceCallback);
    }

    /**
     * Lists all the service resources.
     * Gets the information about all services of an application resource. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedServiceResourceDescriptionListInner object
     */
    public Observable<PagedServiceResourceDescriptionListInner> listAsync(String applicationResourceName) {
        return listWithServiceResponseAsync(applicationResourceName).map(new Func1<ServiceResponse<PagedServiceResourceDescriptionListInner>, PagedServiceResourceDescriptionListInner>() {
            @Override
            public PagedServiceResourceDescriptionListInner call(ServiceResponse<PagedServiceResourceDescriptionListInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Lists all the service resources.
     * Gets the information about all services of an application resource. The information include the description and other properties of the Service.
     *
     * @param applicationResourceName The identity of the application.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedServiceResourceDescriptionListInner object
     */
    public Observable<ServiceResponse<PagedServiceResourceDescriptionListInner>> listWithServiceResponseAsync(String applicationResourceName) {
        if (applicationResourceName == null) {
            throw new IllegalArgumentException("Parameter applicationResourceName is required and cannot be null.");
        }
        final String apiVersion = "6.4-preview";
        return service.list(applicationResourceName, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PagedServiceResourceDescriptionListInner>>>() {
                @Override
                public Observable<ServiceResponse<PagedServiceResourceDescriptionListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PagedServiceResourceDescriptionListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PagedServiceResourceDescriptionListInner> listDelegate(Response<ResponseBody> response) throws FabricErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PagedServiceResourceDescriptionListInner, FabricErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PagedServiceResourceDescriptionListInner>() { }.getType())
                .registerError(FabricErrorException.class)
                .build(response);
    }

}
