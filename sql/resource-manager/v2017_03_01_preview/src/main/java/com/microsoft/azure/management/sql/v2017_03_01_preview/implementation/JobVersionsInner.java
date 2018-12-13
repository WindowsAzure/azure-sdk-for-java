/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_03_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in JobVersions.
 */
public class JobVersionsInner {
    /** The Retrofit service to perform REST calls. */
    private JobVersionsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of JobVersionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public JobVersionsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(JobVersionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for JobVersions to be
     * used by Retrofit to perform actually REST calls.
     */
    interface JobVersionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.JobVersions listByJob" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/versions")
        Observable<Response<ResponseBody>> listByJob(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("jobAgentName") String jobAgentName, @Path("jobName") String jobName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.JobVersions get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/jobAgents/{jobAgentName}/jobs/{jobName}/versions/{jobVersion}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("jobAgentName") String jobAgentName, @Path("jobName") String jobName, @Path("jobVersion") int jobVersion, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.sql.v2017_03_01_preview.JobVersions listByJobNext" })
        @GET
        Observable<Response<ResponseBody>> listByJobNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobVersionInner&gt; object if successful.
     */
    public PagedList<JobVersionInner> listByJob(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName) {
        ServiceResponse<Page<JobVersionInner>> response = listByJobSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName).toBlocking().single();
        return new PagedList<JobVersionInner>(response.body()) {
            @Override
            public Page<JobVersionInner> nextPage(String nextPageLink) {
                return listByJobNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobVersionInner>> listByJobAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName, final ListOperationCallback<JobVersionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByJobSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName),
            new Func1<String, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(String nextPageLink) {
                    return listByJobNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobVersionInner&gt; object
     */
    public Observable<Page<JobVersionInner>> listByJobAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName) {
        return listByJobWithServiceResponseAsync(resourceGroupName, serverName, jobAgentName, jobName)
            .map(new Func1<ServiceResponse<Page<JobVersionInner>>, Page<JobVersionInner>>() {
                @Override
                public Page<JobVersionInner> call(ServiceResponse<Page<JobVersionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all versions of a job.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobVersionInner&gt; object
     */
    public Observable<ServiceResponse<Page<JobVersionInner>>> listByJobWithServiceResponseAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName) {
        return listByJobSinglePageAsync(resourceGroupName, serverName, jobAgentName, jobName)
            .concatMap(new Func1<ServiceResponse<Page<JobVersionInner>>, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(ServiceResponse<Page<JobVersionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByJobNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all versions of a job.
     *
    ServiceResponse<PageImpl<JobVersionInner>> * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
    ServiceResponse<PageImpl<JobVersionInner>> * @param serverName The name of the server.
    ServiceResponse<PageImpl<JobVersionInner>> * @param jobAgentName The name of the job agent.
    ServiceResponse<PageImpl<JobVersionInner>> * @param jobName The name of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobVersionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobVersionInner>>> listByJobSinglePageAsync(final String resourceGroupName, final String serverName, final String jobAgentName, final String jobName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (jobAgentName == null) {
            throw new IllegalArgumentException("Parameter jobAgentName is required and cannot be null.");
        }
        if (jobName == null) {
            throw new IllegalArgumentException("Parameter jobName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByJob(resourceGroupName, serverName, jobAgentName, jobName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobVersionInner>> result = listByJobDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobVersionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobVersionInner>> listByJobDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobVersionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobVersionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the JobVersionInner object if successful.
     */
    public JobVersionInner get(String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobVersion).toBlocking().single().body();
    }

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<JobVersionInner> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion, final ServiceCallback<JobVersionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobVersion), serviceCallback);
    }

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobVersionInner object
     */
    public Observable<JobVersionInner> getAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, jobAgentName, jobName, jobVersion).map(new Func1<ServiceResponse<JobVersionInner>, JobVersionInner>() {
            @Override
            public JobVersionInner call(ServiceResponse<JobVersionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a job version.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server.
     * @param jobAgentName The name of the job agent.
     * @param jobName The name of the job.
     * @param jobVersion The version of the job to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the JobVersionInner object
     */
    public Observable<ServiceResponse<JobVersionInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String jobAgentName, String jobName, int jobVersion) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (jobAgentName == null) {
            throw new IllegalArgumentException("Parameter jobAgentName is required and cannot be null.");
        }
        if (jobName == null) {
            throw new IllegalArgumentException("Parameter jobName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, serverName, jobAgentName, jobName, jobVersion, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<JobVersionInner>>>() {
                @Override
                public Observable<ServiceResponse<JobVersionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<JobVersionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<JobVersionInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<JobVersionInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<JobVersionInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all versions of a job.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;JobVersionInner&gt; object if successful.
     */
    public PagedList<JobVersionInner> listByJobNext(final String nextPageLink) {
        ServiceResponse<Page<JobVersionInner>> response = listByJobNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<JobVersionInner>(response.body()) {
            @Override
            public Page<JobVersionInner> nextPage(String nextPageLink) {
                return listByJobNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all versions of a job.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<JobVersionInner>> listByJobNextAsync(final String nextPageLink, final ServiceFuture<List<JobVersionInner>> serviceFuture, final ListOperationCallback<JobVersionInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listByJobNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(String nextPageLink) {
                    return listByJobNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all versions of a job.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobVersionInner&gt; object
     */
    public Observable<Page<JobVersionInner>> listByJobNextAsync(final String nextPageLink) {
        return listByJobNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<JobVersionInner>>, Page<JobVersionInner>>() {
                @Override
                public Page<JobVersionInner> call(ServiceResponse<Page<JobVersionInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all versions of a job.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;JobVersionInner&gt; object
     */
    public Observable<ServiceResponse<Page<JobVersionInner>>> listByJobNextWithServiceResponseAsync(final String nextPageLink) {
        return listByJobNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<JobVersionInner>>, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(ServiceResponse<Page<JobVersionInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listByJobNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all versions of a job.
     *
    ServiceResponse<PageImpl<JobVersionInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;JobVersionInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<JobVersionInner>>> listByJobNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listByJobNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<JobVersionInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<JobVersionInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<JobVersionInner>> result = listByJobNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<JobVersionInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<JobVersionInner>> listByJobNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<JobVersionInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<JobVersionInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
