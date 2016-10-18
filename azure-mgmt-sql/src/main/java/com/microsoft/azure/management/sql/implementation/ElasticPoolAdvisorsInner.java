/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.management.sql.ArmErrorResponseMessageException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.PATCH;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ElasticPoolAdvisors.
 */
public final class ElasticPoolAdvisorsInner {
    /** The Retrofit service to perform REST calls. */
    private ElasticPoolAdvisorsService service;
    /** The service client containing this operation class. */
    private SqlManagementClientImpl client;

    /**
     * Initializes an instance of ElasticPoolAdvisorsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ElasticPoolAdvisorsInner(Retrofit retrofit, SqlManagementClientImpl client) {
        this.service = retrofit.create(ElasticPoolAdvisorsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ElasticPoolAdvisors to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ElasticPoolAdvisorsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/advisors")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") UUID subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("elasticPoolName") String elasticPoolName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> get(@Path("subscriptionId") UUID subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("elasticPoolName") String elasticPoolName, @Path("advisorName") String advisorName, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Sql/servers/{serverName}/elasticPools/{elasticPoolName}/advisors/{advisorName}")
        Observable<Response<ResponseBody>> update(@Path("subscriptionId") UUID subscriptionId, @Path("resourceGroupName") String resourceGroupName, @Path("serverName") String serverName, @Path("elasticPoolName") String elasticPoolName, @Path("advisorName") String advisorName, @Body AdvisorResourceInner advisor, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @return the AdvisorResourceListInner object if successful.
     */
    public AdvisorResourceListInner list(String resourceGroupName, String serverName, String elasticPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).toBlocking().single().getBody();
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<AdvisorResourceListInner> listAsync(String resourceGroupName, String serverName, String elasticPoolName, final ServiceCallback<AdvisorResourceListInner> serviceCallback) {
        return ServiceCall.create(listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName), serviceCallback);
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @return the observable to the AdvisorResourceListInner object
     */
    public Observable<AdvisorResourceListInner> listAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        return listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName).map(new Func1<ServiceResponse<AdvisorResourceListInner>, AdvisorResourceListInner>() {
            @Override
            public AdvisorResourceListInner call(ServiceResponse<AdvisorResourceListInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @return the observable to the AdvisorResourceListInner object
     */
    public Observable<ServiceResponse<AdvisorResourceListInner>> listWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        final String apiVersion = "2015-05-01-preview";
        final String filter = null;
        return service.list(this.client.subscriptionId(), resourceGroupName, serverName, elasticPoolName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorResourceListInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorResourceListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorResourceListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param filter The filter to apply on the operation
     * @return the AdvisorResourceListInner object if successful.
     */
    public AdvisorResourceListInner list(String resourceGroupName, String serverName, String elasticPoolName, String filter) {
        return listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, filter).toBlocking().single().getBody();
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param filter The filter to apply on the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<AdvisorResourceListInner> listAsync(String resourceGroupName, String serverName, String elasticPoolName, String filter, final ServiceCallback<AdvisorResourceListInner> serviceCallback) {
        return ServiceCall.create(listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, filter), serviceCallback);
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param filter The filter to apply on the operation
     * @return the observable to the AdvisorResourceListInner object
     */
    public Observable<AdvisorResourceListInner> listAsync(String resourceGroupName, String serverName, String elasticPoolName, String filter) {
        return listWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, filter).map(new Func1<ServiceResponse<AdvisorResourceListInner>, AdvisorResourceListInner>() {
            @Override
            public AdvisorResourceListInner call(ServiceResponse<AdvisorResourceListInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Gets list of Azure SQL Database Elastic Pool Advisors.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param filter The filter to apply on the operation
     * @return the observable to the AdvisorResourceListInner object
     */
    public Observable<ServiceResponse<AdvisorResourceListInner>> listWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName, String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        final String apiVersion = "2015-05-01-preview";
        return service.list(this.client.subscriptionId(), resourceGroupName, serverName, elasticPoolName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorResourceListInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorResourceListInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorResourceListInner> clientResponse = listDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorResourceListInner> listDelegate(Response<ResponseBody> response) throws ArmErrorResponseMessageException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<AdvisorResourceListInner, ArmErrorResponseMessageException>(this.client.mapperAdapter())
                .register(200, new TypeToken<AdvisorResourceListInner>() { }.getType())
                .registerError(ArmErrorResponseMessageException.class)
                .build(response);
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @return the AdvisorResourceInner object if successful.
     */
    public AdvisorResourceInner get(String resourceGroupName, String serverName, String elasticPoolName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName).toBlocking().single().getBody();
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<AdvisorResourceInner> getAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, final ServiceCallback<AdvisorResourceInner> serviceCallback) {
        return ServiceCall.create(getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName), serviceCallback);
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<AdvisorResourceInner> getAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName).map(new Func1<ServiceResponse<AdvisorResourceInner>, AdvisorResourceInner>() {
            @Override
            public AdvisorResourceInner call(ServiceResponse<AdvisorResourceInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<ServiceResponse<AdvisorResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        final String apiVersion = "2015-05-01-preview";
        final String filter = null;
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, elasticPoolName, advisorName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param filter The filter to apply on the operation
     * @return the AdvisorResourceInner object if successful.
     */
    public AdvisorResourceInner get(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, String filter) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, filter).toBlocking().single().getBody();
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param filter The filter to apply on the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<AdvisorResourceInner> getAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, String filter, final ServiceCallback<AdvisorResourceInner> serviceCallback) {
        return ServiceCall.create(getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, filter), serviceCallback);
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param filter The filter to apply on the operation
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<AdvisorResourceInner> getAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, String filter) {
        return getWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, filter).map(new Func1<ServiceResponse<AdvisorResourceInner>, AdvisorResourceInner>() {
            @Override
            public AdvisorResourceInner call(ServiceResponse<AdvisorResourceInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Returns details of an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param filter The filter to apply on the operation
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<ServiceResponse<AdvisorResourceInner>> getWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, String filter) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        final String apiVersion = "2015-05-01-preview";
        return service.get(this.client.subscriptionId(), resourceGroupName, serverName, elasticPoolName, advisorName, apiVersion, filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorResourceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorResourceInner> getDelegate(Response<ResponseBody> response) throws ArmErrorResponseMessageException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<AdvisorResourceInner, ArmErrorResponseMessageException>(this.client.mapperAdapter())
                .register(200, new TypeToken<AdvisorResourceInner>() { }.getType())
                .registerError(ArmErrorResponseMessageException.class)
                .build(response);
    }

    /**
     * Updates an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param advisor The requested advisor resource state.
     * @return the AdvisorResourceInner object if successful.
     */
    public AdvisorResourceInner update(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, AdvisorResourceInner advisor) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, advisor).toBlocking().single().getBody();
    }

    /**
     * Updates an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param advisor The requested advisor resource state.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<AdvisorResourceInner> updateAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, AdvisorResourceInner advisor, final ServiceCallback<AdvisorResourceInner> serviceCallback) {
        return ServiceCall.create(updateWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, advisor), serviceCallback);
    }

    /**
     * Updates an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param advisor The requested advisor resource state.
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<AdvisorResourceInner> updateAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, AdvisorResourceInner advisor) {
        return updateWithServiceResponseAsync(resourceGroupName, serverName, elasticPoolName, advisorName, advisor).map(new Func1<ServiceResponse<AdvisorResourceInner>, AdvisorResourceInner>() {
            @Override
            public AdvisorResourceInner call(ServiceResponse<AdvisorResourceInner> response) {
                return response.getBody();
            }
        });
    }

    /**
     * Updates an Azure SQL Database Elastic Pool Advisor.
     *
     * @param resourceGroupName The name of the Resource Group to which the resource belongs.
     * @param serverName The name of the Azure SQL Database Server to which the Azure SQL Database Elastic Pool belongs.
     * @param elasticPoolName The name of the Azure SQL Database Elastic Pool.
     * @param advisorName The name of the Azure SQL Database Elastic Pool Advisor.
     * @param advisor The requested advisor resource state.
     * @return the observable to the AdvisorResourceInner object
     */
    public Observable<ServiceResponse<AdvisorResourceInner>> updateWithServiceResponseAsync(String resourceGroupName, String serverName, String elasticPoolName, String advisorName, AdvisorResourceInner advisor) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (serverName == null) {
            throw new IllegalArgumentException("Parameter serverName is required and cannot be null.");
        }
        if (elasticPoolName == null) {
            throw new IllegalArgumentException("Parameter elasticPoolName is required and cannot be null.");
        }
        if (advisorName == null) {
            throw new IllegalArgumentException("Parameter advisorName is required and cannot be null.");
        }
        if (advisor == null) {
            throw new IllegalArgumentException("Parameter advisor is required and cannot be null.");
        }
        Validator.validate(advisor);
        final String apiVersion = "2015-05-01-preview";
        return service.update(this.client.subscriptionId(), resourceGroupName, serverName, elasticPoolName, advisorName, advisor, apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<AdvisorResourceInner>>>() {
                @Override
                public Observable<ServiceResponse<AdvisorResourceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<AdvisorResourceInner> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<AdvisorResourceInner> updateDelegate(Response<ResponseBody> response) throws ArmErrorResponseMessageException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<AdvisorResourceInner, ArmErrorResponseMessageException>(this.client.mapperAdapter())
                .register(200, new TypeToken<AdvisorResourceInner>() { }.getType())
                .registerError(ArmErrorResponseMessageException.class)
                .build(response);
    }

}
