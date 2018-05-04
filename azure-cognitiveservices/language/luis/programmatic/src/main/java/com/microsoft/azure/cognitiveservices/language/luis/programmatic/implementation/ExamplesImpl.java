/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.programmatic.implementation;

import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.ListExamplesOptionalParameter;
import retrofit2.Retrofit;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples;
import com.google.common.base.Joiner;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.AzureRegions;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.BatchLabelExample;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.ErrorResponseException;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.ExampleLabelObject;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.LabeledUtterance;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.LabelExampleResponse;
import com.microsoft.azure.cognitiveservices.language.luis.programmatic.models.OperationStatus;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Examples.
 */
public class ExamplesImpl implements Examples {
    /** The Retrofit service to perform REST calls. */
    private ExamplesService service;
    /** The service client containing this operation class. */
    private LUISProgrammaticAPIImpl client;

    /**
     * Initializes an instance of ExamplesImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ExamplesImpl(Retrofit retrofit, LUISProgrammaticAPIImpl client) {
        this.service = retrofit.create(ExamplesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Examples to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ExamplesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples add" })
        @POST("apps/{appId}/versions/{versionId}/example")
        Observable<Response<ResponseBody>> add(@Path("appId") UUID appId, @Path("versionId") String versionId, @Body ExampleLabelObject exampleLabelObject, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples batch" })
        @POST("apps/{appId}/versions/{versionId}/examples")
        Observable<Response<ResponseBody>> batch(@Path("appId") UUID appId, @Path("versionId") String versionId, @Body List<ExampleLabelObject> exampleLabelObjectArray, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples listExamples" })
        @GET("apps/{appId}/versions/{versionId}/examples")
        Observable<Response<ResponseBody>> listExamples(@Path("appId") UUID appId, @Path("versionId") String versionId, @Query("skip") Integer skip, @Query("take") Integer take, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.cognitiveservices.language.luis.programmatic.Examples delete" })
        @HTTP(path = "apps/{appId}/versions/{versionId}/examples/{exampleId}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("appId") UUID appId, @Path("versionId") String versionId, @Path("exampleId") int exampleId, @Header("accept-language") String acceptLanguage, @Header("x-ms-parameterized-host") String parameterizedHost, @Header("User-Agent") String userAgent);

    }

    /**
     * Adds a labeled example to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObject An example label with the expected intent and entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LabelExampleResponse object if successful.
     */
    public LabelExampleResponse add(UUID appId, String versionId, ExampleLabelObject exampleLabelObject) {
        return addWithServiceResponseAsync(appId, versionId, exampleLabelObject).toBlocking().single().body();
    }

