/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.APIErrorException;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.BodyModel;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.RefreshIndex;
import com.microsoft.azure.cognitiveservices.vision.contentmoderator.models.TermList;
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
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in ListManagementTermLists.
 */
public class ListManagementTermListsImpl implements ListManagementTermLists {
    /** The Retrofit service to perform REST calls. */
    private ListManagementTermListsService service;
    /** The service client containing this operation class. */
    private ContentModeratorClientImpl client;

    /**
     * Initializes an instance of ListManagementTermListsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ListManagementTermListsImpl(Retrofit retrofit, ContentModeratorClientImpl client) {
        this.service = retrofit.create(ListManagementTermListsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for ListManagementTermLists to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ListManagementTermListsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists getDetails" })
        @GET("contentmoderator/lists/v1.0/termlists/{listId}")
        Observable<Response<ResponseBody>> getDetails(@Path("listId") String listId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists delete" })
        @HTTP(path = "contentmoderator/lists/v1.0/termlists/{listId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("listId") String listId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists update" })
        @PUT("contentmoderator/lists/v1.0/termlists/{listId}")
        Observable<Response<ResponseBody>> update(@Path("listId") String listId, @Header("Content-Type") String contentType, @Body BodyModel bodyParameter, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists create" })
        @POST("contentmoderator/lists/v1.0/termlists")
        Observable<Response<ResponseBody>> create(@Header("Content-Type") String contentType, @Body BodyModel bodyParameter, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists getAllTermLists" })
        @GET("contentmoderator/lists/v1.0/termlists")
        Observable<Response<ResponseBody>> getAllTermLists(@Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.vision.contentmoderator.ListManagementTermLists refreshIndexMethod" })
        @POST("contentmoderator/lists/v1.0/termlists/{listId}/RefreshIndex")
        Observable<Response<ResponseBody>> refreshIndexMethod(@Path("listId") String listId, @Query("language") String language, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Returns list Id details of the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TermList object if successful.
     */
    public TermList getDetails(String listId) {
        return getDetailsWithServiceResponseAsync(listId).toBlocking().single().body();
    }

    /**
     * Returns list Id details of the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TermList> getDetailsAsync(String listId, final ServiceCallback<TermList> serviceCallback) {
        return ServiceFuture.fromResponse(getDetailsWithServiceResponseAsync(listId), serviceCallback);
    }

    /**
     * Returns list Id details of the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<TermList> getDetailsAsync(String listId) {
        return getDetailsWithServiceResponseAsync(listId).map(new Func1<ServiceResponse<TermList>, TermList>() {
            @Override
            public TermList call(ServiceResponse<TermList> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns list Id details of the term list with list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<ServiceResponse<TermList>> getDetailsWithServiceResponseAsync(String listId) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.getDetails(listId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TermList>>>() {
                @Override
                public Observable<ServiceResponse<TermList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TermList> clientResponse = getDetailsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TermList> getDetailsDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TermList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TermList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Deletes term list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the String object if successful.
     */
    public String delete(String listId) {
        return deleteWithServiceResponseAsync(listId).toBlocking().single().body();
    }

