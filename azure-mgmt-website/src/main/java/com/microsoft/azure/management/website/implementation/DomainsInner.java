/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceCall;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.RestException;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
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
 * in Domains.
 */
public final class DomainsInner {
    /** The Retrofit service to perform REST calls. */
    private DomainsService service;
    /** The service client containing this operation class. */
    private WebSiteManagementClientImpl client;

    /**
     * Initializes an instance of DomainsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public DomainsInner(Retrofit retrofit, WebSiteManagementClientImpl client) {
        this.service = retrofit.create(DomainsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Domains to be
     * used by Retrofit to perform actually REST calls.
     */
    interface DomainsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains")
        Observable<Response<ResponseBody>> getDomains(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Observable<Response<ResponseBody>> getDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Observable<Response<ResponseBody>> createOrUpdateDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Body DomainInner domain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> deleteDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Query("forceHardDeleteDomain") Boolean forceHardDeleteDomain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}")
        Observable<Response<ResponseBody>> updateDomain(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("subscriptionId") String subscriptionId, @Body DomainInner domain, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.DomainRegistration/domains/{domainName}/operationresults/{operationId}")
        Observable<Response<ResponseBody>> getDomainOperation(@Path("resourceGroupName") String resourceGroupName, @Path("domainName") String domainName, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("{nextLink}")
        Observable<Response<ResponseBody>> getDomainsNext(@Path(value = "nextLink", encoded = true) String nextPageLink, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;DomainInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<DomainInner>> getDomains(final String resourceGroupName) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<DomainInner>> response = getDomainsSinglePageAsync(resourceGroupName).toBlocking().single();
        PagedList<DomainInner> pagedList = new PagedList<DomainInner>(response.getBody()) {
            @Override
            public Page<DomainInner> nextPage(String nextPageLink) throws RestException, IOException {
                return getDomainsNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<DomainInner>>(pagedList, response.getResponse());
    }

    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<DomainInner>> getDomainsAsync(final String resourceGroupName, final ListOperationCallback<DomainInner> serviceCallback) {
        return AzureServiceCall.create(
            getDomainsSinglePageAsync(resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(String nextPageLink) {
                    return getDomainsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists domains under a resource group.
     *
     * @param resourceGroupName Name of the resource group
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<ServiceResponse<Page<DomainInner>>> getDomainsAsync(final String resourceGroupName) {
        return getDomainsSinglePageAsync(resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<DomainInner>>, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(ServiceResponse<Page<DomainInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return getDomainsNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Lists domains under a resource group.
     *
    ServiceResponse<PageImpl<DomainInner>> * @param resourceGroupName Name of the resource group
     * @return the List&lt;DomainInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DomainInner>>> getDomainsSinglePageAsync(final String resourceGroupName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getDomains(resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DomainInner>> result = getDomainsDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DomainInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DomainInner>> getDomainsDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<DomainInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<DomainInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DomainInner> getDomain(String resourceGroupName, String domainName) throws CloudException, IOException, IllegalArgumentException {
        return getDomainAsync(resourceGroupName, domainName).toBlocking().single();
    }

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DomainInner> getDomainAsync(String resourceGroupName, String domainName, final ServiceCallback<DomainInner> serviceCallback) {
        return ServiceCall.create(getDomainAsync(resourceGroupName, domainName), serviceCallback);
    }

    /**
     * Gets details of a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @return the observable to the DomainInner object
     */
    public Observable<ServiceResponse<DomainInner>> getDomainAsync(String resourceGroupName, String domainName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getDomain(resourceGroupName, domainName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DomainInner>>>() {
                @Override
                public Observable<ServiceResponse<DomainInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DomainInner> clientResponse = getDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DomainInner> getDomainDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DomainInner, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<DomainInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DomainInner> createOrUpdateDomain(String resourceGroupName, String domainName, DomainInner domain) throws CloudException, IOException, IllegalArgumentException {
        return createOrUpdateDomainAsync(resourceGroupName, domainName, domain).toBlocking().single();
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DomainInner> createOrUpdateDomainAsync(String resourceGroupName, String domainName, DomainInner domain, final ServiceCallback<DomainInner> serviceCallback) {
        return ServiceCall.create(createOrUpdateDomainAsync(resourceGroupName, domainName, domain), serviceCallback);
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @return the observable to the DomainInner object
     */
    public Observable<ServiceResponse<DomainInner>> createOrUpdateDomainAsync(String resourceGroupName, String domainName, DomainInner domain) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(domain);
        return service.createOrUpdateDomain(resourceGroupName, domainName, this.client.subscriptionId(), domain, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DomainInner>>>() {
                @Override
                public Observable<ServiceResponse<DomainInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DomainInner> clientResponse = createOrUpdateDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DomainInner> createOrUpdateDomainDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DomainInner, CloudException>(this.client.mapperAdapter())
                .register(202, new TypeToken<DomainInner>() { }.getType())
                .register(200, new TypeToken<DomainInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteDomain(String resourceGroupName, String domainName) throws CloudException, IOException, IllegalArgumentException {
        return deleteDomainAsync(resourceGroupName, domainName).toBlocking().single();
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Object> deleteDomainAsync(String resourceGroupName, String domainName, final ServiceCallback<Object> serviceCallback) {
        return ServiceCall.create(deleteDomainAsync(resourceGroupName, domainName), serviceCallback);
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteDomainAsync(String resourceGroupName, String domainName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final Boolean forceHardDeleteDomain = null;
        return service.deleteDomain(resourceGroupName, domainName, this.client.subscriptionId(), forceHardDeleteDomain, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<Object> deleteDomain(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain) throws CloudException, IOException, IllegalArgumentException {
        return deleteDomainAsync(resourceGroupName, domainName, forceHardDeleteDomain).toBlocking().single();
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<Object> deleteDomainAsync(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain, final ServiceCallback<Object> serviceCallback) {
        return ServiceCall.create(deleteDomainAsync(resourceGroupName, domainName, forceHardDeleteDomain), serviceCallback);
    }

    /**
     * Deletes a domain.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param forceHardDeleteDomain If true then the domain will be deleted immediately instead of after 24 hours
     * @return the observable to the Object object
     */
    public Observable<ServiceResponse<Object>> deleteDomainAsync(String resourceGroupName, String domainName, Boolean forceHardDeleteDomain) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.deleteDomain(resourceGroupName, domainName, this.client.subscriptionId(), forceHardDeleteDomain, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Object>>>() {
                @Override
                public Observable<ServiceResponse<Object>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Object> clientResponse = deleteDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Object> deleteDomainDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Object, CloudException>(this.client.mapperAdapter())
                .register(204, new TypeToken<Object>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DomainInner> updateDomain(String resourceGroupName, String domainName, DomainInner domain) throws CloudException, IOException, IllegalArgumentException {
        return updateDomainAsync(resourceGroupName, domainName, domain).toBlocking().single();
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DomainInner> updateDomainAsync(String resourceGroupName, String domainName, DomainInner domain, final ServiceCallback<DomainInner> serviceCallback) {
        return ServiceCall.create(updateDomainAsync(resourceGroupName, domainName, domain), serviceCallback);
    }

    /**
     * Creates a domain.
     *
     * @param resourceGroupName &amp;gt;Name of the resource group
     * @param domainName Name of the domain
     * @param domain Domain registration information
     * @return the observable to the DomainInner object
     */
    public Observable<ServiceResponse<DomainInner>> updateDomainAsync(String resourceGroupName, String domainName, DomainInner domain) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (domain == null) {
            throw new IllegalArgumentException("Parameter domain is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(domain);
        return service.updateDomain(resourceGroupName, domainName, this.client.subscriptionId(), domain, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DomainInner>>>() {
                @Override
                public Observable<ServiceResponse<DomainInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DomainInner> clientResponse = updateDomainDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DomainInner> updateDomainDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DomainInner, CloudException>(this.client.mapperAdapter())
                .register(202, new TypeToken<DomainInner>() { }.getType())
                .register(200, new TypeToken<DomainInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the DomainInner object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<DomainInner> getDomainOperation(String resourceGroupName, String domainName, String operationId) throws CloudException, IOException, IllegalArgumentException {
        return getDomainOperationAsync(resourceGroupName, domainName, operationId).toBlocking().single();
    }

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<DomainInner> getDomainOperationAsync(String resourceGroupName, String domainName, String operationId, final ServiceCallback<DomainInner> serviceCallback) {
        return ServiceCall.create(getDomainOperationAsync(resourceGroupName, domainName, operationId), serviceCallback);
    }

    /**
     * Retrieves the latest status of a domain purchase operation.
     *
     * @param resourceGroupName Name of the resource group
     * @param domainName Name of the domain
     * @param operationId Domain purchase operation Id
     * @return the observable to the DomainInner object
     */
    public Observable<ServiceResponse<DomainInner>> getDomainOperationAsync(String resourceGroupName, String domainName, String operationId) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (domainName == null) {
            throw new IllegalArgumentException("Parameter domainName is required and cannot be null.");
        }
        if (operationId == null) {
            throw new IllegalArgumentException("Parameter operationId is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.getDomainOperation(resourceGroupName, domainName, operationId, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<DomainInner>>>() {
                @Override
                public Observable<ServiceResponse<DomainInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<DomainInner> clientResponse = getDomainOperationDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<DomainInner> getDomainOperationDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<DomainInner, CloudException>(this.client.mapperAdapter())
                .register(202, new TypeToken<DomainInner>() { }.getType())
                .register(200, new TypeToken<DomainInner>() { }.getType())
                .register(500, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists domains under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;DomainInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public ServiceResponse<PagedList<DomainInner>> getDomainsNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException {
        ServiceResponse<Page<DomainInner>> response = getDomainsNextSinglePageAsync(nextPageLink).toBlocking().single();
        PagedList<DomainInner> pagedList = new PagedList<DomainInner>(response.getBody()) {
            @Override
            public Page<DomainInner> nextPage(String nextPageLink) throws RestException, IOException {
                return getDomainsNextSinglePageAsync(nextPageLink).toBlocking().single().getBody();
            }
        };
        return new ServiceResponse<PagedList<DomainInner>>(pagedList, response.getResponse());
    }

    /**
     * Lists domains under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceCall} object
     */
    public ServiceCall<List<DomainInner>> getDomainsNextAsync(final String nextPageLink, final ServiceCall<List<DomainInner>> serviceCall, final ListOperationCallback<DomainInner> serviceCallback) {
        return AzureServiceCall.create(
            getDomainsNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(String nextPageLink) {
                    return getDomainsNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists domains under a resource group.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the observable to the List&lt;DomainInner&gt; object
     */
    public Observable<ServiceResponse<Page<DomainInner>>> getDomainsNextAsync(final String nextPageLink) {
        return getDomainsNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<DomainInner>>, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(ServiceResponse<Page<DomainInner>> page) {
                    String nextPageLink = page.getBody().getNextPageLink();
                    return getDomainsNextSinglePageAsync(nextPageLink);
                }
            });
    }

    /**
     * Lists domains under a resource group.
     *
    ServiceResponse<PageImpl<DomainInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @return the List&lt;DomainInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<DomainInner>>> getDomainsNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        return service.getDomainsNext(nextPageLink, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<DomainInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<DomainInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<DomainInner>> result = getDomainsNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<DomainInner>>(result.getBody(), result.getResponse()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<DomainInner>> getDomainsNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<PageImpl<DomainInner>, CloudException>(this.client.mapperAdapter())
                .register(200, new TypeToken<PageImpl<DomainInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
