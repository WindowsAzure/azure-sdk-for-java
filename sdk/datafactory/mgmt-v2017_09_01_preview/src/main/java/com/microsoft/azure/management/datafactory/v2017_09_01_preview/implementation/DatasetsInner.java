/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactory.v2017_09_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.datafactory.v2017_09_01_preview.ErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Datasets.
 */
public class DatasetsInner {
    /** The Retrofit service to perform REST calls. */
    private DatasetsService service;
    /** The service client containing this operation class. */
    private DataFactoryManagementClientImpl client;

    /**
     * Initializes an instance of DatasetsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DatasetsInner(Retrofit retrofit, DataFactoryManagementClientImpl client) {
        this.service = retrofit.create(DatasetsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Datasets to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DatasetsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets listByFactory" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/datasets")
        Observable<Response<ResponseBody>> listByFactory(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/datasets/{datasetName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("datasetName") String datasetName, @Query("api-version") String apiVersion, @Header("If-Match") String ifMatch, @Header("accept-language") String acceptLanguage, @Body DatasetResourceInner dataset, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/datasets/{datasetName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("datasetName") String datasetName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DataFactory/factories/{factoryName}/datasets/{datasetName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("factoryName") String factoryName, @Path("datasetName") String datasetName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.datafactory.v2017_09_01_preview.Datasets listByFactoryNext" })
        @GET
        Observable<Response<ResponseBody>> listByFactoryNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists datasets.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DatasetResourceInner&gt; object if successful.
     */
    public PagedList<DatasetResourceInner> listByFactory(final String resourceGroupName, final String factoryName) {
        ServiceResponse<Page<DatasetResourceInner>> response = listByFactorySinglePageAsync(resourceGroupName, factoryName).toBlocking().single();
        return new PagedList<DatasetResourceInner>(response.body()) {
            @Override
            public Page<DatasetResourceInner> nextPage(String nextPageLink) {
                return listByFactoryNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists datasets.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatasetResourceInner>> listByFactoryAsync(final String resourceGroupName, final String factoryName, final ListOperationCallback<DatasetResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByFactorySinglePageAsync(resourceGroupName, factoryName),
            new Func1<String, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(String nextPageLink) {
                    return listByFactoryNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists datasets.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatasetResourceInner&gt; object
     */
    public Observable<Page<DatasetResourceInner>> listByFactoryAsync(final String resourceGroupName, final String factoryName) {
        return listByFactoryWithServiceResponseAsync(resourceGroupName, factoryName)
            .map(new Func1<ServiceResponse<Page<DatasetResourceInner>>, Page<DatasetResourceInner>>() {
                @Override
                public Page<DatasetResourceInner> call(ServiceResponse<Page<DatasetResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists datasets.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatasetResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<DatasetResourceInner>>> listByFactoryWithServiceResponseAsync(final String resourceGroupName, final String factoryName) {
        return listByFactorySinglePageAsync(resourceGroupName, factoryName)
            .concatMap(new Func1<ServiceResponse<Page<DatasetResourceInner>>, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(ServiceResponse<Page<DatasetResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByFactoryNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists datasets.
     *
    ServiceResponse<PageImpl<DatasetResourceInner>> * @param resourceGroupName The resource group name.
    ServiceResponse<PageImpl<DatasetResourceInner>> * @param factoryName The factory name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DatasetResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DatasetResourceInner>>> listByFactorySinglePageAsync(final String resourceGroupName, final String factoryName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByFactory(this.client.subscriptionId(), resourceGroupName, factoryName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatasetResourceInner>> result = listByFactoryDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DatasetResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DatasetResourceInner>> listByFactoryDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DatasetResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DatasetResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DatasetResourceInner object if successful.
     */
    public DatasetResourceInner createOrUpdate(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties).toBlocking().single().body();
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DatasetResourceInner> createOrUpdateAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties, final ServiceCallback<DatasetResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties), serviceCallback);
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<DatasetResourceInner> createOrUpdateAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties).map(new Func1<ServiceResponse<DatasetResourceInner>, DatasetResourceInner>() {
            @Override
            public DatasetResourceInner call(ServiceResponse<DatasetResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<ServiceResponse<DatasetResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (datasetName == null) {
            throw new IllegalArgumentException("Parameter datasetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        final String ifMatch = null;
        DatasetResourceInner dataset = new DatasetResourceInner();
        dataset.withProperties(properties);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, factoryName, datasetName, this.client.apiVersion(), ifMatch, this.client.acceptLanguage(), dataset, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatasetResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<DatasetResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatasetResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @param ifMatch ETag of the dataset entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DatasetResourceInner object if successful.
     */
    public DatasetResourceInner createOrUpdate(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties, String ifMatch) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties, ifMatch).toBlocking().single().body();
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @param ifMatch ETag of the dataset entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DatasetResourceInner> createOrUpdateAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties, String ifMatch, final ServiceCallback<DatasetResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties, ifMatch), serviceCallback);
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @param ifMatch ETag of the dataset entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<DatasetResourceInner> createOrUpdateAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties, String ifMatch) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, factoryName, datasetName, properties, ifMatch).map(new Func1<ServiceResponse<DatasetResourceInner>, DatasetResourceInner>() {
            @Override
            public DatasetResourceInner call(ServiceResponse<DatasetResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates or updates a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param properties Dataset properties.
     * @param ifMatch ETag of the dataset entity.  Should only be specified for update, for which it should match existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<ServiceResponse<DatasetResourceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String factoryName, String datasetName, DatasetInner properties, String ifMatch) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (datasetName == null) {
            throw new IllegalArgumentException("Parameter datasetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        DatasetResourceInner dataset = new DatasetResourceInner();
        dataset.withProperties(properties);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, factoryName, datasetName, this.client.apiVersion(), ifMatch, this.client.acceptLanguage(), dataset, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatasetResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<DatasetResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatasetResourceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatasetResourceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DatasetResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DatasetResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Gets a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the DatasetResourceInner object if successful.
     */
    public DatasetResourceInner get(String resourceGroupName, String factoryName, String datasetName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, datasetName).toBlocking().single().body();
    }

    /**
     * Gets a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<DatasetResourceInner> getAsync(String resourceGroupName, String factoryName, String datasetName, final ServiceCallback<DatasetResourceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, factoryName, datasetName), serviceCallback);
    }

    /**
     * Gets a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<DatasetResourceInner> getAsync(String resourceGroupName, String factoryName, String datasetName) {
        return getWithServiceResponseAsync(resourceGroupName, factoryName, datasetName).map(new Func1<ServiceResponse<DatasetResourceInner>, DatasetResourceInner>() {
            @Override
            public DatasetResourceInner call(ServiceResponse<DatasetResourceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the DatasetResourceInner object
     */
    public Observable<ServiceResponse<DatasetResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String factoryName, String datasetName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (datasetName == null) {
            throw new IllegalArgumentException("Parameter datasetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(this.client.subscriptionId(), resourceGroupName, factoryName, datasetName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DatasetResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<DatasetResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DatasetResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DatasetResourceInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<DatasetResourceInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<DatasetResourceInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String factoryName, String datasetName) {
        deleteWithServiceResponseAsync(resourceGroupName, factoryName, datasetName).toBlocking().single().body();
    }

    /**
     * Deletes a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String factoryName, String datasetName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, factoryName, datasetName), serviceCallback);
    }

    /**
     * Deletes a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String factoryName, String datasetName) {
        return deleteWithServiceResponseAsync(resourceGroupName, factoryName, datasetName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a dataset.
     *
     * @param resourceGroupName The resource group name.
     * @param factoryName The factory name.
     * @param datasetName The dataset name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String factoryName, String datasetName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (factoryName == null) {
            throw new IllegalArgumentException("Parameter factoryName is required and cannot be null.");
        }
        if (datasetName == null) {
            throw new IllegalArgumentException("Parameter datasetName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, factoryName, datasetName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Lists datasets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;DatasetResourceInner&gt; object if successful.
     */
    public PagedList<DatasetResourceInner> listByFactoryNext(final String nextPageLink) {
        ServiceResponse<Page<DatasetResourceInner>> response = listByFactoryNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<DatasetResourceInner>(response.body()) {
            @Override
            public Page<DatasetResourceInner> nextPage(String nextPageLink) {
                return listByFactoryNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists datasets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<DatasetResourceInner>> listByFactoryNextAsync(final String nextPageLink, final ServiceFuture<List<DatasetResourceInner>> serviceFuture, final ListOperationCallback<DatasetResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByFactoryNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(String nextPageLink) {
                    return listByFactoryNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists datasets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatasetResourceInner&gt; object
     */
    public Observable<Page<DatasetResourceInner>> listByFactoryNextAsync(final String nextPageLink) {
        return listByFactoryNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<DatasetResourceInner>>, Page<DatasetResourceInner>>() {
                @Override
                public Page<DatasetResourceInner> call(ServiceResponse<Page<DatasetResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists datasets.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;DatasetResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<DatasetResourceInner>>> listByFactoryNextWithServiceResponseAsync(final String nextPageLink) {
        return listByFactoryNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DatasetResourceInner>>, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(ServiceResponse<Page<DatasetResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByFactoryNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists datasets.
     *
    ServiceResponse<PageImpl<DatasetResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;DatasetResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DatasetResourceInner>>> listByFactoryNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByFactoryNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DatasetResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DatasetResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DatasetResourceInner>> result = listByFactoryNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DatasetResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DatasetResourceInner>> listByFactoryNextDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<DatasetResourceInner>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<DatasetResourceInner>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
