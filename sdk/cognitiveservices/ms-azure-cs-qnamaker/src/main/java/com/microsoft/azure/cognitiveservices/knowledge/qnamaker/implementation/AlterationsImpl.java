/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.knowledge.qnamaker.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.AlterationsDTO;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.knowledge.qnamaker.models.WordAlterationsDTO;
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
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Alterations.
 */
public class AlterationsImpl implements Alterations {
    /** The Retrofit service to perform REST calls. */
    private AlterationsService service;
    /** The service client containing this operation class. */
    private QnAMakerClientImpl client;

    /**
     * Initializes an instance of AlterationsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public AlterationsImpl(Retrofit retrofit, QnAMakerClientImpl client) {
        this.service = retrofit.create(AlterationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Alterations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface AlterationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations get" })
        @GET("alterations")
        Observable<Response<ResponseBody>> get(@Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations replace" })
        @PUT("alterations")
        Observable<Response<ResponseBody>> replace(@Header("accept-language") String acceptLanguage, @Body WordAlterationsDTO wordAlterations, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations getAlterationsForKb" })
        @GET("alterations/{kbId}")
        Observable<Response<ResponseBody>> getAlterationsForKb(@Path("kbId") String kbId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.knowledge.qnamaker.Alterations replaceAlterationsForKb" })
        @PUT("alterations/{kbId}")
        Observable<Response<ResponseBody>> replaceAlterationsForKb(@Path("kbId") String kbId, @Header("accept-language") String acceptLanguage, @Body WordAlterationsDTO wordAlterations, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WordAlterationsDTO object if successful.
     */
    public WordAlterationsDTO get() {
        return getWithServiceResponseAsync().toBlocking().single().body();
    }

    /**
     * Download alterations from runtime.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WordAlterationsDTO> getAsync(final ServiceCallback<WordAlterationsDTO> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    public Observable<WordAlterationsDTO> getAsync() {
        return getWithServiceResponseAsync().map(new Func1<ServiceResponse<WordAlterationsDTO>, WordAlterationsDTO>() {
            @Override
            public WordAlterationsDTO call(ServiceResponse<WordAlterationsDTO> response) {
                return response.body();
            }
        });
    }

    /**
     * Download alterations from runtime.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    public Observable<ServiceResponse<WordAlterationsDTO>> getWithServiceResponseAsync() {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.get(this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WordAlterationsDTO>>>() {
                @Override
                public Observable<ServiceResponse<WordAlterationsDTO>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WordAlterationsDTO> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WordAlterationsDTO> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WordAlterationsDTO, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WordAlterationsDTO>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void replace(List<AlterationsDTO> wordAlterations) {
        replaceWithServiceResponseAsync(wordAlterations).toBlocking().single().body();
    }

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> replaceAsync(List<AlterationsDTO> wordAlterations, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(replaceWithServiceResponseAsync(wordAlterations), serviceCallback);
    }

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> replaceAsync(List<AlterationsDTO> wordAlterations) {
        return replaceWithServiceResponseAsync(wordAlterations).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Replace alterations data.
     *
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> replaceWithServiceResponseAsync(List<AlterationsDTO> wordAlterations) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (wordAlterations == null) {
            throw new IllegalArgumentException("Parameter wordAlterations is required and cannot be null.");
        }
        Validator.validate(wordAlterations);
        WordAlterationsDTO wordAlterations1 = new WordAlterationsDTO();
        wordAlterations1.withWordAlterations(wordAlterations);
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.replace(this.client.acceptLanguage(), wordAlterations1, parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = replaceDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> replaceDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Download alterations per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the WordAlterationsDTO object if successful.
     */
    public WordAlterationsDTO getAlterationsForKb(String kbId) {
        return getAlterationsForKbWithServiceResponseAsync(kbId).toBlocking().single().body();
    }

    /**
     * Download alterations per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<WordAlterationsDTO> getAlterationsForKbAsync(String kbId, final ServiceCallback<WordAlterationsDTO> serviceCallback) {
        return ServiceFuture.fromResponse(getAlterationsForKbWithServiceResponseAsync(kbId), serviceCallback);
    }

    /**
     * Download alterations per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    public Observable<WordAlterationsDTO> getAlterationsForKbAsync(String kbId) {
        return getAlterationsForKbWithServiceResponseAsync(kbId).map(new Func1<ServiceResponse<WordAlterationsDTO>, WordAlterationsDTO>() {
            @Override
            public WordAlterationsDTO call(ServiceResponse<WordAlterationsDTO> response) {
                return response.body();
            }
        });
    }

    /**
     * Download alterations per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the WordAlterationsDTO object
     */
    public Observable<ServiceResponse<WordAlterationsDTO>> getAlterationsForKbWithServiceResponseAsync(String kbId) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (kbId == null) {
            throw new IllegalArgumentException("Parameter kbId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.getAlterationsForKb(kbId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<WordAlterationsDTO>>>() {
                @Override
                public Observable<ServiceResponse<WordAlterationsDTO>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<WordAlterationsDTO> clientResponse = getAlterationsForKbDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<WordAlterationsDTO> getAlterationsForKbDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<WordAlterationsDTO, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<WordAlterationsDTO>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Replace alterations data per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void replaceAlterationsForKb(String kbId, List<AlterationsDTO> wordAlterations) {
        replaceAlterationsForKbWithServiceResponseAsync(kbId, wordAlterations).toBlocking().single().body();
    }

    /**
     * Replace alterations data per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @param wordAlterations Collection of word alterations.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> replaceAlterationsForKbAsync(String kbId, List<AlterationsDTO> wordAlterations, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(replaceAlterationsForKbWithServiceResponseAsync(kbId, wordAlterations), serviceCallback);
    }

    /**
     * Replace alterations data per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> replaceAlterationsForKbAsync(String kbId, List<AlterationsDTO> wordAlterations) {
        return replaceAlterationsForKbWithServiceResponseAsync(kbId, wordAlterations).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Replace alterations data per Knowledgebase (QnAMaker Managed).
     *
     * @param kbId Knowledgebase id.
     * @param wordAlterations Collection of word alterations.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> replaceAlterationsForKbWithServiceResponseAsync(String kbId, List<AlterationsDTO> wordAlterations) {
        if (this.client.endpoint() == null) {
            throw new IllegalArgumentException("Parameter this.client.endpoint() is required and cannot be null.");
        }
        if (kbId == null) {
            throw new IllegalArgumentException("Parameter kbId is required and cannot be null.");
        }
        if (wordAlterations == null) {
            throw new IllegalArgumentException("Parameter wordAlterations is required and cannot be null.");
        }
        Validator.validate(wordAlterations);
        WordAlterationsDTO wordAlterations1 = new WordAlterationsDTO();
        wordAlterations1.withWordAlterations(wordAlterations);
        String parameterizedHost = Joiner.on(", ").join("{Endpoint}", this.client.endpoint());
        return service.replaceAlterationsForKb(kbId, this.client.acceptLanguage(), wordAlterations1, parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = replaceAlterationsForKbDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> replaceAlterationsForKbDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