    /**
     * Adds a labeled example to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObject An example label with the expected intent and entities.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LabelExampleResponse> addAsync(UUID appId, String versionId, ExampleLabelObject exampleLabelObject, final ServiceCallback<LabelExampleResponse> serviceCallback) {
        return ServiceFuture.fromResponse(addWithServiceResponseAsync(appId, versionId, exampleLabelObject), serviceCallback);
    }

    /**
     * Adds a labeled example to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObject An example label with the expected intent and entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LabelExampleResponse object
     */
    public Observable<LabelExampleResponse> addAsync(UUID appId, String versionId, ExampleLabelObject exampleLabelObject) {
        return addWithServiceResponseAsync(appId, versionId, exampleLabelObject).map(new Func1<ServiceResponse<LabelExampleResponse>, LabelExampleResponse>() {
            @Override
            public LabelExampleResponse call(ServiceResponse<LabelExampleResponse> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a labeled example to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObject An example label with the expected intent and entities.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LabelExampleResponse object
     */
    public Observable<ServiceResponse<LabelExampleResponse>> addWithServiceResponseAsync(UUID appId, String versionId, ExampleLabelObject exampleLabelObject) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        if (exampleLabelObject == null) {
            throw new IllegalArgumentException("Parameter exampleLabelObject is required and cannot be null.");
        }
        Validator.validate(exampleLabelObject);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.add(appId, versionId, exampleLabelObject, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LabelExampleResponse>>>() {
                @Override
                public Observable<ServiceResponse<LabelExampleResponse>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LabelExampleResponse> clientResponse = addDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LabelExampleResponse> addDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LabelExampleResponse, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<LabelExampleResponse>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Adds a batch of labeled examples to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObjectArray Array of examples.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;BatchLabelExample&gt; object if successful.
     */
    public List<BatchLabelExample> batch(UUID appId, String versionId, List<ExampleLabelObject> exampleLabelObjectArray) {
        return batchWithServiceResponseAsync(appId, versionId, exampleLabelObjectArray).toBlocking().single().body();
    }

    /**
     * Adds a batch of labeled examples to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObjectArray Array of examples.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<BatchLabelExample>> batchAsync(UUID appId, String versionId, List<ExampleLabelObject> exampleLabelObjectArray, final ServiceCallback<List<BatchLabelExample>> serviceCallback) {
        return ServiceFuture.fromResponse(batchWithServiceResponseAsync(appId, versionId, exampleLabelObjectArray), serviceCallback);
    }

    /**
     * Adds a batch of labeled examples to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObjectArray Array of examples.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BatchLabelExample&gt; object
     */
    public Observable<List<BatchLabelExample>> batchAsync(UUID appId, String versionId, List<ExampleLabelObject> exampleLabelObjectArray) {
        return batchWithServiceResponseAsync(appId, versionId, exampleLabelObjectArray).map(new Func1<ServiceResponse<List<BatchLabelExample>>, List<BatchLabelExample>>() {
            @Override
            public List<BatchLabelExample> call(ServiceResponse<List<BatchLabelExample>> response) {
                return response.body();
            }
        });
    }

    /**
     * Adds a batch of labeled examples to the application.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleLabelObjectArray Array of examples.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;BatchLabelExample&gt; object
     */
    public Observable<ServiceResponse<List<BatchLabelExample>>> batchWithServiceResponseAsync(UUID appId, String versionId, List<ExampleLabelObject> exampleLabelObjectArray) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        if (exampleLabelObjectArray == null) {
            throw new IllegalArgumentException("Parameter exampleLabelObjectArray is required and cannot be null.");
        }
        Validator.validate(exampleLabelObjectArray);
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.batch(appId, versionId, exampleLabelObjectArray, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<BatchLabelExample>>>>() {
                @Override
                public Observable<ServiceResponse<List<BatchLabelExample>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<BatchLabelExample>> clientResponse = batchDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<BatchLabelExample>> batchDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<BatchLabelExample>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(201, new TypeToken<List<BatchLabelExample>>() { }.getType())
                .register(207, new TypeToken<List<BatchLabelExample>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }


    /**
     * Returns examples to be reviewed.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listExamplesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;LabeledUtterance&gt; object if successful.
     */
    public List<LabeledUtterance> listExamples(UUID appId, String versionId, ListExamplesOptionalParameter listExamplesOptionalParameter) {
        return listExamplesWithServiceResponseAsync(appId, versionId, listExamplesOptionalParameter).toBlocking().single().body();
    }

    /**
     * Returns examples to be reviewed.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listExamplesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LabeledUtterance>> listExamplesAsync(UUID appId, String versionId, ListExamplesOptionalParameter listExamplesOptionalParameter, final ServiceCallback<List<LabeledUtterance>> serviceCallback) {
        return ServiceFuture.fromResponse(listExamplesWithServiceResponseAsync(appId, versionId, listExamplesOptionalParameter), serviceCallback);
    }

    /**
     * Returns examples to be reviewed.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listExamplesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LabeledUtterance&gt; object
     */
    public Observable<List<LabeledUtterance>> listExamplesAsync(UUID appId, String versionId, ListExamplesOptionalParameter listExamplesOptionalParameter) {
        return listExamplesWithServiceResponseAsync(appId, versionId, listExamplesOptionalParameter).map(new Func1<ServiceResponse<List<LabeledUtterance>>, List<LabeledUtterance>>() {
            @Override
            public List<LabeledUtterance> call(ServiceResponse<List<LabeledUtterance>> response) {
                return response.body();
            }
        });
    }

    /**
     * Returns examples to be reviewed.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param listExamplesOptionalParameter the object representing the optional parameters to be set before calling this API
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LabeledUtterance&gt; object
     */
    public Observable<ServiceResponse<List<LabeledUtterance>>> listExamplesWithServiceResponseAsync(UUID appId, String versionId, ListExamplesOptionalParameter listExamplesOptionalParameter) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        final Integer skip = listExamplesOptionalParameter != null ? listExamplesOptionalParameter.skip() : null;
        final Integer take = listExamplesOptionalParameter != null ? listExamplesOptionalParameter.take() : null;
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());

        return listExamplesWithServiceResponseAsync(appId, versionId, skip, take);
    }

    /**
     * Returns examples to be reviewed.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param skip The number of entries to skip. Default value is 0.
     * @param take The number of entries to return. Maximum page size is 500. Default is 100.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LabeledUtterance&gt; object
     */
    public Observable<ServiceResponse<List<LabeledUtterance>>> listExamplesWithServiceResponseAsync(UUID appId, String versionId, Integer skip, Integer take) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.listExamples(appId, versionId, skip, take, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LabeledUtterance>>>>() {
                @Override
                public Observable<ServiceResponse<List<LabeledUtterance>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<List<LabeledUtterance>> clientResponse = listExamplesDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<List<LabeledUtterance>> listExamplesDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<List<LabeledUtterance>, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<List<LabeledUtterance>>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes the labeled example with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleId The example ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the OperationStatus object if successful.
     */
    public OperationStatus delete(UUID appId, String versionId, int exampleId) {
        return deleteWithServiceResponseAsync(appId, versionId, exampleId).toBlocking().single().body();
    }

    /**
     * Deletes the labeled example with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleId The example ID.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<OperationStatus> deleteAsync(UUID appId, String versionId, int exampleId, final ServiceCallback<OperationStatus> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(appId, versionId, exampleId), serviceCallback);
    }

    /**
     * Deletes the labeled example with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleId The example ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<OperationStatus> deleteAsync(UUID appId, String versionId, int exampleId) {
        return deleteWithServiceResponseAsync(appId, versionId, exampleId).map(new Func1<ServiceResponse<OperationStatus>, OperationStatus>() {
            @Override
            public OperationStatus call(ServiceResponse<OperationStatus> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the labeled example with the specified ID.
     *
     * @param appId The application ID.
     * @param versionId The version ID.
     * @param exampleId The example ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the OperationStatus object
     */
    public Observable<ServiceResponse<OperationStatus>> deleteWithServiceResponseAsync(UUID appId, String versionId, int exampleId) {
        if (this.client.azureRegion() == null) {
            throw new IllegalArgumentException("Parameter this.client.azureRegion() is required and cannot be null.");
        }
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (versionId == null) {
            throw new IllegalArgumentException("Parameter versionId is required and cannot be null.");
        }
        String parameterizedHost = Joiner.on(", ").join("{AzureRegion}", this.client.azureRegion());
        return service.delete(appId, versionId, exampleId, this.client.acceptLanguage(), parameterizedHost, this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<OperationStatus>>>() {
                @Override
                public Observable<ServiceResponse<OperationStatus>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<OperationStatus> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<OperationStatus> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<OperationStatus, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<OperationStatus>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
