/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsGet;
import com.microsoft.azure.arm.collection.InnerSupportsDelete;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.CategoryType;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.WorkbookErrorException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.CollectionFormat;
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
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Workbooks.
 */
public class WorkbooksInner implements InnerSupportsGet<WorkbookInner>, InnerSupportsDelete<Void> {
    /** The Retrofit service to perform REST calls. */
    private WorkbooksService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsManagementClientImpl client;

    /**
     * Initializes an instance of WorkbooksInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public WorkbooksInner(Retrofit retrofit, ApplicationInsightsManagementClientImpl client) {
        this.service = retrofit.create(WorkbooksService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Workbooks to be
     * used by Retrofit to perform actually REST calls.
     */
    interface WorkbooksService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbooks listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/workbooks")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Query("category") CategoryType category, @Query("tags") String tags, @Query("canFetchContent") Boolean canFetchContent, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbooks getByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/workbooks/{resourceName}")
        Observable<Response<ResponseBody>> getByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbooks delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/workbooks/{resourceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbooks createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/workbooks/{resourceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Body WorkbookInner workbookProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.applicationinsights.v2015_05_01.Workbooks update" })
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/microsoft.insights/workbooks/{resourceName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") String subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("resourceName") String resourceName, @Query("api-version") String apiVersion, @Body WorkbookInner workbookProperties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @return the PagedList<WorkbookInner> object if successful.
     */
    public PagedList<WorkbookInner> listByResourceGroup(String resourceGroupName, CategoryType category) {
        PageImpl1<WorkbookInner> page = new PageImpl1<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName, category).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<WorkbookInner>(page) {
            @Override
            public Page<WorkbookInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkbookInner>> listByResourceGroupAsync(String resourceGroupName, CategoryType category, final ServiceCallback<List<WorkbookInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName, category), serviceCallback);
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @return the observable to the List&lt;WorkbookInner&gt; object
     */
    public Observable<Page<WorkbookInner>> listByResourceGroupAsync(String resourceGroupName, CategoryType category) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName, category).map(new Func1<ServiceResponse<List<WorkbookInner>>, Page<WorkbookInner>>() {
            @Override
            public Page<WorkbookInner> call(ServiceResponse<List<WorkbookInner>> response) {
                PageImpl1<WorkbookInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @return the observable to the List&lt;WorkbookInner&gt; object
     */
    public Observable<ServiceResponse<List<WorkbookInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName, CategoryType category) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (category == null) {
            throw new IllegalArgumentException("Parameter category is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final List<String> tags = null;
        final Boolean canFetchContent = null;
        String tagsConverted = this.client.serializerAdapter().serializeList(tags, CollectionFormat.CSV);
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, category, tagsConverted, canFetchContent, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<WorkbookInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<WorkbookInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WorkbookInner>> result = listByResourceGroupDelegate(response);
                        List<WorkbookInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<WorkbookInner>> clientResponse = new ServiceResponse<List<WorkbookInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If false, only return summary content for workbooks.
     * @return the PagedList<WorkbookInner> object if successful.
     */
    public PagedList<WorkbookInner> listByResourceGroup(String resourceGroupName, CategoryType category, List<String> tags, Boolean canFetchContent) {
        PageImpl1<WorkbookInner> page = new PageImpl1<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroupName, category, tags, canFetchContent).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<WorkbookInner>(page) {
            @Override
            public Page<WorkbookInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If false, only return summary content for workbooks.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<WorkbookInner>> listByResourceGroupAsync(String resourceGroupName, CategoryType category, List<String> tags, Boolean canFetchContent, final ServiceCallback<List<WorkbookInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroupName, category, tags, canFetchContent), serviceCallback);
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If false, only return summary content for workbooks.
     * @return the observable to the List&lt;WorkbookInner&gt; object
     */
    public Observable<Page<WorkbookInner>> listByResourceGroupAsync(String resourceGroupName, CategoryType category, List<String> tags, Boolean canFetchContent) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroupName, category, tags, canFetchContent).map(new Func1<ServiceResponse<List<WorkbookInner>>, Page<WorkbookInner>>() {
            @Override
            public Page<WorkbookInner> call(ServiceResponse<List<WorkbookInner>> response) {
                PageImpl1<WorkbookInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Get all Workbooks defined within a specified resource group and category.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param category Category of workbook to return. Possible values include: 'workbook', 'TSG', 'performance', 'retention'
     * @param tags Tags presents on each workbook returned.
     * @param canFetchContent Flag indicating whether or not to return the full content for each applicable workbook. If false, only return summary content for workbooks.
     * @return the observable to the List&lt;WorkbookInner&gt; object
     */
    public Observable<ServiceResponse<List<WorkbookInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroupName, CategoryType category, List<String> tags, Boolean canFetchContent) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (category == null) {
            throw new IllegalArgumentException("Parameter category is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(tags);
        String tagsConverted = this.client.serializerAdapter().serializeList(tags, CollectionFormat.CSV);
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroupName, category, tagsConverted, canFetchContent, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<WorkbookInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<WorkbookInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<WorkbookInner>> result = listByResourceGroupDelegate(response);
                        List<WorkbookInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<WorkbookInner>> clientResponse = new ServiceResponse<List<WorkbookInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<WorkbookInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws WorkbookErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<WorkbookInner>, WorkbookErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<WorkbookInner>>() { }.getType())
                .registerError(WorkbookErrorException.class)
                .build(response);
    }

    /**
     * Get a single workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws WorkbookErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkbookInner object if successful.
     */
    public WorkbookInner getByResourceGroup(String resourceGroupName, String resourceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Get a single workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkbookInner> getByResourceGroupAsync(String resourceGroupName, String resourceName, final ServiceCallback<WorkbookInner> serviceCallback) {
        return ServiceFuture.fromResponse(getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Get a single workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<WorkbookInner> getByResourceGroupAsync(String resourceGroupName, String resourceName) {
        return getByResourceGroupWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<WorkbookInner>, WorkbookInner>() {
            @Override
            public WorkbookInner call(ServiceResponse<WorkbookInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get a single workbook by its resourceName.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<ServiceResponse<WorkbookInner>> getByResourceGroupWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getByResourceGroup(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkbookInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkbookInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkbookInner> clientResponse = getByResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkbookInner> getByResourceGroupDelegate(Response<ResponseBody> response) throws WorkbookErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkbookInner, WorkbookErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkbookInner>() { }.getType())
                .registerError(WorkbookErrorException.class)
                .build(response);
    }

    /**
     * Delete a workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws WorkbookErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String resourceName) {
        deleteWithServiceResponseAsync(resourceGroupName, resourceName).toBlocking().single().body();
    }

    /**
     * Delete a workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String resourceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, resourceName), serviceCallback);
    }

    /**
     * Delete a workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String resourceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, resourceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Delete a workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String resourceName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
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

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws WorkbookErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, WorkbookErrorException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(WorkbookErrorException.class)
                .build(response);
    }

    /**
     * Create a new workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws WorkbookErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkbookInner object if successful.
     */
    public WorkbookInner createOrUpdate(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties).toBlocking().single().body();
    }

    /**
     * Create a new workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkbookInner> createOrUpdateAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties, final ServiceCallback<WorkbookInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties), serviceCallback);
    }

    /**
     * Create a new workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<WorkbookInner> createOrUpdateAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties).map(new Func1<ServiceResponse<WorkbookInner>, WorkbookInner>() {
            @Override
            public WorkbookInner call(ServiceResponse<WorkbookInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create a new workbook.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<ServiceResponse<WorkbookInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (workbookProperties == null) {
            throw new IllegalArgumentException("Parameter workbookProperties is required and cannot be null.");
        }
        Validator.validate(workbookProperties);
        return service.createOrUpdate(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), workbookProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkbookInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkbookInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkbookInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkbookInner> createOrUpdateDelegate(Response<ResponseBody> response) throws WorkbookErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkbookInner, WorkbookErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkbookInner>() { }.getType())
                .register(201, new TypeToken<WorkbookInner>() { }.getType())
                .registerError(WorkbookErrorException.class)
                .build(response);
    }

    /**
     * Updates a workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws WorkbookErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WorkbookInner object if successful.
     */
    public WorkbookInner update(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties).toBlocking().single().body();
    }

    /**
     * Updates a workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WorkbookInner> updateAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties, final ServiceCallback<WorkbookInner> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties), serviceCallback);
    }

    /**
     * Updates a workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<WorkbookInner> updateAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        return updateWithServiceResponseAsync(resourceGroupName, resourceName, workbookProperties).map(new Func1<ServiceResponse<WorkbookInner>, WorkbookInner>() {
            @Override
            public WorkbookInner call(ServiceResponse<WorkbookInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates a workbook that has already been added.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param resourceName The name of the Application Insights component resource.
     * @param workbookProperties Properties that need to be specified to create a new workbook.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WorkbookInner object
     */
    public Observable<ServiceResponse<WorkbookInner>> updateWithServiceResponseAsync(String resourceGroupName, String resourceName, WorkbookInner workbookProperties) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (resourceName == null) {
            throw new IllegalArgumentException("Parameter resourceName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (workbookProperties == null) {
            throw new IllegalArgumentException("Parameter workbookProperties is required and cannot be null.");
        }
        Validator.validate(workbookProperties);
        return service.update(this.client.subscriptionId(), resourceGroupName, resourceName, this.client.apiVersion(), workbookProperties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WorkbookInner>>>() {
                @Override
                public Observable<ServiceResponse<WorkbookInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WorkbookInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WorkbookInner> updateDelegate(Response<ResponseBody> response) throws WorkbookErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WorkbookInner, WorkbookErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WorkbookInner>() { }.getType())
                .registerError(WorkbookErrorException.class)
                .build(response);
    }

}