    /**
     * Deletes term list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<String> deleteAsync(String listId, final ServiceCallback<String> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(listId), serviceCallback);
    }

    /**
     * Deletes term list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<String> deleteAsync(String listId) {
        return deleteWithServiceResponseAsync(listId).map(new Func1<ServiceResponse<String>, String>() {
            @Override
            public String call(ServiceResponse<String> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes term list with the list Id equal to list Id passed.
     *
     * @param listId List Id of the image list.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the String object
     */
    public Observable<ServiceResponse<String>> deleteWithServiceResponseAsync(String listId) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.delete(listId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<String>>>() {
                @Override
                public Observable<ServiceResponse<String>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<String> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<String> deleteDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<String, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<String>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Updates an Term List.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TermList object if successful.
     */
    public TermList update(String listId, String contentType, BodyModel bodyParameter) {
        return updateWithServiceResponseAsync(listId, contentType, bodyParameter).toBlocking().single().body();
    }

    /**
     * Updates an Term List.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TermList> updateAsync(String listId, String contentType, BodyModel bodyParameter, final ServiceCallback<TermList> serviceCallback) {
        return ServiceFuture.fromResponse(updateWithServiceResponseAsync(listId, contentType, bodyParameter), serviceCallback);
    }

    /**
     * Updates an Term List.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<TermList> updateAsync(String listId, String contentType, BodyModel bodyParameter) {
        return updateWithServiceResponseAsync(listId, contentType, bodyParameter).map(new Func1<ServiceResponse<TermList>, TermList>() {
            @Override
            public TermList call(ServiceResponse<TermList> response) {
                return response.body();
            }
        });
    }

    /**
     * Updates an Term List.
     *
     * @param listId List Id of the image list.
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<ServiceResponse<TermList>> updateWithServiceResponseAsync(String listId, String contentType, BodyModel bodyParameter) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (bodyParameter == null) {
            throw new IllegalArgumentException("Parameter bodyParameter is required and cannot be null.");
        }
        Validator.validate(bodyParameter);
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.update(listId, contentType, bodyParameter, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TermList>>>() {
                @Override
                public Observable<ServiceResponse<TermList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TermList> clientResponse = updateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TermList> updateDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TermList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TermList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Creates a Term List.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TermList object if successful.
     */
    public TermList create(String contentType, BodyModel bodyParameter) {
        return createWithServiceResponseAsync(contentType, bodyParameter).toBlocking().single().body();
    }

    /**
     * Creates a Term List.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TermList> createAsync(String contentType, BodyModel bodyParameter, final ServiceCallback<TermList> serviceCallback) {
        return ServiceFuture.fromResponse(createWithServiceResponseAsync(contentType, bodyParameter), serviceCallback);
    }

    /**
     * Creates a Term List.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<TermList> createAsync(String contentType, BodyModel bodyParameter) {
        return createWithServiceResponseAsync(contentType, bodyParameter).map(new Func1<ServiceResponse<TermList>, TermList>() {
            @Override
            public TermList call(ServiceResponse<TermList> response) {
                return response.body();
            }
        });
    }

    /**
     * Creates a Term List.
     *
     * @param contentType The content type.
     * @param bodyParameter Schema of the body.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TermList object
     */
    public Observable<ServiceResponse<TermList>> createWithServiceResponseAsync(String contentType, BodyModel bodyParameter) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (contentType == null) {
            throw new IllegalArgumentException("Parameter contentType is required and cannot be null.");
        }
        if (bodyParameter == null) {
            throw new IllegalArgumentException("Parameter bodyParameter is required and cannot be null.");
        }
        Validator.validate(bodyParameter);
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.create(contentType, bodyParameter, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TermList>>>() {
                @Override
                public Observable<ServiceResponse<TermList>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TermList> clientResponse = createDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TermList> createDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TermList, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TermList>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * gets all the Term Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;TermList&gt; object if successful.
     */
    public List<TermList> getAllTermLists() {
        return getAllTermListsWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * gets all the Term Lists.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<TermList>> getAllTermListsAsync(final ServiceCallback<List<TermList>> serviceCallback) {
        return ServiceFuture.fromResponse(getAllTermListsWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * gets all the Term Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TermList&gt; object
     */
    public Observable<List<TermList>> getAllTermListsAsync() {
        return getAllTermListsWithServiceResponseAsync().map(new Func1<ServiceResponse<List<TermList>>, List<TermList>>() {
            @Override
            public List<TermList> call(ServiceResponse<List<TermList>> response) {
                return response.body();
            }
        });
    }

    /**
     * gets all the Term Lists.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;TermList&gt; object
     */
    public Observable<ServiceResponse<List<TermList>>> getAllTermListsWithServiceResponseAsync() {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.getAllTermLists(this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<TermList>>>>() {
                @Override
                public Observable<ServiceResponse<List<TermList>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<TermList>> clientResponse = getAllTermListsDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<TermList>> getAllTermListsDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<TermList>, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<TermList>>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

    /**
     * Refreshes the index of the list with list Id equal to list ID passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws APIErrorException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the RefreshIndex object if successful.
     */
    public RefreshIndex refreshIndexMethod(String listId, String language) {
        return refreshIndexMethodWithServiceResponseAsync(listId, language).toBlocking().single().body();
    }

    /**
     * Refreshes the index of the list with list Id equal to list ID passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<RefreshIndex> refreshIndexMethodAsync(String listId, String language, final ServiceCallback<RefreshIndex> serviceCallback) {
        return ServiceFuture.fromResponse(refreshIndexMethodWithServiceResponseAsync(listId, language), serviceCallback);
    }

    /**
     * Refreshes the index of the list with list Id equal to list ID passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefreshIndex object
     */
    public Observable<RefreshIndex> refreshIndexMethodAsync(String listId, String language) {
        return refreshIndexMethodWithServiceResponseAsync(listId, language).map(new Func1<ServiceResponse<RefreshIndex>, RefreshIndex>() {
            @Override
            public RefreshIndex call(ServiceResponse<RefreshIndex> response) {
                return response.body();
            }
        });
    }

    /**
     * Refreshes the index of the list with list Id equal to list ID passed.
     *
     * @param listId List Id of the image list.
     * @param language Language of the terms.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the RefreshIndex object
     */
    public Observable<ServiceResponse<RefreshIndex>> refreshIndexMethodWithServiceResponseAsync(String listId, String language) {
        if (this.client.baseUrl() == null) {
            throw new IllegalArgumentException("Parameter this.client.baseUrl() is required and cannot be null.");
        }
        if (listId == null) {
            throw new IllegalArgumentException("Parameter listId is required and cannot be null.");
        }
        if (language == null) {
            throw new IllegalArgumentException("Parameter language is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{baseUrl}", this.client.baseUrl());
        return service.refreshIndexMethod(listId, language, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<RefreshIndex>>>() {
                @Override
                public Observable<ServiceResponse<RefreshIndex>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<RefreshIndex> clientResponse = refreshIndexMethodDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<RefreshIndex> refreshIndexMethodDelegate(Response<ResponseBody> response) throws APIErrorException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<RefreshIndex, APIErrorException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<RefreshIndex>() { }.getType())
                .registerError(APIErrorException.class)
                .build(response);
    }

}
