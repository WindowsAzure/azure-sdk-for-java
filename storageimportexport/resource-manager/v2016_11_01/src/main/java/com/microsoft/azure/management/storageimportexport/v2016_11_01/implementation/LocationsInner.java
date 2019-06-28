/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storageimportexport.v2016_11_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.storageimportexport.v2016_11_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
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
 * in Locations.
 */
public class LocationsInner {
    /** The Retrofit service to perform REST calls. */
    private LocationsService service;
    /** The service client containing this operation class. */
    private StorageImportExportImpl client;

    /**
     * Initializes an instance of LocationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LocationsInner(Retrofit retrofit, StorageImportExportImpl client) {
        this.service = retrofit.create(LocationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Locations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LocationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storageimportexport.v2016_11_01.Locations list" })
        @GET("providers/Microsoft.ImportExport/locations")
        Observable<Response<ResponseBody>> list(@Query("api-version") String apiVersion, @Header("Accept-Language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storageimportexport.v2016_11_01.Locations get" })
        @GET("providers/Microsoft.ImportExport/locations/{locationName}")
        Observable<Response<ResponseBody>> get(@Path("locationName") String locationName, @Query("api-version") String apiVersion, @Header("Accept-Language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location is a Microsoft data center region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;LocationInner&gt; object if successful.
     */
    public List<LocationInner> list() {
        return listWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location is a Microsoft data center region.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LocationInner>> listAsync(final ServiceCallback<List<LocationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location is a Microsoft data center region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LocationInner&gt; object
     */
    public Observable<List<LocationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<LocationInner>>, List<LocationInner>>() {
            @Override
            public List<LocationInner> call(ServiceResponse<List<LocationInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns a list of locations to which you can ship the disks associated with an import or export job. A location is a Microsoft data center region.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LocationInner&gt; object
     */
    public Observable<ServiceResponse<List<LocationInner>>> listWithServiceResponseAsync() {
        return service.list(this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LocationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<LocationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LocationInner>> result = listDelegate(response);
                        List<LocationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<LocationInner>> clientResponse = new ServiceResponse<List<LocationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LocationInner>> listDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LocationInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LocationInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A location is an Azure region.
     *
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LocationInner object if successful.
     */
    public LocationInner get(String locationName) {
        return getWithServiceResponseAsync(locationName).toBlocking().single().body();
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A location is an Azure region.
     *
     * @param locationName The name of the location. For example, West US or westus.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LocationInner> getAsync(String locationName, final ServiceCallback<LocationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(locationName), serviceCallback);
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A location is an Azure region.
     *
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationInner object
     */
    public Observable<LocationInner> getAsync(String locationName) {
        return getWithServiceResponseAsync(locationName).map(new Func1<ServiceResponse<LocationInner>, LocationInner>() {
            @Override
            public LocationInner call(ServiceResponse<LocationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns the details about a location to which you can ship the disks associated with an import or export job. A location is an Azure region.
     *
     * @param locationName The name of the location. For example, West US or westus.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LocationInner object
     */
    public Observable<ServiceResponse<LocationInner>> getWithServiceResponseAsync(String locationName) {
        if (locationName == null) {
            throw new IllegalArgumentException("Parameter locationName is required and cannot be null.");
        }
        return service.get(locationName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LocationInner>>>() {
                @Override
                public Observable<ServiceResponse<LocationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LocationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LocationInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LocationInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LocationInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
